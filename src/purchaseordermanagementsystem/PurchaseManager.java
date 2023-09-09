/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purchaseordermanagementsystem;

/**
 *
 * @author YAO FENG PC
 */
public class PurchaseManager extends User {
    private String PM_ID;

    public PurchaseManager(String UserID, String UserName, String UserPassword, String UserEmail, String UserPhone, String Department,String PM_ID) {
        super(UserID, UserName, UserPassword, UserEmail, UserPhone, Department);
        this.PM_ID=PM_ID;
    }

    public String getPM_ID() {
        return PM_ID;
    }

    public void setPM_ID(String PM_ID) {
        this.PM_ID = PM_ID;
    }
    
    public void changePRStatus( String[] unedit, String[] edit){
            FileManager file = new FileManager("Purchase_Requisition.txt");
            file.editFile(unedit, edit);  
    }
    
    public String toString(){
        return this.getUserID()+"|"+this.getUserName()+"|"+this.getUserPassword()+"|"+this.getUserEmail()+"|"+this.getUserPhone()+"|"+this.getUserType()+"|"+this.getPM_ID();
    }
    
}
