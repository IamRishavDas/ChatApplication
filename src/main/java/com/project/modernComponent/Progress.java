
package com.project.modernComponent;

import javax.swing.Icon;
import javax.swing.JProgressBar;


public class Progress extends JProgressBar{
    
    private ProgressType progressType = ProgressType.NONE;
       
    public Progress(){
        setOpaque(false);
        setUI(new ProgressCircleUI(this));
    }
    
    public static enum ProgressType{
        DOWNLOAD_FILE,
        CANCEL_FILE,
        FILE_FILE,
        NONE
    }
    
    public void setProgressType(ProgressType progressType){
        this.progressType = progressType;
        this.repaint();
    }
    
    public ProgressType getProgressType(){
        return this.progressType;
    }   
}

