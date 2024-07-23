package com.project.model;

import org.json.JSONObject;

public class ModelUserAccount {
    private int userId;
    private String userName;
    private String gender;
    private String image;
    private boolean status;

    public ModelUserAccount(){ }
    
    public ModelUserAccount(int userId, String userName, String gender, String image, boolean status) {
        this.userId = userId;
        this.userName = userName;
        this.gender = gender;
        this.image = image;
        this.status = status;
    }

    public ModelUserAccount(Object json){
        JSONObject object = (JSONObject)json;
        try {
            userId = object.getInt("userId");
            userName = object.getString("userName");
            gender = object.getString("gender");
            image = object.getString("image");
            status = object.getBoolean("status");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
   
}
