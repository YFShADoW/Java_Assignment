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
    
    public String generatesaleID(){
       
        FileManager file = new FileManager("Sale.txt");
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
        String newSaleID = "DR" + String.format("%05d", newNo);
        return newSaleID;
    
    }
    
     public void manageSale(String mode,Sale sale){
        switch(mode){
            case "add":
                sale.addSale(); 
         
            default:
                break;
        }
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
    
     public void editSale(String mode, String[] unedit, String[] edit){
         switch(mode){
             case "edit":
                 FileManager file = new FileManager("Sale.txt");
                 file.editFile(unedit, edit);  
                 
             default:
                break;
             
         }
    }
    
    
    
    
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
    
     public String[] removestock(String [] saledata1){
       
        String salequantity = saledata1[5];  
        String searchitemid = saledata1[2];
        FileManager file1 = new FileManager ("Item.txt");
        ArrayList<String[]> removestock2= new ArrayList();
        ArrayList<String>search = file1.readFile();
        ArrayList<String> removestock = new ArrayList<>();
        for(int i= 0 ; i<search.size(); i++){
            String [] removestock1 = search.get(i).split("\\|");
            for (int j = 0; j<removestock1.length;j++){
                if(removestock1[j].equals(searchitemid)){
                    removestock2.add(removestock1);
                    for (String[] array : removestock2) {
                         String removestock4 = String.join("|", array);
                          removestock.add(removestock4);
                    }
                          String[] add = removestock.toArray(new String[0]);
                          String add1 = String.join("|", add);
                          String[] removestock3 = add1.split("\\|");
                          int stock = Integer.parseInt(salequantity);
                         String quantity = removestock3[4];
                          int itemquantity = Integer.parseInt(quantity);
                          int total = itemquantity - stock;
                           String totalstock = Integer.toString(total);  
                        String[] newArray = new String[removestock3.length];
                        for (int t = 0; t < removestock3.length; t++) {
                            newArray[t] = removestock3[t];
                       
                        }
                         
                        newArray[4] = totalstock;
                    
                     
                     FileManager file = new FileManager("Item.txt");
                     file.editFile(removestock3, newArray);  
                    
              
                        }
            }
        }return null;
       }

    public String[] addstock(String [] saledata2){
       
        String salequantity = saledata2[5];  
        String searchitemid = saledata2[2];
        FileManager file1 = new FileManager ("Item.txt");
        ArrayList<String[]> addstock2= new ArrayList();
        ArrayList<String>search = file1.readFile();
        ArrayList<String> addstock = new ArrayList<>();
        for(int i= 0 ; i<search.size(); i++){
            String [] addstock1 = search.get(i).split("\\|");
            for (int j = 0; j<addstock1.length;j++){
                if(addstock1[j].equals(searchitemid)){
                    addstock2.add(addstock1);
                    for (String[] array : addstock2) {
                         String addstock4 = String.join("|", array);
                          addstock.add(addstock4);
                    }
                          String[] add = addstock.toArray(new String[0]);
                          String add1 = String.join("|", add);
                          String[] addstock3 = add1.split("\\|");
                          int addquantity = Integer.parseInt(salequantity);
                          String quantity = addstock3[4];
                          int itemstock = Integer.parseInt(quantity);
                          int total = itemstock + addquantity;
                           String totalstock = Integer.toString(total);  
                        String[] newArray = new String[addstock3.length];
                        for (int t = 0; t < addstock3.length; t++) {
                            newArray[t] = addstock3[t];
                       
                        }
                         
                        newArray[4] = totalstock;
                    
                     
                     FileManager file = new FileManager("Item.txt");
                     file.editFile(addstock3, newArray);  
                    
              
                        }
            }
        }return null;
    }

    public String toString(){
        return this.getUserID()+"|"+this.getUserName()+"|"+this.getUserPassword()+"|"+this.getUserEmail()+"|"+this.getUserPhone()+"|"+this.getUserType()+"|"+this.getSM_ID();
    }
}

