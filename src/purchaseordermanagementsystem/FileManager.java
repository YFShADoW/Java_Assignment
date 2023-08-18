/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purchaseordermanagementsystem;

/**
 *
 * @author YAO FENG PC
 */
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FileManager {
    ArrayList<User> users= new ArrayList<User>();
//    public void saveToArrayLIst(String fileName){
//        try{
//            FileInputStream file = new FileInputStream(fileName);
//            ObjectInputStream inputFile = new ObjectInputStream(file);
//            
//            boolean endOfFile = false;
//            
//            while (! endOfFile){
//                try{
//                    users.add((User) inputFile.readObject())
//                }
//                catch(EOFException e){
//                    endOfFile = true;
//                }
//                catch(Exception f){
//                JOptionPane.showMessageDialog(null,f.getMessage());                    
//                }
//            }
//        }
//        catch(IOException e){
//            JOptionPane.showMessageDialog(null,e.getMessage());
//        }
//    }
    // Constructor
    private String fileName;

    public FileManager(String fileName) {
        this.fileName = fileName;
    }

//    public void saveToArrayList(ArrayList<Administrator> objects) {
//        ArrayList<String> lines = new ArrayList<>();
//        for (User obj : objects) {
//            lines.add(obj.getUserID());
//            lines.add(obj.getUserName());
//            lines.add(obj.getUserEmail());
//            lines.add(obj.getUserPhone());
//            lines.add(obj.getUserType());
//            
//        }
//        writeFile(lines);
//    }
//    public String[] stringListToArray(ArrayList<String> objects){
//        for(int i=0 ; i< objects.size();i++){
//            String line = objects.get(i).toString();
//            String[] data = line.split("\\|");
//        }
//    
//    }
    
    public void addToFile(String[] newObject){
        try{
            FileWriter file = new FileWriter(fileName,true);
            BufferedWriter writer = new BufferedWriter(file);
            for(String data: newObject){
                writer.append(data);
                writer.append("|");
            }
            writer.append("\n");
            writer.close();
            
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void removeLineFromFile(String target){
        ArrayList<String> fileData = this.readFile();
        ArrayList<ArrayList<String>> listData = new ArrayList();
        System.out.println(fileData);
        
    }
    
    
//    public void writeFile(ArrayList<String> lines) {
//        try (FileWriter fileWriter = new FileWriter(fileName)) {
//            for (String line : lines) {
//                fileWriter.write(line);
//                fileWriter.write(System.lineSeparator());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        
//    }
    
    public ArrayList<String> readFile() {
        ArrayList<String> object = new ArrayList<String>();
        try{
            FileReader file = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(file);
            String line;
            while ((line = reader.readLine()) != null){
                object.add(line);
            }
            reader.close();
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return object;
    }    
}
