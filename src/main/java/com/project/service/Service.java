
package com.project.service;


import java.util.List;
import java.util.ArrayList;

import com.project.event.PublicEvent;
import com.project.model.ModelUserAccount;

import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;


public class Service {
    private static Service service;
    private Socket client;
    private final int PORT_NUMBER = 6969;
    private final String IP = "localhost";
    private ModelUserAccount user;
    
    public static Service getService(){
        if(service == null){
            service = new Service();
        }
        return service;
    }
    private Service(){
    }
    
    public void startServer(){
        try{
            client = IO.socket("http://" + IP + ":" + PORT_NUMBER);
            client.on("list_user", new Emitter.Listener() {

                @Override
                public void call(Object... os) {
                    //list user
                    List<ModelUserAccount> users = new ArrayList<>(); 
                    for(Object o: os){
                        users.add(new ModelUserAccount(o));
                    }    
                    PublicEvent.getInstance().getLeftMenuEvent().newUser(users);
                }
                
            });
            client.open();
        } catch(Exception ex){
            error(ex);
        }       
    }
    
    public Socket getClient(){
        return client;
    }
    
    private void error(Exception ex){
        System.out.println(ex);
    }

    public void setUser(ModelUserAccount user){
        this.user = user;
    }

    public ModelUserAccount getUser(){
        return this.user;
    }

}
