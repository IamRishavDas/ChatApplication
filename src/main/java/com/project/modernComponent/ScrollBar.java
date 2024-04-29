
package com.project.modernComponent;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;


public class ScrollBar extends JScrollBar{
    public ScrollBar(Color color){
        setUI(new ModernScrollBarUI(color));
        setPreferredSize(new Dimension(5,5));
        setUnitIncrement(20);
    }
}
