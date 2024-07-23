
package com.project.chatapplication;

import com.project.component.PeopleCard;
import com.project.event.LeftMenuEvent;
import com.project.event.PublicEvent;
import com.project.model.ModelUserAccount;
import com.project.modernComponent.ScrollBar;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import net.miginfocom.swing.MigLayout;


public class LeftMenu extends javax.swing.JPanel {

    
    private List<ModelUserAccount> userAccount;
    public LeftMenu() {
        initComponents();
        initSimpleAndSelectedIcon();
        init();
        showPeople();
    }
    
    private void init() {
        scrollPanePeopleCard.setVerticalScrollBar(new ScrollBar(Color.GREEN));
        peopleList.setLayout(new MigLayout("fillx","0[]0","1[]1"));
        userAccount = new ArrayList<>();
        PublicEvent.getInstance().setLeftMenuEvent(new LeftMenuEvent() {

            @Override
            public void newUser(List<ModelUserAccount> users) {
                for(ModelUserAccount d: users){
                    userAccount.add(d);
                    peopleList.add(new PeopleCard(d.getUserName()), "wrap");
                    updateLeftMenu();
                }
            }
            
        });
        showPeople();
    }
    
    private void showPeople() {
        peopleList.removeAll();
        for(ModelUserAccount d: userAccount){
            peopleList.add(new PeopleCard(d.getUserName()), "wrap");
        }
        updateLeftMenu();
    }
    
    private void showGroup(){
        peopleList.removeAll();
        for(int i=0; i<10; i++){
            peopleList.add(new PeopleCard("Group " + (i+1)), "wrap");
        }
        updateLeftMenu();
    }
    
    private void showMessage(){
        peopleList.removeAll();
        for(int i=0; i<4; i++){
            peopleList.add(new PeopleCard("Mail " + (i+1)), "wrap");
        }
        updateLeftMenu();
    }
    
    private void updateLeftMenu(){
        peopleList.repaint();
        peopleList.revalidate();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuLeft = new javax.swing.JLayeredPane();
        chatButton = new com.project.component.MenuButton();
        groupButton = new com.project.component.MenuButton();
        messageButton = new com.project.component.MenuButton();
        scrollPanePeopleCard = new javax.swing.JScrollPane();
        peopleList = new javax.swing.JLayeredPane();

        setBackground(new java.awt.Color(153, 255, 153));

        menuLeft.setOpaque(true);
        menuLeft.setLayout(new java.awt.GridLayout(1, 0, 3, 0));

        chatButton.setSelected(true);
        chatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatButtonActionPerformed(evt);
            }
        });
        menuLeft.add(chatButton);

        groupButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/socialIcons/group.png"))); // NOI18N
        groupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupButtonActionPerformed(evt);
            }
        });
        menuLeft.add(groupButton);

        messageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/socialIcons/mail.png"))); // NOI18N
        messageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageButtonActionPerformed(evt);
            }
        });
        menuLeft.add(messageButton);

        scrollPanePeopleCard.setBorder(null);
        scrollPanePeopleCard.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        peopleList.setBackground(new java.awt.Color(204, 255, 204));
        peopleList.setOpaque(true);

        javax.swing.GroupLayout peopleListLayout = new javax.swing.GroupLayout(peopleList);
        peopleList.setLayout(peopleListLayout);
        peopleListLayout.setHorizontalGroup(
            peopleListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        peopleListLayout.setVerticalGroup(
            peopleListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 674, Short.MAX_VALUE)
        );

        scrollPanePeopleCard.setViewportView(peopleList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE)
            .addComponent(scrollPanePeopleCard)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanePeopleCard))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void initSimpleAndSelectedIcon(){
        chatButton.setIconSimple(new javax.swing.ImageIcon(getClass().getResource("/socialIcons/chat.png")));
        chatButton.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/socialIcons/chat_hover.png")));
        
        groupButton.setIconSimple(new javax.swing.ImageIcon(getClass().getResource("/socialIcons/group.png")));
        groupButton.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/socialIcons/group_hover.png")));
        
        messageButton.setIconSimple(new javax.swing.ImageIcon(getClass().getResource("/socialIcons/mail.png")));
        messageButton.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/socialIcons/mail_hover.png")));
    }
    
    private void chatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatButtonActionPerformed
        if(!chatButton.isSelected()){
            chatButton.setSelected(true);
            groupButton.setSelected(false);
            messageButton.setSelected(false);
            showPeople();
        }
    }//GEN-LAST:event_chatButtonActionPerformed

    private void groupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupButtonActionPerformed
        if(!groupButton.isSelected()){
            chatButton.setSelected(false);
            groupButton.setSelected(true);
            messageButton.setSelected(false);
            showGroup();
        }
    }//GEN-LAST:event_groupButtonActionPerformed

    private void messageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageButtonActionPerformed
        if(!messageButton.isSelected()){
            chatButton.setSelected(false);
            groupButton.setSelected(false);
            messageButton.setSelected(true);
            showMessage();
        }
    }//GEN-LAST:event_messageButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.project.component.MenuButton chatButton;
    private com.project.component.MenuButton groupButton;
    private javax.swing.JLayeredPane menuLeft;
    private com.project.component.MenuButton messageButton;
    private javax.swing.JLayeredPane peopleList;
    private javax.swing.JScrollPane scrollPanePeopleCard;
    // End of variables declaration//GEN-END:variables
}
