/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author kiranreddy
 */
public class ProductHistory {
    
    private ArrayList<Product> history;
    
    public ProductHistory(){
        this.history = new ArrayList<Product>();
    }

    public ArrayList<Product> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Product> history) {
        this.history = history;
    }
    
    public Product addnewProducts(){
        Product newProducts = new Product();
        history.add(newProducts);
        return newProducts;
        
    }
    public void updateDetails(int selectedRowIndex, Product vs){
        history.set(selectedRowIndex, vs);
    }
    public void deleteProducts(Product vs){
        history.remove(vs);
    }

    public void setText(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
