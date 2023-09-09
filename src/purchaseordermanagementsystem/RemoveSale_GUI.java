package purchaseordermanagementsystem;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Shu Qin
 */
public class RemoveSale_GUI extends javax.swing.JFrame {
    private DefaultTableModel removesaletable = new DefaultTableModel();
    private String [] removesalecol = {"Sale ID","Sale Date", "Sale Itrem Code","Sale Name","Sale Irtem Category","Sale Quantity","Sale Unit Price","Sale Total Price"};
    SaleManager saleManager;
    private int row;

    /**
     * Creates new form RemoveSale_GUI
     */
    public RemoveSale_GUI(SaleManager saleManager) {
        removesaletable.setColumnIdentifiers(removesalecol);
        this.saleManager = saleManager;
        displayTable();
        initComponents();
        setLocationRelativeTo(null);
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
        Remove_SaleTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Text_rSaleDate = new javax.swing.JTextField();
        Text_rSaleItemCode = new javax.swing.JTextField();
        Text_rSaleItemName = new javax.swing.JTextField();
        Text_rSaleCategory = new javax.swing.JTextField();
        Text_rSaleQuantity = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Text_rSaleUnitPrice = new javax.swing.JTextField();
        Text_rSaletotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Text_rSaleID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Remove_SaleTable.setModel(removesaletable);
        Remove_SaleTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Remove_SaleTableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Remove_SaleTable);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Remove Sale");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel2.setText("Sale Date: ");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel3.setText("Sale Item Code:");

        Text_rSaleDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_rSaleDateActionPerformed(evt);
            }
        });

        Text_rSaleItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_rSaleItemNameActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("STHupo", 0, 18)); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel7.setText("Fill in the sale information");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel8.setText("Sale Item Name:");

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel9.setText("Sale Item Category:");

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel10.setText("Sale Quantity: ");

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel11.setText("Sale Unit Price:");

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel12.setText("Sale Total Price:");

        Text_rSaleUnitPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_rSaleUnitPriceActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel4.setText("Sale ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Text_rSaleItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Text_rSaleQuantity, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Text_rSaleDate, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Text_rSaleUnitPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Text_rSaletotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(Text_rSaleCategory)
                                    .addComponent(Text_rSaleItemName)
                                    .addComponent(Text_rSaleID))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Text_rSaleID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_rSaleDate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Text_rSaleItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Text_rSaleItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(Text_rSaleCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_rSaleQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(Text_rSaleUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(Text_rSaletotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String rsaleid = Text_rSaleID.getText();
        String rsaledate = Text_rSaleDate.getText();
        String rsalecode = Text_rSaleItemCode.getText();
        String rsalename = Text_rSaleItemName.getText();
        String rsalecategory = Text_rSaleCategory.getText();
        String rsalequantity = Text_rSaleQuantity.getText();
        String rsaleunitprice = Text_rSaleUnitPrice.getText();
        String rsaletotalprice= Text_rSaletotal.getText();
        
        String [] removesaledata = {rsaleid,rsaledate,rsalecode,rsalename, rsalecategory,rsalequantity,rsaleunitprice,rsaletotalprice};
        
        
        FileManager file = new FileManager ("Sale.txt");
        file.removeLineFromFile(removesaledata[0]);
        saleManager.addstock(removesaledata);
        this.removeTableRow();
        this.displayTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Text_rSaleDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_rSaleDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_rSaleDateActionPerformed

    private void Text_rSaleItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_rSaleItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_rSaleItemNameActionPerformed

    private void Text_rSaleUnitPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_rSaleUnitPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_rSaleUnitPriceActionPerformed

    private void Remove_SaleTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Remove_SaleTableMouseReleased
        // TODO add your handling code here:
         row = Remove_SaleTable.getSelectedRow();
        
        String rsaleID = String.valueOf(removesaletable.getValueAt(row,0));
        String rsaleDate = String.valueOf(removesaletable.getValueAt(row,1));
        String rsaleItemCode = String.valueOf(removesaletable.getValueAt(row,2));
        String rsaleItemName = String.valueOf(removesaletable.getValueAt(row,3));
        String rsaleItemCategory = String.valueOf(removesaletable.getValueAt(row,4));  
        String rsaleItemQuantity = String.valueOf(removesaletable.getValueAt(row,5));
        String rsaleUnitPrice = String.valueOf(removesaletable.getValueAt(row,6));
        String rsaleTotalPrice= String.valueOf(removesaletable.getValueAt(row,7));  
        
        Text_rSaleID.setText(rsaleID);
        Text_rSaleDate.setText(rsaleDate);
        Text_rSaleItemCode.setText(rsaleItemCode);
        Text_rSaleItemName.setText(rsaleItemName);
        Text_rSaleCategory.setText(rsaleItemCategory);
        Text_rSaleQuantity.setText(rsaleItemQuantity);
        Text_rSaleUnitPrice.setText(rsaleUnitPrice);
        Text_rSaletotal.setText(rsaleTotalPrice);
        
        
    }//GEN-LAST:event_Remove_SaleTableMouseReleased
    public void displayTable(){
       // DefaultTableModel suppliertable = (DefaultTableModel) SupplierTable.getModel;
        FileManager getrow = new FileManager("Sale.txt");
        ArrayList<String> rows =  getrow.readFile();
        for(int i=0 ; i< rows.size();i++){
            String line = rows.get(i).toString();
            String[] removesaledata1 = line.split("\\|");
            removesaletable.addRow(removesaledata1 );
            
        }
    }
    public void removeTableRow(){
      //  DefaultTableModel model = (DefaultTableModel) SupplierrTable.getModel();
        int count = removesaletable.getRowCount();
        for (int i = count - 1; i >= 0; i--) {
            removesaletable.removeRow(i);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nim bus look and feel */
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
            java.util.logging.Logger.getLogger(RemoveSale_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveSale_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveSale_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveSale_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and SaleManagerdisplay the form */
        SaleManager saleManager = new SaleManager("U00002","SM01","SM1234","SM01@gmail.com","0134567890","SaleManager","S00001");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveSale_GUI(saleManager).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Remove_SaleTable;
    private javax.swing.JTextField Text_rSaleCategory;
    private javax.swing.JTextField Text_rSaleDate;
    private javax.swing.JTextField Text_rSaleID;
    private javax.swing.JTextField Text_rSaleItemCode;
    private javax.swing.JTextField Text_rSaleItemName;
    private javax.swing.JTextField Text_rSaleQuantity;
    private javax.swing.JTextField Text_rSaleUnitPrice;
    private javax.swing.JTextField Text_rSaletotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
