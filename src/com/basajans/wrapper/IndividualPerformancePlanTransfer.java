/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basajans.wrapper;

import java.util.HashMap;

/**
 *
 * @author Hasani
 */
public class IndividualPerformancePlanTransfer {
    private String id;
    private String number;
    private final HashMap<String,String> internalOrganizationPeriod=new HashMap<>();
    private EmployeeWrapper fromParty;
    private EmployeeWrapper toParty;
    private Integer rev;
    private Double maxPoint;
    private final HashMap<String, Double> corporatePerformanceTarget = new HashMap<>();
    private final HashMap<String, Double> individualPerformanceTarget = new HashMap<>();
    private final HashMap<String, Double> ordinaryControlPoint = new HashMap<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public EmployeeWrapper getFromParty() {
        return fromParty;
    }

    public void setFromParty(EmployeeWrapper fromParty) {
        this.fromParty = fromParty;
    }

    public EmployeeWrapper getToParty() {
        return toParty;
    }

    public void setToParty(EmployeeWrapper toParty) {
        this.toParty = toParty;
    }

    public Integer getRev() {
        return rev;
    }

    public void setRev(Integer rev) {
        this.rev = rev;
    }

    public Double getMaxPoint() {
        return maxPoint;
    }

    public void setMaxPoint(Double maxPoint) {
        this.maxPoint = maxPoint;
    }

    public HashMap<String, String> getInternalOrganizationPeriod() {
        return internalOrganizationPeriod;
    }

    public HashMap<String, Double> getCorporatePerformanceTarget() {
        return corporatePerformanceTarget;
    }

    public HashMap<String, Double> getIndividualPerformanceTarget() {
        return individualPerformanceTarget;
    }

    public HashMap<String, Double> getOrdinaryControlPoint() {
        return ordinaryControlPoint;
    }
    
    
    
}
