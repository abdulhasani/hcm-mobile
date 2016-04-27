/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basajans.rest.resource;

import com.basajans.wrapper.SessionWrapper;
import com.codename1.components.InfiniteProgress;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkManager;
import com.codename1.processing.Result;
import com.codename1.ui.Dialog;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author Hasani
 */
public class SessionResource {
   
    public SessionWrapper submitLogin(final String username,final String password){
        Map<String,String> mapService= new HashMap<>();
        mapService.put("username", username);
        mapService.put("password", password);
        final String payload = Result.fromContent(mapService).toString();
        
        SessionWrapper sessionWrapper = null;
        ConnectionRequest connectionRequest=new ConnectionRequest("http://cloud.abyor.com:13088/hcm/api/login"){
            @Override
            protected void buildRequestBody(OutputStream os) throws IOException {   
                os.write(payload.getBytes("UTF-8"));
            }
            
            @Override
            protected void readResponse(InputStream input) throws IOException {
                 JSONParser jsonParse= new JSONParser();
                 Map<String, Object> mapRespone=jsonParse.parseJSON(new InputStreamReader(input));
                 for (Map.Entry<String, Object> entry : mapRespone.entrySet()) {
                    String string = entry.getKey();
                    Object object = entry.getValue();
                    System.out.println(string);
                }
            }
        };    
        ConstanConnection.POST(connectionRequest);
        return sessionWrapper;
    }
    
}
