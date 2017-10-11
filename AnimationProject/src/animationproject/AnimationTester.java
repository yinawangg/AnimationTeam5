/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animationproject;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * This program implements an animation that moves a car shape.
 */
public class AnimationTester {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        ArrayList<MoveableShape> carList = new ArrayList<MoveableShape>();
        for (int i = 0; i < CAR_NUM; i++) {
            carList.add(new CarShape(i, i * 100, CAR_WIDTH));
        }

        ShapeIcon icon = new ShapeIcon(carList,
                ICON_WIDTH, ICON_HEIGHT);

        final JLabel label = new JLabel(icon);
        frame.setLayout(new FlowLayout());
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        final int DELAY = 100;
        // Milliseconds between timer ticks
        Timer t = new Timer(DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                for (int i = 0; i < CAR_NUM; i++) {
                    carList.get(i).translate(1, 0);
                }

                label.repaint();
            }
        });
        t.start();
    }

    private static final int ICON_WIDTH = 400;
    private static final int ICON_HEIGHT = 500;
    private static final int CAR_WIDTH = 100;
    private static final int CAR_NUM = 5;
}
