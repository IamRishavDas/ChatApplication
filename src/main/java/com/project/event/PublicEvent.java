
package com.project.event;


public class PublicEvent {
    private static PublicEvent publicEvent;
    private ImageViewEvent imageViewEvent;
    private ChatEvent chatEvent;
    
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
    
    public void setChatEvent(ChatEvent chatEvent){
        this.chatEvent = chatEvent;
    }
    
    public ChatEvent getChatEvent(){
        return this.chatEvent;
    }
}
