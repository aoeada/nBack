package main.java.Classes.MedicalRecordTypes;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="medicalTest")
public class MedicalTest implements Serializable
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
    @Column(name="testName")
    private String testName;
    @Column(name="testResult")
    private String testResult;
    
    public MedicalTest(String testName, String testResult){
        super();
        /*
        this.patientId = patientId;
        this.doctorId = doctorId;
        */
        this.testName = testName;
        this.testResult = testResult;
    }
    
    public MedicalTest(){
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
    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
}
