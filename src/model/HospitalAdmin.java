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
public class HospitalAdmin {
    
    private String hospitalName;
    private ArrayList<DoctorDetails> doclist;
    
    public HospitalAdmin(String hospitalName){
        
        this.hospitalName = hospitalName;
        this.doclist = new ArrayList<>();
    }

    public String getHospitalName() {
        return hospitalName;
    }
    
    public ArrayList<DoctorDetails> getDoclist() {
        return doclist;
    }

    public void setDoclist(ArrayList<DoctorDetails> doclist) {
        this.doclist = doclist;
    }
    
    public void addDoctor(DoctorDetails doctor) {
        this.doclist.add(doctor);
    }
    
}

