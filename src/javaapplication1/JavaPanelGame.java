package javaapplication1;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JavaPanelGame extends JPanel implements KeyListener, Runnable {
    
    private int[] x = new int[500];//toa do x
    private int[] y = new int[500];//toa do y

    private int[] foodx = new int[25];//thuc an
    private int[] foody = new int[25];

    private int[] vcx = new int[400];//vat can (vườn rau)
    private int[] vcy = new int[400];

    private int[] vcx1 = new int[400];//vat can 1( nhà tù)
    private int[] vcy1 = new int[400];

    private Random ran = new Random();
    private int xpos = ran.nextInt(25);
    private int ypos = ran.nextInt(25);

    private int move = 0;//dieu kien di chuyen
    private int length = this.length;//chieu dai ran
    private int score = this.score;//diem ban dau

    private Thread th;
    int map, speed, chedo, lenght2, score2;

    private boolean r = false, l = false, u = false, d = false;//huong di chuyen

    //ham khoi tao
    public JavaPanelGame(int speed, int map, int chedo, int lenght2, int score2) {
        Employee e = null;
      try {
         FileInputStream fileIn = new FileInputStream("test.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         e = (Employee) in.readObject();
         in.close();
         fileIn.close();
      } catch (IOException i) {
         i.printStackTrace();
         return;
      } catch (ClassNotFoundException c) {
         System.out.println("Khong tim thay file .ser");
         c.printStackTrace();
         return;
        }
      
        this.speed = speed;
        this.map = map;
        this.chedo = chedo;
        this.length = e.lenght1;
        this.score = e.score1;

        addKeyListener(this);
        setFocusable(true);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(new Color(28, 28, 28));//ve nen game
        g.fillRect(0, 0, 421, 421);// thay đổi kích thước  khung màu backgroud trong game
        drawS(g);//ve ran
        
        //ve vat can
        if (map == 1)// vườn rau
        {
            posMap(vcx, vcy, 96, 272, 96, 272);//tọa độ của vườn rau 
            drawMap(vcx, vcy, g);

        } else if (map == 2)// đường ống
        {
            posMap(vcx, vcy, 96, 144, 80, 372);// tọa độ của đường ống 1
            drawMap(vcx, vcy, g);
            posMap(vcx1, vcy1, 192, 240, 48, 372);// tọa độ của đường ống 2
            drawMap(vcx1, vcy1, g);
        }
        drawF(g);//ve food ran
        System.out.println("foodx = " + foodx[xpos]);
        System.out.println("foody = " + foody[ypos]);
        g.setColor(Color.WHITE);
        g.drawString("Score: " + score, 10, 10); // tọa độ hiển thị của score
        if (chedo == 1) {
            for (int i = 0; i <= 384; i += 16) {
                g.setColor(new Color(224, 255, 255));
                g.fill3DRect(i, 0, 16, 16, true);
                g.fill3DRect(0, i, 16, 16, true);
                g.fill3DRect(i, 384, 16, 16, true);
                g.fill3DRect(384, i, 16, 16, true);
                g.setColor(Color.WHITE);//ve diem
                g.drawString("Score: " + score, 24, 26);
            }
        }
        //xử lý thua khi rắn chạm thân 
        for (int i = 1; i < length; i++) {
            if (x[0] == x[i] && y[0] == y[i]) {
                xuly(g);
            }
        }
        // code xử lý rắn chạm vào bản đồ vườn rau + đường ống 1  thua
        for (int i = 0; i < vcx.length; i++) {
            if (x[0] == vcx[i] && y[0] == vcy[i]) {
                if (vcx[i] == 0 && vcy[i] == 0) {
                    continue;
                }
                xuly(g);
            }
        }
        // code xử lý rắn chạm tường( chế độ nhà tù) thua
        for (int i = 0; i < vcx1.length; i++) {
            if (x[0] == vcx1[i] && y[0] == vcy1[i]) {
                if (vcx1[i] == 0 && vcy1[i] == 0) {
                    continue;
                }
                xuly(g);
            }
       }
        if (chedo == 1 && x[0] >= 384 || chedo == 1 && x[0] <= 1
                || chedo == 1 && y[0] >= 384 || chedo == 1 && y[0] <= 1) {
            xuly(g);
        }
        g.dispose();
    }
// Xử lý game sau sau khi kết thúc
    public void xuly(Graphics g) {
        r = false;
        l = false;
        d = false;
        u = false;
        char[] s = {'G', 'A', 'M', 'E', ' ', 'O', 'V', 'E', 'R'};
        g.setColor(new Color(28, 28, 28));
        g.fillRect(0, 0, 400, 400);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Tahoma", Font.BOLD, 40));// font chữ của gameover
        g.drawChars(s, 0, s.length, 60, 200);
        g.setFont(new Font("Tahoma", Font.BOLD, 30));// font chữ của điểm và dòng trạng thái
        g.drawString("Score: " + score, 60, 230);
        g.drawString("Enter to continue", 60, 260);
        //
        abc();
        
        
        // đọc file
        try {
            ArrayList<String> list = new ArrayList<>();
            ArrayList<Integer> listSN = new ArrayList<>();
            File myfile = new File("filename.txt");
            Scanner myReader = new Scanner(myfile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                list.add(data);
                Integer dataSN = Integer.parseInt(data);
                listSN.add(dataSN);
            }
            myReader.close();
       
            // viết file
            FileWriter myWriter = new FileWriter("filename.txt");
            listSN.add(score);
            
           //Collections.sort(listSN);// sắp xếp tăng dần
          Collections.sort(listSN,Comparator.reverseOrder());// sắp xếp giảm dần
            //sortDESC(listSN);
            for(Integer item : listSN){
                myWriter.write(item+"\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
    }
    public void abc(){
        // TODO add your handling code here:
       Employee e = null;
      try {
         FileInputStream fileIn = new FileInputStream("test.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         e = (Employee) in.readObject();
         in.close();
         fileIn.close();
      } catch (IOException i) {
         i.printStackTrace();
         return;
      } catch (ClassNotFoundException c) {
         System.out.println("Khong tim thay file .ser");
         c.printStackTrace();
         return;
        }
      
        this.speed = speed;
        this.map = map;
        this.chedo = chedo;
        this.length = 3;
        this.score = 0;

        addKeyListener(this);
        setFocusable(true);
    }
    //ve food

    public void drawF(Graphics g) {
        pos();
        for (int i = 0; i < vcx.length; i++) {
            if (foodx[xpos] == vcx[i] && foody[xpos] == vcy[i]) {
                xpos = ran.nextInt(25);
                ypos = ran.nextInt(25);
            }
        }
        for (int h = 0; h < vcx1.length; h++) {
            if (foodx[xpos] == vcx1[h] && foody[xpos] == vcy1[h]) {
                xpos = ran.nextInt(25);
                ypos = ran.nextInt(25);
            }
        }
        if (foodx[xpos] == 0 && chedo == 1 || foody[ypos] == 0 && chedo == 1
                || foodx[xpos] == 384 && chedo == 1 || foody[ypos] == 384 && chedo == 1) {
            xpos = ran.nextInt(25);
            ypos = ran.nextInt(25);
        }
        // rắn ăn mồi
        if (foodx[xpos] == x[0] && foody[ypos] == y[0]) {
            length++;
            score += 10; // mức điểm của mỗi lần ăn được mồi
            xpos = ran.nextInt(25);
            ypos = ran.nextInt(25);
        }

        g.setColor(Color.red);
        g.fill3DRect(foodx[xpos], foody[ypos], 16, 16, true);
    }
    //vẽ rắn

    public void drawS(Graphics g) {
        if (move == 0) {
            x[0] = 64;
            x[1] = 48;
            x[2] = 32;
            y[0] = 320;
            y[1] = 320;
            y[2] = 320;
        }
        g.setColor(Color.red);
        g.fill3DRect(x[0], y[0], 16, 16, true);

        for (int i = 0; i < length; i++) {
            if (i == 0) {
                g.setColor(Color.red);
                g.fill3DRect(x[i], y[i], 16, 16, true);
            } else if (i != 0) {
                g.setColor(Color.yellow);
                g.fill3DRect(x[i], y[i], 16, 16, true);
            }
        }
    }
    //toa do random
    public void pos() {
        int tem = 0;
        for (int j = 0; j < 384; j += 16) {
            foodx[tem] = j;
            foody[tem] = j;
            tem++;
        }
    }
    //ve map
    public void posMap(int[] xx, int[] yy, int xd, int yd, int xxd, int yyd) {
        int tam = 0;
        for (int i = xd; i <= yd; i += 16) {
            for (int j = xxd; j <= yyd; j += 16) {
                xx[tam] = i;
                yy[tam] = j;
                tam++;
            }
        }
    }
    //hien thi map
    public void drawMap(int[] aa, int[] bb, Graphics g) {
        for (int i = 0; i < aa.length; i++) {
            for (int j = 0; j < bb.length; j++) {
                if (aa[i] == 0 || bb[j] == 0) {
                    continue;
                }
                g.setColor(new Color(224, 255, 255));
                g.fill3DRect(aa[i], bb[j], 16, 16, true);
            }
        }
    }
    @Override
    public void run() {
        for (;;) {
            try {
                SnakeMove();
                th.sleep(speed);
            } catch (Exception e) {
            }
        }
    }
    //rắn di chuyển
    public void SnakeMove() {
        if (r) {
            for (int i = length - 1; i >= 0; i--) {
                y[i + 1] = y[i];
            }
            for (int i = length; i >= 0; i--) {
                if (i == 0) {
                    x[i] = x[i] + 16;
                } else {
                    x[i] = x[i - 1];
                }
                if (x[i] > 384) {
                    x[i] = 0;
                }
            }
            repaint();
        }
        if (l) {
            for (int i = length - 1; i >= 0; i--) {
                y[i + 1] = y[i];
            }
            for (int i = length; i >= 0; i--) {
                if (i == 0) {
                    x[i] = x[i] - 16;
                } else {
                    x[i] = x[i - 1];
                }
                if (x[i] < 0) {
                    x[i] = 384;
                }
            }
            repaint();
        }
        if (u) {
            for (int i = length - 1; i >= 0; i--) {
                x[i + 1] = x[i];
            }
            for (int i = length; i >= 0; i--) {
                if (i == 0) {
                    y[i] = y[i] - 16;
                } else {
                    y[i] = y[i - 1];
                }
                if (y[i] < 0) {
                    y[i] = 384;
                }
            }
            repaint();
        }
        if (d) {
            for (int i = length - 1; i >= 0; i--) {
                x[i + 1] = x[i];
            }
            for (int i = length; i >= 0; i--) {
                if (i == 0) {
                    y[i] = y[i] + 16;
                } else {
                    y[i] = y[i - 1];
                }
                if (y[i] > 384) {
                    y[i] = 0;
                }
            }
            repaint();
        }
    }
// xử lý sự kiện
    @Override
    public void keyPressed(KeyEvent e) {
        int k = e.getKeyCode();
        if (k == KeyEvent.VK_SPACE) {
            r = false;
            l = false;
            u = false;
            d = false;
            Component Frame = null;
//            JOptionPane.showConfirmDialog(null,"Hello world");
            JDialog.setDefaultLookAndFeelDecorated(true);
            int response = JOptionPane.showConfirmDialog(null, "Bạn có muốn lưu data?", "Confirm",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.NO_OPTION) {
                //khong luu
            } else if (response == JOptionPane.YES_OPTION) {
                //luu
                State();
                //thoat he thong
                System.exit(0);
            } else if (response == JOptionPane.CLOSED_OPTION) {
                
            }
//            JOptionPane.showMessageDialog( Frame,"Bạn đã ấn nút tạm dừng, Ấn nút điều hướng để tiếp tục");
        }
        if (k == KeyEvent.VK_ENTER) {
            length = 3;
            score = 0;
            move = 0;
            repaint();
        }
        if (k == KeyEvent.VK_RIGHT) {
            move = 1;
            r = true;
            if (!l) {
                r = true;
            } else {
                r = false;
                l = true;
            }
            u = false;
            d = false;
        }
        if (k == KeyEvent.VK_LEFT) {
            move = 1;
            l = true;
            if (!r) {
                l = true;
            } else {
                l = false;
                r = true;
            }
            u = false;
            d = false;
        }
        if (k == KeyEvent.VK_UP) {
            move = 1;
            u = true;
            if (!d) {
                u = true;
            } else {
                u = false;
                d = true;
            }
            l = false;
            r = false;
        }
        if (k == KeyEvent.VK_DOWN) {
            move = 1;
            d = true;
            if (!u) {
                d = true;
            } else {
                d = false;
                u = true;
            }
            l = false;
            r = false;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
    
    public void State() {
            Employee e = new Employee();
      e.score1 = score;
      e.lenght1 = length;
      e.speed1 = speed;
      e.map1 = map;
      e.chedo1 = chedo;
      
      try {
         FileOutputStream fileOut =
         new FileOutputStream("test.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("luu data vao file test.ser");
      } catch (IOException i) {
         i.printStackTrace();
      }
    }

}
