/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.form.admin;

import controller.Communication;
import domain.RoleEnum;
import domain.User;
import javax.swing.JOptionPane;
import view.components.TableModelViewUsers;

/**
 *
 * @author Nikolina
 */
public class FormViewUsers extends javax.swing.JFrame {

    User restriction = null;
    /**
     * Creates new form FormViewUsers
     */
    public FormViewUsers() {
        initComponents();
        prepareForm();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAllUsers = new javax.swing.JTable();
        btnCreateNewUser = new javax.swing.JButton();
        btnMainPage = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        cmbRole = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        tblAllUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblAllUsers);

        btnCreateNewUser.setText("Create new user");
        btnCreateNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNewUserActionPerformed(evt);
            }
        });

        btnMainPage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMainPage.setText("...");
        btnMainPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainPageActionPerformed(evt);
            }
        });

        jLabel1.setText("Firstname:");

        jLabel2.setText("Lastname:");

        jLabel3.setText("Email:");

        jLabel4.setText("Role:");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Customer" }));

        jButton4.setText("Details");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSearch)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCreateNewUser)
                            .addComponent(btnMainPage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btnMainPage, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCreateNewUser)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(btnSearch)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNewUserActionPerformed
        new FormCreateNewUser(this, true).setVisible(true);
        prepareTable();
    }//GEN-LAST:event_btnCreateNewUserActionPerformed

    private void btnMainPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainPageActionPerformed
        new FormMainAdmin().setVisible(true);
    }//GEN-LAST:event_btnMainPageActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
      restriction = new User();
        if (txtFirstname!= null || !txtFirstname.getText().isEmpty()) {
            restriction.setFirstname(txtFirstname.getText().trim().toLowerCase());
        }
        if (txtLastname!= null || !txtLastname.getText().isEmpty()) {
            restriction.setLastname(txtLastname.getText().trim().toLowerCase());
        }
        if (txtEmail!= null || !txtEmail.getText().isEmpty()) {
            restriction.setEmail(txtEmail.getText().trim().toLowerCase());
        }
        if ( cmbRole.getSelectedIndex()>-1) {
            restriction.setRole((RoleEnum) cmbRole.getSelectedItem());
        }
        
        updateTable();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        if(tblAllUsers.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this,"Please select user", "No user selected", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if(tblAllUsers.getSelectedRowCount()>1) {
            JOptionPane.showMessageDialog(this,"Please select only one user", "Multiple users selected", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        User selectedUser = (User)((TableModelViewUsers) tblAllUsers.getModel()).getUsers().get(tblAllUsers.getSelectedRow());
        //System.out.println(selectedUser); 
        new FormUserDetail(this, true, selectedUser).setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateNewUser;
    private javax.swing.JButton btnMainPage;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAllUsers;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLastname;
    // End of variables declaration//GEN-END:variables

    private void prepareForm() {
        prepareTable();
        setResizable(false);
        setLocationRelativeTo(null);
       
    }

    private void prepareTable() {
        TableModelViewUsers model = new TableModelViewUsers();
        Thread thread = new Thread(model);
        thread.start();
        tblAllUsers.setModel(model);
        updateTable();
        cmbRole.setSelectedIndex(-1);
    }

    private void updateTable() {
        TableModelViewUsers model = (TableModelViewUsers) tblAllUsers.getModel();
        System.out.println(restriction);
        model.setRestriction(restriction);
        
    }
    
   
}
