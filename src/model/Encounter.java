/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author pavit
 */
public class Encounter extends Person{
    private int enc;

    public int getEnc() {
        return enc;
    }

    public void setEnc(int enc) {
        this.enc = enc;
    }

    public VitalSigns getVitalsigns() {
        return vitalsigns;
    }

    public void setVitalsigns(VitalSigns vitalsigns) {
        this.vitalsigns = vitalsigns;
    }
    
    VitalSigns vitalsigns;
    
}
