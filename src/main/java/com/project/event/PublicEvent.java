
package com.project.event;


public class PublicEvent {
    private static PublicEvent publicEvent;
    private ImageViewEvent imageViewEvent;
    
    public static PublicEvent getInstance(){
        if(publicEvent == null) publicEvent = new PublicEvent();
        return publicEvent;
    }
    
    private PublicEvent(){
        
    }
    
    public void setImageViewEvent(ImageViewEvent imageViewEvent){
        this.imageViewEvent = imageViewEvent;
    }
    
    public ImageViewEvent getImageViewEvent(){
        return this.imageViewEvent;
    }
}
