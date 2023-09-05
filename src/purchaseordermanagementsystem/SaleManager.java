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
        ArrayList<String> userData = file.readFile();
        String lastRow = userData.get(userData.size()-1);
        String[] data = lastRow.trim().split("\\|");
        String lastUserID = data[0];
        int newNo = Integer.parseInt(lastUserID.substring(2))+1;
        String newSupplierID = "SR" + String.format("%05d", newNo);
        
        return newSupplierID;
    }
    
    public void generatePurchaseRequisition(){
        
    }
    public void manageItem(String mode, Item item){
        item.addItem();
        
        
    }
    public void manageSale(){
        
    }
    public void manageSupplier(String mode,Supplier supplier){
        switch(mode){
            case "add":
                supplier.addSupplier(); 
         
            default:
                break;
        }
    }
    
     public void editSupplier(String mode, String[] unedit, String[] edit){
         switch(mode){
             case "edit":
                 FileManager file = new FileManager("Supplier.txt");
                 file.editFile(unedit, edit);  
                 
             default:
                break;
             
         }
         
     }
        
                
        
    
        
        
     
   
    
    public ArrayList<String[]> searchsupplier(String supplier){
        FileManager file = new FileManager("Supplier.txt");
        ArrayList<String[]> searchsupplier1= new ArrayList();
        ArrayList<String> searchsupplierdata = file.readFile();
        
        for(int i= 0 ; i<searchsupplierdata.size(); i++){
            String [] ssupplierdata = searchsupplierdata.get(i).split("\\|");
            for (int j = 0; i<ssupplierdata.length;i++){
                if(ssupplierdata[j].equals(supplier)){
                    searchsupplier1.add(ssupplierdata);
                } 
             
                
            }
        }
        return searchsupplier1;
    }
    
    
    
            
            
          
    
 
}
