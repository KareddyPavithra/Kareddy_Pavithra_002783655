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
public class PersonHistory {
   private ArrayList<Person> history;
   
   public PersonHistory(){
       this.history = new ArrayList<Person>();
       
       
   }

    public ArrayList<Person> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Person> history) {
        this.history = history;
    }
    public Person addNewPerson(){
        Person newP = new Person();
        history.add(newP);
        return newP;
    }
    
    public void deletePerson(Person p){
        history.remove(p);
    }
    
    public ArrayList<Person> getPersonsList(){
        return history;
    }
}
