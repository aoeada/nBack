package main.java.Classes.MedicalRecordTypes;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="surgery")
public class Surgery implements Serializable
{
    @Id
    @JoinColumn(name="recordId")
    private int recordId;
    /*
    @JoinColumn(name="userId")
    private int patientId;
    @JoinColumn(name="userId")
    private int doctorId;
    */
    @Column(name="surgeryName")
    private String surgeryName;
    @Column(name="surgeryResult")
    private String surgeryResult;
    
    public Surgery(String surgeryName, String surgeryResult){
        super();
        /*
        this.patientId = patientId;
        this.doctorId = doctorId;
        */
        this.surgeryName = surgeryName;
        this.surgeryResult = surgeryResult;
    }
    
    public Surgery(){
        super();
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }
    /*
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }
    */
    public String getSurgeryName() {
        return surgeryName;
    }

    public void setSurgeryName(String surgeryName) {
        this.surgeryName = surgeryName;
    }

    public String getSurgeryResult() {
        return surgeryResult;
    }

    public void setSurgeryResult(String surgeryResult) {
        this.surgeryResult = surgeryResult;
    }
    
}
