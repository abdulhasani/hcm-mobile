/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package support;

import java.util.Date;

/**
 *
 * @author Hasani
 */
public class Notification {
    private String field;
    private String message;
    private String type;
    private Date time;

    public Notification() {
    }

    public Notification(String message, String type) {
        this.message = message;
        this.type = type;
        this.time=new Date();
    }

    public Notification(String field, String message, String type) {
        this(message,type);
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
    
    

    
    
}
