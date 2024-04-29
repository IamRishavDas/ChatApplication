
package com.project.component;

import com.project.event.PublicEvent;
import com.project.modernComponent.PictureBox;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;


public class ChatImage extends javax.swing.JLayeredPane {

   
    public ChatImage(boolean right) {
        initComponents();
        this.setLayout(new MigLayout("", "0["+(right ? "right" : "left")+"]0", "2[]2"));
    }

    public void addImage(Icon... images){
        for(Icon image: images){
            PictureBox pictureBox = new PictureBox();
            pictureBox.setPreferredSize(getAutoSize(image, 200, 200));
            pictureBox.setImage(image);
            addEvent(pictureBox, image);
            add(pictureBox, "wrap");
        }
    }
    
    public void addImage(String... images){
        for(String image: images){
            ImageItem imageItem = new ImageItem();
            imageItem.setPreferredSize(new Dimension(200, 200));
            imageItem.setImage(image);
//            addEvent(imageItem, image);
            add(imageItem, "wrap");
        }
    }
    
    private void addEvent(Component com, Icon image){
        com.setCursor(new Cursor(Cursor.HAND_CURSOR));
        com.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent evt){
                if(SwingUtilities.isLeftMouseButton(evt)){
                    PublicEvent.getInstance().getImageViewEvent().viewImage(image);
                }
            }
        });
    }
    
    private Dimension getAutoSize(Icon image, int w, int h) {
        if(w>image.getIconWidth()){
            w = image.getIconHeight();
        }
        if(h>image.getIconHeight()){
            h = image.getIconHeight();
        }
        int iw = image.getIconWidth();
        int ih = image.getIconHeight();
        double xScale = (double) w / iw;
        double yScale = (double) h / ih;
        double scale = Math.min(xScale, yScale);
        int width = (int) (scale * iw);
        int height = (int) (scale * ih);
        return new Dimension(width, height);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
