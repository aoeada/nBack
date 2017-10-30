package main.java.Services.Interfaces;

import java.util.List;
import main.java.Classes.MedicalRecord;
import main.java.Classes.MedicalRecordTypes.Diagnosis;
import main.java.Classes.MedicalRecordTypes.Immunization;
import main.java.Classes.MedicalRecordTypes.MedicalTest;
import main.java.Classes.MedicalRecordTypes.Medication;
import main.java.Classes.MedicalRecordTypes.SocialHistory;
import main.java.Classes.MedicalRecordTypes.Surgery;

public interface IMedicalRecordService {
    //medical record index
    List<MedicalRecord> getAllMedicalRecords(int id);
    MedicalRecord getMedicalRecordById(int recordId);
    int createMedicalRecord(MedicalRecord medicalRecord);
    void updateMedicalRecord(MedicalRecord medicalRecord);
    void deleteMedicalRecord(int recordId);
        
    //diagnosis
    Diagnosis getDiagnosisRecordById(int recordId);
    void createDiagnosisRecord(Diagnosis record);
    
    
    //immunization
    Immunization getImmunizationRecordById(int recordId);
    void createImmunizationRecord(Immunization record);
    
    
    //medicalTest
    MedicalTest getMedicalTestRecordById(int recordId);
    void createMedicalTest(MedicalTest record);
    
    
    //medication
    Medication getMedicationRecordById(int recordId);
    void createMedicationRecord(Medication record);
    

    //socialHistory
    SocialHistory getSocialHistoryTestRecordById(int recordId);
    void createSocialHistory(SocialHistory record);
    
    
    //Surgery
    Surgery getSurgeryRecordById(int recordId);
    void createSurgeryRecord(Surgery record);
    
}
