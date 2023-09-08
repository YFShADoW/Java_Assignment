/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purchaseordermanagementsystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author YAO FENG PC
 */
public class SaleManager extends User {
    private String SM_ID;
    
    public SaleManager(String UserID, String UserName, String UserPassword, String UserEmail, String UserPhone, String Department,String SM_ID) {
        super(UserID, UserName, UserPassword, UserEmail, UserPhone, Department);
        this.SM_ID=SM_ID;
    }
    //getter and setter
    public String getSM_ID() {
        return SM_ID;
    }

    public void setSM_ID(String SM_ID) {
        this.SM_ID = SM_ID;
    }
    
    public String generateSupplierID(){
        FileManager file = new FileManager("Supplier.txt");
        ArrayList<String> lineData = file.readFile();
        int newNo = 0;
        if(lineData.size() == 0){
            newNo=1;
        }
        else{
            String lastRow = lineData.get(lineData.size()-1);
            String[] data = lastRow.trim().split("\\|");
            String lastUserID = data[0];
            newNo = Integer.parseInt(lastUserID.substring(2))+1;    
        }
        String newSupplierID = "SR" + String.format("%05d", newNo);
        return newSupplierID;
    }
    
    public String generateItemID(){
        FileManager file = new FileManager("Item.txt");
        ArrayList<String> lineData = file.readFile();
        int newNo = 0;
        if(lineData.size() == 0){
            newNo=1;
        }
        else{
            String lastRow = lineData.get(lineData.size()-1);
            String[] data = lastRow.trim().split("\\|");
            String lastUserID = data[0];
            newNo = Integer.parseInt(lastUserID.substring(2))+1;    
        }
        String newItemID = "I" + String.format("%05d", newNo);
        return newItemID;
    }
    
    public void generatePurchaseRequisition(){
        
    }
    
    public PurchaseRequisition checkPRInfo(String PRID){
        FileManager file = new FileManager("Purchase_Requisition.txt");
        String[] PRData = file.searchByPrimaryKey(PRID);
//        System.out.println(Arrays.toString(PRData));
        PurchaseRequisition PR  = new PurchaseRequisition(PRData[0],PRData[1],PRData[2],PRData[3],PRData[4],PRData[5],PRData[6]);
        return PR;
    }
    
    
    public Item checkItemInfo(String itemCode){
        FileManager file = new FileManager("Item.txt");
        String[] itemData = file.searchByPrimaryKey(itemCode);
        Item item = new Item(itemData[0],itemData[1],itemData[2],Double.parseDouble(itemData[3]), Integer.parseInt(itemData[4]),itemData[5]);
        return item;
    }
    
//    public Supplier checkSupplierInfo(String supplierID){
//        FileManager file = new FileManager("Supplier.txt");
//        String[] supplierData = file.searchByPrimaryKey(supplierID);
//        Supplier supplier = new Supplier(supplierData[0],supplierData[1],supplierData[2],supplierData[3],supplierData[4]);
//        return supplier;
//    }
    
    
    public void manageItem(String mode, Item item,Item editItem){
        switch(mode){
            case "add":
                item.addItem();
                break;
                
            case "remove":
                item.removeItem();
                break;
                
            case "edit":
                item.editItem(editItem);
                break;
            
            default:
                break;
        }
   
    }
    public void manageSale(){
        
    }
    public String generatePRID(){
        FileManager file = new FileManager("Purchase_Requisition.txt");
        ArrayList<String> PRData = file.readFile();
        int newNo=0;
        if(PRData.size() ==0){
            newNo=1;
        }
        else{
            String lastRow = PRData.get(PRData.size()-1);
            String[] data = lastRow.trim().split("\\|");
            String lastPRID = data[0];
            newNo = Integer.parseInt(lastPRID.substring(2))+1;
        }        
        String newPRID = "PR" + String.format("%05d", newNo);  
        return newPRID;
    }
    public void manageSupplier(String mode,Supplier supplier,Supplier editSupplier){
        switch(mode){
            case "add":
                supplier.addSupplier(); 
                break;
                
            case "remove":
                supplier.removeSupplier();
                break;
                
            case "edit":
                supplier.editSupplier(editSupplier);
                break;
            
            default:
                break;
        }
    } 
}
