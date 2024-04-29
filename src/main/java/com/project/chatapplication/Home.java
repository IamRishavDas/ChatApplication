
package com.project.chatapplication;

import net.miginfocom.swing.MigLayout;


public class Home extends javax.swing.JLayeredPane {

    
    public Home() {
        initComponents();
        init();
    }
    
    private void init() {
        this.setLayout(new MigLayout("fillx, filly", "0[200!]5[fill, 100%]5[200!]0", "0[fill]0"));
        this.add(new LeftMenu());
        this.add(new ChatPanel());
        this.add(new RightMenu());
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1099, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
