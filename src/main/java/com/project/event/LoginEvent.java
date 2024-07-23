
package com.project.event;

import com.project.model.ModelRegister;


public interface LoginEvent {
    public void login();
    public void register(ModelRegister modelRegister, MessageEvent messageEvent);
    public void goRegister();
    public void goLogin();
}
