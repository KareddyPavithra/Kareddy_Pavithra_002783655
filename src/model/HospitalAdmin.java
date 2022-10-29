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
    private ArrayList<DoctorDetails> doclist;
    
    public HospitalAdmin(){
        this.doclist = new ArrayList<DoctorDetails>();
    }

    public ArrayList<DoctorDetails> getDoclist() {
        return doclist;
    }

    public void setDoclist(ArrayList<DoctorDetails> doclist) {
        this.doclist = doclist;
    }
    
}
