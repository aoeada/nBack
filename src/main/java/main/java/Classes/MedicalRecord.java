package main.java.Classes;

import java.util.Date;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="medicalrecords")
public class MedicalRecord implements Serializable
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="recordid")
    private int recordId;
    @JoinColumn(name="userId")
    private int patientId;
    @JoinColumn(name="userId")
    private int doctorId;
    @JoinColumn(name="conditionId")
    private int recordTypeId;
    @Column(name="recordDate")
    private Date recordDate;
    
    public MedicalRecord(int patientId, int doctorId, int recordTypeId, Date recordDate){
        super();
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.recordTypeId = recordTypeId;
        this.recordDate = recordDate;
    }
    
    public MedicalRecord(){
        super();
    }

    public int getRecordId(){
        return recordId;
    }
    
    public int getPatientId(){
        return patientId;
    }
    
    public void setPatientId(int patientId){
        this.patientId = patientId;
    }
    
    public int getDoctorId(){
        return doctorId;
    }
    
    public void setDoctorId(int doctorId){
        this.doctorId = doctorId;
    }
    
    public int getRecordTypeId(){
        return recordTypeId;
    }
    
    public void setRecordTypeId(int recordTypeId){
        this.recordTypeId = recordTypeId;
    }
    
    public Date getRecordDate(){
        return recordDate;
    }
    
    public void setRecordDate(Date recordDate){
        this.recordDate = recordDate;
    }
}
