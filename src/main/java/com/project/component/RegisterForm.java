
package com.project.component;

import com.project.event.PublicEvent;
import com.project.model.ModelRegister;


public class RegisterForm extends javax.swing.JPanel {

    
    public RegisterForm() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userNameInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passwordInput = new javax.swing.JPasswordField();
        registerButton = new javax.swing.JButton();
        backLoginButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        passwordConfirm = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(204, 204, 255));

        loginTitle.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        loginTitle.setForeground(new java.awt.Color(102, 102, 102));
        loginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTitle.setText("Register");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("User Name");

        userNameInput.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        userNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameInputActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Password");

        passwordInput.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        registerButton.setFont(new java.awt.Font("Segoe UI Symbol", 1, 16)); // NOI18N
        registerButton.setText("Register");
        registerButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        backLoginButton.setFont(new java.awt.Font("Segoe UI Symbol", 1, 16)); // NOI18N
        backLoginButton.setForeground(new java.awt.Color(102, 51, 255));
        backLoginButton.setText("Back login");
        backLoginButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        backLoginButton.setContentAreaFilled(false);
        backLoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backLoginButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Confirm Password");

        passwordConfirm.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(registerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordInput)
                    .addComponent(userNameInput, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backLoginButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(passwordConfirm)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(loginTitle)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameInputActionPerformed

    private void backLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backLoginButtonActionPerformed
        PublicEvent.getInstance().getLoginEvent().goLogin();
    }//GEN-LAST:event_backLoginButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        String username = userNameInput.getText().trim();
        String password = String.valueOf(passwordInput.getPassword());
        String confirmPassword = String.valueOf(passwordConfirm.getPassword());
        if(username.equals("")){
            userNameInput.grabFocus();
        } else if(password.equals("")){
            passwordInput.grabFocus();
        } else if(!password.equals(confirmPassword)){
            passwordInput.grabFocus();
        } else {
            ModelRegister registerData = new ModelRegister(username, password);
            System.out.println("Client: The register form invoked!!");
            PublicEvent.getInstance().getLoginEvent().register(registerData);
        }      
    }//GEN-LAST:event_registerButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backLoginButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JPasswordField passwordConfirm;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField userNameInput;
    // End of variables declaration//GEN-END:variables
}
