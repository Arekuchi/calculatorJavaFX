package sample;

import javax.swing.*;

public class calculator {
    private JPanel calculator;
    private JTextField textField1;
    private JRadioButton On;
    private JRadioButton Off;
    private JButton button1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("calculator");
        frame.setContentPane(new calculator().calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
