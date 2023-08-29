/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purchaseordermanagementsystem;

import java.util.ArrayList;

/**
 *
 * @author Shu Qin
 */
public class AddSupplier {
    private String SupplierID;
    private String SupplierName;
    private String SupplierPhone;
    private String SupplierEmail;
    private String SupplierAddress;
    
    public AddSupplier(){
        this.SupplierID = null;
        this.SupplierName = null;
        this.SupplierPhone = null;
        this.SupplierEmail = null;
        this.SupplierAddress = null;
    }
    
    public AddSupplier (String SupplierID, String SupplierName, String SupplierPhone, String SupplierEmail, String SupplierAddress){
        this.SupplierID = SupplierID;
        this.SupplierName =SupplierName;
        this.SupplierPhone = SupplierPhone;
        this.SupplierEmail = SupplierEmail;
        this.SupplierAddress = SupplierAddress; 
              
    }

    public String getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(String SupplierID) {
        this.SupplierID = SupplierID;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String SupplierName) {
        this.SupplierName = SupplierName;
    }

    public String getSupplierPhone() {
        return SupplierPhone;
    }

    public void setSupplierPhone(String SupplierPhone) {
        this.SupplierPhone = SupplierPhone;
    }

    public String getSupplierEmail() {
        return SupplierEmail;
    }

    public void setSupplierEmail(String SupplierEmail) {
        this.SupplierEmail = SupplierEmail;
    }

    public String getSupplierAddress() {
        return SupplierAddress;
    }

    public void setSupplierAddress(String SupplierAddress) {
        this.SupplierAddress = SupplierAddress;
    }

    
    public void AddSupplier (Supplier savedsupplierdata ){
        String [] newSupplier = {savedsupplierdata.getSupplierID(),savedsupplierdata.getSupplierName(), savedsupplierdata.getSupplierPhone(),savedsupplierdata.getSupplierEmail(),savedsupplierdata.getSupplierAddress()};
        FileManager file = new FileManager("Supplier.txt");
        file.addToFile(newSupplier);
    }

    
  
    
    
}
