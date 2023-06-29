/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Options;

import Program.Main;
import Program.Objects.Asset;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author moham
 */
public class RetireanAssetJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RetireanAssetJPanel
     */
    Asset asset;

    public RetireanAssetJPanel() {
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
        MainMenujButton = new javax.swing.JButton();
        RetirejButton = new javax.swing.JButton();
        IDjLabel = new javax.swing.JLabel();
        ShownIDjLabel = new javax.swing.JLabel();
        TypejLabel = new javax.swing.JLabel();
        ShownTypejLabel = new javax.swing.JLabel();
        ListjPanel = new javax.swing.JPanel();
        ListTitlejLabel = new javax.swing.JLabel();
        SearchjLabel = new javax.swing.JLabel();
        SearchjTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        ModeljLabel = new javax.swing.JLabel();
        ShownModeljLabel = new javax.swing.JLabel();

        TitlejLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TitlejLabel.setText("Retire an Asset");

        MainMenujButton.setText("Main Menu");
        MainMenujButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenujButtonActionPerformed(evt);
            }
        });

        RetirejButton.setText("Retire");
        RetirejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetirejButtonActionPerformed(evt);
            }
        });

        IDjLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IDjLabel.setText("ID :");

        ShownIDjLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        TypejLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TypejLabel.setText("Type :");

        ShownTypejLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ListTitlejLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ListTitlejLabel.setText("Assets");

        SearchjLabel.setText("Search ID :");

        jList1.setModel(new javax.swing.AbstractListModel() {
            Asset[] assets = Main.assets;
            public int getSize() { return assets.length; }
            public Object getElementAt(int i) { return assets[i]; }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout ListjPanelLayout = new javax.swing.GroupLayout(ListjPanel);
        ListjPanel.setLayout(ListjPanelLayout);
        ListjPanelLayout.setHorizontalGroup(
            ListjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(ListjPanelLayout.createSequentialGroup()
                .addComponent(SearchjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchjTextField))
            .addGroup(ListjPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(ListTitlejLabel)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        ListjPanelLayout.setVerticalGroup(
            ListjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ListTitlejLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ListjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchjLabel)
                    .addComponent(SearchjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
        );

        SearchjTextField.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                updatelist();
            }
            public void removeUpdate(DocumentEvent e) {
                updatelist();
            }
            public void insertUpdate(DocumentEvent e) {
                updatelist();
            }
        });

        ModeljLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ModeljLabel.setText("Model :");

        ShownModeljLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(RetirejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MainMenujButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TypejLabel)
                            .addComponent(IDjLabel)
                            .addComponent(ModeljLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ShownIDjLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(ShownTypejLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(ShownModeljLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(ListjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(TitlejLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitlejLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ListjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDjLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ShownIDjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TypejLabel)
                            .addComponent(ShownTypejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ModeljLabel)
                            .addComponent(ShownModeljLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MainMenujButton)
                            .addComponent(RetirejButton))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void MainMenujButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenujButtonActionPerformed
        Main.BacktoMainMenu();
    }//GEN-LAST:event_MainMenujButtonActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged

        if (evt.getValueIsAdjusting()) {//This line prevents double events
            asset = (Asset) jList1.getSelectedValue();
            // setting previous information
            ShownIDjLabel.setText(asset.toString());
            ShownModeljLabel.setText(asset.getModel());
            switch (asset.getType()) { // swaping panels by typ of asset
                case 0:
                    ShownTypejLabel.setText("Computer");
                    break;
                case 1:
                    ShownTypejLabel.setText("Switch");
                    break;
                case 2:
                    ShownTypejLabel.setText("Printer");
                    break;
            }
        }
        
    }//GEN-LAST:event_jList1ValueChanged

    private void RetirejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetirejButtonActionPerformed

        int i = JOptionPane.showConfirmDialog(Main.login, "Do you want to Retire " + 
                asset.toString() + " ?", "Retire Asset", 0);
        if (JOptionPane.YES_OPTION == i) {
            asset.setState("Retired");
            JOptionPane.showInternalMessageDialog(this, "Asset " + asset.toString() +
                    " State has been set to Retire.", "Retire", 1);
            Main.BacktoMainMenu();
        }

    }//GEN-LAST:event_RetirejButtonActionPerformed

    void updatelist() {

        ArrayList<Asset> NewList = new ArrayList();
        for (Asset a : Main.assets) {
            if (a.toString().startsWith(SearchjTextField.getText())) {
                NewList.add(a);
            }
        }
        jList1.setListData(NewList.toArray());

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDjLabel;
    private javax.swing.JLabel ListTitlejLabel;
    private javax.swing.JPanel ListjPanel;
    private javax.swing.JButton MainMenujButton;
    private javax.swing.JLabel ModeljLabel;
    private javax.swing.JButton RetirejButton;
    private javax.swing.JLabel SearchjLabel;
    private javax.swing.JTextField SearchjTextField;
    private javax.swing.JLabel ShownIDjLabel;
    private javax.swing.JLabel ShownModeljLabel;
    private javax.swing.JLabel ShownTypejLabel;
    private javax.swing.JLabel TitlejLabel;
    private javax.swing.JLabel TypejLabel;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
