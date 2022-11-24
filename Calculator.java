import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    JFrame frame;
    JTextField textField;
    JButton[] nubmerButtons;

    JButton[] functionButtons;
    JButton addButton;
    JButton subButton;
    JButton mulButton;
    JButton divButton;
    JButton equButton;
    JButton delButton;
    JButton clrButton;
    JButton negButton;
    JButton decButton;

    JPanel panel;

    Font myFont = new Font("TimesRoman", Font.BOLD, 30);

    public Calculator() {
        frame = new JFrame("My calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// чтобы мы могли его закрыть
        frame.setSize(500, 500);
        frame.setLayout(null); // созание макета контейнера, если null то он пустой, если он пустой, то релентно устанавливать границы (bounders), размеры и тд

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont); //устанавлиаем шрифт
        textField.setEditable(false); // устанавливаем, что поле не редактируюся

        nubmerButtons = new JButton[10];
        for (int i = 0; i < nubmerButtons.length; i++) {
            nubmerButtons[i] = new JButton(String.valueOf(i));
            nubmerButtons[i].setFont(myFont); //устанавливваем шрифт
            nubmerButtons[i].addActionListener(this); //срабатывает на нажатии
            nubmerButtons[i].setFocusable(false); // объект не может быь сфокусирован
        }

        functionButtons = new JButton[9];
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("\u00d7");
        divButton = new JButton("\u00f7");
        equButton = new JButton("=");
        delButton = new JButton("\u232b");
        clrButton = new JButton("Clear");
        negButton = new JButton("\u00b1");
        decButton = new JButton(".");

        functionButtons[0] = addButton; // +
        functionButtons[1] = subButton; // -
        functionButtons[2] = mulButton; // *
        functionButtons[3] = divButton; // /
        functionButtons[4] = equButton; // =
        functionButtons[5] = delButton; // удаление
        functionButtons[6] = clrButton; // clear
        functionButtons[7] = negButton; // +/-
        functionButtons[8] = decButton; // .

        for (int i = 0; i < functionButtons.length; i++) {
            functionButtons[i].setFont(myFont); // шрифт
            functionButtons[i].addActionListener(this); //действует при нажатии
            functionButtons[i].setFocusable(false);
        }

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10)); //устанавлаем макет
        //panel.setBackground(Color.GREEN);

        panel.add(nubmerButtons[1]);
        panel.add(nubmerButtons[2]);
        panel.add(nubmerButtons[3]);
        panel.add(addButton);
        panel.add(nubmerButtons[4]);
        panel.add(nubmerButtons[5]);
        panel.add(nubmerButtons[6]);
        panel.add(subButton);
        panel.add(nubmerButtons[7]);
        panel.add(nubmerButtons[8]);
        panel.add(nubmerButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(nubmerButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        negButton.setBounds(50, 430, 65, 50);
        delButton.setBounds(125, 430, 80, 50);
        clrButton.setBounds(215, 430, 135, 50);

        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(panel);
        frame.add(textField);
        frame.setVisible(true);
    }

    public static void main(String[] arg) {
        Calculator calculator = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean firstPartOfNumber = false;
        boolean firstNumber = false;
        String number1 = "";
        String number2 = "";
        double result = 0;
        double number01;
        double number02;

        if (e.getSource() == nubmerButtons[1]) {
            if (firstPartOfNumber && firstNumber) {
                textField.setText("1");
                firstNumber = true;
            } else if (!firstPartOfNumber && firstNumber) {
                number1 = textField.getText();
                number1 = number1 + "1";
                textField.setText(number1);
            } else if (firstPartOfNumber && !firstNumber) {
                textField.setText("1");
                firstNumber = false;
            } else if (!firstPartOfNumber && !firstNumber) {
                number2 = textField.getText();
                number2 = number2 + "1";
                textField.setText(number2);
            }
        }

        if (e.getSource() == nubmerButtons[2]) {
            if (firstPartOfNumber && firstNumber) {
                textField.setText("2");
                firstNumber = true;
            } else if (!firstPartOfNumber && firstNumber) {
                number1 = textField.getText();
                number1 = number1 + "2";
                textField.setText(number1);
            } else if (firstPartOfNumber && !firstNumber) {
                textField.setText("2");
                firstNumber = false;
            } else if (!firstPartOfNumber && !firstNumber) {
                number2 = textField.getText();
                number2 = number2 + "2";
                textField.setText(number2);
            }
        }

        if (e.getSource() == nubmerButtons[3]) {
            if (firstPartOfNumber && firstNumber) {
                textField.setText("3");
                firstNumber = true;
            } else if (!firstPartOfNumber && firstNumber) {
                number1 = textField.getText();
                number1 = number1 + "3";
                textField.setText(number1);
            } else if (firstPartOfNumber && !firstNumber) {
                textField.setText("3");
                firstNumber = false;
            } else if (!firstPartOfNumber && !firstNumber) {
                number2 = textField.getText();
                number2 = number2 + "3";
                textField.setText(number2);
            }
        }

        if (e.getSource() == nubmerButtons[4]) {
            if (firstPartOfNumber && firstNumber) {
                textField.setText("4");
                firstNumber = true;
            } else if (!firstPartOfNumber && firstNumber) {
                number1 = textField.getText();
                number1 = number1 + "4";
                textField.setText(number1);
            } else if (firstPartOfNumber && !firstNumber) {
                textField.setText("4");
                firstNumber = false;
            } else if (!firstPartOfNumber && !firstNumber) {
                number2 = textField.getText();
                number2 = number2 + "4";
                textField.setText(number2);
            }
        }
        if (e.getSource() == nubmerButtons[5]) {
            if (firstPartOfNumber && firstNumber) {
                textField.setText("5");
                firstNumber = true;
            } else if (!firstPartOfNumber && firstNumber) {
                number1 = textField.getText();
                number1 = number1 + "5";
                textField.setText(number1);
            } else if (firstPartOfNumber && !firstNumber) {
                textField.setText("5");
                firstNumber = false;
            } else if (!firstPartOfNumber && !firstNumber) {
                number2 = textField.getText();
                number2 = number2 + "5";
                textField.setText(number2);
            }
        }
        if (e.getSource() == nubmerButtons[6]) {
            if (firstPartOfNumber && firstNumber) {
                textField.setText("6");
                firstNumber = true;
            } else if (!firstPartOfNumber && firstNumber) {
                number1 = textField.getText();
                number1 = number1 + "6";
                textField.setText(number1);
            } else if (firstPartOfNumber && !firstNumber) {
                textField.setText("6");
                firstNumber = false;
            } else if (!firstPartOfNumber && !firstNumber) {
                number2 = textField.getText();
                number2 = number2 + "6";
                textField.setText(number2);
            }
        }
        if (e.getSource() == nubmerButtons[7]) {
            if (firstPartOfNumber && firstNumber) {
                textField.setText("7");
                firstNumber = true;
            } else if (!firstPartOfNumber && firstNumber) {
                number1 = textField.getText();
                number1 = number1 + "7";
                textField.setText(number1);
            } else if (firstPartOfNumber && !firstNumber) {
                textField.setText("7");
                firstNumber = false;
            } else if (!firstPartOfNumber && !firstNumber) {
                number2 = textField.getText();
                number2 = number2 + "7";
                textField.setText(number2);
            }
        }

        if (e.getSource() == nubmerButtons[8]) {
            if (firstPartOfNumber && firstNumber) {
                textField.setText("8");
                firstNumber = true;
            } else if (!firstPartOfNumber && firstNumber) {
                number1 = textField.getText();
                number1 = number1 + "8";
                textField.setText(number1);
            } else if (firstPartOfNumber && !firstNumber) {
                textField.setText("8");
                firstNumber = false;
            } else if (!firstPartOfNumber && !firstNumber) {
                number2 = textField.getText();
                number2 = number2 + "8";
                textField.setText(number2);
            }
        }

        if (e.getSource() == nubmerButtons[9]) {
            if (firstPartOfNumber && firstNumber) {
                textField.setText("9");
                firstNumber = true;
            } else if (!firstPartOfNumber && firstNumber) {
                number1 = textField.getText();
                number1 = number1 + "9";
                textField.setText(number1);
            } else if (firstPartOfNumber && !firstNumber) {
                textField.setText("9");
                firstNumber = false;
            } else if (!firstPartOfNumber && !firstNumber) {
                number2 = textField.getText();
                number2 = number2 + "9";
                textField.setText(number2);
            }
        }

        if (e.getSource() == nubmerButtons[0]) {
            if (!firstPartOfNumber && firstNumber) {
                number1 = textField.getText();
                number1 = number1 + "0";
                textField.setText(number1);
            } else if (!firstPartOfNumb;.firstPartOfNumber && !firstNumber) {
                number2 = textField.getText();
                number2 = number2 + "0";
                textField.setText(number2);
            }
        }

        if (e.getSource() == equButton) {
            number02 = Double.parseDouble(textField.getText());
            if (e.getSource() == addButton) {
                number01 = Double.parseDouble(textField.getText());
                textField.setText(e.getActionCommand());
                result = number01 + number02;
            } else if (e.getSource() == subButton) {
                number01 = Double.parseDouble(textField.getText());
                textField.setText(e.getActionCommand());
                result = number01 - number02;
            } else if (e.getSource() == mulButton) {
                number01 = Double.parseDouble(textField.getText());
                textField.setText(e.getActionCommand());
                result = number01 * number02;
            } else if (e.getSource() == divButton) {
                number01 = Double.parseDouble(textField.getText());
                textField.setText(e.getActionCommand());
                result = number01 / number02;
            }
            textField.setText(String.valueOf(result));
        }
    }
}







