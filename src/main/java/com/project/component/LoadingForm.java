
package com.project.component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class LoadingForm extends javax.swing.JComponent {

   
    public LoadingForm() {
        initComponents();
    }
    
     @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(new Color(255, 255, 255, 200));
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        laodingLabel = new javax.swing.JLabel();

        laodingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laodingLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginPage/loading.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(laodingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(laodingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel laodingLabel;
    // End of variables declaration//GEN-END:variables
}
