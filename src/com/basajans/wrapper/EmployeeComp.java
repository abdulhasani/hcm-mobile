/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basajans.wrapper;

import java.util.Comparator;

/**
 *
 * @author Hasani
 */
public class EmployeeComp implements Comparator<EmployeeWrapper>{

    @Override
    public int compare(EmployeeWrapper o1, EmployeeWrapper o2) {
        return o1.getId().compareTo(o2.getId());
    }
    
}
