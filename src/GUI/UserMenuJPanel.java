/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.Options.*;
import Program.Main;

/**
 *
 * @author moham
 */
public class UserMenuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserMenuJPanel
     */
    public UserMenuJPanel() {
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
        AssetMenujPanel = new javax.swing.JPanel();
        ViewAllAssetsJButton = new javax.swing.JButton();
        RepairanAssetJButton = new javax.swing.JButton();
        AddanAssetJButton = new javax.swing.JButton();
        EditanAssetJButton = new javax.swing.JButton();
        RetireanAssetJButton = new javax.swing.JButton();
        ExitJButton = new javax.swing.JButton();
        UserMenujPanel = new javax.swing.JPanel();
        ChangePasswordJButton = new javax.swing.JButton();
        ReportsJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        TitlejLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TitlejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitlejLabel.setText("Menu");

        AssetMenujPanel.setBackground(new java.awt.Color(153, 153, 153));

        ViewAllAssetsJButton.setText("View All Assets");
        ViewAllAssetsJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ViewAllAssetsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAllAssetsJButtonActionPerformed(evt);
            }
        });

        RepairanAssetJButton.setText("Repair an Asset");
        RepairanAssetJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RepairanAssetJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepairanAssetJButtonActionPerformed(evt);
            }
        });

        AddanAssetJButton.setText("Add an Asset");
        AddanAssetJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddanAssetJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddanAssetJButtonActionPerformed(evt);
            }
        });

        EditanAssetJButton.setText("Edit an Asset");
        EditanAssetJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EditanAssetJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditanAssetJButtonActionPerformed(evt);
            }
        });

        RetireanAssetJButton.setText("Retire an Asset");
        RetireanAssetJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RetireanAssetJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetireanAssetJButtonActionPerformed(evt);
            }
        });

        ExitJButton.setText("Exit");
        ExitJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ExitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AssetMenujPanelLayout = new javax.swing.GroupLayout(AssetMenujPanel);
        AssetMenujPanel.setLayout(AssetMenujPanelLayout);
        AssetMenujPanelLayout.setHorizontalGroup(
            AssetMenujPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AssetMenujPanelLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(AssetMenujPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AssetMenujPanelLayout.createSequentialGroup()
                        .addComponent(AddanAssetJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EditanAssetJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AssetMenujPanelLayout.createSequentialGroup()
                        .addComponent(ViewAllAssetsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RepairanAssetJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RetireanAssetJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AssetMenujPanelLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(ExitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        AssetMenujPanelLayout.setVerticalGroup(
            AssetMenujPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AssetMenujPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AssetMenujPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewAllAssetsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RepairanAssetJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AssetMenujPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AssetMenujPanelLayout.createSequentialGroup()
                        .addComponent(EditanAssetJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AssetMenujPanelLayout.createSequentialGroup()
                        .addComponent(AddanAssetJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RetireanAssetJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        UserMenujPanel.setBackground(new java.awt.Color(153, 153, 153));

        ChangePasswordJButton.setText("Change Password ");
        ChangePasswordJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ChangePasswordJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePasswordJButtonActionPerformed(evt);
            }
        });

        ReportsJButton.setText("Reports");
        ReportsJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ReportsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportsJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UserMenujPanelLayout = new javax.swing.GroupLayout(UserMenujPanel);
        UserMenujPanel.setLayout(UserMenujPanelLayout);
        UserMenujPanelLayout.setHorizontalGroup(
            UserMenujPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserMenujPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ReportsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ChangePasswordJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UserMenujPanelLayout.setVerticalGroup(
            UserMenujPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserMenujPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(UserMenujPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReportsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChangePasswordJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AssetMenujPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UserMenujPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TitlejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(TitlejLabel)
                .addGap(21, 21, 21)
                .addComponent(UserMenujPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AssetMenujPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RepairanAssetJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepairanAssetJButtonActionPerformed
        // go to repair an asset panel
        Main.login.setContentPane(new RepairanAssetJPanel());
        Main.login.pack();
    }//GEN-LAST:event_RepairanAssetJButtonActionPerformed

    private void ReportsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportsJButtonActionPerformed
        // go to report panel
        Main.login.setContentPane(new ReportsJPanel());
        Main.login.pack();
    }//GEN-LAST:event_ReportsJButtonActionPerformed

    private void ChangePasswordJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePasswordJButtonActionPerformed
        // go to change password panel
        Main.login.setContentPane(new ChangePasswordJPanel());
        Main.login.pack();
    }//GEN-LAST:event_ChangePasswordJButtonActionPerformed

    private void ViewAllAssetsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAllAssetsJButtonActionPerformed
        // go to view all assets panel
        Main.login.setContentPane(new ViewAllAssetsJPanel());
        Main.login.pack();
    }//GEN-LAST:event_ViewAllAssetsJButtonActionPerformed

    private void AddanAssetJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddanAssetJButtonActionPerformed
        // go to add an asset panel
        Main.login.setContentPane(new AddanAssetJPanel());
        Main.login.pack();
    }//GEN-LAST:event_AddanAssetJButtonActionPerformed

    private void EditanAssetJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditanAssetJButtonActionPerformed
        // go to edit an asset panel
        Main.login.setContentPane(new EditanAssetJPanel());
        Main.login.pack();
    }//GEN-LAST:event_EditanAssetJButtonActionPerformed

    private void RetireanAssetJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetireanAssetJButtonActionPerformed
        // go to retire an asset panel
        Main.login.setContentPane(new RetireanAssetJPanel());
        Main.login.pack();
    }//GEN-LAST:event_RetireanAssetJButtonActionPerformed

    private void ExitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitJButtonActionPerformed
        
        try {
            Main.login.setContentPane(new LoginJPanel());
            Main.login.pack();
        } catch (Exception e){
            System.out.println("Something Unexcepted Happend! Trying to save data!");
        } finally {
            Main.SaveAllData();
        }
        
    }//GEN-LAST:event_ExitJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddanAssetJButton;
    private javax.swing.JPanel AssetMenujPanel;
    private javax.swing.JButton ChangePasswordJButton;
    private javax.swing.JButton EditanAssetJButton;
    private javax.swing.JButton ExitJButton;
    private javax.swing.JButton RepairanAssetJButton;
    private javax.swing.JButton ReportsJButton;
    private javax.swing.JButton RetireanAssetJButton;
    private javax.swing.JLabel TitlejLabel;
    private javax.swing.JPanel UserMenujPanel;
    private javax.swing.JButton ViewAllAssetsJButton;
    // End of variables declaration//GEN-END:variables
}