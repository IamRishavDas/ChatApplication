
package com.project.component;

import com.project.event.PublicEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.Icon;
import javax.swing.SwingUtilities;


public class ImageViewer extends javax.swing.JComponent {

    private Icon img;
   
    public ImageViewer() {
        initComponents();
    }
    
    public void viewImage(Icon image){
        this.img = image;
        this.image.setImage(image);
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        image = new com.project.modernComponent.PictureBox();
        saveImage = new javax.swing.JButton();

        image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imageMousePressed(evt);
            }
        });

        saveImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uiIcons/download.png"))); // NOI18N
        saveImage.setContentAreaFilled(false);
        saveImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveImageActionPerformed(evt);
            }
        });

        image.setLayer(saveImage, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout imageLayout = new javax.swing.GroupLayout(image);
        image.setLayout(imageLayout);
        imageLayout.setHorizontalGroup(
            imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imageLayout.createSequentialGroup()
                .addContainerGap(845, Short.MAX_VALUE)
                .addComponent(saveImage)
                .addContainerGap())
        );
        imageLayout.setVerticalGroup(
            imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(saveImage)
                .addContainerGap(606, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void imageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMousePressed
        if(SwingUtilities.isLeftMouseButton(evt)){
            setVisible(false);
        }
    }//GEN-LAST:event_imageMousePressed

    private void saveImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveImageActionPerformed
        PublicEvent.getInstance().getImageViewEvent().saveImage(img);
    }//GEN-LAST:event_saveImageActionPerformed

    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(new Color(0, 0, 0, 200));
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.project.modernComponent.PictureBox image;
    private javax.swing.JButton saveImage;
    // End of variables declaration//GEN-END:variables
}
