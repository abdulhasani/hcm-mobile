/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package support;

/**
 *
 * @author Hasani
 */
public abstract class AbstractArrayTransfer<T> {
    
    protected Integer totalServerItems;
//    protected Integer totalPage;

    public AbstractArrayTransfer() {}

    public Integer getTotalServerItems() {
        return this.totalServerItems;
    }

    public void setTotalServerItems(Integer totalServerItems) {
        this.totalServerItems = totalServerItems;
    }
    
}
