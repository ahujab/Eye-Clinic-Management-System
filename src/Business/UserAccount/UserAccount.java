/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Patient.Patient;
import Business.RegisterRequest.RegisterRequestDirectory;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;


public class UserAccount {
    
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private Patient patient;
    private WorkQueue workQueue;
    private String name;
    public RegisterRequestDirectory registerRequestDirectory;

    
    public UserAccount() {
        workQueue = new WorkQueue();
        registerRequestDirectory = new RegisterRequestDirectory();
    }
    
     public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public RegisterRequestDirectory getRegisterRequestDirectory() {
        return registerRequestDirectory;
    }

    public void setRegisterRequestDirectory(RegisterRequestDirectory registerRequestDirectory) {
        this.registerRequestDirectory = registerRequestDirectory;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}