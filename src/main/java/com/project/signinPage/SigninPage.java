
package com.project.signinPage;

import com.project.component.LoginForm;
import com.project.component.RegisterForm;
import com.project.event.LoginEvent;
import com.project.event.PublicEvent;
import com.project.model.ModelRegister;
import com.project.service.Service;
import io.socket.client.Ack;

public class SigninPage extends javax.swing.JPanel {

    public SigninPage() {
        initComponents();
        init();
    }

    private void init() {
        PublicEvent.getInstance().setLoginEvent(new LoginEvent() {
            @Override
            public void login() {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        PublicEvent.getInstance().getMainEvent().showLoading(true);
                        try {
                            Thread.sleep(4000);
                        } catch (InterruptedException ex) {
                            System.out.println("Sleep: Exception" + ex.getMessage());
                        }
                        PublicEvent.getInstance().getMainEvent().showLoading(false);
                        PublicEvent.getInstance().getMainEvent().showChat();
                        setVisible(false);
                    }
                }).start();
            }

            @Override
            public void register(ModelRegister registerData) {
                System.out.println("Client(signin page): The register method is incoked!!");
                System.out.println("signin page: json data ->" + registerData.toJSONObject());
                Service.getService().getClient().emit("register", registerData.toJSONObject(), new Ack() {
                    @Override
                    public void call(Object... os) {

                    }
                });
            }

            @Override
            public void goRegister() {
                panelSlide.show(1);
            }

            @Override
            public void goLogin() {
                panelSlide.show(0);
            }

        });
        LoginForm loginForm = new LoginForm();
        RegisterForm registerForm = new RegisterForm();
        panelSlide.init(loginForm, registerForm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signinPic = new com.project.modernComponent.PictureBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelSlide = new com.project.modernComponent.PanelSlide();

        setBackground(new java.awt.Color(204, 204, 255));

        signinPic.setImage(new javax.swing.ImageIcon(getClass().getResource("/loginPage/front.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel2.setText("ChatApplication");

        signinPic.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout signinPicLayout = new javax.swing.GroupLayout(signinPic);
        signinPic.setLayout(signinPicLayout);
        signinPicLayout.setHorizontalGroup(
                signinPicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(signinPicLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(jLabel2)
                                .addContainerGap(680, Short.MAX_VALUE)));
        signinPicLayout.setVerticalGroup(
                signinPicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signinPicLayout.createSequentialGroup()
                                .addContainerGap(529, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        panelSlide.setBackground(new java.awt.Color(204, 204, 255));
        panelSlide.setPreferredSize(new java.awt.Dimension(300, 400));

        javax.swing.GroupLayout panelSlideLayout = new javax.swing.GroupLayout(panelSlide);
        panelSlide.setLayout(panelSlideLayout);
        panelSlideLayout.setHorizontalGroup(
                panelSlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 303, Short.MAX_VALUE));
        panelSlideLayout.setVerticalGroup(
                panelSlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 383, Short.MAX_VALUE));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panelSlide, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                                .addContainerGap()));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panelSlide, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                                .addContainerGap()));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(signinPic, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(signinPic, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addContainerGap(80, Short.MAX_VALUE)
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 90, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 4,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.project.modernComponent.PanelSlide panelSlide;
    private com.project.modernComponent.PictureBox signinPic;
    // End of variables declaration//GEN-END:variables
}
