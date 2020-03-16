/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PharmacyAdminRole.PharmacyWorkAreaJPanel;

/**
 *
 * @author mansipandya
 */
public class PharmacyAdminRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecoSystem){
        return new PharmacyWorkAreaJPanel(userProcessContainer, account, (PharmacyOrganization)organization, enterprise, ecoSystem);  
    }
}
