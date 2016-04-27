/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basajans.rest.resource;

import com.basajans.wrapper.SessionWrapper;
import com.codename1.io.ConnectionRequest;

/**
 *
 * @author Hasani
 */
public class SessionResource {
   
    private SessionWrapper login(String username,String password){
        ConnectionRequest connectionRequest=new ConnectionRequest(username){
            
        };
        return null;
    }
    
}
