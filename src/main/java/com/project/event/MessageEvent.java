package com.project.event;

import com.project.model.ModelMessage;

public interface MessageEvent {
    public void callMessage(ModelMessage modelMessage);
}
