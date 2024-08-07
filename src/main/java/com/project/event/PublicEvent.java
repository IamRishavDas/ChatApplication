
package com.project.event;


public class PublicEvent {
    private static PublicEvent publicEvent;
    private MainEvent mainEvent;
    private ImageViewEvent imageViewEvent;
    private ChatEvent chatEvent;
    private LoginEvent loginEvent;
    private LeftMenuEvent leftMenuEvent;
    
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
    
    
    public void setLoginEvent(LoginEvent loginEvent){
        this.loginEvent = loginEvent;
    }
    
    public LoginEvent getLoginEvent(){
        return this.loginEvent;
    }
    
    public void setMainEvent(MainEvent mainEvent){
        this.mainEvent = mainEvent;
    }
    
    public MainEvent getMainEvent(){
        return this.mainEvent;
    }

    public void setLeftMenuEvent(LeftMenuEvent leftMenuEvent){
        this.leftMenuEvent = leftMenuEvent;
    }

    public LeftMenuEvent getLeftMenuEvent(){
        return this.leftMenuEvent;
    }
}
