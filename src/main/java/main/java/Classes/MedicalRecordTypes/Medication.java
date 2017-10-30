package main.java.Classes.MedicalRecordTypes;

import java.util.Date;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="medication")
public class Medication implements Serializable
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
    @Column(name="medicationName")
    private String medicationName;
    @Column(name="frequency")
    private String frequency;
    @Column(name="dosage")
    private int dosage;
    @Column(name="deliveryMethod")
    private String deliveryMethod;
    @Column(name="experationDate")
    private Date experationDate;
    
    public Medication(String medicationName, String frequency, int dosage, String deliveryMethod, Date experationDate){
        super();
        /*
        this.patientId = patientId;
        this.doctorId = doctorId;
        */
        this.medicationName = medicationName;
        this.frequency = frequency;
        this.dosage = dosage;
        this.deliveryMethod = deliveryMethod;
        this.experationDate = experationDate;
    }
    
    public Medication(){
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
    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }
    
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public int getDosage() {
        return dosage;
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public Date getExperationDate() {
        return experationDate;
    }

    public void setExperationDate(Date experationDate) {
        this.experationDate = experationDate;
    }
    
}
