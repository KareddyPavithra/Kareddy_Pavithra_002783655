/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author pavit
 */
public class VitalSigns {
    private Double weight;
    private Double temperature;
    private Double bloodPressure;
    private Double diabetes;
    private int encounterno;
    private long patientId;

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }
    private ArrayList<VitalSigns> history1;

    
    public int getEncounterno() {
        return encounterno;
    }

    public void setEncounterno(int encounterno) {
        this.encounterno = encounterno;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(Double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public Double getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(Double diabetes) {
        this.diabetes = diabetes;
    }
    public VitalSigns(){
    this.history1 = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getHistory1() {
        return history1;
    }

    public void setHistory1(ArrayList<VitalSigns> history1) {
        this.history1 = history1;
    }
    

    public VitalSigns addNewVitals() {
         VitalSigns newV = new VitalSigns();
        history1.add(newV);
        return newV;
    }
   
}

