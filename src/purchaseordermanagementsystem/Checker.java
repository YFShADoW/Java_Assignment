/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package purchaseordermanagementsystem;

/**
 *
 * @author YAO FENG PC
 */
public interface Checker {
    public PurchaseRequisition checkPRInfo(String PRID);
    public PurchaseOrder checkPOInfo(String POID);
}
