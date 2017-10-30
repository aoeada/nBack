package main.java.Classes.MedicalRecordTypes;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="socialHistory")
public class SocialHistory implements Serializable
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
    @Column(name="smokes")
    private boolean smokes;
    @Column(name="amountSmokes")
    private int amountSmokes;
    @Column(name="drinks")
    private boolean drinks;
    @Column(name="amountDrinks")
    private int amountDrinks;
    
    public SocialHistory(boolean smokes, int amountSmokes, boolean drinks, int amountDrinks){
        super();
        /*
        this.patientId = patientId;
        this.doctorId = doctorId;
        */
        this.smokes = smokes;
        this.amountSmokes = amountSmokes;
        this.drinks = drinks;
        this.amountDrinks = amountDrinks;
    }
    
    public SocialHistory(){
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
    public boolean isSmokes() {
        return smokes;
    }

    public void setSmokes(boolean smokes) {
        this.smokes = smokes;
    }

    public int getAmountSmokes() {
        return amountSmokes;
    }

    public void setAmountSmokes(int amountSmokes) {
        this.amountSmokes = amountSmokes;
    }

    public boolean isDrinks() {
        return drinks;
    }

    public void setDrinks(boolean drinks) {
        this.drinks = drinks;
    }

    public int getAmountDrinks() {
        return amountDrinks;
    }

    public void setAmountDrinks(int amountDrinks) {
        this.amountDrinks = amountDrinks;
    }

}
