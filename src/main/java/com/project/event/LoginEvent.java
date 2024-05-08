
package com.project.event;

import com.project.model.ModelRegister;


public interface LoginEvent {
    public void login();
    public void register(ModelRegister modelRegister);
    public void goRegister();
    public void goLogin();
}
