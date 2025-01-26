import java.awt.*;
import java.util.Random;

public class Mansion {
    private int width;
    private int height;
    private Graphics g;
//    private String col;

    public Mansion(int width, int height) {
        this.width = width;
        this.height = height;
//        this.col = col;
        g = new DrawingPanel(width, height).getGraphics();
    }

    public void colorBG() {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, width, height);

    }

    public void drawSnow() {
        g.setColor(Color.WHITE);
        for (int i = 0; i < 200; i++) {
            Random r = new Random();
            int w = r.nextInt(width);
            int h = r.nextInt(height);
            g.drawOval(w, h, 2, 3);
        }
    }

//    public void bodyBodyHouse() {
//        g.setColor(Color.WHITE);
//        g.fillRect(50, 50, 200, 400);
//        g.setColor(Color.BLACK);
//        g.drawLine(50, 100, 250, 100);
//        g.drawLine( 50, 150, 250, 150);
//        g.drawLine( 50, 200, 250, 200);
//        g.drawLine( 50, 250, 250, 250);
//        g.drawLine( 50, 300, 250, 300);
//        g.drawLine( 50, 350, 250, 350);
//    }

    public void bigGreenSpace(int x, int y, int width, int height) {
        g.setColor(Color.GREEN);
        //    g.fillRect(300, 50, 400, 400);
        g.fillRect(x, y, width, height);
    }

    public void bigWhiteSpace(int x, int y, int width, int height) {
        g.setColor(Color.GRAY);
        g.fillRect(x, y, width, height);
    }

    public void addSiding(int x, int y, int width, int height) {
        g.setColor(Color.BLACK);
        g.drawLine(x, y, x + width, y);
        int boards = 0;
        for (int i = 0; i < height; i = i + 20) {
            g.drawLine(x, y + i, x + width, y + i);
        }
        g.setColor(Color.WHITE);
    }

    public void buildOuthouse() {
        g.setColor(Color.ORANGE);
        g.fillRect(700, 500, 55, 100);

    }

    public void buildPolygon(int p1, int p2, int p3, int p4, int p5, int p6) {
        g.setColor(Color.RED);
        Polygon myPolygon = new Polygon();
        myPolygon.addPoint(p1, p2);
        myPolygon.addPoint(p3, p4);
        myPolygon.addPoint(p5, p6);
        g.fillPolygon(myPolygon);
        g.drawPolygon(myPolygon);
    }

    public void buildWindow(int x, int y, int width, int height) {
        g.setColor(Color.YELLOW);
        this.width = width;
        this.height = height;
        //   g.fillRect(450, 450, 55, 100);
        g.fillRect(x, y, width, height);        // outines
        g.setColor(Color.BLUE);
        g.drawLine(x, y, x + width, y);                       // top line
        g.drawLine(x, y, x, y + height);                     //  left side
        g.drawLine(x + width, y, x + width, y + height); //  right side
        g.drawLine(x, y + height, x + width, y + height); //  bottom side
        // mullions vertical Center Vetrical
        g.drawLine(x + (width / 2), y, x + (width / 2), y + height);
        // mullions vertical Center horizontal
        g.drawLine(x, y + (height / 2), x + width, y + (height / 2));


    }

    public void buildDoor(int x, int y, int width, int height) {
        this.width = width;
        this.height = height;
        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);        // outines6
        g.setColor(Color.BLUE);
    }

    public void addDoorKnob(int x, int y, int width, int height) {
        g.setColor(Color.BLACK);
        g.drawOval(x, y, 3, 5);
        //    g.drawOval(x, y, 3, 3);
    }
    public void addDoorWindow(int x, int y, int width, int height) {
        g.setColor(Color.BLACK);
        g.drawOval(x, y,  width, height);
        //    g.drawOval(x, y, 3, 3);
    }

    public void buildChimney(int x, int y, int width, int height) {
        this.width = width;
        this.height = height;
        g.setColor(Color.CYAN);
        g.fillRect(x, y, width, height);        // outines6
        g.setColor(Color.BLUE);
    }

    public void drawSmoke(int x, int y, int width, int height) {
        g.setColor(Color.RED);
        for (int i = 0; i < 30; i++) {
            Random r = new Random();
            int w = r.nextInt(x);
            int h = r.nextInt(y);
            g.drawOval(w, h, 5, 8);
        }
        g.setColor(Color.LIGHT_GRAY);
        for (int i = 0; i < 30; i++) {
            Random r = new Random();
            int w = r.nextInt(x);
            int h = r.nextInt(y);
            g.drawOval(w, h, 5, 4);
        }
    }

    public void drawMoon(int x, int y, int width, int height) {
        g.setColor(Color.WHITE);
        // g.drawOval(x,y, 15, 15);
        g.drawOval(x, y, width, height);
        g.fillOval(x, y, width, height);
    }

    public void drawShrub(int x, int y, int width, int height) {
        g.setColor(Color.GREEN);
        // g.drawOval(x,y, 15, 15);
        g.drawOval(x, y, width, height);
        g.fillOval(x, y, width, height);
    }

    public void drawSidewalk(int x, int y, int width, int height) {
        g.setColor(Color.WHITE);
        // g.drawOval(x,y, 15, 15);
        g.fillRect(x, y, width, height);
    }

    public static void main(String[] args) {
        Mansion myMansion = new Mansion(800, 800);
        myMansion.colorBG();
        myMansion.drawSnow();
        //   g.setColor(Color.GRAY);
        // do Lawn
        myMansion.bigGreenSpace(0, 600, 800, 400);
        //    myMansion.bodyBodyHouse();
        myMansion.buildOuthouse();         // 700, 400, 55, 100
        myMansion.buildPolygon(685, 500, 725, 475, 770, 500);// OUTHOUSE roof
        myMansion.buildDoor(710, 515, 35, 85);
        myMansion.addDoorKnob(735, 550, 35, 85);
        // outhouse door window
        myMansion.addDoorWindow(725, 525, 8, 15);
        //   g.setColor(Color.GREEN);
        myMansion.bigWhiteSpace(50, 200, 600, 500);
        myMansion.addSiding(50, 200, 600, 500);
        myMansion.buildWindow(130, 500, 100, 100);
        myMansion.buildWindow(470, 500, 100, 100);
        myMansion.buildWindow(130, 300, 75, 75);
        myMansion.buildWindow(250, 300, 75, 75);
        myMansion.buildWindow(370, 300, 75, 75);
        myMansion.buildWindow(500, 300, 75, 75);
        //    myMansion.buildWindow(500, 175, 100, 100);
        //    myMansion.buildWindow(375, 175, 100, 100);
        myMansion.buildDoor(300, 500, 100, 200);
        myMansion.addDoorKnob(315, 600, 35, 85);
        myMansion.buildChimney(30, 60,19, 600);
        myMansion.drawSmoke(50,80,10, 10);
        myMansion.drawMoon(725, 50, 30, 30);
        myMansion.buildPolygon(30, 200, 675, 200, 350, 75);  // house roof
        myMansion.drawShrub(80, 650, 50, 70);
        myMansion.drawShrub(160, 650, 50, 70);
        myMansion.drawShrub(240, 650, 50, 70);
        myMansion.drawShrub(420, 650, 50, 70);
        myMansion.drawShrub(500, 650, 50, 70);
        myMansion.drawShrub(580, 650, 50, 70);
        myMansion.drawSidewalk(300, 700, 100, 100);
    //  myMansion.drawSnow();
    }

}

