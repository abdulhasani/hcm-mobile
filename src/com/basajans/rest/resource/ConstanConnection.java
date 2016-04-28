/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basajans.rest.resource;

import com.codename1.components.InfiniteProgress;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.NetworkManager;
import com.codename1.ui.Dialog;

/**
 *
 * @author Hasani
 */
public class ConstanConnection {
 
    public static void postJSON(ConnectionRequest connectionRequest){
        connectionRequest.setContentType("application/json");
        connectionRequest.setPost(true);
        connectionRequest.setHttpMethod("POST");
        connectionRequest.addRequestHeader("Accept", "application/json");
        InfiniteProgress prog = new InfiniteProgress();
        Dialog dlg = prog.showInifiniteBlocking();
        connectionRequest.setDisposeOnCompletion(dlg);
        NetworkManager.getInstance().addToQueue(connectionRequest);
        
    }
    public static void post(ConnectionRequest connectionRequest){
        connectionRequest.setPost(true);
        connectionRequest.setHttpMethod("POST");
        InfiniteProgress prog = new InfiniteProgress();
        Dialog dlg = prog.showInifiniteBlocking();
        connectionRequest.setDisposeOnCompletion(dlg);
        NetworkManager.getInstance().addToQueue(connectionRequest);
        
    }
    
    public static void GET(ConnectionRequest connectionRequest,String username,String token){
         connectionRequest.setPost(false);
        connectionRequest.addArgument("username", username);
        connectionRequest.addArgument("auth_token", token);
        InfiniteProgress prog = new InfiniteProgress();
        Dialog dlg = prog.showInifiniteBlocking();
        connectionRequest.setDisposeOnCompletion(dlg);
        NetworkManager.getInstance().addToQueue(connectionRequest);
    }
    
    public static void PUT(ConnectionRequest connectionRequest){
    }
    
    public static void DELETE(ConnectionRequest connectionRequest){
    }
}
