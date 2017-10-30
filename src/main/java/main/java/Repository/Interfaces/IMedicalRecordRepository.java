package main.java.Repository.Interfaces;

import java.util.List;
import main.java.Classes.MedicalRecord;

public interface IMedicalRecordRepository {
	List<MedicalRecord> getAllMedicalRecords(int id);
	MedicalRecord getMedicalRecordById(int recordId);
	int createMedicalRecord(MedicalRecord medicalRecord);
	void updateMedicalRecord(MedicalRecord medicalRecord);
	void deleteMedicalRecord(int recordId);
}
