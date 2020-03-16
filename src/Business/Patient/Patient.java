/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.UserAccount.UserAccount;


public class Patient {
    private String patientName;
    private int pID;
    private int age;
    private String address;
    private String city;
    private String email;
    private int phoneNumber;
    private static int countID=1;
    private String prefDoctor;
    private UserAccount prefdoctor;
    private UserAccount patient;
    private RecordsHistory recordsHistory;
    private String picture;

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    
    public Patient(){
        super();
        countID++;
        pID=countID;
        this.recordsHistory=new RecordsHistory();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    public static int getCountID() {
        return countID;
    }

    public static void setCountID(int countID) {
        Patient.countID = countID;
    }

    public String getPrefDoctor() {
        return prefDoctor;
    }

    public void setPrefDoctor(String prefDoctor) {
        this.prefDoctor = prefDoctor;
    }

    public UserAccount getPrefdoctor() {
        return prefdoctor;
    }

    public void setPrefdoctor(UserAccount prefdoctor) {
        this.prefdoctor = prefdoctor;
    }

    public UserAccount getPatient() {
        return patient;
    }

    public void setPatient(UserAccount patient) {
        this.patient = patient;
    }

    public RecordsHistory getRecordsHistory() {
        return recordsHistory;
    }

    public void setRecordsHistory(RecordsHistory recordsHistory) {
        this.recordsHistory = recordsHistory;
    }
    
    
    @Override
    public String toString(){
        return patientName;
    }
}
