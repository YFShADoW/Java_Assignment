/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purchaseordermanagementsystem;

import java.util.Date;

public class PurchaseRequisition {
    private String PurchaseRequisitionID, PurchaseRequisitionStatus;
    private String supplier;
    private String requestDate;
    private String grandTotalPrice;
    private String saleManager;
    private ItemLine[] itemLine;

    public PurchaseRequisition(String PurchaseRequisitionID, String saleManager, String supplier, String requestDate, String grandTotalPrice, String PurchaseRequisitionStatus, ItemLine[] itemLine) {
        this.PurchaseRequisitionID = PurchaseRequisitionID;
        this.saleManager = saleManager;
        this.supplier = supplier;
        this.requestDate = requestDate;
        this.grandTotalPrice = grandTotalPrice; // Redo
        this.PurchaseRequisitionStatus = PurchaseRequisitionStatus;
        this.itemLine = itemLine;
    }
    public void addPR(){
        
    }

    public void createPurchaseRequisition(){
        
    }
    
    public void addPurchaseRequisition(){
        String[] newPR = {this.getPurchaseRequisitionID(),this.getSaleManager(),this.getSupplier(),this.getRequestDate(),this.getGrandTotalPrice(),this.getPurchaseRequisitionStatus(),this.getItemLine()};
        FileManager PRFile = new FileManager("Purchase_Requisition.txt");
        PRFile.addToFile(newPR);
    }
    
}
