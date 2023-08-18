/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purchaseordermanagementsystem;

import java.util.Date;

public class PurchaseOrder {
    private String purchaseOrderID;
    private Date orderDate;
    private PurchaseRequisition purchaseRequisition;
    private PurchaseManager purchaseManager;

    public PurchaseOrder(String purchaseOrderID, Date orderDate, PurchaseRequisition purchaseRequisition, PurchaseManager purchaseManager) {
        this.purchaseOrderID = purchaseOrderID;
        this.orderDate = orderDate;
        this.purchaseRequisition = purchaseRequisition;
        this.purchaseManager = purchaseManager;
    }

    public String getPurchaseOrderID() {
        return purchaseOrderID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    
}
