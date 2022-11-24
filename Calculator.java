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

    double result = 0;
    double num1 = 0;
    double num2 = 0;
    char operator;

    public Calculator() {
        frame = new JFrame("My calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// чтобы мы могли его закрыть
        Dimension frameDimension = new Dimension(500, 500); //расширение
        frame.setResizable(false);
        frame.setSize(500, 500);
        frame.setLayout(null); // создание макета контейнера, если null то он пустой, если он пустой, то релентно устанавливать границы (bounders), размеры и тд

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
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == nubmerButtons[i]) {
                //textField.setText(textField.getText().concat(String.valueOf(i)));
                textField.setText(textField.getText() + i);
            }
        }
        if(e.getSource() == negButton){
           // double myDec = Double.parseDouble(textField.getText());
           // myDec = myDec * (-1.0);
           // textField.setText(String.valueOf(myDec));
            if(textField.getText().length() != 0 && textField.getText().charAt(0) == '-'){
                textField.setText(textField.getText().substring(1));
            }
            else{
                textField.setText("-" + textField.getText());
            }
            }

        if(e.getSource() == decButton && textField.getText().length() != 0 && !textField.getText().contains(".")){
            textField.setText(textField.getText() + ".");
        }

        if(e.getSource() == addButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        if(e.getSource() == subButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        if(e.getSource() == mulButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        if(e.getSource() == divButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }
        
        if(e.getSource() == equButton){
            num2 = Double.parseDouble(textField.getText());
            switch (operator){
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
            }
            textField.setText(String.valueOf(result));
            //num1 = result;
        }
        if(e.getSource() == clrButton){
            textField.setText("");
        }
        if(e.getSource() == delButton && textField.getText().length() != 0){
            String temp = textField.getText().substring(0, textField.getText().length() - 1);
            textField.setText(temp);
        }
    }
}









