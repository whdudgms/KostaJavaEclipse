package com.kosta.exam08;

import java.awt.*;
import java.awt.event.*;
import java.util.Stack;

public class ScientificCalculator extends Frame implements ActionListener {
    TextField display;
    Button[] numberButtons = new Button[10];
    Button addButton, subButton, mulButton, divButton, eqButton, clrButton;
    Button sinButton, cosButton, tanButton, logButton, sqrtButton;
    Panel panel;

    // Variables to hold the operands and operator
    double num1 = 0, num2 = 0, result = 0;
    char operator;

    public ScientificCalculator() {
        // Frame properties
        setTitle("Scientific Calculator");
        setSize(400, 600);
        setLayout(new BorderLayout());

        // Display field
        display = new TextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Panel for buttons
        panel = new Panel();
        panel.setLayout(new GridLayout(6, 4));

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

        // Scientific function buttons
        sinButton = new Button("sin");
        cosButton = new Button("cos");
        tanButton = new Button("tan");
        logButton = new Button("log");
        sqrtButton = new Button("sqrt");

        sinButton.addActionListener(this);
        cosButton.addActionListener(this);
        tanButton.addActionListener(this);
        logButton.addActionListener(this);
        sqrtButton.addActionListener(this);

        panel.add(sinButton);
        panel.add(cosButton);
        panel.add(tanButton);
        panel.add(logButton);
        panel.add(sqrtButton);

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

        try {
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
            } else if (command.equals("sin")) {
                num1 = Math.sin(Double.parseDouble(display.getText()));
                display.setText(String.valueOf(num1));
            } else if (command.equals("cos")) {
                num1 = Math.cos(Double.parseDouble(display.getText()));
                display.setText(String.valueOf(num1));
            } else if (command.equals("tan")) {
                num1 = Math.tan(Double.parseDouble(display.getText()));
                display.setText(String.valueOf(num1));
            } else if (command.equals("log")) {
                num1 = Math.log(Double.parseDouble(display.getText()));
                display.setText(String.valueOf(num1));
            } else if (command.equals("sqrt")) {
                num1 = Math.sqrt(Double.parseDouble(display.getText()));
                display.setText(String.valueOf(num1));
            } else {
                if (!display.getText().isEmpty()) {
                    num1 = Double.parseDouble(display.getText());
                    operator = command.charAt(0);
                    display.setText("");
                }
            }
        } catch (Exception ex) {
            display.setText("Error");
        }
    }

    public static void main(String[] args) {
        new ScientificCalculator();
    }
}