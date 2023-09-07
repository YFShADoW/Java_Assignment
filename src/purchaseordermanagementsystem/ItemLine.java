/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purchaseordermanagementsystem;


public class ItemLine extends Item{
    
    private String quantity;
    private String totalPrice;

    public ItemLine(String itemCode, String itemName, String quantity, String itemUnitPrice, String totalPrice, String itemCategory, String itemStock, String supplierID) {
        super(itemCode, itemName, itemCategory, itemUnitPrice, itemStock, supplierID);
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public void addItemLine(){

    }
    
}
