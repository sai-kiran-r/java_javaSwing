/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.EcoSystem;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kiranreddy
 */
public class UpdateCustomerDetails extends javax.swing.JPanel {

    /**
     * Creates new form UpdateCustomerDetails
     */
    JPanel userProcessContainer;
    EcoSystem system;
    
    public UpdateCustomerDetails(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        this.populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomerProfile = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        btnGoBack = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        lblAddress = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();

        lbTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText(" Customer Profile");

        tblCustomerProfile.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "UserName", "Password", "Address", "PhoneNumber"
            }
        ));
        jScrollPane1.setViewportView(tblCustomerProfile);

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        btnSubmit.setText("Update");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblPassword.setText("Password :");

        lblName.setText("Name :");

        lblUserName.setText("Username :");

        btnGoBack.setText("<< Go Back");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        lblAddress.setText("Address :");

        lblPhoneNumber.setText("Phone Number :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(btnSubmit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGoBack)
                                .addGap(67, 67, 67)
                                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPhoneNumber)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblUserName)
                                            .addComponent(lblName))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblPassword)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblAddress)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                    .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTitle)
                    .addComponent(btnGoBack))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnView)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneNumber))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

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

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        // here we are updating the 
        int selectedRowIndex = tblCustomerProfile.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCustomerProfile.getModel();
        String name = txtName.getText();
        String userName = txtUserName.getText();
        String password = txtPassword.getText();

        
        ArrayList<Customer> restos = system.getCustomerDirectory().returnCustomerDetails();
        for(Customer r: restos)
        {
            if(r.getName().equals(name))
            {
               r.returnUserAccount().setPassword(password);
               r.setUserPassword(password);
               r.setPhoneNumber(Long.parseLong(txtPhoneNumber.getText()));
               r.setAddress(txtAddress.getText());
               break;
            }
            
        }
        JOptionPane.showMessageDialog(this, "Password Updated Successfully");
        txtName.setText("");txtUserName.setText("");txtPassword.setText("");
        txtAddress.setText("");txtPhoneNumber.setText("");
        populateTable();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblCustomerProfile.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to View");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCustomerProfile.getModel();
        Customer selectedCustomer = (Customer)model.getValueAt(selectedRowIndex, 0);
        txtName.setText("");
        txtName.setText(selectedCustomer.getName());
        txtUserName.setText("");
        txtUserName.setText(selectedCustomer.getUserName());
        txtPassword.setText("");
        txtPassword.setText(selectedCustomer.getUserPassword());
        txtAddress.setText("");
        txtAddress.setText(selectedCustomer.getAddress());
        txtPhoneNumber.setText("");
        txtPhoneNumber.setText(String.valueOf(selectedCustomer.getPhoneNumber()));
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblCustomerProfile.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCustomerProfile.getModel();
        Customer selectedCustomer = (Customer)model.getValueAt(selectedRowIndex, 0);
        // First delete the customer from employee
        this.system.getEmployeeDirectory().deleteEmployee(selectedCustomer.getName());
        // And thne delete the userAccount
        this.system.getUserAccountDirectory().deleteUserAccount(
                this.system.getCustomerDirectory().returnCustomerDetails().
                        get(selectedRowIndex).returnUserAccount()
        );
        // finally delete the user from customer directory
        this.system.getCustomerDirectory().deleteCustomer(selectedCustomer);
        
        JOptionPane.showMessageDialog(this, "Deleted the entry Successfully");
        
        for(Customer ck : this.system.getCustomerDirectory().returnCustomerDetails()){
            System.out.println(ck.getName());
        }
        this.populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTable tblCustomerProfile;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void populateTable(){
        System.out.println("Inside method to populate Customer table");
        DefaultTableModel model = (DefaultTableModel) tblCustomerProfile.getModel();
        model.setRowCount(0);

        for(Customer cust : this.system.getCustomerDirectory().returnCustomerDetails()){
            System.out.println(cust);
            Object[] row = new Object[5];
            row[0] = cust;
            row[1] = cust.getUserName();
            row[2] = cust.getUserPassword();
            row[3] = cust.getAddress();
            row[4] = cust.getPhoneNumber();
            model.addRow(row);
        }
    }

}
