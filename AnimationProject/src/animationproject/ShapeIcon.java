/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animationproject;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 * An icon that contains a movable shape.
 */
public class ShapeIcon implements Icon {

    /**
     * constructor for ShapeIcon
     *
     * @param shapes , an arraylist of movable shapes
     * @param width, the width
     * @param height , the height
     */
    public ShapeIcon(ArrayList<MoveableShape> shapes,
            int width, int height) {
        this.shapes = shapes;
        this.width = width;
        this.height = height;
    }

    /**
     * get icon width
     *
     * @return the width
     */
    public int getIconWidth() {
        return width;
    }

    /**
     * get icon height
     *
     * @return the height
     */
    public int getIconHeight() {
        return height;
    }

    /**
     * Paints the icon
     *
     * @param c, the component
     * @param g, the graphic being paint
     * @param x, x coordinate
     * @param y, y coordinate
     */
    public void paintIcon(Component c, Graphics g, int x, int y) {
        for (int i = 0; i < shapes.size(); i++) {
            Graphics2D g2 = (Graphics2D) g;
            shapes.get(i).draw(g2);
        }

    }

    private int width;
    private int height;
    private ArrayList<MoveableShape> shapes;
}
