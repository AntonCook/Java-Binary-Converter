import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.google.common.base.Splitter;

public class Main implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JTextArea textArea;

    public Main() {
        frame = new JFrame();
        frame.setTitle("Binary Converter");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);

        button = new JButton("Convert");
        button.addActionListener(this);
        button.setFocusable(false);
        button.setFont(new Font("Comic Sans", Font.PLAIN, 12));

        textArea = new JTextArea();
        textArea.setLineWrap(true);



        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 20, 20));
        panel.setLayout(new GridLayout(2, 1));
        panel.add(textArea);
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);


    }

    public void show() {
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String input = textArea.getText();
        textArea.setText("");
        if(input.charAt(0) == '1' || input.charAt(0) == '0') {
           String output = CLI.BinaryToEnglish(input);
           textArea.setText(output);
        }
        else {
            String output = CLI.EnglishToBinary(input);
            textArea.setText(output);
        }
    }
}