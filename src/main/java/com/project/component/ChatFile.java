
package com.project.component;


public class ChatFile extends javax.swing.JPanel {

    
    public ChatFile() {
        initComponents();
        initImage();
        setOpaque(false);
    }
    
    public void setFile(String fileName, String fileSize){
        labelFileName.setText(fileName);
        labelFileSize.setText(fileSize);
    }
    
    private void initImage(){
        this.progress1.setProgressType(com.project.modernComponent.Progress.ProgressType.FILE_FILE);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progress1 = new com.project.modernComponent.Progress();
        jPanel1 = new javax.swing.JPanel();
        labelFileName = new javax.swing.JLabel();
        labelFileSize = new javax.swing.JLabel();

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

        labelFileName.setText("FileName.file");
        jPanel1.add(labelFileName);

        labelFileSize.setText("5 MB");
        jPanel1.add(labelFileSize);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(progress1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(progress1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelFileName;
    private javax.swing.JLabel labelFileSize;
    private com.project.modernComponent.Progress progress1;
    // End of variables declaration//GEN-END:variables
}
