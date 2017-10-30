package main.java.Repository.Interfaces;

import main.java.Classes.MedicalRecordTypes.Diagnosis;

public interface IDiagnosisRepository {
    Diagnosis getDiagnosisById(int recordId);
    void createDiagnosisRecord(Diagnosis medicalRecord);
}
