import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator1 extends JFrame implements ActionListener {
    JTextField input1, input2, result;
    JButton addBtn, subBtn, mulBtn, divBtn, clearBtn;

    public Calculator1() {
        setTitle("Basic Calculator");
        setSize(350, 250);
        setLayout(new GridLayout(6, 2, 10, 10));
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        add(new JLabel("Enter First Number:"));
        input1 = new JTextField();
        add(input1);

        add(new JLabel("Enter Second Number:"));
        input2 = new JTextField();
        add(input2);

        add(new JLabel("Result:"));
        result = new JTextField();
        result.setEditable(false);
        add(result);


        addBtn = new JButton("Add");
        subBtn = new JButton("Subtract");
        mulBtn = new JButton("Multiply");
        divBtn = new JButton("Divide");
        clearBtn = new JButton("Clear");

        add(addBtn);
        add(subBtn);
        add(mulBtn);
        add(divBtn);
        add(clearBtn);

 
        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        mulBtn.addActionListener(this);
        divBtn.addActionListener(this);
        clearBtn.addActionListener(this);

        setLocationRelativeTo(null); 
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(input1.getText());
            double num2 = Double.parseDouble(input2.getText());
            double output = 0;

            if (e.getSource() == addBtn) {
                output = num1 + num2;
            } else if (e.getSource() == subBtn) {
                output = num1 - num2;
            } else if (e.getSource() == mulBtn) {
                output = num1 * num2;
            } else if (e.getSource() == divBtn) {
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(this, "Cannot divide by zero!");
                    return;
                }
                output = num1 / num2;
            } else if (e.getSource() == clearBtn) {
                input1.setText("");
                input2.setText("");
                result.setText("");
                return;
            }

            result.setText(String.valueOf(output));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        new Calculator1();
    }
}
