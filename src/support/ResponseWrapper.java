/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package support;

import com.codename1.ui.List;

/**
 *
 * @author Hasani
 * @param <T>
 */
public class ResponseWrapper<T> {

    private List<Notification> notifications;
    private T data;

    public ResponseWrapper() {}

    public ResponseWrapper(T data) {
        this.data = data;
    }

    
    public List<Notification> getNotifications() {
    	return notifications;
    }
    
    public void setNotifications(List<Notification> notifications) {
    	this.notifications = notifications;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
