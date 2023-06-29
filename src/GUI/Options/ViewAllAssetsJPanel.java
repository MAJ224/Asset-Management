/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Options;

import Program.Main;
import Program.Objects.Asset;
import Program.Objects.Computer;
import Program.Objects.Printer;
import Program.Objects.Switch;
import java.util.ArrayList;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author moham
 */
public class ViewAllAssetsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewAllAssetsJPanel
     */
    Asset asset;

    public ViewAllAssetsJPanel() {
        initComponents();
        Main.login.setMinimumSize(this.getMinimumSize());
        ComputerjPanel.setVisible(true);
        SwitchjPanel.setVisible(false);
        PrinterjPanel.setVisible(false);
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
        AssetsInfojPanel1 = new javax.swing.JPanel();
        IDjLabel = new javax.swing.JLabel();
        ShownIDjLabel = new javax.swing.JLabel();
        ModeljLabel = new javax.swing.JLabel();
        ShownModeljLabel = new javax.swing.JLabel();
        BDatejLabel = new javax.swing.JLabel();
        ShownBDatejLabel = new javax.swing.JLabel();
        LocationjLabel = new javax.swing.JLabel();
        ShownLocationjLabel = new javax.swing.JLabel();
        StatejLabel = new javax.swing.JLabel();
        ShownStatejLabel = new javax.swing.JLabel();
        jLayeredPane = new javax.swing.JLayeredPane();
        ComputerjPanel = new javax.swing.JPanel();
        CPUjLabel = new javax.swing.JLabel();
        ShownCPUjLabel = new javax.swing.JLabel();
        RAMjLabel = new javax.swing.JLabel();
        HardjLabel = new javax.swing.JLabel();
        ShownRAMjLabel = new javax.swing.JLabel();
        ShownHardjLabel = new javax.swing.JLabel();
        GraphicjLabel = new javax.swing.JLabel();
        ShownGraphicjLabel = new javax.swing.JLabel();
        SwitchjPanel = new javax.swing.JPanel();
        PortNumberjLabel = new javax.swing.JLabel();
        ShownPortNumberjLabel = new javax.swing.JLabel();
        ManageablejLabel = new javax.swing.JLabel();
        ShownManageablejLabel = new javax.swing.JLabel();
        PrinterjPanel = new javax.swing.JPanel();
        ColorPrintjLabel = new javax.swing.JLabel();
        ShownColorPrintjLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ListjPanel = new javax.swing.JPanel();
        ListTitlejLabel = new javax.swing.JLabel();
        SearchjLabel = new javax.swing.JLabel();
        SearchjTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        TitlejLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TitlejLabel.setText("View All Assets");

        IDjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        IDjLabel.setText("ID :");

        ShownIDjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShownIDjLabel.setText("ID");

        ModeljLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ModeljLabel.setText("Model :");

        ShownModeljLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShownModeljLabel.setText("Model");

        BDatejLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BDatejLabel.setText("BDate :");

        ShownBDatejLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShownBDatejLabel.setText("BDate");

        LocationjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LocationjLabel.setText("Location :");

        ShownLocationjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShownLocationjLabel.setText("Location");

        StatejLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        StatejLabel.setText("State :");

        ShownStatejLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShownStatejLabel.setText("state");

        javax.swing.GroupLayout AssetsInfojPanel1Layout = new javax.swing.GroupLayout(AssetsInfojPanel1);
        AssetsInfojPanel1.setLayout(AssetsInfojPanel1Layout);
        AssetsInfojPanel1Layout.setHorizontalGroup(
            AssetsInfojPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AssetsInfojPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AssetsInfojPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AssetsInfojPanel1Layout.createSequentialGroup()
                        .addComponent(IDjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ShownIDjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AssetsInfojPanel1Layout.createSequentialGroup()
                        .addComponent(ModeljLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ShownModeljLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AssetsInfojPanel1Layout.createSequentialGroup()
                        .addComponent(BDatejLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ShownBDatejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AssetsInfojPanel1Layout.createSequentialGroup()
                        .addComponent(LocationjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ShownLocationjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AssetsInfojPanel1Layout.createSequentialGroup()
                        .addComponent(StatejLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ShownStatejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AssetsInfojPanel1Layout.setVerticalGroup(
            AssetsInfojPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AssetsInfojPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(AssetsInfojPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IDjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ShownIDjLabel))
                .addGap(18, 18, 18)
                .addGroup(AssetsInfojPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModeljLabel)
                    .addComponent(ShownModeljLabel))
                .addGap(18, 18, 18)
                .addGroup(AssetsInfojPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BDatejLabel)
                    .addComponent(ShownBDatejLabel))
                .addGap(18, 18, 18)
                .addGroup(AssetsInfojPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocationjLabel)
                    .addComponent(ShownLocationjLabel))
                .addGap(18, 18, 18)
                .addGroup(AssetsInfojPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StatejLabel)
                    .addComponent(ShownStatejLabel))
                .addContainerGap())
        );

        CPUjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CPUjLabel.setText("CPU :");

        ShownCPUjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShownCPUjLabel.setText("CPU");

        RAMjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RAMjLabel.setText("RAM :");

        HardjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        HardjLabel.setText("Hard :");

        ShownRAMjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShownRAMjLabel.setText("RAM");

        ShownHardjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShownHardjLabel.setText("Hard");

        GraphicjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        GraphicjLabel.setText("Graphic :");

        ShownGraphicjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShownGraphicjLabel.setText("Graphic");

        javax.swing.GroupLayout ComputerjPanelLayout = new javax.swing.GroupLayout(ComputerjPanel);
        ComputerjPanel.setLayout(ComputerjPanelLayout);
        ComputerjPanelLayout.setHorizontalGroup(
            ComputerjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComputerjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ComputerjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ComputerjPanelLayout.createSequentialGroup()
                        .addComponent(HardjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ShownHardjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ComputerjPanelLayout.createSequentialGroup()
                        .addComponent(CPUjLabel)
                        .addGap(10, 10, 10)
                        .addComponent(ShownCPUjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ComputerjPanelLayout.createSequentialGroup()
                        .addComponent(GraphicjLabel)
                        .addGap(10, 10, 10)
                        .addComponent(ShownGraphicjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ComputerjPanelLayout.createSequentialGroup()
                        .addComponent(RAMjLabel)
                        .addGap(10, 10, 10)
                        .addComponent(ShownRAMjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(38, 38, 38))
        );
        ComputerjPanelLayout.setVerticalGroup(
            ComputerjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComputerjPanelLayout.createSequentialGroup()
                .addGroup(ComputerjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPUjLabel)
                    .addComponent(ShownCPUjLabel))
                .addGap(18, 18, 18)
                .addGroup(ComputerjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RAMjLabel)
                    .addComponent(ShownRAMjLabel))
                .addGap(18, 18, 18)
                .addGroup(ComputerjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HardjLabel)
                    .addComponent(ShownHardjLabel))
                .addGap(18, 18, 18)
                .addGroup(ComputerjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GraphicjLabel)
                    .addComponent(ShownGraphicjLabel)))
        );

        PortNumberjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PortNumberjLabel.setText("Port Number :");

        ShownPortNumberjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShownPortNumberjLabel.setText("Port Number");

        ManageablejLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ManageablejLabel.setText("Manageable :");

        ShownManageablejLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShownManageablejLabel.setText("Yes / No");

        javax.swing.GroupLayout SwitchjPanelLayout = new javax.swing.GroupLayout(SwitchjPanel);
        SwitchjPanel.setLayout(SwitchjPanelLayout);
        SwitchjPanelLayout.setHorizontalGroup(
            SwitchjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SwitchjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SwitchjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SwitchjPanelLayout.createSequentialGroup()
                        .addComponent(PortNumberjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ShownPortNumberjLabel))
                    .addGroup(SwitchjPanelLayout.createSequentialGroup()
                        .addComponent(ManageablejLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ShownManageablejLabel)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        SwitchjPanelLayout.setVerticalGroup(
            SwitchjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SwitchjPanelLayout.createSequentialGroup()
                .addGroup(SwitchjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PortNumberjLabel)
                    .addComponent(ShownPortNumberjLabel))
                .addGap(18, 18, 18)
                .addGroup(SwitchjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManageablejLabel)
                    .addComponent(ShownManageablejLabel))
                .addGap(0, 69, Short.MAX_VALUE))
        );

        ColorPrintjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ColorPrintjLabel.setText("Color Print :");

        ShownColorPrintjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShownColorPrintjLabel.setText("Yes / No");

        javax.swing.GroupLayout PrinterjPanelLayout = new javax.swing.GroupLayout(PrinterjPanel);
        PrinterjPanel.setLayout(PrinterjPanelLayout);
        PrinterjPanelLayout.setHorizontalGroup(
            PrinterjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrinterjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ColorPrintjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ShownColorPrintjLabel)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        PrinterjPanelLayout.setVerticalGroup(
            PrinterjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrinterjPanelLayout.createSequentialGroup()
                .addGroup(PrinterjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorPrintjLabel)
                    .addComponent(ShownColorPrintjLabel))
                .addGap(0, 102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jLayeredPaneLayout = new javax.swing.GroupLayout(jLayeredPane);
        jLayeredPane.setLayout(jLayeredPaneLayout);
        jLayeredPaneLayout.setHorizontalGroup(
            jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ComputerjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SwitchjPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PrinterjPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPaneLayout.setVerticalGroup(
            jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPaneLayout.createSequentialGroup()
                .addComponent(ComputerjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SwitchjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PrinterjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane.setLayer(ComputerjPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane.setLayer(SwitchjPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane.setLayer(PrinterjPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("Main Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TitlejLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLayeredPane)
                                .addGap(10, 10, 10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AssetsInfojPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(ListjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TitlejLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AssetsInfojPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(ListjPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Main.BacktoMainMenu();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged

        if (evt.getValueIsAdjusting()) {//This line prevents double events
            asset = (Asset) jList1.getSelectedValue();
            // setting previous information
            ShownIDjLabel.setText(asset.toString());
            ShownModeljLabel.setText(asset.getModel());
            ShownBDatejLabel.setText(asset.getBDate());
            ShownLocationjLabel.setText(asset.getLocation()[0] + " , "
                    + asset.getLocation()[1] + " , " + asset.getLocation()[2]);
            ShownStatejLabel.setText(asset.getState().toString());
            
            switch (asset.getType()) { // swaping panels by typ of asset
                case 0:
                    // changing panels
                    ComputerjPanel.setVisible(true);
                    SwitchjPanel.setVisible(false);
                    PrinterjPanel.setVisible(false);
                    // insert other values
                    Computer pc = (Computer) asset;
                    ShownCPUjLabel.setText(pc.getCPU());
                    ShownRAMjLabel.setText(pc.getRAM());
                    ShownHardjLabel.setText(pc.getHard());
                    ShownGraphicjLabel.setText(pc.getGraphic());
                    break;
                case 1:
                    // changing panels
                    ComputerjPanel.setVisible(false);
                    SwitchjPanel.setVisible(true);
                    PrinterjPanel.setVisible(false);
                    // insert other values
                    Switch s = (Switch) asset;
                    ShownPortNumberjLabel.setText(Integer.toString(s.getPortNumber()));
                    if (s.getManageable()) {
                        ShownManageablejLabel.setText("Yes");
                    } else {
                        ShownManageablejLabel.setText("No");
                    }
                    break;
                case 2:
                    // changing panels
                    ComputerjPanel.setVisible(false);
                    SwitchjPanel.setVisible(false);
                    PrinterjPanel.setVisible(true);
                    // insert other values
                    Printer p = (Printer) asset;
                    if (p.getColorPrint()) {
                        ShownColorPrintjLabel.setText("Yes");
                    } else {
                        ShownColorPrintjLabel.setText("No");
                    }
                    break;
            }
        }
        
    }//GEN-LAST:event_jList1ValueChanged

    void updatelist() {
        
        ArrayList <Asset> NewList = new ArrayList();
        for (Asset a : Main.assets){
            if (a.toString().startsWith(SearchjTextField.getText())){
                NewList.add(a);
            }           
        }
        jList1.setListData(NewList.toArray());
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AssetsInfojPanel1;
    private javax.swing.JLabel BDatejLabel;
    private javax.swing.JLabel CPUjLabel;
    private javax.swing.JLabel ColorPrintjLabel;
    private javax.swing.JPanel ComputerjPanel;
    private javax.swing.JLabel GraphicjLabel;
    private javax.swing.JLabel HardjLabel;
    private javax.swing.JLabel IDjLabel;
    private javax.swing.JLabel ListTitlejLabel;
    private javax.swing.JPanel ListjPanel;
    private javax.swing.JLabel LocationjLabel;
    private javax.swing.JLabel ManageablejLabel;
    private javax.swing.JLabel ModeljLabel;
    private javax.swing.JLabel PortNumberjLabel;
    private javax.swing.JPanel PrinterjPanel;
    private javax.swing.JLabel RAMjLabel;
    private javax.swing.JLabel SearchjLabel;
    private javax.swing.JTextField SearchjTextField;
    private javax.swing.JLabel ShownBDatejLabel;
    private javax.swing.JLabel ShownCPUjLabel;
    private javax.swing.JLabel ShownColorPrintjLabel;
    private javax.swing.JLabel ShownGraphicjLabel;
    private javax.swing.JLabel ShownHardjLabel;
    private javax.swing.JLabel ShownIDjLabel;
    private javax.swing.JLabel ShownLocationjLabel;
    private javax.swing.JLabel ShownManageablejLabel;
    private javax.swing.JLabel ShownModeljLabel;
    private javax.swing.JLabel ShownPortNumberjLabel;
    private javax.swing.JLabel ShownRAMjLabel;
    private javax.swing.JLabel ShownStatejLabel;
    private javax.swing.JLabel StatejLabel;
    private javax.swing.JPanel SwitchjPanel;
    private javax.swing.JLabel TitlejLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLayeredPane jLayeredPane;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
