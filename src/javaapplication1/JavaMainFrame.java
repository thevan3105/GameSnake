package javaapplication1;

import javax.swing.JFrame;

public class JavaMainFrame {

    Thread th;
    public JavaMainFrame(int speed, int map,int chedo, int lenght2, int score2) {
        JavaPanelGame s = new JavaPanelGame(speed, map, chedo, lenght2, score2);
        System.out.println("speed frame:"+speed);
        System.out.println("map frame:"+map);
        //hien thi frame
        JFrame fm = new JFrame("Game Snake !!!");
        fm.pack();
        fm.setSize(406, 432);// thay đổi frame
        fm.setLocationRelativeTo(null);
        fm.setVisible(true);
        fm.setResizable(false);
//        fm.setScore();
        

        //add snake
        fm.add(s);
        
        th = new Thread(s);
        th.start();
    }

}
