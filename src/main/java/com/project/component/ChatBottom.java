
package com.project.component;

import com.project.event.PublicEvent;
import com.project.modernComponent.JIMSendTextPane;
import com.project.modernComponent.ScrollBar;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;


public class ChatBottom extends javax.swing.JPanel {

    public ChatBottom() {
        initComponents();
        init();
    }

    private void init(){
        setLayout(new MigLayout("fillx, filly", "0[fill]0[]0[]2", "2[fill]2"));
        JScrollPane scroll = new JScrollPane();
        scroll.setBorder(null);
        JIMSendTextPane text= new JIMSendTextPane();
        text.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent e){
                refresh();
            }
        });
        text.setBorder(new EmptyBorder(5,5,5,5));
        text.setHintText("Write message here...");
        scroll.setViewportView(text);
        ScrollBar scrollBar = new ScrollBar(Color.BLACK);
        scrollBar.setBackground(new Color(255,153,153));
        scrollBar.setPreferredSize(new Dimension(2, 10));
        scroll.setVerticalScrollBar(scrollBar);
        this.add(scrollBar);
        this.add(scroll, "w 100%");
        
        JPanel panel = new JPanel();
        panel.setLayout(new MigLayout("filly", "0[]0", "0[bottom]0"));
        panel.setPreferredSize(new Dimension(20, 28));
        panel.setBackground(Color.WHITE);
        JButton sendButton = new JButton();
        sendButton.setBorder(null);
        sendButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        sendButton.setContentAreaFilled(false);
        sendButton.setIcon(new ImageIcon(getClass().getResource("/uiIcons/sendIcon.png")));
        sendButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String message = text.getText().trim();
                if(!message.equals("")){
                    PublicEvent.getInstance().getChatEvent().sendMessage(message);
                    text.setText("");
                    text.grabFocus();
                    refresh();
                } else {
                    text.grabFocus();
                }
            }
        });
        panel.add(sendButton);
        this.add(panel);
    }
    
    private void refresh(){
        revalidate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
