package net;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AppWindow extends Frame {

    private TextField textField;
    private Button button;

    public AppWindow() {
        super("Test frame");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        createGUI();
    }

    private void createGUI() {
        setSize(new Dimension(500, 200));
        Panel panel = new Panel();
        panel.setLayout(new FlowLayout());

        button = new Button("Button 1");
        button.setActionCommand("Button 1 was pressed!");
        panel.add(button);

        textField = new TextField();
        textField.setColumns(23);
        textField.setText("Lab-16 have done!");
        textField.setVisible(false);
        textField.setBounds(170, 50, 150, 20);
        panel.add(textField);

        button.addActionListener(e -> {
            textField.setVisible(true);
            panel.add(textField);
        });
        this.add(panel);
        setPreferredSize(new Dimension(320, 100));
    }

    public static void main(String[] args) {
        AppWindow frame = new AppWindow();
        frame.setVisible(true);
    }
}