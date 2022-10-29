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
public class EncounterHistory {
    private ArrayList<Encounter> list;
    
    public EncounterHistory(){
        this.list = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getList() {
        return list;
    }

    public void setList(ArrayList<Encounter> list) {
        this.list = list;
    }
    
}
