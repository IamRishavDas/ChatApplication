
package com.project.chatapplication;

import java.awt.Color;
import javax.swing.Icon;


public class ChatLeftWithProfile extends javax.swing.JLayeredPane {

    
    public ChatLeftWithProfile() {
        initComponents();
        text.setBackground(new Color(255, 222, 224));
    }
    
    public void setText(String text){
        if(text.equals("")){
            this.text.hideText();
        } else {
            this.text.setText(text);
        }
    }
    
    public void setUserProfile(String user){
        this.text.setUserProfile(user);
    }
    
    public void setImageProfile(Icon imageIcon){
        this.image.setImage(imageIcon);
    }
    
    public void setImage(Icon... image){
        this.text.setImage(false, image);
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        image = new com.project.modernComponent.ImageAvatar();
        text = new com.project.component.ChatItem();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        image.setBorderSize(0);
        image.setImage(new javax.swing.ImageIcon(getClass().getResource("/socialIcons/profilePic.png"))); // NOI18N
        image.setMaximumSize(new java.awt.Dimension(31, 31));
        image.setMinimumSize(new java.awt.Dimension(31, 31));
        image.setPreferredSize(new java.awt.Dimension(31, 31));

        jLayeredPane1.setLayer(image, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jLayeredPane1);
        add(text);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.project.modernComponent.ImageAvatar image;
    private javax.swing.JLayeredPane jLayeredPane1;
    private com.project.component.ChatItem text;
    // End of variables declaration//GEN-END:variables
}
