 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Options;

import Program.Enums.State;
import Program.Objects.Asset;
import Program.Main;
import Program.Objects.Computer;
import Program.Objects.Printer;
import Program.Objects.Switch;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author moham
 */


public class EditanAssetJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EditanAssetJPanel
     */
    Asset asset;
    String[] location = new String[3];

    public EditanAssetJPanel() {
        initComponents();
        Main.login.setMinimumSize(this.getMinimumSize());
        ComputerjPanel.setVisible(false);
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

        ColorbuttonGroup = new javax.swing.ButtonGroup();
        ManageablebuttonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        TitlejLabel = new javax.swing.JLabel();
        ListjPanel = new javax.swing.JPanel();
        ListTitlejLabel = new javax.swing.JLabel();
        SearchjLabel = new javax.swing.JLabel();
        SearchjTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        AssetjPanel1 = new javax.swing.JPanel();
        IDjLabel = new javax.swing.JLabel();
        ModeljLabel = new javax.swing.JLabel();
        BDatejLabel = new javax.swing.JLabel();
        LocationjLabel = new javax.swing.JLabel();
        StatejLabel = new javax.swing.JLabel();
        ModeljTextField = new javax.swing.JTextField();
        StatejComboBox = new javax.swing.JComboBox();
        CollegejTextField = new javax.swing.JTextField();
        OwnerjTextField = new javax.swing.JTextField();
        PlacejTextField = new javax.swing.JTextField();
        CamajLabel1 = new javax.swing.JLabel();
        CamajLabel2 = new javax.swing.JLabel();
        ShownIDjLabel = new javax.swing.JLabel();
        ShownBDatejLabel = new javax.swing.JLabel();
        jLayeredPane = new javax.swing.JLayeredPane();
        ComputerjPanel = new javax.swing.JPanel();
        CPUjLabel = new javax.swing.JLabel();
        RAMjLabel = new javax.swing.JLabel();
        HardjLabel = new javax.swing.JLabel();
        GraphicjLabel = new javax.swing.JLabel();
        CPUjTextField = new javax.swing.JTextField();
        RAMjTextField = new javax.swing.JTextField();
        HardjTextField = new javax.swing.JTextField();
        GraphicjTextField = new javax.swing.JTextField();
        SwitchjPanel = new javax.swing.JPanel();
        PortNumberjLabel = new javax.swing.JLabel();
        ManageablejLabel = new javax.swing.JLabel();
        PortNumberjSpinner = new javax.swing.JSpinner();
        YesjRadioButton1 = new javax.swing.JRadioButton();
        NojRadioButton1 = new javax.swing.JRadioButton();
        PrinterjPanel = new javax.swing.JPanel();
        ColorPrintjLabel = new javax.swing.JLabel();
        YesjRadioButton = new javax.swing.JRadioButton();
        NojRadioButton = new javax.swing.JRadioButton();
        MainMenujButton = new javax.swing.JButton();
        EditjButton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        TitlejLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TitlejLabel.setText("Edit an Asset");

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

        IDjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        IDjLabel.setText("ID :");

        ModeljLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ModeljLabel.setText("Model :");

        BDatejLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BDatejLabel.setText("BDate :");

        LocationjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LocationjLabel.setText("Location :");

        StatejLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        StatejLabel.setText("State :");

        StatejComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Working and Fine", "Working but Broken" }));

        CollegejTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CollegejTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CollegejTextFieldFocusLost(evt);
            }
        });

        OwnerjTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                OwnerjTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                OwnerjTextFieldFocusLost(evt);
            }
        });

        PlacejTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PlacejTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PlacejTextFieldFocusLost(evt);
            }
        });

        CamajLabel1.setText(",");

        CamajLabel2.setText(",");

        ShownIDjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout AssetjPanel1Layout = new javax.swing.GroupLayout(AssetjPanel1);
        AssetjPanel1.setLayout(AssetjPanel1Layout);
        AssetjPanel1Layout.setHorizontalGroup(
            AssetjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AssetjPanel1Layout.createSequentialGroup()
                .addGroup(AssetjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AssetjPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(StatejLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StatejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AssetjPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(LocationjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CollegejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CamajLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OwnerjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CamajLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PlacejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AssetjPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(AssetjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(AssetjPanel1Layout.createSequentialGroup()
                        .addComponent(BDatejLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ShownBDatejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AssetjPanel1Layout.createSequentialGroup()
                        .addComponent(IDjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ShownIDjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AssetjPanel1Layout.createSequentialGroup()
                        .addComponent(ModeljLabel)
                        .addGap(9, 9, 9)
                        .addComponent(ModeljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AssetjPanel1Layout.setVerticalGroup(
            AssetjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AssetjPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(AssetjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IDjLabel)
                    .addComponent(ShownIDjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AssetjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BDatejLabel)
                    .addComponent(ShownBDatejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AssetjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModeljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModeljLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AssetjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AssetjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CollegejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LocationjLabel))
                    .addGroup(AssetjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CamajLabel2)
                        .addComponent(OwnerjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PlacejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CamajLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AssetjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StatejLabel)
                    .addComponent(StatejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        CPUjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CPUjLabel.setText("CPU :");

        RAMjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RAMjLabel.setText("RAM :");

        HardjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        HardjLabel.setText("Hard :");

        GraphicjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        GraphicjLabel.setText("Graphic :");

        javax.swing.GroupLayout ComputerjPanelLayout = new javax.swing.GroupLayout(ComputerjPanel);
        ComputerjPanel.setLayout(ComputerjPanelLayout);
        ComputerjPanelLayout.setHorizontalGroup(
            ComputerjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ComputerjPanelLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(ComputerjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(GraphicjLabel)
                    .addComponent(CPUjLabel)
                    .addComponent(HardjLabel)
                    .addComponent(RAMjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ComputerjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GraphicjTextField)
                    .addComponent(HardjTextField)
                    .addComponent(RAMjTextField)
                    .addComponent(CPUjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        ComputerjPanelLayout.setVerticalGroup(
            ComputerjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComputerjPanelLayout.createSequentialGroup()
                .addGroup(ComputerjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPUjLabel)
                    .addComponent(CPUjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ComputerjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RAMjLabel)
                    .addComponent(RAMjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ComputerjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HardjLabel)
                    .addComponent(HardjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ComputerjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GraphicjLabel)
                    .addComponent(GraphicjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        PortNumberjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PortNumberjLabel.setText("Port Number :");

        ManageablejLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ManageablejLabel.setText("Manageable :");

        ManageablebuttonGroup.add(YesjRadioButton1);
        YesjRadioButton1.setText("Yes");

        ManageablebuttonGroup.add(NojRadioButton1);
        NojRadioButton1.setText("No");

        javax.swing.GroupLayout SwitchjPanelLayout = new javax.swing.GroupLayout(SwitchjPanel);
        SwitchjPanel.setLayout(SwitchjPanelLayout);
        SwitchjPanelLayout.setHorizontalGroup(
            SwitchjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SwitchjPanelLayout.createSequentialGroup()
                .addGroup(SwitchjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SwitchjPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(PortNumberjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PortNumberjSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SwitchjPanelLayout.createSequentialGroup()
                        .addContainerGap(89, Short.MAX_VALUE)
                        .addComponent(ManageablejLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(YesjRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NojRadioButton1)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        SwitchjPanelLayout.setVerticalGroup(
            SwitchjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SwitchjPanelLayout.createSequentialGroup()
                .addGroup(SwitchjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PortNumberjLabel)
                    .addComponent(PortNumberjSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 38, Short.MAX_VALUE)
                .addGroup(SwitchjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManageablejLabel)
                    .addComponent(YesjRadioButton1)
                    .addComponent(NojRadioButton1))
                .addGap(0, 75, Short.MAX_VALUE))
        );

        ColorPrintjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ColorPrintjLabel.setText("Color Print :");

        ColorbuttonGroup.add(YesjRadioButton);
        YesjRadioButton.setText("Yes");

        ColorbuttonGroup.add(NojRadioButton);
        NojRadioButton.setText("No");

        javax.swing.GroupLayout PrinterjPanelLayout = new javax.swing.GroupLayout(PrinterjPanel);
        PrinterjPanel.setLayout(PrinterjPanelLayout);
        PrinterjPanelLayout.setHorizontalGroup(
            PrinterjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrinterjPanelLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(ColorPrintjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(YesjRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NojRadioButton)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        PrinterjPanelLayout.setVerticalGroup(
            PrinterjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrinterjPanelLayout.createSequentialGroup()
                .addGroup(PrinterjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorPrintjLabel)
                    .addComponent(YesjRadioButton)
                    .addComponent(NojRadioButton))
                .addGap(0, 94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jLayeredPaneLayout = new javax.swing.GroupLayout(jLayeredPane);
        jLayeredPane.setLayout(jLayeredPaneLayout);
        jLayeredPaneLayout.setHorizontalGroup(
            jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ComputerjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SwitchjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PrinterjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPaneLayout.setVerticalGroup(
            jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 156, Short.MAX_VALUE)
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ComputerjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SwitchjPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PrinterjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane.setLayer(ComputerjPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane.setLayer(SwitchjPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane.setLayer(PrinterjPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        MainMenujButton.setText("Main Menu");
        MainMenujButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenujButtonActionPerformed(evt);
            }
        });

        EditjButton.setText("Edit");
        EditjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TitlejLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AssetjPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLayeredPane))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ListjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EditjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MainMenujButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitlejLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ListjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AssetjPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLayeredPane)
                        .addGap(23, 23, 23)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MainMenujButton)
                    .addComponent(EditjButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CollegejTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CollegejTextFieldFocusGained

        location[0] = CollegejTextField.getText();
        CollegejTextField.setText("");

    }//GEN-LAST:event_CollegejTextFieldFocusGained

    private void CollegejTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CollegejTextFieldFocusLost

        if (CollegejTextField.getText().equals("")) {
            CollegejTextField.setText(location[0]);
        }
        location[0] = CollegejTextField.getText();

    }//GEN-LAST:event_CollegejTextFieldFocusLost

    private void OwnerjTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_OwnerjTextFieldFocusGained

        location[1] = OwnerjTextField.getText();
        OwnerjTextField.setText("");

    }//GEN-LAST:event_OwnerjTextFieldFocusGained

    private void OwnerjTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_OwnerjTextFieldFocusLost

        if (OwnerjTextField.getText().equals("")) {
            OwnerjTextField.setText(location[1]);
        }
        location[1] = OwnerjTextField.getText();

    }//GEN-LAST:event_OwnerjTextFieldFocusLost

    private void PlacejTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PlacejTextFieldFocusGained

        location[2] = PlacejTextField.getText();
        PlacejTextField.setText("");

    }//GEN-LAST:event_PlacejTextFieldFocusGained

    private void PlacejTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PlacejTextFieldFocusLost

        if (PlacejTextField.getText().equals("")) {
            PlacejTextField.setText(location[2]);
        }
        location[2] = PlacejTextField.getText();

    }//GEN-LAST:event_PlacejTextFieldFocusLost

    private void MainMenujButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenujButtonActionPerformed
        Main.BacktoMainMenu();
    }//GEN-LAST:event_MainMenujButtonActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged

        if (evt.getValueIsAdjusting()) {//This line prevents double events
            asset = (Asset) jList1.getSelectedValue();
            // setting previous information
            ShownIDjLabel.setText(asset.toString());
            ModeljTextField.setText(asset.getModel());
            ShownBDatejLabel.setText(asset.getBDate());
            CollegejTextField.setText(asset.getLocation()[0]);
            OwnerjTextField.setText(asset.getLocation()[1]);
            PlacejTextField.setText(asset.getLocation()[2]);
            location = asset.getLocation();
            if (asset.getState().equals(State.Working_Fine)) {
                StatejComboBox.setSelectedIndex(0);
            } else if (asset.getState().equals(State.Working_Broken)) {
                StatejComboBox.setSelectedIndex(1);
            } else {
                StatejComboBox.setSelectedIndex(2);
            }
            switch (asset.getType()) { // swaping panels by typ of asset
                case 0:
                    // changing panels
                    ComputerjPanel.setVisible(true);
                    SwitchjPanel.setVisible(false);
                    PrinterjPanel.setVisible(false);
                    // insert other values
                    Computer pc = (Computer) asset;
                    CPUjTextField.setText(pc.getCPU());
                    RAMjTextField.setText(pc.getRAM());
                    HardjTextField.setText(pc.getHard());
                    GraphicjTextField.setText(pc.getGraphic());
                    break;
                case 1:
                    // changing panels
                    ComputerjPanel.setVisible(false);
                    SwitchjPanel.setVisible(true);
                    PrinterjPanel.setVisible(false);
                    // insert other values
                    Switch s = (Switch) asset;
                    PortNumberjSpinner.setValue(s.getPortNumber());
                    ManageablebuttonGroup.setSelected(YesjRadioButton1.getModel(), s.getManageable());
                    break;
                case 2:
                    // changing panels
                    ComputerjPanel.setVisible(false);
                    SwitchjPanel.setVisible(false);
                    PrinterjPanel.setVisible(true);
                    // insert other values
                    Printer p = (Printer) asset;
                    ColorbuttonGroup.setSelected(YesjRadioButton.getModel(), p.getColorPrint());
                    break;
            }
        }

    }//GEN-LAST:event_jList1ValueChanged

    private void EditjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditjButtonActionPerformed

        try {
            ready();
            asset.setLocation(location);
            asset.setModel(ModeljTextField.getText());
            switch (StatejComboBox.getSelectedIndex()) {
                case 0:
                    asset.setState("Working_Fine");
                    break;
                case 1:
                    asset.setState("Working_Broken");
                    break;
            }

            switch (asset.getType()) {
                case 0:
                    Computer pc = (Computer) asset;
                    pc.setCPU(CPUjTextField.getText());
                    pc.setRAM(RAMjTextField.getText());
                    pc.setHard(HardjTextField.getText());
                    pc.setGraphic(GraphicjTextField.getText());
                    break;
                case 1:
                    Switch s = (Switch) asset;
                    s.setPortNumber((int) PortNumberjSpinner.getValue());
                    s.setManageable(ManageablebuttonGroup.getSelection().equals(YesjRadioButton.getModel()));
                    break;
                case 2:
                    Printer p = (Printer) asset;
                    p.setColorPrint(ColorbuttonGroup.getSelection().equals(YesjRadioButton.getModel()));
                    break;
            }
            Main.BacktoMainMenu();
        } catch (IllegalStateException e) {
            JOptionPane.showMessageDialog(Main.login, e.getMessage(), "Error", 0);
        }


    }//GEN-LAST:event_EditjButtonActionPerformed

    void updatelist() {

        ArrayList<Asset> NewList = new ArrayList();
        for (Asset a : Main.assets) {
            if (a.toString().startsWith(SearchjTextField.getText())) {
                NewList.add(a);
            }
        }
        jList1.setListData(NewList.toArray());

    }

    void ready() throws IllegalStateException {

        if (ModeljTextField.getText().equals("") || location[0].equals("")
                || location[1].equals("") || location[2].equals("")) {
            throw new IllegalStateException("One or some of asset fields are invalid!");
        }
        if (asset.getType() == 0 && ((CPUjTextField.getText().equals("")
                || RAMjTextField.getText().equals("")
                || HardjTextField.getText().equals("") || GraphicjTextField.getText().equals("")))) {
            throw new IllegalStateException("One or some of computer fields are invalid!");
        }
        if (asset.getType() == 1 && ((int) PortNumberjSpinner.getValue() <= 1)) {
            throw new IllegalStateException("Port Number must be higher than 1!");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AssetjPanel1;
    private javax.swing.JLabel BDatejLabel;
    private javax.swing.JLabel CPUjLabel;
    private javax.swing.JTextField CPUjTextField;
    private javax.swing.JLabel CamajLabel1;
    private javax.swing.JLabel CamajLabel2;
    private javax.swing.JTextField CollegejTextField;
    private javax.swing.JLabel ColorPrintjLabel;
    private javax.swing.ButtonGroup ColorbuttonGroup;
    private javax.swing.JPanel ComputerjPanel;
    private javax.swing.JButton EditjButton;
    private javax.swing.JLabel GraphicjLabel;
    private javax.swing.JTextField GraphicjTextField;
    private javax.swing.JLabel HardjLabel;
    private javax.swing.JTextField HardjTextField;
    private javax.swing.JLabel IDjLabel;
    private javax.swing.JLabel ListTitlejLabel;
    private javax.swing.JPanel ListjPanel;
    private javax.swing.JLabel LocationjLabel;
    private javax.swing.JButton MainMenujButton;
    private javax.swing.ButtonGroup ManageablebuttonGroup;
    private javax.swing.JLabel ManageablejLabel;
    private javax.swing.JLabel ModeljLabel;
    private javax.swing.JTextField ModeljTextField;
    private javax.swing.JRadioButton NojRadioButton;
    private javax.swing.JRadioButton NojRadioButton1;
    private javax.swing.JTextField OwnerjTextField;
    private javax.swing.JTextField PlacejTextField;
    private javax.swing.JLabel PortNumberjLabel;
    private javax.swing.JSpinner PortNumberjSpinner;
    private javax.swing.JPanel PrinterjPanel;
    private javax.swing.JLabel RAMjLabel;
    private javax.swing.JTextField RAMjTextField;
    private javax.swing.JLabel SearchjLabel;
    private javax.swing.JTextField SearchjTextField;
    private javax.swing.JLabel ShownBDatejLabel;
    private javax.swing.JLabel ShownIDjLabel;
    private javax.swing.JComboBox StatejComboBox;
    private javax.swing.JLabel StatejLabel;
    private javax.swing.JPanel SwitchjPanel;
    private javax.swing.JLabel TitlejLabel;
    private javax.swing.JRadioButton YesjRadioButton;
    private javax.swing.JRadioButton YesjRadioButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}