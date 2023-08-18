/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purchaseordermanagementsystem;


public class Item {
    private String itemCode, itemCategory, itemName;
    private Supplier Supplier;

    public Item(String itemCode, String itemCategory, String itemName, Supplier Supplier) {
        this.itemCode = itemCode;
        this.itemCategory = itemCategory;
        this.itemName = itemName;
        this.Supplier = Supplier;
    }

    public String getItemCode() {
        return itemCode;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

}
