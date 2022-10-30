/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pavit
 */
public class City {
    private String cityName;
    protected List<Community> communities = new ArrayList<>();
    private String hospital;

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    
    public City(String cityName, String community, String hospital){
        this.cityName = cityName;
        //this.community = community;
        this.hospital = hospital;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(String communityName) {
//        this.communities = communities;
          Community community = new Community(communityName);
          communities.add(community);
    }

    
}
