
package com.project.component;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.border.EmptyBorder;


public class ChatItem extends javax.swing.JLayeredPane {

    private JLabel label;
   
    public ChatItem() {
        initComponents();
        text.setEditable(false);
        text.setBackground(new Color(0, 0, 0, 0));
        text.setOpaque(false);
    }
    
    public void setUserProfile(String user){
        JLayeredPane layer = new JLayeredPane();
        layer.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        layer.setBorder(new EmptyBorder(5, 10, 0, 10));
        JButton cmd = new JButton(user);
        cmd.setBorder(null);
        cmd.setContentAreaFilled(false);
        cmd.setFocusable(false);
        cmd.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
        cmd.setForeground(new Color(getRandom(0,255), getRandom(0,255), getRandom(0,255)));
        cmd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.text.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 5, 10));
        layer.add(cmd);
        add(layer, 0);
    }
    
    private int getRandom(int min, int max){
        return (int)(Math.random() * (max - min) + min);
    }
    
    public void setText(String text){
        this.text.setText(text);
    }
    
    public void setTime(String time){
        JLayeredPane layer = new JLayeredPane();
        layer.setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        layer.setBorder(new EmptyBorder(0, 5, 10, 10));
        label = new JLabel(time);
        label.setForeground(Color.GRAY);
        label.setHorizontalTextPosition(JLabel.LEFT);
        layer.add(label);
        add(layer);
    }
    
    public void sendSuccess(){
        if(label!=null){
            label.setIcon(new ImageIcon(getClass().getResource("/uiIcons/singleTick.png")));
        }
    }
    
    public void seen(){
        if(label!=null){
            label.setIcon(new ImageIcon(getClass().getResource("/uiIcons/doubleTick.png")));
        }
    }
    
    public void hideText(){
        this.text.setVisible(false);
    }
    
    public void setImage(boolean right, Icon... image){
        if(image.length > 0){
            JLayeredPane layer = new JLayeredPane();
            layer.setLayout(new FlowLayout(right ? FlowLayout.RIGHT : FlowLayout.LEFT));
            layer.setBorder(new EmptyBorder(0, 5, 0, 10));
            ChatImage chatImage = new ChatImage(right);
            chatImage.addImage(image);
            layer.add(chatImage);
            add(layer);
        }
    }
    
    public void setImage(boolean right, String... image){
        JLayeredPane layer = new JLayeredPane();
        layer.setLayout(new FlowLayout(right ? FlowLayout.RIGHT : FlowLayout.LEFT));
        layer.setBorder(new EmptyBorder(0, 5, 0, 10));
        ChatImage chatImage = new ChatImage(right);
        chatImage.addImage(image);
        layer.add(chatImage);
        add(layer);
    }
    
    public void setFile(String fileName, String fileSize){
        JLayeredPane layer = new JLayeredPane();
        layer.setLayout(new FlowLayout(FlowLayout.LEFT));
        layer.setBorder(new EmptyBorder(0, 5, 0, 10));
        ChatFile chatFile = new ChatFile();
        chatFile.setFile(fileName, fileSize);
        layer.add(chatFile);
        add(layer);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text = new com.project.modernComponent.JIMSendTextPane();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        text.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 5, 10));
        text.setSelectionColor(new java.awt.Color(255, 204, 204));
        add(text);
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(this.getBackground());
        g2.fillRoundRect(0, 0, this.getWidth(), this.getHeight(), 15, 15);
        super.paintComponent(g2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.project.modernComponent.JIMSendTextPane text;
    // End of variables declaration//GEN-END:variables


}
