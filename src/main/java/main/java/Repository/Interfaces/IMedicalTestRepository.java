package main.java.Repository.Interfaces;

import main.java.Classes.MedicalRecordTypes.MedicalTest;

public interface IMedicalTestRepository {
    MedicalTest getMedicalTestById(int recordId);
    void createMedicalTestRecord(MedicalTest medicalRecord);
}
