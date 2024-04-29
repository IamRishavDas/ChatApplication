
package com.project.component;

import com.project.chatapplication.ChatLeft;
import com.project.chatapplication.ChatLeftWithProfile;
import com.project.chatapplication.ChatRight;
import com.project.modernComponent.ScrollBar;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Rishav
 */
public class ChatBody extends javax.swing.JPanel {

    
    public ChatBody() {
        initComponents();
        init();
        addItemRight("Practical task: For example, you might be asked to create a webpage that displays a greeting message which changes based on the time of the day. Use HTML, CSS, and a bit of JavaScript.");
        addItemLeft("Practical task: For example, you might be asked to create a webpage that displays a greeting message which changes based on the time of the day. Use HTML, CSS, and a bit of JavaScript.", "rishav");
        addItemRight("Practical task: For example, you might be asked to create a webpage that displays a greeting message which changes based on the time of the day. Use HTML, CSS, and a bit of JavaScript.");
        
        String[] imageHash = {"LEHLk~WB2yk8pyo0adR*.7kCMdnj", "LEHLk~WB2yk8pyo0adR*.7kCMdnj"};
        
        addItemLeft("Practical task: ", "rishav", imageHash);
        addItemRight("Practical task: For example, you might be asked to create a webpage that displays a greeting message which changes based on the time of the day. Use HTML, CSS, and a bit of JavaScript.");
        addItemLeft("Practical task: For example, you might be asked to create a webpage that displays a greeting message which changes based on the time of the day. Use HTML, CSS, and a bit of JavaScript.", "rishav");
        
        addDate("03/02/2024");
        
        addItemRight("Practical task: For example, you might be asked to create a webpage that displays a greeting message which changes based on the time of the day. Use HTML, CSS, and a bit of JavaScript.");
        addItemLeft("Practical task: For example, you might be asked to create a webpage that displays a greeting message which changes based on the time of the day. Use HTML, CSS, and a bit of JavaScript.", "rishav", new ImageIcon(getClass().getResource("/testingImages/testingDog.jpg")), new ImageIcon(getClass().getResource("/testingImages/testingDog.jpg")));
        addItemRight("Practical task: For example, you might be asked to create a webpage that displays a greeting message which changes based on the time of the day. Use HTML, CSS, and a bit of JavaScript.");
        
        addDate("Today");
        
        addItemLeft("Practical task: For example, you might be asked to create a webpage that displays a greeting message which changes based on the time of the day. Use HTML, CSS, and a bit of JavaScript.", "rishav", new ImageIcon(getClass().getResource("/testingImages/testingDog.jpg")));
        addItemRight("Practical task", new ImageIcon(getClass().getResource("/testingImages/testingImage2.jpg")), new ImageIcon(getClass().getResource("/testingImages/testingDog.jpg")));
        addItemLeft("", "hitesh", new ImageIcon(getClass().getResource("/testingImages/testingDog.jpg")));
        addItemLeft("ami mota", "pamela", new ImageIcon(getClass().getResource("/testingImages/testingDog.jpg")));
        
        addItemFileLeft("project application file", "Lora", "applicatin.docx", "1.3 MB");
        addItemFileRight("please check my resume!", "Resume.pdf", "299.4 KB");
        addItemFileRight("", "Resume.pdf", "100 KB");
    }
    

    private void init(){
        chatBody.setLayout(new MigLayout("fillx", "", "7[]7"));
        chatBodyScrollPane.setVerticalScrollBar(new ScrollBar(Color.RED));
        chatBodyScrollPane.getVerticalScrollBar().setBackground(Color.PINK);
    }
    
    private void updateChatBody(){
        chatBody.repaint();
        chatBody.revalidate();
    }
    
    public void addItemLeft(String text, String user, Icon... image){
        ChatLeftWithProfile leftItem = new ChatLeftWithProfile();
        leftItem.setText(text);
        leftItem.setImage(image);
        leftItem.setTime();
        leftItem.setUserProfile(user);
        chatBody.add(leftItem, "wrap, w 100::80%");
        updateChatBody();
    }
    
    public void addItemLeft(String text, String user, String[] image){
        ChatLeftWithProfile leftItem = new ChatLeftWithProfile();
        leftItem.setText(text);
        leftItem.setImage(image);
        leftItem.setTime();
        leftItem.setUserProfile(user);
        chatBody.add(leftItem, "wrap, w 100::80%");
        updateChatBody();
    }
    
    public void addItemRight(String text, Icon... image){
        ChatRight rightItem = new ChatRight();
        rightItem.setText(text);
        rightItem.setImage(image);
        rightItem.setTime();
        chatBody.add(rightItem, "wrap, al right, w 100::80%");
        updateChatBody();
    }
    
    public void addItemFileLeft(String text, String user, String fileName, String fileSize){
        ChatLeftWithProfile leftItem = new ChatLeftWithProfile();
        leftItem.setText(text);
        leftItem.setFile(fileName, fileSize);
        leftItem.setTime();
        leftItem.setUserProfile(user);
        chatBody.add(leftItem, "wrap, w 100::80%");
        updateChatBody();
    }
    
    public void addItemFileRight(String text, String fileName, String fileSize){
        ChatRight rightItem = new ChatRight();
        rightItem.setText(text);
        rightItem.setFile(fileName, fileSize);
        chatBody.add(rightItem, "wrap, al right, w 100::80%");
        updateChatBody();
    }
    
    public void addDate(String date){
        ChatDate chatDate = new ChatDate();
        chatDate.setDate(date);
        chatBody.add(chatDate, "wrap, al center");
        updateChatBody();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chatBodyScrollPane = new javax.swing.JScrollPane();
        chatBody = new javax.swing.JPanel();

        setBackground(new java.awt.Color(246, 194, 194));

        chatBodyScrollPane.setBorder(null);
        chatBodyScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        chatBody.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout chatBodyLayout = new javax.swing.GroupLayout(chatBody);
        chatBody.setLayout(chatBodyLayout);
        chatBodyLayout.setHorizontalGroup(
            chatBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 925, Short.MAX_VALUE)
        );
        chatBodyLayout.setVerticalGroup(
            chatBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );

        chatBodyScrollPane.setViewportView(chatBody);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chatBodyScrollPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chatBodyScrollPane)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel chatBody;
    private javax.swing.JScrollPane chatBodyScrollPane;
    // End of variables declaration//GEN-END:variables
}
