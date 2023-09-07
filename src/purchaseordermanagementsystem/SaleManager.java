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
    
    public ArrayList<String[]> searchFilterPR(String searchTarget,String filterTarget){
        FileManager file = new FileManager("Purchase_Requisition.txt");
        ArrayList<String[]> result= new ArrayList();
        ArrayList<String> PRLine = file.readFile();
        // select Status
        if(searchTarget == null && !filterTarget.equals("All")){
            for(int i = 0; i<PRLine.size();i++){
                String[] PRData = PRLine.get(i).split("\\|");
                if(PRData[5].equals(filterTarget)){
                    result.add(PRData);
                }
            }
            return result;
        }
        // search with All
        else if(searchTarget!=null && filterTarget.equals("All")){
            for(int i = 0; i<PRLine.size();i++){
                String[] PRData = PRLine.get(i).split("\\|");
                for(int j = 0;j< PRData.length;j++){
                    if(PRData[j].equals(searchTarget)){
                        result.add(PRData);
                    }
                }
            }
            return result;
        }
        // search with Status
        else{
            for(int i = 0; i<PRLine.size();i++){
                String[] PRData = PRLine.get(i).split("\\|");
                if(PRData[5].equals(filterTarget)){
                    for(int j = 0;j< PRData.length;j++){
                        if(PRData[j].equals(searchTarget)){
                        result.add(PRData);
                        }
                    }   
                }
            }
            return result;
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
