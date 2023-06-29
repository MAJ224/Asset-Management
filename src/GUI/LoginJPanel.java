/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Program.Enums.UserRank;
import Program.Main;
import Program.Objects.User;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author MAJ
 */
public class LoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginJPanel
     */
    
    private String Username;
    private String Password;
    private int WrongPasswordTimes = 0;
    private User user;
    
    public LoginJPanel() {
        initComponents();
        Main.login.setMinimumSize(this.getMinimumSize());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitlejLabel = new javax.swing.JLabel();
        UsernameLable = new javax.swing.JLabel();
        PasswordLable = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        UsernameErrorjLabel = new javax.swing.JLabel();
        PasswordErrorjLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(477, 211));

        TitlejLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        TitlejLabel.setText("Welcome to SUTech Asset Manager 1.0");

        UsernameLable.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        UsernameLable.setText("Username :");

        PasswordLable.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        PasswordLable.setText("Password :");

        UsernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameFieldFocusLost(evt);
            }
        });

        PasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusLost(evt);
            }
        });

        LoginButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        UsernameErrorjLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        UsernameErrorjLabel.setForeground(new java.awt.Color(255, 0, 0));
        UsernameErrorjLabel.setText("*");

        PasswordErrorjLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PasswordErrorjLabel.setForeground(new java.awt.Color(255, 0, 0));
        PasswordErrorjLabel.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitlejLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UsernameLable)
                            .addComponent(PasswordLable))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PasswordField)
                            .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PasswordErrorjLabel)
                            .addComponent(UsernameErrorjLabel))))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitlejLabel)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UsernameLable)))
                    .addComponent(UsernameErrorjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordErrorjLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PasswordLable)))
                .addGap(18, 36, Short.MAX_VALUE)
                .addComponent(LoginButton)
                .addContainerGap())
        );

        UsernameErrorjLabel.setVisible(false);
        UsernameErrorjLabel.setToolTipText("Username not Found or invalid!");
        PasswordErrorjLabel.setVisible(false);
        PasswordErrorjLabel.setToolTipText("Password does not match!");
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFieldFocusGained
        UsernameErrorjLabel.setVisible(false);
    }//GEN-LAST:event_UsernameFieldFocusGained

    private void UsernameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFieldFocusLost
        Username = UsernameField.getText();
    }//GEN-LAST:event_UsernameFieldFocusLost

    private void PasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusGained
        PasswordErrorjLabel.setVisible(false);
    }//GEN-LAST:event_PasswordFieldFocusGained

    private void PasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusLost
        Password = PasswordField.getText();
    }//GEN-LAST:event_PasswordFieldFocusLost

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed

         Date CurrentDate = new Date();
        if (LoginCheck() && WrongPasswordTimes < 3) {
            for (User user_check : Main.users) {
                if (user_check.getUsername().equals(Username)) {
                    Main.login.setUser(user_check);
                    break;
                }
            }
            if (Main.login.getUser().getRank().equals(UserRank.Administrator)) {
                // logging in
                Main.login.setContentPane(new AdminMenuJPanel());
            } else {
                Main.login.setContentPane(new UserMenuJPanel());
            }
            Main.login.pack();
        } else if (CurrentDate.before(user.getBanDate())) {
            JOptionPane.showInputDialog (this,"Error","User is banned",0);
        } else if (WrongPasswordTimes >= 3) {
            user.setBanDate(new Date(System.currentTimeMillis() + 3600000));
            System.out.println("User has been Banned!");
        }
        
    }//GEN-LAST:event_LoginButtonActionPerformed

    private boolean LoginCheck() {

        boolean UserCheck = false;
        boolean PasswordCheck = false;

        for (User U : Main.users) {
            if (U.getUsername().equals(Username)) {
                UsernameErrorjLabel.setVisible(false);
                UserCheck = true;
                user = U;
                break;
            }
        }
        if (UserCheck == true) {
            if (user.getPassword().equals(Password)) {
                PasswordCheck = true;
            } else {
                PasswordCheck = false;
                PasswordErrorjLabel.setVisible(true);
                WrongPasswordTimes++;
            }
        } else {
            UsernameErrorjLabel.setVisible(true);
        }
        return PasswordCheck;
    }

    public User getUser() {
        return user;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel PasswordErrorjLabel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLable;
    private javax.swing.JLabel TitlejLabel;
    private javax.swing.JLabel UsernameErrorjLabel;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel UsernameLable;
    // End of variables declaration//GEN-END:variables
}
