/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purchaseordermanagementsystem;


public class ItemLine extends Item{
    
    private int quantity;
    private double totalPrice;

    public ItemLine(int quantity, double totalPrice, String itemCode, String itemName, String itemCategory, String itemUnitPrice, String itemStock, String supplierID) {
        super(itemCode, itemName, itemCategory, itemUnitPrice, itemStock, supplierID);
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    
    
}
