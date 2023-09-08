/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purchaseordermanagementsystem;

/**
 *
 * @author Shu Qin
 */
public class Sale {
    
    private String saleDate, saleID, saleItemCode, saleItemName, saleItemCategory, saleItemQuantity, saleItemUnitPrice, saleItemTotalPrice;
    
    public Sale (String saleID, String saleDate, String saleItemCode, String saleItemName, String saleItemCategory, String saleItemQuantity, String saleItemUnitPrice, String saleItemTotalPrice){
        this.saleDate = saleDate;
        this.saleID = saleID;
        this.saleItemCode = saleItemCode;
        this.saleItemName = saleItemName;
        this.saleItemCategory = saleItemCategory;
        this.saleItemQuantity = saleItemQuantity;
        this.saleItemUnitPrice = saleItemUnitPrice;
        this.saleItemTotalPrice = saleItemTotalPrice;
}

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleID(String saleDate) {
        this.saleDate = saleDate;
    }

    public String getSaleItemCode() {
        return saleItemCode;
    }

    public void setSaleItemCode(String saleItemCode) {
        this.saleItemCode = saleItemCode;
    }

    public String getSaleItemName() {
        return saleItemName;
    }

    public void setSaleItemName(String saleItemName) {
        this.saleItemName = saleItemName;
    }

    public String getSaleItemCategory() {
        return saleItemCategory;
    }

    public void setSaleItemCategory(String saleItemCategory) {
        this.saleItemCategory = saleItemCategory;
    }

    public String getSaleItemUnitPrice() {
        return saleItemUnitPrice;
    }

    public void setSaleItemUnitPrice(String saleItemUnitPrice) {
        this.saleItemUnitPrice = saleItemUnitPrice;
    }

    public String getSaleItemTotalPrice() {
        return saleItemTotalPrice;
    }

    public void setSaleItemTotalPrice(String saleItemTotalPrice) {
        this.saleItemTotalPrice = saleItemTotalPrice;
    }

    public String getSaleItemQuantity() {
        return saleItemQuantity;
    }

    public void setSaleItemQuantity(String saleItemQuantity) {
        this.saleItemQuantity = saleItemQuantity;
    }

    public String getSaleID() {
        return saleID;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }
    
    public void addSale(){
        String[] newSale = {this.getSaleID(),this.getSaleDate(),this.getSaleItemCode(),this.getSaleItemName(),this.getSaleItemCategory(),this.getSaleItemQuantity(),this.getSaleItemUnitPrice(), this.getSaleItemTotalPrice()};
        FileManager file = new FileManager("Sale.txt");
        file.addToFile(newSale);
    }
    
}
