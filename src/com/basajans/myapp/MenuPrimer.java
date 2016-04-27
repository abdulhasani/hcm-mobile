/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basajans.myapp;

import com.codename1.ui.Command;
import com.codename1.ui.NavigationCommand;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.tree.Tree;
import com.codename1.ui.tree.TreeModel;
import java.util.Vector;
import userclasses.StateMachine;



/**
 *
 * @author Hasani
 */
public class MenuPrimer {
   
    private StateMachine StateMachine;
    
    private Command menuHome;
    private Command menuDocuments;
    private Command childMyDocuments;
    private Command childMySubordinates;

    public StateMachine getStateMachine() {
        return StateMachine;
    }

    public void setStateMachine(StateMachine StateMachine) {
        this.StateMachine = StateMachine;
    }
    
   
    
    
    
    //create menuPrimer
    public Tree createMenuPrimer(){
        Tree tree=new Tree(new ButtonArrayModel());
        
       return tree;
    }
    
    
    
    private Command getMenuHome(){
       this.menuHome= NavigationCommand.create("Home", null, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                StateMachine.showForm("mainHome", evt.getCommand());
            }
        });
       
        return this.menuHome;
        
    }
    
    private Command getMenuDocuments(){
        this.menuDocuments=NavigationCommand.create("Documents", null,null);
        return menuDocuments;
    }
    
    private Command getChildMyDocuments(){
        
          this.childMyDocuments=NavigationCommand.create("My Documents", null, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                StateMachine.showForm("mainDocuments", evt.getCommand());
            }
        });
          
       
         
        return this.childMyDocuments;
        
    }
    
    private Command getChildMySubordinates(){
        this.childMySubordinates=NavigationCommand.create("My Subordinates", null, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                StateMachine.showForm("mainSubordinates", evt.getCommand());
            }
        });
        
        return this.childMySubordinates;
        
    }
    
    class ButtonArrayModel implements TreeModel{
        
         Command[][] arr = new Command[][] {
            {getMenuHome(), getMenuDocuments()},
            {getChildMyDocuments(), getChildMySubordinates()}
        };
         
        
        @Override
        public Vector getChildren(Object parent) {
             if(parent == null) {
            Vector v = new Vector();
            for(int iter = 0 ; iter < arr[0].length ; iter++) {
                v.addElement(arr[0][iter]);
            }
            return v;
        }
        Vector v = new Vector();
        for(int iter = 0 ; iter < arr[0].length ; iter++) {
            if(parent == arr[0][iter]) {
                if(arr.length > iter + 1 && arr[iter + 1] != null) {
                    for(int i = 0 ; i < arr[iter + 1].length ; i++) {
                        v.addElement(arr[iter + 1][i]);
                    }
                }
            }
        }
        return v;
        }

        @Override
        public boolean isLeaf(Object node) {
          Vector v=getChildren(node);
          return v==null||v.size()==0;
        }
        
        
        
    }


   
   
}
