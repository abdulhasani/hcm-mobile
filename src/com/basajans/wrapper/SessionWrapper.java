/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basajans.wrapper;

/**
 *
 * @author Hasani
 */
public class SessionWrapper {
    private final String resource="session";
    private String username;
    private String authToken;

    public SessionWrapper(String username, String authToken) {
        this.username = username;
        this.authToken = authToken;
    }

    public String getResource() {
        return resource;
    }
    
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }
    
    
    
}
