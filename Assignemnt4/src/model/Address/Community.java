/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Address;

/**
 *
 * @author kiranreddy
 */
public class Community {
    
    private String communityNames;
    
    public Community(String communityNames){
        this.communityNames = communityNames;
    }
    public String getCommunityNames(){
        return communityNames;
    }
    public void setCommunityNames(String communityNames){
        this.communityNames = communityNames;
    }
}


