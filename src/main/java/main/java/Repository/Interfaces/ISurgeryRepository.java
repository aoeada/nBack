package main.java.Repository.Interfaces;

import main.java.Classes.MedicalRecordTypes.Surgery;

public interface ISurgeryRepository {
    Surgery getSurgeryById(int recordId);
    void createSurgeryRecord(Surgery medicalRecord);
}
