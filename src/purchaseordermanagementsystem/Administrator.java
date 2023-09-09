/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purchaseordermanagementsystem;

/**
 *
 * @author YAO FENG PC
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Administrator extends User{
    private String Admin_ID;

    public Administrator(String UserID, String UserName, String UserPassword, String UserEmail, String UserPhone, String Department, String Admin_ID) {
        super(UserID, UserName, UserPassword, UserEmail, UserPhone, Department);
        this.Admin_ID=Admin_ID;
    }

    public String getAdmin_ID() {
        return Admin_ID;
    }

    public void setAdmin_ID(String Admin_ID) {
        this.Admin_ID = Admin_ID;
    }

////////////////////////////////////////
    
    public String generateUserID(){
        FileManager file = new FileManager("User.txt");
        ArrayList<String> userData = file.readFile();
        int newNo=0;
        if(userData.size() ==0){
            newNo=1;
        }
        else{
            String lastRow = userData.get(userData.size()-1);
            String[] data = lastRow.trim().split("\\|");
            String lastUserID = data[0];
            newNo = Integer.parseInt(lastUserID.substring(1))+1;
        }        
        String newUserID = "U" + String.format("%05d", newNo);  
        return newUserID;
    }
    
    public String generatestaffID(String userType){
        FileManager file = new FileManager("User.txt");
        ArrayList<String> userData = file.readFile();
        ArrayList<String> adminList = new ArrayList<String>();
        ArrayList<String> SMList = new ArrayList<String>();;
        ArrayList<String> PMList = new ArrayList<String>();;
        String lastID;
        String newStaffID ="";
        
        for(int i =  0 ; i< userData.size();i++){
            String[] data = userData.get(i).trim().split("\\|");
            String staffID = data[data.length-1];
            Character TypeID = staffID.charAt(0);
            if (TypeID.equals('A')){
                adminList.add(staffID);
            }
            else if (TypeID.equals('S')){
                SMList.add(staffID);
            }
            else if(TypeID.equals('P')){
                PMList.add(staffID);
            }
        }
        
        if (userType.equals("Admin")){
            int newNo=0;
            if(adminList.size()==0){
                newNo=1;
            }
            else{
                lastID = adminList.get(adminList.size()-1);
                newNo = Integer.parseInt(lastID.substring(1))+1;                
            }
            newStaffID = "A" + String.format("%05d", newNo);
        }
        else if(userType.equals("SaleManager")){
            int newNo=0;
            if(SMList.size()==0){
                newNo=1;
            }
            else{
                lastID = SMList.get(SMList.size()-1);
                newNo = Integer.parseInt(lastID.substring(1))+1;                
            }
            newStaffID = "S" + String.format("%05d", newNo);
        }
        else if(userType.equals("PurchaseManager")){
            int newNo=0;
            if(PMList.size()==0){
                newNo=1;
            }
            else{
                lastID = PMList.get(PMList.size()-1);
                newNo = Integer.parseInt(lastID.substring(1))+1;                
            }
            newStaffID = "P" + String.format("%05d", newNo);
        }  
        return newStaffID;
    }
            
    
    // Method Overloading
    public void registerUser(Administrator newAdmin){
        //Validation
        String[] newUser = {newAdmin.getUserID(),newAdmin.getUserName(),newAdmin.getUserPassword(),newAdmin.getUserEmail(),newAdmin.getUserPhone(),newAdmin.getUserType(),newAdmin.getAdmin_ID()};
        FileManager file = new FileManager("User.txt");
        file.addToFile(newUser);
    }
    
    public void registerUser(SaleManager newSM){
        String[] newUser = {newSM.getUserID(),newSM.getUserName(),newSM.getUserPassword(),newSM.getUserEmail(),newSM.getUserPhone(),newSM.getUserType(),newSM.getSM_ID()};
        FileManager file = new FileManager("User.txt");
        file.addToFile(newUser);
    }
    
    public void registerUser(PurchaseManager newPM){
        String[] newUser = {newPM.getUserID(),newPM.getUserName(),newPM.getUserPassword(),newPM.getUserEmail(),newPM.getUserPhone(),newPM.getUserType(),newPM.getPM_ID()};
        FileManager file = new FileManager("User.txt");
        file.addToFile(newUser);
    }

    public void manageUser(String mode,String[] oldData,String[] newData){
        User user = new User();
        switch (mode){                
            case "edit":
                user.editUser(oldData, newData);
                break;
                       
            case "remove":
                user.removeUser(oldData[0]);
                break;
            
            default:
                break;
        }
    }
    
    public String toString(){
        return this.getUserID()+"|"+this.getUserName()+"|"+this.getUserPassword()+"|"+this.getUserEmail()+"|"+this.getUserPhone()+"|"+this.getUserType()+"|"+this.getAdmin_ID();
    }
    
//    public ArrayList<String[]> searchFilterUser(String searchTarget,String filterTarget){
//        FileManager file = new FileManager("User.txt");
//        ArrayList<String[]> result= new ArrayList();
//        ArrayList<String> userLine = file.readFile();
//        // select UserType
//        if(searchTarget == null && !filterTarget.equals("All")){
//            for(int i = 0; i<userLine.size();i++){
//                String[] userData = userLine.get(i).split("\\|");
//                if(userData[5].equals(filterTarget)){
//                    result.add(userData);
//                }
//            }
//            return result;
//        }
//        // search with All
//        else if(searchTarget!=null && filterTarget.equals("All")){
//            for(int i = 0; i<userLine.size();i++){
//                String[] userData = userLine.get(i).split("\\|");
//                for(int j = 0;j< userData.length;j++){
//                    if(userData[j].equals(searchTarget)){
//                        result.add(userData);
//                    }
//                }
//            }
//            return result;
//        }
//        // search with userType
//        else{
//            for(int i = 0; i<userLine.size();i++){
//                String[] userData = userLine.get(i).split("\\|");
//                if(userData[5].equals(filterTarget)){
//                    for(int j = 0;j< userData.length;j++){
//                        if(userData[j].equals(searchTarget)){
//                        result.add(userData);
//                        }
//                    }   
//                }
//            }
//            return result;
//        }
//    }
    // redo search function
//    public void 
//    
//    
//    
//    public void View_Sale_Info(){
//        
//    }

}

/*
U00001|admin01|admin1234|admin01@gmail.com|0123456789|Admin|A00001
U00002|SM01|SM1234|SM01@gmail.com|0134567890|SaleManager|S00001
U00003|PM01|PM1234|PM01@gmail.com|0124567890|PurchaseManager|P00001
U00004|YF|YF0322|YF@gmail.com|0189796991|Admin|A00002
*/