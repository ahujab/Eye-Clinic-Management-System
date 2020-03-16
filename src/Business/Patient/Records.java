/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.Date;


public class Records {
    private String wearingGlasses;
    private String contactLens;
    private String dryness;
    private String blurred;
    private String itching;
    private String burning;
    private float leftEye;
    private float rightEye;
    private String watery;
    private String eyePain;
    private String redness;
    private String headache;
    private Date date;
    private String normalOrNot;

    public String getBlurred() {
        return blurred;
    }

    public void setBlurred(String blurred) {
        this.blurred = blurred;
    }

    public String getHeadache() {
        return headache;
    }

    public void setHeadache(String headache) {
        this.headache = headache;
    }

    public String getWearingGlasses() {
        return wearingGlasses;
    }

    public void setWearingGlasses(String wearingGlasses) {
        this.wearingGlasses = wearingGlasses;
    }

    public String getContactLens() {
        return contactLens;
    }

    public void setContactLens(String contactLens) {
        this.contactLens = contactLens;
    }

    public String getDryness() {
        return dryness;
    }

    public void setDryness(String dryness) {
        this.dryness = dryness;
    }

    public String getItching() {
        return itching;
    }

    public void setItching(String itching) {
        this.itching = itching;
    }

    public String getBurning() {
        return burning;
    }

    public void setBurning(String burning) {
        this.burning = burning;
    }

    public float getLeftEye() {
        return leftEye;
    }

    public void setLeftEye(float leftEye) {
        this.leftEye = leftEye;
    }

    public float getRightEye() {
        return rightEye;
    }

    public void setRightEye(float rightEye) {
        this.rightEye = rightEye;
    }

    public String getWatery() {
        return watery;
    }

    public void setWatery(String watery) {
        this.watery = watery;
    }

    public String getEyePain() {
        return eyePain;
    }

    public void setEyePain(String eyePain) {
        this.eyePain = eyePain;
    }

    public String getRedness() {
        return redness;
    }

    public void setRedness(String redness) {
        this.redness = redness;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNormalOrNot() {
        return normalOrNot;
    }

    public void setNormalOrNot(String normalOrNot) {
        this.normalOrNot = normalOrNot;
    }
    
    
    @Override
    public String toString(){
        return date.toString();
    }
}
