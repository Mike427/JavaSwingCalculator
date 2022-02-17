package sample;

import javax.swing.*;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator.setSize(300, 200);
        calculator.setVisible(true);
    }
}
