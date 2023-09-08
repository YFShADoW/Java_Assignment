/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purchaseordermanagementsystem;

import java.util.ArrayList;
import java.util.Date;

public class PurchaseRequisition {
    private String PurchaseRequisitionID;
    private String PurchaseRequisitionStatus;
    private String requestDate;
    private String grandTotalPrice;
    private String saleManager;
    private ItemLine[] itemList;
    private Supplier supplier;

    public PurchaseRequisition(String PurchaseRequisitionID, String saleManager, Supplier supplier, String requestDate, String grandTotalPrice, String PurchaseRequisitionStatus, ItemLine[] itemList) {
        this.PurchaseRequisitionID = PurchaseRequisitionID;
        this.saleManager = saleManager;
        this.supplier = supplier;
        this.requestDate = requestDate;
        this.grandTotalPrice = grandTotalPrice; // Redo
        this.PurchaseRequisitionStatus = PurchaseRequisitionStatus;
        this.itemList = itemList;
    }
    public PurchaseRequisition(String PurchaseRequisitionID, String saleManager, String supplierID, String requestDate, String grandTotalPrice, String PurchaseRequisitionStatus, ItemLine[] itemList) {
        this.PurchaseRequisitionID = PurchaseRequisitionID;
        this.saleManager = saleManager;
        
        FileManager file = new FileManager("Supplier.txt");
        String[] supplierData =file.searchByPrimaryKey(supplierID);
        
        this.supplier = new Supplier(supplierData[0],supplierData[1],supplierData[2],supplierData[3],supplierData[4]);
        this.requestDate = requestDate;
        this.grandTotalPrice = grandTotalPrice;
        this.PurchaseRequisitionStatus = PurchaseRequisitionStatus;
        this.itemList = itemList;
    }

    public String getPurchaseRequisitionID() {
        return PurchaseRequisitionID;
    }

    public void setPurchaseRequisitionID(String PurchaseRequisitionID) {
        this.PurchaseRequisitionID = PurchaseRequisitionID;
    }

    public String getPurchaseRequisitionStatus() {
        return PurchaseRequisitionStatus;
    }

    public void setPurchaseRequisitionStatus(String PurchaseRequisitionStatus) {
        this.PurchaseRequisitionStatus = PurchaseRequisitionStatus;
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

    public String getSaleManager() {
        return saleManager;
    }

    public void setSaleManager(String saleManager) {
        this.saleManager = saleManager;
    }

    public ItemLine[] getItemList() {
        return itemList;
    }

    public void setItemList(ItemLine[] itemList) {
        this.itemList = itemList;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    
    
    public void createPurchaseRequisition(){
        
    }
    
    public void addPurchaseRequisition(){
        String line = "";
        for(ItemLine item: this.itemList){
            String ItemIDQuantity = String.join(";",item.getItem().getItemCode(),Integer.toString(item.getQuantity()));
            line = String.join(",", line,ItemIDQuantity);
        }
        line = line.substring(1);
        String[] newPR = {this.getPurchaseRequisitionID(),this.getSaleManager(),this.getSupplier().getSupplierID(),this.getRequestDate(),this.getGrandTotalPrice(),this.getPurchaseRequisitionStatus(),line};
        FileManager PRFile = new FileManager("Purchase_Requisition.txt");
        PRFile.addToFile(newPR);
    }
    
}
