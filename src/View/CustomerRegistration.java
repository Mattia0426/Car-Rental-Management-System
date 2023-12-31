/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mwathsilu
 */
public class CustomerRegistration extends javax.swing.JFrame {

    /**
     * Creates new form CustomerRegistration
     */
    public CustomerRegistration() {
        initComponents();
        displayCustomerData();

        custtbl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = custtbl.getSelectedRow();
                if (selectedRow != -1) {
                    // A row is selected, enable the Delete button
                    dltbtn.setEnabled(true);
                } else {
                    // No row is selected, disable the Delete button
                    dltbtn.setEnabled(false);
                }
            }
        });

    }

    private void clearFormFields() {
        txtid.setText("");
        txtname.setText("");
        txtaddr.setText("");
        txttp.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        savebtn = new javax.swing.JButton();
        dltbtn = new javax.swing.JButton();
        updtbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txttp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtaddr = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        dashlbl = new javax.swing.JLabel();
        vlbl = new javax.swing.JLabel();
        clbl = new javax.swing.JLabel();
        inlbl = new javax.swing.JLabel();
        outlbl = new javax.swing.JLabel();
        loglbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        custtbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(227, 244, 255));

        jPanel6.setBackground(new java.awt.Color(227, 244, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(749, 170));

        savebtn.setBackground(new java.awt.Color(51, 0, 102));
        savebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        savebtn.setForeground(new java.awt.Color(255, 255, 255));
        savebtn.setText("SAVE");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        dltbtn.setBackground(new java.awt.Color(51, 0, 102));
        dltbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dltbtn.setForeground(new java.awt.Color(255, 255, 255));
        dltbtn.setText("DELETE");
        dltbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltbtnActionPerformed(evt);
            }
        });

        updtbtn.setBackground(new java.awt.Color(51, 0, 102));
        updtbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updtbtn.setForeground(new java.awt.Color(255, 255, 255));
        updtbtn.setText("UPDATE");
        updtbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updtbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Customer ID");

        txtid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtid.setForeground(new java.awt.Color(0, 102, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Telephone (07XXXXXXX)");

        txttp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txttp.setForeground(new java.awt.Color(0, 102, 153));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Address");

        txtaddr.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtaddr.setForeground(new java.awt.Color(0, 102, 153));

        txtname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtname.setForeground(new java.awt.Color(0, 102, 153));
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttp, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtaddr, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dltbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updtbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(txttp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtaddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(savebtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updtbtn)
                .addGap(12, 12, 12)
                .addComponent(dltbtn)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 0, 102));

        dashlbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dashlbl.setForeground(new java.awt.Color(255, 255, 255));
        dashlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashlbl.setText("DASHBOARD");
        dashlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashlblMouseClicked(evt);
            }
        });

        vlbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        vlbl.setForeground(new java.awt.Color(255, 255, 255));
        vlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vlbl.setText("VEHICLE");
        vlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vlblMouseClicked(evt);
            }
        });

        clbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clbl.setForeground(new java.awt.Color(255, 255, 255));
        clbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clbl.setText("CUSTOMER");
        clbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clblMouseClicked(evt);
            }
        });

        inlbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        inlbl.setForeground(new java.awt.Color(255, 255, 255));
        inlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inlbl.setText("CHECK-IN");
        inlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inlblMouseClicked(evt);
            }
        });

        outlbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        outlbl.setForeground(new java.awt.Color(255, 255, 255));
        outlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        outlbl.setText("CHECK-OUT");
        outlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                outlblMouseClicked(evt);
            }
        });

        loglbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loglbl.setForeground(new java.awt.Color(255, 255, 255));
        loglbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loglbl.setText("LOGOUT");
        loglbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loglblMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dashicon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loglbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(outlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dashlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dashlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(outlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        custtbl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        custtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer ID", "Name", "Address", "Telephone"
            }
        ));
        custtbl.setGridColor(new java.awt.Color(255, 255, 255));
        custtbl.setRowHeight(40);
        custtbl.setSelectionBackground(new java.awt.Color(51, 0, 102));
        custtbl.setSelectionForeground(new java.awt.Color(153, 204, 255));
        jScrollPane1.setViewportView(custtbl);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 1045, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        String cid = txtid.getText().trim();
        String name = txtname.getText().trim();
        String address = txtaddr.getText().trim();
        String telephoneStr = txttp.getText().trim();

        // Validate the input
        if (cid.isEmpty() && name.isEmpty() && address.isEmpty() && telephoneStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All input fields are empty. Please enter customer details.");
            return;
        }

        if (!cid.matches("^C\\d+$")) {
            JOptionPane.showMessageDialog(this, "CID must start with 'C' followed by numbers.");
            return;
        }

        if (!name.matches("^[a-zA-Z]+$")) {
            JOptionPane.showMessageDialog(this, "Name must contain only alphabet letters.");
            return;
        }

        if (!telephoneStr.matches("^\\d{10}$")) {
            JOptionPane.showMessageDialog(this, "Telephone must contain exactly 10 digits.");
            return;
        }

        if (!telephoneStr.matches("^07\\d{8}$")) {
            JOptionPane.showMessageDialog(this, "Telephone must be Sri Lankan and contain exactly 10 digits in total.");
            return;
        }

        int telephone;

        try {
            telephone = Integer.parseInt(telephoneStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid numeric value for Telephone.");
            return;
        }

        try {
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
            String sql = "INSERT INTO customer (cid, name, address, telephone) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, cid);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, address);
            preparedStatement.setInt(4, telephone);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Customer details added successfully!");
                displayCustomerData();
                clearFormFields();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to add Customer.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
        }
        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_savebtnActionPerformed

    private void updtbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updtbtnActionPerformed
        int selectedRow = custtbl.getSelectedRow();
        if (selectedRow != -1) {
            // Get the updated data from the text fields and combo box
            String updatedid = txtid.getText();
            String updatedname = txtname.getText();
            String updatedaddr = txtaddr.getText();
            String updatedtp = txttp.getText();

            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to update this car?", "Confirm Update", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                // Update the data in the table (user interface)
                DefaultTableModel tableModel = (DefaultTableModel) custtbl.getModel();
                tableModel.setValueAt(updatedid, selectedRow, 0);
                tableModel.setValueAt(updatedname, selectedRow, 1);
                tableModel.setValueAt(updatedaddr, selectedRow, 2);
                tableModel.setValueAt(updatedtp, selectedRow, 3);

                // Update the data in the MySQL table
                try {
                    // Establish a database connection
                    java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");

                    // Define the SQL query to update the record in the database
                    String sql = "UPDATE customer SET name=?, address=?, telephone=? WHERE cid=?";

                    // Prepare the statement
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, updatedname);
                    preparedStatement.setString(2, updatedaddr);
                    preparedStatement.setString(3, updatedtp);
                    preparedStatement.setString(4, updatedid);

                    // Execute the update
                    int rowsAffected = preparedStatement.executeUpdate();

                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(this, "Customer updated successfully.");
                    } else {
                        JOptionPane.showMessageDialog(this, "Failed to update customer in the database.");
                    }

                    // Close the database connection
                    connection.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a car to update.");
        } // TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_updtbtnActionPerformed

    private void dltbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltbtnActionPerformed
        int selectedRow = custtbl.getSelectedRow();
        if (selectedRow != -1) {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this car?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                DefaultTableModel tableModel = (DefaultTableModel) custtbl.getModel();

                // Get the carRegistration value from the selected row
                String cid = (String) tableModel.getValueAt(selectedRow, 0); // Assuming carRegistration is in the first column

                // Remove the selected row from the table
                tableModel.removeRow(selectedRow);

                try {
                    try ( // Establish a database connection
                            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "")) {
                        String sql = "DELETE FROM customer WHERE cid = ?";

                        PreparedStatement preparedStatement = connection.prepareStatement(sql);
                        preparedStatement.setString(1, cid);

                        int rowsAffected = preparedStatement.executeUpdate();

                        if (rowsAffected > 0) {
                            JOptionPane.showMessageDialog(this, "Customer deleted successfully.");
                        } else {
                            JOptionPane.showMessageDialog(this, "Failed to delete customer from the database.");
                        }
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a customer to delete.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_dltbtnActionPerformed

    private void dashlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashlblMouseClicked
        Dashboard newform = new Dashboard();
        newform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newform.pack();
        newform.setVisible(true);
        dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_dashlblMouseClicked

    private void vlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vlblMouseClicked
        VehicleRegistration newform = new VehicleRegistration();
        newform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newform.pack();
        newform.setVisible(true);
        dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_vlblMouseClicked

    private void clblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clblMouseClicked
        CustomerRegistration newform = new CustomerRegistration();
        newform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newform.pack();
        newform.setVisible(true);
        dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_clblMouseClicked

    private void inlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inlblMouseClicked
        Booking newform = new Booking();
        newform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newform.pack();
        newform.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_inlblMouseClicked

    private void outlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outlblMouseClicked
        CheckOut newform = new CheckOut();
        newform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newform.pack();
        newform.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_outlblMouseClicked

    private void loglblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loglblMouseClicked
        int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to Logout?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            // User clicked "Yes", so proceed with the logout
            dispose();
            LoginForm newform = new LoginForm();
            newform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            newform.pack();
            newform.setVisible(true);
        } else {
            // User clicked "No," so take no action
        }        // TODO add your handling code here:
    }//GEN-LAST:event_loglblMouseClicked

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void selectRow(java.awt.event.MouseEvent evt) {
        int selectedRow = custtbl.getSelectedRow();
        if (selectedRow != -1) {
            // A row is selected, so you can retrieve the data from the selected row
            DefaultTableModel tableModel = (DefaultTableModel) custtbl.getModel();
            String cid = (String) tableModel.getValueAt(selectedRow, 0);
            String name = (String) tableModel.getValueAt(selectedRow, 1);
            String address = (String) tableModel.getValueAt(selectedRow, 2);
            String telephone = (String) tableModel.getValueAt(selectedRow, 3);

            // Populate the text fields and combo box with the selected car's data
            txtid.setText(cid);
            txtname.setText(name);
            txtaddr.setText(address);
            txttp.setText(telephone);

            // You can also enable the "Update" and "Delete" buttons here if needed
            updtbtn.setEnabled(true);
            dltbtn.setEnabled(true);
        }         // TODO add your handling code here:
    }

    private void displayCustomerData() {
        try (
                // Establish a database connection
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", ""); PreparedStatement preparedStatement = connection.prepareStatement("SELECT cid, name, address, telephone FROM customer;"); ResultSet resultSet = preparedStatement.executeQuery();) {
            DefaultTableModel tableModel = (DefaultTableModel) custtbl.getModel();

            // Clear existing data in the table
            tableModel.setRowCount(0);

            while (resultSet.next()) {
                String cid = resultSet.getString("cid");
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                String telephone = resultSet.getString("telephone");

                // Add the fetched data as a new row in the table
                tableModel.addRow(new Object[]{cid, name, address, telephone});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }

        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clbl;
    private javax.swing.JTable custtbl;
    private javax.swing.JLabel dashlbl;
    private javax.swing.JButton dltbtn;
    private javax.swing.JLabel inlbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loglbl;
    private javax.swing.JLabel outlbl;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField txtaddr;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txttp;
    private javax.swing.JButton updtbtn;
    private javax.swing.JLabel vlbl;
    // End of variables declaration//GEN-END:variables
}
