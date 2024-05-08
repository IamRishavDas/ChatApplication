
package com.project.service;


import io.socket.client.IO;
import io.socket.client.Socket;


public class Service {
    private static Service service;
    private Socket client;
    private final int PORT_NUMBER = 6969;
    private final String IP = "localhost";
    
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
}
