package main.java.Services;

import main.java.Services.Interfaces.IMedicalRecordService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//Repository
import main.java.Repository.Interfaces.IMedicalRecordRepository;
import main.java.Repository.Interfaces.IDiagnosisRepository;
import main.java.Repository.Interfaces.IImmunizationRepository;
import main.java.Repository.Interfaces.IMedicalTestRepository;
import main.java.Repository.Interfaces.IMedicationRepository;
import main.java.Repository.Interfaces.ISocialHistoryRepository;
import main.java.Repository.Interfaces.ISurgeryRepository;
//Classes
import main.java.Classes.MedicalRecord;
import main.java.Classes.MedicalRecordTypes.Diagnosis;
import main.java.Classes.MedicalRecordTypes.Immunization;
import main.java.Classes.MedicalRecordTypes.MedicalTest;
import main.java.Classes.MedicalRecordTypes.Medication;
import main.java.Classes.MedicalRecordTypes.SocialHistory;
import main.java.Classes.MedicalRecordTypes.Surgery;
import main.java.Classes.RecordAccess;
import main.java.Repository.Interfaces.IRecordAccessRepository;

@Service
public class MedicalRecordService implements IMedicalRecordService{
	@Autowired
	private IMedicalRecordRepository medicalRecordRepository;
        @Autowired
        private IDiagnosisRepository diagnosisRepository;
        @Autowired
        private IImmunizationRepository immunizationRepository;
        @Autowired
        private IMedicalTestRepository medicalTestRepository;
        @Autowired
        private IMedicationRepository medicationRepository;
        @Autowired
        private ISocialHistoryRepository socialHistoryRepository;
        @Autowired
        private ISurgeryRepository surgeryRepository;
        @Autowired
        private IRecordAccessRepository recordAccessRepository;

	
        //Generic Medical Record Index Management Service Calls
	@Override
	public List<MedicalRecord> getAllMedicalRecords(int id){
		return medicalRecordRepository.getAllMedicalRecords(id);
	}
	
	@Override
        //this will probably never be used since any gets will go directly to the appropriate record type table
	public MedicalRecord getMedicalRecordById(int recordId){
		MedicalRecord obj = medicalRecordRepository.getMedicalRecordById(recordId);
		return obj;
	}
	
	@Override
	public int createMedicalRecord(MedicalRecord medicalRecord){
		int id = medicalRecordRepository.createMedicalRecord(medicalRecord);
                MedicalRecord record = medicalRecordRepository.getMedicalRecordById(id);
                RecordAccess patient = new RecordAccess(id, record.getPatientId());
                recordAccessRepository.createRecordAccess(patient);
                RecordAccess doctor = new RecordAccess(id, record.getDoctorId());
                recordAccessRepository.createRecordAccess(doctor);
                return id;
	}
	
	@Override
	public void updateMedicalRecord(MedicalRecord medicalRecord){
		// TODO : this is a strange one since with blockchain we can't just overwrite the old data
		// we can discuss when we need to implement it
	}
	
	@Override
        //should also delete the record in the appropriate table
	public void deleteMedicalRecord(int recordId){
		// TODO : again this is strange because we have to save all the data for the chain
		// implementation tbd
	}
        
        //Diagnosis Record Service Calls
        @Override
        public Diagnosis getDiagnosisRecordById(int recordId){
            return diagnosisRepository.getDiagnosisById(recordId);
        }
        
        @Override
        public void createDiagnosisRecord(Diagnosis record){
            diagnosisRepository.createDiagnosisRecord(record);
        }
    
        
        //Immunization Record Serivice Calls
        @Override
        public Immunization getImmunizationRecordById(int recordId){
            return immunizationRepository.getImmunizationById(recordId);
        }
        
        @Override
        public void createImmunizationRecord(Immunization record){
            immunizationRepository.createImmunizationRecord(record);
        }
    
        
        //MedicalTest Record Serivice Calls
        @Override
        public MedicalTest getMedicalTestRecordById(int recordId){
            return medicalTestRepository.getMedicalTestById(recordId);
        }
        
        @Override
        public void createMedicalTest(MedicalTest record){
            medicalTestRepository.createMedicalTestRecord(record);
        }
    
        
        //Medication Record Serivice Calls
        @Override
        public Medication getMedicationRecordById(int recordId){
            return medicationRepository.getMedicationById(recordId);
        }
        
        @Override
        public void createMedicationRecord(Medication record){
            medicationRepository.createMedicationRecord(record);
        }
        
        
        //SocialHistory Record Serivice Calls
        @Override
        public SocialHistory getSocialHistoryTestRecordById(int recordId){
            return socialHistoryRepository.getSocialHistoryById(recordId);
        }
        
        @Override
        public void createSocialHistory(SocialHistory record){
            socialHistoryRepository.createSocialHistoryRecord(record);
        }
    

        //Surgery Record Serivice Calls
        @Override
        public Surgery getSurgeryRecordById(int recordId){
            return surgeryRepository.getSurgeryById(recordId);
        }
        
        @Override
        public void createSurgeryRecord(Surgery record){
            surgeryRepository.createSurgeryRecord(record);
        }
}
