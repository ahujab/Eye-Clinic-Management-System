/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;


public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount createUserAccount(){
        UserAccount uaccount = new UserAccount();
        userAccountList.add(uaccount);
        return uaccount;
    }
    
    public UserAccount removeUserAccount(UserAccount uaccount){
        userAccountList.remove(uaccount);
        return null;
    }
    
   public String checkExit(String name,Enterprise enterprise){
       for(UserAccount uaa : enterprise.getUserAccountDirectory().getUserAccountList()){
           if(uaa.getUsername().equals(name)){
               return "";
           }
       }
       return null;
   }
   
   public String checkExit(String name,Organization org){
       for(UserAccount uaa : org.getUserAccountDirectory().getUserAccountList()){
           if(uaa.getUsername().equals(name)){
               return "";
           }
       }
       return null;
   }
   
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
