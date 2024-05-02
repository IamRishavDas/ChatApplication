
package com.project.chatapplication;


import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;
import com.project.event.ImageViewEvent;
import com.project.event.PublicEvent;
import com.project.modernComponent.ComponentResizer;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.Icon;


public class ChatWindow extends javax.swing.JFrame {

    private final int width = 900;
    private final int height = 500;
    
    public ChatWindow() {
        initComponents();
        init();
    }
    
    private void init() {
        ComponentResizer com = new ComponentResizer();
        com.registerComponent(this);
        com.setMinimumSize(new Dimension(width, height));
        com.setMaximumSize(Toolkit.getDefaultToolkit().getScreenSize());
        com.setSnapSize(new Dimension(10, 10));
        imageViewer.setVisible(false);
        home.setVisible(true);
        initEvent();
    }
    
    private void initEvent(){
        PublicEvent.getInstance().setImageViewEvent(new ImageViewEvent(){
            @Override
            public void viewImage(Icon image){
                imageViewer.viewImage(image);
            }
            
            @Override
            public void saveImage(Icon image){
                System.out.println("Todo: save image!!");
            }
        });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        backgroundContent = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        closeButton = new javax.swing.JButton();
        maximizeButton = new javax.swing.JButton();
        minimizeButton = new javax.swing.JButton();
        contentBody = new javax.swing.JLayeredPane();
        signinPage = new com.project.signinPage.SigninPage();
        imageViewer = new com.project.component.ImageViewer();
        home = new com.project.chatapplication.Home();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        backgroundPanel.setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/navigationIcons/close.png"))); // NOI18N
        closeButton.setBorder(null);
        closeButton.setContentAreaFilled(false);
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeButtonMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                closeButtonMouseReleased(evt);
            }
        });
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        maximizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/navigationIcons/maximize.png"))); // NOI18N
        maximizeButton.setBorder(null);
        maximizeButton.setContentAreaFilled(false);
        maximizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maximizeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maximizeButtonMouseExited(evt);
            }
        });
        maximizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maximizeButtonActionPerformed(evt);
            }
        });

        minimizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/navigationIcons/minimize.png"))); // NOI18N
        minimizeButton.setBorder(null);
        minimizeButton.setContentAreaFilled(false);
        minimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseExited(evt);
            }
        });
        minimizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(maximizeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(minimizeButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minimizeButton)
                    .addComponent(maximizeButton)
                    .addComponent(closeButton))
                .addContainerGap())
        );

        contentBody.setLayout(new java.awt.CardLayout());
        contentBody.add(signinPage, "card4");
        contentBody.setLayer(imageViewer, javax.swing.JLayeredPane.POPUP_LAYER);
        contentBody.add(imageViewer, "card3");
        contentBody.add(home, "card2");

        javax.swing.GroupLayout backgroundContentLayout = new javax.swing.GroupLayout(backgroundContent);
        backgroundContent.setLayout(backgroundContentLayout);
        backgroundContentLayout.setHorizontalGroup(
            backgroundContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentBody, javax.swing.GroupLayout.DEFAULT_SIZE, 1261, Short.MAX_VALUE)
                .addContainerGap())
        );
        backgroundContentLayout.setVerticalGroup(
            backgroundContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundContentLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentBody, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(backgroundContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(backgroundContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private int pX;
    private int pY;
    
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - pX, this.getLocation().y + evt.getY() - pY);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        pX = evt.getX();
        pY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void maximizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maximizeButtonActionPerformed
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double screenWidth = screenSize.getWidth();
        double screenHeight = screenSize.getHeight();
        
        this.setSize((int)screenWidth, (int)screenHeight);
        this.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_maximizeButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void minimizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeButtonActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_minimizeButtonActionPerformed

    private void closeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseEntered
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/navigationIcons/close_hover.png")));
    }//GEN-LAST:event_closeButtonMouseEntered

    private void closeButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseReleased
        System.out.println("TODO: NOT IMPLEMENTED YET!");
    }//GEN-LAST:event_closeButtonMouseReleased

    private void closeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseExited
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/navigationIcons/close.png")));
    }//GEN-LAST:event_closeButtonMouseExited

    private void maximizeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeButtonMouseEntered
        maximizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/navigationIcons/maximize_hover.png")));
    }//GEN-LAST:event_maximizeButtonMouseEntered

    private void maximizeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeButtonMouseExited
        maximizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/navigationIcons/maximize.png")));
    }//GEN-LAST:event_maximizeButtonMouseExited

    private void minimizeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseEntered
        minimizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/navigationIcons/minimize_hover.png")));
    }//GEN-LAST:event_minimizeButtonMouseEntered

    private void minimizeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseExited
        minimizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/navigationIcons/minimize.png")));
    }//GEN-LAST:event_minimizeButtonMouseExited

    
    public static void main(String args[]) {
        
        FlatArcIJTheme.setup();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ChatWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundContent;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton closeButton;
    private javax.swing.JLayeredPane contentBody;
    private com.project.chatapplication.Home home;
    private com.project.component.ImageViewer imageViewer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton maximizeButton;
    private javax.swing.JButton minimizeButton;
    private com.project.signinPage.SigninPage signinPage;
    // End of variables declaration//GEN-END:variables
}
