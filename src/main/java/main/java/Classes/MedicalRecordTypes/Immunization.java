package main.java.Classes.MedicalRecordTypes;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="immunization")
public class Immunization implements Serializable
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
    @Column(name="immunization")
    private String immunization;
    
    public Immunization(String immunization){
        super();
        /*
        this.patientId = patientId;
        this.doctorId = doctorId;
        */
        this.immunization = immunization;
    }
    
    public Immunization(){
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
    public String getImmunization() {
        return immunization;
    }

    public void setImmunization(String immunization) {
        this.immunization = immunization;
    }
    
}
