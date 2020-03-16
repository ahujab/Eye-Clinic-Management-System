/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;


public class PatientDirectory {
    private ArrayList<Patient> patientList;

    public PatientDirectory(){
        this.patientList = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public Patient addPatient(String name){
        Patient pat = new Patient();
        pat.setPatientName(name);
        patientList.add(pat);
        return pat;
    }
    
    public void removePatient(Patient pat){
        patientList.remove(pat);
    }
}
