/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package support;

import com.google.common.base.CaseFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hasani
 * @param <T>
 */
public class ArrayTransfer<T> extends AbstractArrayTransfer<T>{
    private String resource;
    private List<T> items = new ArrayList<T>();
    public ArrayTransfer(Class<T> entityClass) {
        this.resource = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, entityClass.toString());
    }
}