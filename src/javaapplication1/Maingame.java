
package javaapplication1;

/**
 *
 * @author GCafe
 */
public class Maingame {

    public Maingame() {
        new NewJFrame().setVisible(true);
    }
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               new Maingame();
            }
        });
    }
}
