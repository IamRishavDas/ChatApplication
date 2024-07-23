package com.project.event;

import com.project.model.ModelUserAccount;
import java.util.List;

public interface LeftMenuEvent {
    public void newUser(List<ModelUserAccount> users);
}
