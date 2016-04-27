/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userclasses;

import com.codename1.ui.Dialog;

/**
 *
 * @author Hasani
 */
public class ValidasiSession {
    
    public Boolean cekfield(String username,String password){
        
        if(username.length()==0 || password.length()==0){
            return false;
        }else if(username.length()<8){
            return false;
        }else{
            return true;
        }
    }
    
    
}
