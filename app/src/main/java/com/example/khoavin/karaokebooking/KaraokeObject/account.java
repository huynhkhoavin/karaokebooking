package com.example.khoavin.karaokebooking.KaraokeObject;

import com.google.gson.Gson;

public class account implements IObject {
    String username;
    String password;
    public account(String u, String p)
    {
        setUsername(u);
        setPassword(p);
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public account convertFromJson() {
        return null;
    }
}
