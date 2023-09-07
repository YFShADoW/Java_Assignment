/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purchaseordermanagementsystem;


public class ItemLine{
    
    private int quantity;
    private Item item;
    

    public ItemLine(int quantity,Item item) {
        this.quantity = quantity;
        this.item=item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice(){
        return this.quantity*Double.parseDouble(item.getItemUnitPrice());
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
        return item.getItemCode()+"|"+item.getItemName()+"|"+quantity+"|"+item.getItemUnitPrice()+this.getTotalPrice();
    }
    
    public void addItemLine(){

    }
    
}
