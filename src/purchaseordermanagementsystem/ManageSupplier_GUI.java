/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package purchaseordermanagementsystem;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author YAO FENG PC
 */
public class ManageSupplier_GUI extends javax.swing.JFrame {
    SaleManager saleManager;
    PurchaseManager purchaseManager;
    /**
     * Creates new form ViewSupplier_GUI
     */
    public ManageSupplier_GUI(SaleManager saleManager) {
        this.saleManager = saleManager;
        initComponents();
        displayTable();
        
    }
    
    public ManageSupplier_GUI(PurchaseManager purchaseManager){
        this.purchaseManager = purchaseManager;
        initComponents();                
        setLocationRelativeTo(null);
        displayTable();
        
        AddButton.setVisible(false);
        EditButton.setVisible(false);
        DeleteButton.setVisible(false);
        SupplierLabel.setText("View Supplier");
    }
    
    public void displayTable(){
        DefaultTableModel model = (DefaultTableModel) supplierTable.getModel();
        FileManager getrow = new FileManager("Supplier.txt");
        ArrayList<String> rows =  getrow.readFile();
        for(int i=0 ; i< rows.size();i++){
            String line = rows.get(i).toString();
            String[] data = line.split("\\|");
            model.addRow(data);
        }
    }
    public void displayTable(ArrayList<String[]> userData){
        DefaultTableModel model = (DefaultTableModel) supplierTable.getModel();
        for(int i =0;i<userData.size();i++){
            model.addRow(userData.get(i));
        }
    }
    
    public void removeTableRow(){
        DefaultTableModel model = (DefaultTableModel) supplierTable.getModel();
        int count = model.getRowCount();
        for (int i = count - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        supplierTable = new javax.swing.JTable();
        SupplierLabel = new javax.swing.JLabel();
        searchText = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        EditButton.setText("Edit");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        supplierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SupplierID", "Name", "PhoneNo", "Email", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(supplierTable);

        SupplierLabel.setText("Manage Supplier");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(AddButton)
                        .addGap(51, 51, 51)
                        .addComponent(EditButton)
                        .addGap(54, 54, 54)
                        .addComponent(DeleteButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addGap(55, 55, 55)
                                .addComponent(SupplierLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(SupplierLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton)
                    .addComponent(EditButton)
                    .addComponent(DeleteButton))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        AddSupplier_GUI addSupplierGUI = new AddSupplier_GUI(saleManager);
        addSupplierGUI.show();
        dispose();
        
    }//GEN-LAST:event_AddButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        if (purchaseManager !=null && saleManager == null){
            PurchaseManager_GUI purchaseManagerGUI = new PurchaseManager_GUI(purchaseManager);
            purchaseManagerGUI.show();
            dispose();
        }
        else if (purchaseManager ==null && saleManager != null){
            SaleManager_GUI smGUI = new SaleManager_GUI(saleManager);
            smGUI.show();
            dispose();
        }
    }//GEN-LAST:event_backButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        // get selected index 
        int indexRow = supplierTable.getSelectedRow();
        // define a model to modify table
        TableModel model = supplierTable.getModel();
        // delcare a table size array
        String[] tableData = new String[supplierTable.getColumnCount()];
        // Get each data from specific row
        for(int i=0; i<supplierTable.getColumnCount();i++){
            String data = model.getValueAt(indexRow, i).toString();
            tableData[i]=data;
        }
        Supplier supplier = new Supplier(tableData[0],tableData[1],tableData[2],tableData[3],tableData[4]);
        saleManager.manageSupplier("remove", supplier,null);
        
        this.removeTableRow();
        this.displayTable();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String searchTarget =searchText.getText();
        if(searchTarget.isBlank()){
            removeTableRow();
            displayTable();
        }
        else{
            
            FileManager file = new FileManager("Supplier.txt");
            ArrayList<String[]> searchList = file.searchData(searchTarget);
            removeTableRow();
            displayTable(searchList); 
        }
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        // TODO add your handling code here:
        int indexRow = supplierTable.getSelectedRow();
        TableModel model = supplierTable.getModel();
        String[] tableData = new String[supplierTable.getColumnCount()];
        for(int i=0; i<supplierTable.getColumnCount();i++){
            String data = model.getValueAt(indexRow, i).toString();
            tableData[i]=data;
        }
        System.out.println(Arrays.toString(tableData));
        EditSupplier_GUI editSupplierGUI = new EditSupplier_GUI(saleManager,tableData);
        editSupplierGUI.show();
        dispose();
    }//GEN-LAST:event_EditButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        SaleManager saleManager = new SaleManager("U00002","SM01","SM1234","SM01@gmail.com","0134567890","SaleManager","S00001");
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
            java.util.logging.Logger.getLogger(ManageSupplier_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageSupplier_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageSupplier_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageSupplier_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageSupplier_GUI(saleManager).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JLabel SupplierLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchText;
    private javax.swing.JTable supplierTable;
    // End of variables declaration//GEN-END:variables
}
