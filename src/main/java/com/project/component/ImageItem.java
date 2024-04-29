
package com.project.component;

import com.project.blurHash.BlurHash;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;



public class ImageItem extends javax.swing.JLayeredPane {

    
    public ImageItem() {
        initComponents();
    }

    public void setImage(String image){
        int width = 200;
        int height = 200;
        int[] data = BlurHash.decode(image, width, height, 1);
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        bufferedImage.setRGB(0, 0, width, height, data, 0, width);
        Icon iconImage = new ImageIcon(bufferedImage);
        picture.setImage(iconImage);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        picture = new com.project.modernComponent.PictureBox();
        progress1 = new com.project.modernComponent.Progress();

        progress1.setForeground(new java.awt.Color(255, 255, 255));
        progress1.setValue(70);
        progress1.setProgressType(com.project.modernComponent.Progress.ProgressType.CANCEL_FILE);

        picture.setLayer(progress1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pictureLayout = new javax.swing.GroupLayout(picture);
        picture.setLayout(pictureLayout);
        pictureLayout.setHorizontalGroup(
            pictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pictureLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(progress1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pictureLayout.setVerticalGroup(
            pictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pictureLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(progress1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setLayer(picture, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(picture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(picture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.project.modernComponent.PictureBox picture;
    private com.project.modernComponent.Progress progress1;
    // End of variables declaration//GEN-END:variables
}
