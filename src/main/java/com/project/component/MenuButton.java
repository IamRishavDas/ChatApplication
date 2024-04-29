
package com.project.component;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JButton;


public class MenuButton extends JButton{
    
    private Icon iconSimple;
    private Icon iconSelected;
    
    public Icon getIconSimple(){
        return this.iconSimple;
    }
    
    public void setIconSimple(Icon iconSample){
        this.iconSimple = iconSample;
    }
    
    public Icon getIconSelected(){
        return this.iconSelected;
    }
    
    public void setIconSelected(Icon iconSelected){
        this.iconSelected = iconSelected;
    }
    
    
    public MenuButton(){
        this.setContentAreaFilled(false);
    }
    
    @Override
    public void setSelected(boolean bin){
        super.setSelected(bin);
        if(bin){
            setIcon(iconSelected);
        } else {
            setIcon(iconSimple);
        }
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if(isSelected()){
            g.setColor(new Color(42, 143, 25));
            g.fillRect(0, getHeight() - 2, getWidth(), getHeight());
        }
    }
}
