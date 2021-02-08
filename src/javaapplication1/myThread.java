package javaapplication1;

public class myThread implements Runnable {

    private int speed;
    private int map;
    private int chedo;
    private int lenght2;
    private int score2;

    public void setChedo(int chedo) {
        this.chedo = chedo;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMap(int map) {
        this.map = map;
    }
    public void setlenght(int lenght2) {
        this.lenght2 = lenght2;
    }
    public void setScore(int score2) {
        this.score2 = score2;
    }
    public void show(){
        System.out.println("map "+map);
        System.out.println("speed "+speed);
        System.out.println("che do "+chedo);
        System.out.println("lenght "+lenght2);
        System.out.println("Score "+score2);
    }
    @Override
    public void run() {
        new JavaMainFrame(speed,map,chedo,lenght2,score2);   
    }
}
