/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purchaseordermanagementsystem;

import java.util.Arrays;


public class ItemLine{
    
    private int quantity;
    private Item item;
    

    public ItemLine(int quantity,Item item) {
        this.quantity = quantity;
        this.item=item;
    }
    
    public ItemLine(int quantity,String itemID){
        this.quantity = quantity;
        FileManager file = new FileManager("Item.txt");
        String[] itemData = file.searchByPrimaryKey(itemID);
        this.item = new Item(itemData[0],itemData[1],itemData[2],Double.parseDouble(itemData[3]),Integer.parseInt(itemData[4]),itemData[5]);
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice(){
        
        return this.quantity*item.getItemUnitPrice();
        // remember change the data type from String to double
    }
    public static double calculateGrandTotalPrice(ItemLine[] itemList) {
        double grandTotal = 0.0;
        for (ItemLine itemLine : itemList) {
            grandTotal += itemLine.getTotalPrice();
        }
        return grandTotal;
    }
    
    
    public String toString(){
        return item.getItemCode()+"|"+item.getItemName()+"|"+quantity+"|"+item.getItemUnitPrice()+"|"+this.getTotalPrice();
    }
    
    public void addItemLine(){

    }
    
}
