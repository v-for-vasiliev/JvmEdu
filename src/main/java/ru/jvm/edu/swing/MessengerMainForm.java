package ru.jvm.edu.swing;

import java.awt.Dimension;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class MessengerMainForm {

    private JPanel mainPanel;
    private JTextField messageInput;
    private JButton sendButton;
    private JScrollPane chatScroll;
    private JList<String> messagesList;

    public MessengerMainForm() {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        messagesList.setModel(listModel);
        listModel.addElement("");

        sendButton.addActionListener(e -> {
            System.out.println("hello");
            listModel.addElement(messageInput.getText());
            messageInput.setText("");
        });
        messageInput.addActionListener(e -> {
            listModel.addElement(messageInput.getText());
            messageInput.setText("");
        });
        chatScroll.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                e.getAdjustable().setValue(e.getAdjustable().getMaximum());
            }
        });
    }

    public void showForm() {
        JFrame frame = new JFrame("Messenger Form");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
    }
}
