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
        supplier.addSupplier(); 
        supplier.removeSupplier();
    }
    
  //  public void viewsupplier(){
      //  try{
      //      File supplierfile = new File("C:\\Users\\Shu Qin\\OneDrive\\Documents\\NetBeansProjects\\JavaApplication32\\src\\javaapplication32\\User.txt");
       //     FileReader supplierfile = new FileReader(fileName);
       //     FileReader supplierdata = new FileReader(supplierfile);
            
       //     BufferedReader supplierdata1 = new BufferedReader(supplierdata);
       //     String line;
        //    while ((line = supplierdata1.readLine()) != null) {
        //        System.out.println(line);
         //   }
        //    supplierdata1.close();
        //    supplierdata.close();
     //   }catch(FileNotFoundException ex){
         //   System.out.println("File does not exist");
    //    }catch (IOException e) {
         //   e.printStackTrace(); 
            
     //   }
   // }
}
