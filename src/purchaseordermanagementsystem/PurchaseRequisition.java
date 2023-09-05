/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purchaseordermanagementsystem;

import java.util.Date;

public class PurchaseRequisition {
    private String PurchaseRequisitionID, PurchaseRequisitionStatus;
    private Supplier supplier;
    private Date requestDate;
    private double grandTotalPrice;
    private SaleManager saleManager;
    private ItemLine itemLine;

    public PurchaseRequisition(String PurchaseRequisitionID, SaleManager saleManager, Supplier supplier, Date requestDate, double grandTotalPrice, String PurchaseRequisitionStatus, ItemLine itemLine) {
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

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public double getGrandTotalPrice() {
        return grandTotalPrice;
    }

    public void setGrandTotalPrice(double grandTotalPrice) {
        this.grandTotalPrice = grandTotalPrice;
    }
    
    public String getPurchaseRequisitionStatus() {
        return PurchaseRequisitionStatus;
    }

    public void setPurchaseRequisitionStatus(String PurchaseRequisitionStatus) {
        this.PurchaseRequisitionStatus = PurchaseRequisitionStatus;
    }
    
    public void createPurchaseRequisition(){
        
    }
 
    
}
