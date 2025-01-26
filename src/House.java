//******************************************************************************
//* This House class should contain all the methods to                         *
//* draw various shapes to create a house.                                     *
//******************************************************************************

import java.awt.*;
import java.io.IOException;

public class House {

    private int width;
    private int height;
    private Graphics g;

    public House(int width, int height) {
        g = new DrawingPanel(width, height).getGraphics();
    }

    /* sample method, you can delete this */
    public void drawOval(Color c, int x, int y, int width, int height) {
        g.setColor(c);
        g.fillOval(x, y, width, height);
        g.drawOval(x, y, width, height);
    }

    /* sample method, you can delete this */
    public void drawBlackLine(int x, int y, int x2, int y2) {
        g.setColor(Color.BLACK);
        g.drawLine(x, y, x2, y2);

    }

    /* sample method, you can delete this */
    public void drawRect(int x, int y, int width, int height) {

        g.fillRect(x, y, width, height);
        g.drawRect(x, y, width, height);
    }

    /* sample method, you can delete this */
    public void drawPolygon(int p1, int p2, int p3, int p4, int p5, int p6) {
        g.setColor(Color.BLACK);
        Polygon myPolygon = new Polygon();
        myPolygon.addPoint(p1, p2);
        myPolygon.addPoint(p3, p4);
        myPolygon.addPoint(p5, p6);
        g.fillPolygon(myPolygon);
        g.drawPolygon(myPolygon);
    }

    public void drawImage(String filename, int x, int y) {
        Image image = null;
        try {
            image = ImageUtility.loadImage(filename);
        } catch (Exception e) {
            e.printStackTrace();
        }
        g.drawImage(image,x,y,null);
    }

    public static void main(String[] args) {
        // sample drawing
        House myHouse = new House(500, 500);
        myHouse.drawOval(Color.BLUE, 50, 50, 250, 250);
        myHouse.drawImage("res/fire.gif",100,100);
        myHouse.drawOval(Color.ORANGE, 200, 200, 300, 300);
        myHouse.drawPolygon(400, 300, 210, 450, 300, 100);

    }

}
