/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Patient.Patient;
import Business.Patient.Records;
import java.util.Date;

/**
 *
 * @author mansipandya
 */
public class PatientDoctorWorkRequest extends WorkRequest {
    private Patient patient;
    private Records records;
    private String testResults;
    private String labStatus;
    private String preStatus;
    private String respondStatus;
    private String drugStatus;
    private String NormalOrNot;
    private Date date;
    private String patientName;
    private String respondMessage;
    private String medicineName;
    private String medicineQuantity;
    private String doctorResponseMessage;


    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Records getRecords() {
        return records;
    }

    public void setRecords(Records records) {
        this.records = records;
    }

    public String getTestResults() {
        return testResults;
    }

    public void setTestResults(String testResults) {
        this.testResults = testResults;
    }

    public String getLabStatus() {
        return labStatus;
    }

    public void setLabStatus(String labStatus) {
        this.labStatus = labStatus;
    }

    public String getPreStatus() {
        return preStatus;
    }

    public void setPreStatus(String preStatus) {
        this.preStatus = preStatus;
    }

    public String getRespondStatus() {
        return respondStatus;
    }

    public void setRespondStatus(String respondStatus) {
        this.respondStatus = respondStatus;
    }

    public String getDrugStatus() {
        return drugStatus;
    }

    public void setDrugStatus(String drugStatus) {
        this.drugStatus = drugStatus;
    }

    public String getNormalOrNot() {
        return NormalOrNot;
    }

    public void setNormalOrNot(String NormalOrNot) {
        this.NormalOrNot = NormalOrNot;
    }

    public Date getDate() {
        return date;
    }

    public void setDate() {
        this.date = new Date();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getRespondMessage() {
        return respondMessage;
    }

    public void setRespondMessage(String respondMessage) {
        this.respondMessage = respondMessage;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getMedicineQuantity() {
        return medicineQuantity;
    }

    public void setMedicineQuantity(String medicineQuantity) {
        this.medicineQuantity = medicineQuantity;
    }

    public String getDoctorResponseMessage() {
        return doctorResponseMessage;
    }

    public void setDoctorResponseMessage(String doctorResponseMessage) {
        this.doctorResponseMessage = doctorResponseMessage;
    }
    
    @Override
    public String toString(){
        return getDate().toString();
    }
    
}
