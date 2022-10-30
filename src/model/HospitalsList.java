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
public class HospitalsList {
    private ArrayList<HospitalAdmin> hospitalList;
    
    public HospitalsList() {
        hospitalList = new ArrayList<>();
    }
    
    public ArrayList<HospitalAdmin> getHospitalList() {
        return hospitalList;
    }
    public void addHospital(HospitalAdmin hospital) {
        hospitalList.add(hospital);
    }
    
}
