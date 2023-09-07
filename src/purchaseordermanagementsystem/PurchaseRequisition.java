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
    private String itemLine;

    public PurchaseRequisition(String PurchaseRequisitionID, String saleManager, String supplier, String requestDate, String grandTotalPrice, String PurchaseRequisitionStatus, String itemLine) {
        this.PurchaseRequisitionID = PurchaseRequisitionID;
        this.saleManager = saleManager;
        this.supplier = supplier;
        this.requestDate = requestDate;
        this.grandTotalPrice = grandTotalPrice;
        this.PurchaseRequisitionStatus = PurchaseRequisitionStatus;
        this.itemLine = itemLine;
    }

    public String getPurchaseRequisitionID() {
        return PurchaseRequisitionID;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getGrandTotalPrice() {
        return grandTotalPrice;
    }

    public void setGrandTotalPrice(String grandTotalPrice) {
        this.grandTotalPrice = grandTotalPrice;
    }
    
    public String getPurchaseRequisitionStatus() {
        return PurchaseRequisitionStatus;
    }

    public void setPurchaseRequisitionStatus(String PurchaseRequisitionStatus) {
        this.PurchaseRequisitionStatus = PurchaseRequisitionStatus;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getSaleManager() {
        return saleManager;
    }

    public void setSaleManager(String saleManager) {
        this.saleManager = saleManager;
    }

    public String getItemLine() {
        return itemLine;
    }

    public void setItemLine(String itemLine) {
        this.itemLine = itemLine;
    }

    public void createPurchaseRequisition(){
        
    }
    
    public void addPurchaseRequisition(){
        String[] newPR = {this.getPurchaseRequisitionID(),this.getSaleManager(),this.getSupplier(),this.getRequestDate(),this.getGrandTotalPrice(),this.getPurchaseRequisitionStatus(),this.getItemLine()};
        FileManager PRFile = new FileManager("Purchase_Requisition.txt");
        PRFile.addToFile(newPR);
    }
    
}
