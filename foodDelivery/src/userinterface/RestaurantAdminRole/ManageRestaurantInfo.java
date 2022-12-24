/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author Kiranreddy
 */
public class ManageRestaurantInfo extends javax.swing.JPanel {

    /**
     * Creates new form ManageRestaurantInfo
     */
    JPanel userProcessContainer;
    EcoSystem system;
    Restaurant res;
    
    public ManageRestaurantInfo(JPanel userProcessContainer, EcoSystem system, Restaurant res) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.res = res;
        txtAddress.setText(this.res.getAddress());
        txtMangerName.setText(this.res.getManagerName());
        txtRestaurantName.setText(this.res.getRestaurantName());
        System.out.println(this.res.getPhoneNumber());
        txtPhoneNumber.setText(String.valueOf(this.res.getPhoneNumber()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTItle = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblResturantName = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblResturant = new javax.swing.JLabel();
        txtRestaurantName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtMangerName = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnGoBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(192, 47, 47));

        lbTItle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbTItle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTItle.setText(" Restaurant Profile");

        lblAddress.setText("Address :");

        lblResturantName.setText("Restaurant Name :");

        lblPhoneNumber.setText("Phone Number :");

        lblResturant.setText("Restaurant Manager Name :");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnGoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/back.png"))); // NOI18N
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(btnUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(lbTItle, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblResturantName)
                            .addComponent(lblAddress)
                            .addComponent(lblPhoneNumber)
                            .addComponent(lblResturant))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMangerName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lbTItle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResturantName)
                    .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNumber)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResturant)
                    .addComponent(txtMangerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnUpdate)
                .addContainerGap(117, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        Component[] comps = this.userProcessContainer.getComponents();
        for(Component comp : comps){
            if(comp instanceof SystemAdminWorkAreaJPanel){
                SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel= (SystemAdminWorkAreaJPanel) comp;
                systemAdminWorkAreaJPanel.populateTree();
            }
        }
    }//GEN-LAST:event_btnGoBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int counter = 0;
           
        for(Restaurant restaurantData : this.system.getRestaurantDirectory().returnAllRestaurants()){
            counter++;
            if(restaurantData.getRestaurantName().equals(this.res.getRestaurantName())){
                break;
            }
        }
        this.res.setAddress(txtAddress.getText());
        this.res.setPhoneNumber(Long.parseLong(txtPhoneNumber.getText()));
        this.res.setManagerName(txtMangerName.getText());
        this.res.setRestaurantName(txtRestaurantName.getText());
        JOptionPane.showMessageDialog(this, "Updated info Successfully");
//        this.system.getRestaurantDirectory().setRestaurant(counter-1, this.res);
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lbTItle;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblResturant;
    private javax.swing.JLabel lblResturantName;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtMangerName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtRestaurantName;
    // End of variables declaration//GEN-END:variables
}