package sample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator {
    private JPanel calculator;
    private JTextField textField1;
    private JRadioButton On;
    private JRadioButton Off;
    private JButton button1;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton multiplyButton;
    private JButton divideButton;
    private JButton minusButton;
    private JButton addButton;
    private JButton equalButton;
    private JButton clearButton;
    private Operation calcOperation;
    private Double leftOperand;
    private Double rightOperand;

    public calculator() {

        a7Button.addActionListener(new NumberBtnClicked(a7Button.getText()));
        a8Button.addActionListener(new NumberBtnClicked(a8Button.getText()));
        a9Button.addActionListener(new NumberBtnClicked(a9Button.getText()));
        a4Button.addActionListener(new NumberBtnClicked(a4Button.getText()));
        a5Button.addActionListener(new NumberBtnClicked(a5Button.getText()));
        a6Button.addActionListener(new NumberBtnClicked(a6Button.getText()));
        a1Button.addActionListener(new NumberBtnClicked(a1Button.getText()));
        a2Button.addActionListener(new NumberBtnClicked(a2Button.getText()));
        a3Button.addActionListener(new NumberBtnClicked(a3Button.getText()));
        a0Button.addActionListener(new NumberBtnClicked(a0Button.getText()));

//        percentBtn.addActionListener(new OperationBtnClicked(Operation.PERCENTAGE));
//        multiplyButton.addActionListener(new OperationBtnClicked(Operation.MULTIPLICATION));
//        divideButton.addActionListener(new OperationBtnClicked(Operation.DIVISION));
//        minusButton.addActionListener(new OperationBtnClicked(Operation.SUBTRACTION));
//        addButton.addActionListener(new OperationBtnClicked(Operation.ADDITION));
        equalButton.addActionListener(new EqualBtnClicked());
        clearButton.addActionListener(new ClearBtnClicked());
//        signBtn.addActionListener(new SignBtnClicked());
//        digitBtn.addActionListener(new DigitBtnClicked());
    }

    private class NumberBtnClicked implements ActionListener {

        private String value;

        public NumberBtnClicked(String value) {
            this.value = value;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(leftOperand == null || leftOperand == 0.0) {
                value = textField1.getText() + value;
            }else{
                rightOperand = Double.valueOf(value);
            }
            textField1.setText(value);

        }
    }

    private class OperationBtnClicked implements ActionListener {

        private Operation operation;

        public OperationBtnClicked(Operation operation) {
            this.operation = operation;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            calcOperation = operation;
            leftOperand = Double.valueOf(textField1.getText());
        }
    }

    private class ClearBtnClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText("");
            leftOperand = 0.0;
            rightOperand = 0.0;
        }
    }

    private class DigitBtnClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText(textField1.getText() + ".");

        }
    }

    private class EqualBtnClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
//            Double output = calcOperation.getOperator().applyAsDouble(leftOperand, rightOperand);
//            textField1.setText(output%1==0?String.valueOf(output.intValue()):String.valueOf(output));
            leftOperand = 0.0;
            rightOperand = 0.0;
        }
    }

    private class SignBtwClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText("-"+ textField1.getText());
        }
    }




    public static void main(String[] args) {
        JFrame frame = new JFrame("calculator");
        frame.setContentPane(new calculator().calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }


}
