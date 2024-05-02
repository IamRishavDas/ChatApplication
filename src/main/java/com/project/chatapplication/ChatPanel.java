
package com.project.chatapplication;

import com.project.component.ChatBody;
import com.project.component.ChatBottom;
import com.project.component.ChatTitle;
import com.project.event.ChatEvent;
import com.project.event.PublicEvent;
import net.miginfocom.swing.MigLayout;


public class ChatPanel extends javax.swing.JPanel {

    
    public ChatPanel() {
        initComponents();
        init();
    }

    private void init(){
        setLayout(new MigLayout("fillx", "0[fill]0", "[]0[100%, bottom]0[shrink 0]0"));
        ChatTitle chatTitle = new ChatTitle();
        ChatBody chatBody = new ChatBody();
        ChatBottom chatBottm = new ChatBottom();
        PublicEvent.getInstance().setChatEvent(new ChatEvent(){
            @Override
            public void sendMessage(String text) {
                chatBody.addItemRight(text);
            }
            
        });
        this.add(chatTitle, "wrap");
        this.add(chatBody, "wrap");
        this.add(chatBottm, "h ::20%");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(219, 175, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
