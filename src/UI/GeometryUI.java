package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeometryUI {
    JFrame frame = new JFrame("Geometry");
    JFrame areaOfSquareFrame = new JFrame("Area of Square");
    JButton calculateAreaOfSquare = new JButton("Calculate");
    JButton areaOfSquare = new JButton("Area of Square");
    JTextField enterLengthOfSquare = new JTextField("Enter Length: ");

    JButton areaOfTriangle = new JButton("Area of Triangle");
    JButton areaOfRectangle = new JButton("Area of Rectangle");

    public void mainUI() {
        frame.add(areaOfSquare);
        frame.add(areaOfTriangle);
        frame.add(areaOfRectangle);
        frame.setSize(200, 150);
        frame.setLayout(new GridLayout(3, 1));
        frame.setVisible(true);
        areaOfSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Calculate area of Square");
                JOptionPane.showMessageDialog(null, "Calculate area of Square");
            }
        });
    }

    public void drawAreaOfSquare() {
        areaOfSquareFrame.add(enterLengthOfSquare);
        areaOfSquareFrame.add(calculateAreaOfSquare);
        areaOfSquareFrame.setLayout(new GridLayout(2, 1));
        areaOfSquareFrame.setSize(200, 150);
        areaOfSquareFrame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        calculateAreaOfSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float length = Float.parseFloat(enterLengthOfSquare.getText());
                float result = areaOfSquare(length);
                System.out.println("Calculate area of Square");
                JOptionPane.showMessageDialog(null, "The area of the Square from the provided length is: " + result);
            }
        });
    }

    private float areaOfSquare(float length) {
        return length * length;
    }

    public static void main(String[] args) {
        GeometryUI geometryUI = new GeometryUI();
        geometryUI.mainUI();
        geometryUI.drawAreaOfSquare();
    }
}
