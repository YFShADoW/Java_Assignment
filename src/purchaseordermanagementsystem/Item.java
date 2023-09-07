/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purchaseordermanagementsystem;


public class Item {
    private String itemCode, itemCategory, itemName;
    private String supplierID;
    private String itemUnitPrice;
    private String itemStock;
    

    public Item(String itemCode, String itemName, String itemCategory, String itemUnitPrice, String itemStock, String supplierID) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemCategory = itemCategory;
        this.itemUnitPrice = itemUnitPrice;
        this.itemStock = itemStock;
        this.supplierID = supplierID;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
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

    public String getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }

    public String getItemUnitPrice() {
        return itemUnitPrice;
    }

    public void setItemUnitPrice(String itemUnitPrice) {
        this.itemUnitPrice = itemUnitPrice;
    }

    public String getItemStock() {
        return itemStock;
    }

    public void setItemStock(String itemStock) {
        this.itemStock = itemStock;
    }

    public void addItem(){
        String [] newitem = {this.getItemCode(),this.getItemName(),this.getItemCategory(),this.getItemUnitPrice(),this.getItemStock(),this.getSupplierID()};
        FileManager file = new FileManager("Item.txt");
        file.addToFile(newitem);
    }
    
    public void removeItem(){
        FileManager file = new FileManager("Item.txt");
        file.removeLineFromFile(this.getItemCode());
    }
    public void editItem(Item newItem){
        FileManager file = new FileManager("Item.txt");
        String[] oldData = {this.getItemCode(),this.getItemName(),this.getItemCategory(),this.getItemUnitPrice(),this.getItemStock(),this.getSupplierID()};
        String[] newData = {newItem.getItemCode(),newItem.getItemName(),newItem.getItemCategory(),newItem.getItemUnitPrice(),newItem.getItemStock(),newItem.getSupplierID()};
        file.editFile(oldData, newData);
    }
}
