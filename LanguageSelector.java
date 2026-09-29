import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LanguageSelector extends JFrame implements ActionListener {
    JCheckBox javaCheckBox, pythonCheckBox, cppCheckBox, jsCheckBox;
    JButton submitButton;
    JLabel resultLabel;

    public LanguageSelector() {
        setTitle("Programming Language Selector");
        setSize(400, 300);
        setLayout(new FlowLayout());

        javaCheckBox = new JCheckBox("Java");
        pythonCheckBox = new JCheckBox("Python");
        cppCheckBox = new JCheckBox("C++");
        jsCheckBox = new JCheckBox("JavaScript");

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        resultLabel = new JLabel("Selected Languages: ");

        add(new JLabel("Select your favorite languages:"));
        add(javaCheckBox);
        add(pythonCheckBox);
        add(cppCheckBox);
        add(jsCheckBox);
        add(submitButton);
        add(resultLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        StringBuilder selected = new StringBuilder("Selected Languages: ");
        boolean found = false;

        if (javaCheckBox.isSelected()) {
            selected.append("Java ");
            found = true;
        }
        if (pythonCheckBox.isSelected()) {
            selected.append("Python ");
            found = true;
        }
        if (cppCheckBox.isSelected()) {
            selected.append("C++ ");
            found = true;
        }
        if (jsCheckBox.isSelected()) {
            selected.append("JavaScript ");
            found = true;
        }

        if (!found) {
            selected = new StringBuilder("No language selected.");
        }

        resultLabel.setText(selected.toString());
    }

    public static void main(String[] args) {
        new LanguageSelector();
    }
}
