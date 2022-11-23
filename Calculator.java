import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
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

    public Calculator(){
        frame = new JFrame("My calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null); // посмотреть что это такое

        textField = new JTextField();
        textField.setBounds(50,25,300,50);
        textField.setFont(myFont);
        textField.setEditable(false);

        nubmerButtons = new JButton[10];
        for(int i = 0; i < nubmerButtons.length; i++)
        {
            nubmerButtons[i] = new JButton(String.valueOf(i));
            nubmerButtons[i].setFont(myFont);
            nubmerButtons[i].addActionListener(this);
            nubmerButtons[i].setFocusable(false);
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

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = equButton;
        functionButtons[5] = delButton;
        functionButtons[6] = clrButton;
        functionButtons[7] = negButton;
        functionButtons[8] = decButton;

        for(int i = 0; i < functionButtons.length; i++)
        {
            functionButtons[i].setFont(myFont);
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFocusable(false);
        }

        panel = new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
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

    public static void main (String[] arg){
        Calculator calculator = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
