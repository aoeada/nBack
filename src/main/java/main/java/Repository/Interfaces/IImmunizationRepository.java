package main.java.Repository.Interfaces;

import main.java.Classes.MedicalRecordTypes.Immunization;

public interface IImmunizationRepository {
    Immunization getImmunizationById(int recordId);
    void createImmunizationRecord(Immunization medicalRecord);
}
