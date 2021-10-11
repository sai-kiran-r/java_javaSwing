/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;

/**
 *
 * @author kiranreddy
 */
public class ProductUpdateHistory {
    
    private static LocalDateTime lastUpdateTime;
    
    
    public static LocalDateTime getLastUpdateTime()
    {
        return lastUpdateTime;
    }
    
    public static void setLastUpdateTime(LocalDateTime lastUpdatedtime)
    {
        ProductUpdateHistory.lastUpdateTime = lastUpdatedtime;
    }
    
    
}
