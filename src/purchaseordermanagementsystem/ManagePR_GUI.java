/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package purchaseordermanagementsystem;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author weily
 */
public class ManagePR_GUI extends javax.swing.JFrame {

    private SaleManager saleManager;
    String[] statusSelection = {"All","Pending","Approved","Rejected"};
    
    public ManagePR_GUI(SaleManager saleManager) {
        this.saleManager=saleManager;

        initComponents();
        setLocationRelativeTo(null);
        displayTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchText = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PRTable = new javax.swing.JTable();
        statusComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Manage Purchase Requisition");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        PRTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PR ID", "SM ID", "Supplier ID", "Request Date", "Grand Total Price", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PRTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PRTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PRTable);

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Pending", "Approved", "Rejected" }));
        statusComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                statusComboBoxItemStateChanged(evt);
            }
        });
        statusComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Status");

        jLabel2.setText("Find");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(backButton)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(addButton)
                        .addGap(30, 30, 30)
                        .addComponent(editButton)
                        .addGap(26, 26, 26)
                        .addComponent(removeButton)
                        .addGap(85, 85, 85))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(backButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(addButton)
                                .addComponent(editButton)
                                .addComponent(removeButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel1))
                            .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(searchButton)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        
        AddPR_GUI addPRGUI = new AddPR_GUI(saleManager);
        addPRGUI.show();
        dispose();
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void statusComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusComboBoxActionPerformed
        
    }//GEN-LAST:event_statusComboBoxActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        SaleManager_GUI smGUI = new SaleManager_GUI(saleManager);
        smGUI.show();
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        
        String filterTarget = statusSelection[statusComboBox.getSelectedIndex()];
        String searchTarget = searchText.getText();
        // search with All
        if (searchTarget.isBlank() && filterTarget.equals("All")){
            removeTableRow();
            displayTable();
        }
        else if(searchTarget.isBlank() && statusComboBox.getSelectedIndex()!=0){
            FileManager filterStatus = new FileManager("Purchase_Requisition.txt");
            ArrayList<String[]> statusPR = filterStatus.filterData(5, filterTarget);
            removeTableRow();
            displayTable(statusPR);  
        }
        // search & Text
        else if(searchText != null && statusComboBox.getSelectedIndex()!=0){
            
            FileManager searchPR = new FileManager("Purchase_Requisition.txt");
            ArrayList<String[]> PRList = searchPR.searchData(searchTarget);
            ArrayList<String[]> statusPR = searchPR.filterData(5, filterTarget);
            
            ArrayList<String[]> PR_StatusArray = new ArrayList<String[]>();
            for(int i = 0; i<PRList.size();i++){
                String[] arrayData = PRList.get(i);
                for(int j = 0; j<statusPR.size();j++){
                    String[] statusData = statusPR.get(j);
                    if(Arrays.equals(arrayData,statusData) == true){
                        PR_StatusArray.add(statusData);  
                    }
                }
            }
            removeTableRow();
            displayTable(PR_StatusArray);
        }
        else{
            FileManager searchPR = new FileManager("Purchase_Requisition.txt");
            ArrayList<String[]> PRList = searchPR.searchData(searchTarget);
            removeTableRow();
            displayTable(PRList); 
        }
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed

        DefaultTableModel model = (DefaultTableModel) PRTable.getModel();
        int selectedRowIndex = PRTable.getSelectedRow();
        String SelectedPRID = model.getValueAt(selectedRowIndex, 0).toString();
//        System.out.println(SelectedPRID);
        
        FileManager searchPR = new FileManager("Purchase_Requisition.txt");
        ArrayList<String[]> PRList = searchPR.searchData(SelectedPRID); 
 
        String[] SelectedPRData = PRList.get(0);
//        System.out.println(Arrays.toString(SelectedPRData));
//        String hello = SelectedPRData[2];
//        System.out.println(hello);
        
        EditPR_GUI editPRGUI = new EditPR_GUI(saleManager,SelectedPRData);
        editPRGUI.show();
        dispose();
    }//GEN-LAST:event_editButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        RemovePR_GUI removePRGUI = new RemovePR_GUI(saleManager);
        removePRGUI.show();
        dispose();
    }//GEN-LAST:event_removeButtonActionPerformed

    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextActionPerformed

    private void statusComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_statusComboBoxItemStateChanged
    
    }//GEN-LAST:event_statusComboBoxItemStateChanged

    private void PRTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PRTableMouseClicked
//        DefaultTableModel model = (DefaultTableModel) PRTable.getModel();
//        int selectedRowIndex = PRTable.getSelectedRow();
//        String SelectedPRID = model.getValueAt(selectedRowIndex, 0).toString();
//        
//        FileManager searchPR = new FileManager("Purchase_Requisition.txt");
//        ArrayList<String[]> PRList = searchPR.searchData(SelectedPRID);
//        SelectedPRData = PRList.get(0);
//        System.out.print(selectedRowIndex+"\n");
//        System.out.print(SelectedPRID);
    }//GEN-LAST:event_PRTableMouseClicked

    public void displayTable(){
        DefaultTableModel model = (DefaultTableModel) PRTable.getModel();
        FileManager getrow = new FileManager("Purchase_Requisition.txt");
        ArrayList<String> rows =  getrow.readFile();
        for(int i=0 ; i< rows.size();i++){
            String line = rows.get(i).toString();
            String[] data = line.split("\\|");
            String[] selectedData = Arrays.copyOf(data, 6);
            model.addRow(selectedData);
        }
        
    }
    
    public void displayTable(ArrayList<String[]> PRData){
        DefaultTableModel model = (DefaultTableModel) PRTable.getModel();
        for(int i =0;i<PRData.size();i++){
            String[] selectedData = Arrays.copyOf(PRData.get(i), 6);
            model.addRow(selectedData);
        }
    }    
    
    public void removeTableRow(){
        DefaultTableModel model = (DefaultTableModel) PRTable.getModel();
        int count = model.getRowCount();
        for (int i = count - 1; i >= 0; i--) {
            model.removeRow(i);
        }
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
            java.util.logging.Logger.getLogger(ManagePR_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagePR_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagePR_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagePR_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        SaleManager salem = new SaleManager("U00002","SM01","SM1234","SM01@gmail.com","0134567890","SaleManager","S00001");

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagePR_GUI(salem).setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PRTable;
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchText;
    private javax.swing.JComboBox<String> statusComboBox;
    // End of variables declaration//GEN-END:variables
}
