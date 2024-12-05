import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class GUICalculator {
    // Components
    JFrame frame;
    JPanel panel;
    JLabel resultLabel;
    JTextField input1, input2;
    JComboBox<String> operators;

    // Constructor
    GUICalculator() {
        // Frame setup
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 100);

        // Create components
        JLabel resultLabel = new JLabel("Result: ");
        JButton calcButton = new JButton("Calculate");
        input1 = new JTextField("Type Input 1 Here");
        input2 = new JTextField("Type Input 2 Here");

        // Making JComboBox for the different operators
        String[] operatorBox = {"+", "-", "*", "/"};
        operators = new JComboBox<>(operatorBox);

        // Panel with FlowLayout
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(input1);
        panel.add(operators);
        panel.add(input2);
        panel.add(calcButton);
        panel.add(resultLabel);

        // Action Listener for button
        calcButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Turning text input to doubles
                    double num1 = Double.parseDouble(input1.getText());
                    double num2 = Double.parseDouble(input2.getText());
                    // Get selected operator and casting operators as a string
                    String operator = (String) operators.getSelectedItem();

                    // Original code for just addition
                    // double result = num1 + num2;
                    // resultLabel.setText("Result: " + result);

                    double result = 0.0; // initialize result variable

                    // Calculations based on selected operators
                    switch (operator) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            result = num1 / num2;
                            break;
                    }
                    resultLabel.setText("Result: " + result); // Outputting result
                } catch (NumberFormatException ex) { // Responds to invalid inputs
                    resultLabel.setText("Result: Invalid input!");
                }
            }
        });

        // Add panel to frame and make visible
        frame.add(panel);
        frame.setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        new GUICalculator();
    }
}


