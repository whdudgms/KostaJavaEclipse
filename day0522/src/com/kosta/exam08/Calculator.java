package com.kosta.exam08;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
    // UI components
    TextField display;
    Button[] numberButtons = new Button[10];
    Button addButton, subButton, mulButton, divButton, eqButton, clrButton;
    Panel panel;

    // Variables to hold the operands and operator
    double num1 = 0, num2 = 0, result = 0;
    char operator;

    public Calculator() {
        // Frame properties
        setTitle("Calculator");
        setSize(400, 500);
        setLayout(new BorderLayout());

        // Display field
        display = new TextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Panel for buttons
        panel = new Panel();
        panel.setLayout(new GridLayout(4, 4));

        // Number buttons
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new Button(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            panel.add(numberButtons[i]);
        }

        // Operation buttons
        addButton = new Button("+");
        subButton = new Button("-");
        mulButton = new Button("*");
        divButton = new Button("/");
        eqButton = new Button("=");
        clrButton = new Button("C");

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        eqButton.addActionListener(this);
        clrButton.addActionListener(this);

        panel.add(addButton);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(divButton);
        panel.add(eqButton);
        panel.add(clrButton);

        add(panel, BorderLayout.CENTER);

        // Window close event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if ((command.charAt(0) >= '0' && command.charAt(0) <= '9') || command.equals(".")) {
            display.setText(display.getText() + command);
        } else if (command.charAt(0) == 'C') {
            display.setText("");
        } else if (command.charAt(0) == '=') {
            num2 = Double.parseDouble(display.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }

            display.setText(String.valueOf(result));
            num1 = result;
        } else {
            if (!display.getText().isEmpty()) {
                num1 = Double.parseDouble(display.getText());
                operator = command.charAt(0);
                display.setText("");
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}