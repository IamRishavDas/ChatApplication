
package com.project.chatapplication;

import java.awt.Color;
import javax.swing.Icon;


public class ChatRight extends javax.swing.JLayeredPane {

    
    public ChatRight() {
        initComponents();
        text.setBackground(new Color(168, 168, 168));
    }
    
    public void setText(String text){
        if(text.equals("")){
            this.text.hideText();
        } else {
            this.text.setText(text);
        }
        this.text.sendSuccess();
    }
    
    public void setImage(Icon... image){
        this.text.setImage(true, image);
    }
    
    public void setImage(String... image){
        this.text.setImage(false, image);
    }
    
    public void setTime(){
        this.text.setTime("10: 34pm");
    }
    
    public void setFile(String fileName, String fileSize){
        this.text.setFile(fileName, fileSize);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text = new com.project.component.ChatItem();

        setLayer(text, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.project.component.ChatItem text;
    // End of variables declaration//GEN-END:variables
}
