package main.java.Repository.Interfaces;

import main.java.Classes.MedicalRecordTypes.Medication;

public interface IMedicationRepository {
    Medication getMedicationById(int recordId);
    void createMedicationRecord(Medication medicalRecord);
}
