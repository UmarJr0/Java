package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeometryUI {
    JFrame frame = new JFrame("Geometry");
    JFrame areaOfSquareFrame = new JFrame("area of Square");
    JButton calculateAreaOfSquare = new JButton("Calculate");
    JButton areaOfSquare = new JButton("areaOfSquare");
    JTextField enterLengthOfSquare = new JTextField("Enter Length: ");

    JButton areaOfTriangle = new JButton("areaOfTriangle");
    JButton areaOfRectangle = new JButton("areaOfRectangle");




    public void mainUI() {
        frame.add(areaOfSquare);
        frame.add(areaOfTriangle);
        frame.add(areaOfRectangle);
        frame.setSize (150, 200);
        frame.setLayout(new GridLayout(3,1));
        frame.setVisible(true);
        areaOfSquare.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Calculate area of Square");
                JOptionPane.showMessageDialog(null,"Calculate area of Square");

            }
        });

        }
        public void drawAreaOfSquare (){
        areaOfSquareFrame.add(enterLengthOfSquare);
        areaOfSquareFrame.add(calculateAreaOfSquare);
        areaOfSquareFrame.setLayout(new GridLayout(2,1));
        areaOfSquareFrame.setSize(150,200);
        areaOfSquareFrame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        GeometryUI Geometry = new GeometryUI();

        calculateAreaOfSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               float result = GeometryUI.areaOfSquare(Float.parseFloat(enterLengthOfSquare.getText()));
                System.out.println("Calculate area of Square");
                JOptionPane.showMessageDialog(null, "area of a Square");

            }
        });
        }

    private static float areaOfSquare(float v) {
        return 0;
    }

}

