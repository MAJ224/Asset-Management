/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Options;

import GUI.AdminMenuJPanel;
import Program.Main;
import Program.Objects.User;
import javax.swing.JOptionPane;

/**
 *
 * @author moham
 */
public class AddaUser extends javax.swing.JPanel {

    /**
     * Creates new form SignIn
     */
    String Name = "";
    String Password = "";
    String Rank = "";
    boolean namechk = false;
    boolean passchk1 = false;
    boolean passchk2 = false;
    boolean passchk3 = true;

    public AddaUser() {
        initComponents();
        Main.login.setMinimumSize(this.getMinimumSize());
        ErrorNameLabel.setVisible(false);
        ErrorEmptyPassLabel.setVisible(false);
        ErrorPassMatchLabel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UTComboBox = new javax.swing.JComboBox();
        UTLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        PasswordLabel1 = new javax.swing.JLabel();
        PasswordLabel2 = new javax.swing.JLabel();
        PasswordField1 = new javax.swing.JPasswordField();
        PasswordField2 = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        SigninButton = new javax.swing.JButton();
        TitleLabel = new javax.swing.JLabel();
        ErrorNameLabel = new javax.swing.JLabel();
        ErrorEmptyPassLabel = new javax.swing.JLabel();
        ErrorPassMatchLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        UTComboBox.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        UTComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal User", "Administrator" }));
        UTComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UTComboBoxActionPerformed(evt);
            }
        });

        UTLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        UTLabel.setText("User Type :");

        NameLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        NameLabel.setText("Name :");

        NameTextField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        NameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NameTextFieldFocusLost(evt);
            }
        });

        PasswordLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        PasswordLabel1.setText("Password :");

        PasswordLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        PasswordLabel2.setText("Confirm Password :");

        PasswordField1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        PasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordField1FocusLost(evt);
            }
        });

        PasswordField2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        PasswordField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordField2FocusLost(evt);
            }
        });

        LoginButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LoginButton.setText("Main Menu");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        SigninButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SigninButton.setText("Add");
        SigninButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigninButtonActionPerformed(evt);
            }
        });

        TitleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TitleLabel.setText("Add User");

        ErrorNameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ErrorNameLabel.setForeground(new java.awt.Color(255, 0, 0));
        ErrorNameLabel.setText("*");

        ErrorEmptyPassLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ErrorEmptyPassLabel.setForeground(new java.awt.Color(255, 0, 0));
        ErrorEmptyPassLabel.setText("*");

        ErrorPassMatchLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ErrorPassMatchLabel.setForeground(new java.awt.Color(255, 0, 0));
        ErrorPassMatchLabel.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TitleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PasswordLabel1)
                    .addComponent(NameLabel)
                    .addComponent(PasswordLabel2)
                    .addComponent(UTLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ErrorNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ErrorPassMatchLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ErrorEmptyPassLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(UTComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addComponent(SigninButton, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(LoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UTLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UTComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel)
                    .addComponent(ErrorNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel1)
                    .addComponent(PasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ErrorEmptyPassLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel2)
                    .addComponent(PasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ErrorPassMatchLabel))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SigninButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        ErrorNameLabel.setToolTipText("Enter a Valid Name!");
        ErrorEmptyPassLabel.setToolTipText("Enter a Valid Password!");
        ErrorPassMatchLabel.setToolTipText("Different Passwords!");
    }// </editor-fold>//GEN-END:initComponents

    private void UTComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UTComboBoxActionPerformed
    }//GEN-LAST:event_UTComboBoxActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        Main.login.setContentPane(new AdminMenuJPanel());
        Main.login.pack();
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void SigninButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SigninButtonActionPerformed

        if (UTComboBox.getSelectedIndex() == 0) {
            Rank = "NormalUser";
        } else {
            Rank = "Administrator";
        }
        if (namechk && passchk1 && passchk2) {
            boolean flag = true;
            for (User u : Main.users) {
                if (u.getUsername().equals(Name)) {
                    JOptionPane.showMessageDialog(Main.login, "This Username is taken!", "Error", 0);
                    flag = false;
                }
            }
            if (flag) {
                // add user to users list
                Main.users.add(new User(Name, Password, Rank, 0));
                JOptionPane.showInternalMessageDialog(this, "User " + Name +
                    " has been added successfully.", "Add User", 1);
                // get back to admin menu panel
                Main.BacktoMainMenu();
            } else {
                if (!namechk) {
                    ErrorNameLabel.setVisible(true);
                }
                if (!passchk1 || !passchk2) {
                    ErrorEmptyPassLabel.setVisible(true);
                }
                if (!passchk3) {
                    ErrorPassMatchLabel.setVisible(true);
                }
            }
        }

    }//GEN-LAST:event_SigninButtonActionPerformed

    private void PasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordField1FocusLost
        passchk1 = !"".equals(PasswordField1.getText());
        Password = PasswordField1.getText();
    }//GEN-LAST:event_PasswordField1FocusLost

    private void PasswordField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordField2FocusLost
        
        if ("".equals(PasswordField2.getText())) {
            passchk2 = false;
        } else if (!Password.equals(PasswordField2.getText())) {
            passchk3 = false;
        } else {
            passchk2 = true;
            passchk3 = true;
        }

    }//GEN-LAST:event_PasswordField2FocusLost

    private void NameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameTextFieldFocusLost
        namechk = !NameTextField.getText().equals("");
        Name = NameTextField.getText();
    }//GEN-LAST:event_NameTextFieldFocusLost

    private void NameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameTextFieldFocusGained
        ErrorNameLabel.setVisible(false);
    }//GEN-LAST:event_NameTextFieldFocusGained

    private void PasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordField1FocusGained
        ErrorEmptyPassLabel.setVisible(false);
    }//GEN-LAST:event_PasswordField1FocusGained

    private void PasswordField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordField2FocusGained
        ErrorEmptyPassLabel.setVisible(false);
        ErrorPassMatchLabel.setVisible(false);
    }//GEN-LAST:event_PasswordField2FocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ErrorEmptyPassLabel;
    private javax.swing.JLabel ErrorNameLabel;
    private javax.swing.JLabel ErrorPassMatchLabel;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JPasswordField PasswordField1;
    private javax.swing.JPasswordField PasswordField2;
    private javax.swing.JLabel PasswordLabel1;
    private javax.swing.JLabel PasswordLabel2;
    private javax.swing.JButton SigninButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JComboBox UTComboBox;
    private javax.swing.JLabel UTLabel;
    // End of variables declaration//GEN-END:variables
}
