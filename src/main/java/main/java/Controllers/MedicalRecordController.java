package main.java.Controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.Map;
//Spring
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
//Classes
import main.java.Classes.MedicalRecord;
import main.java.Classes.MedicalRecordTypes.Diagnosis;
import main.java.Classes.MedicalRecordTypes.Immunization;
import main.java.Classes.MedicalRecordTypes.MedicalTest;
import main.java.Classes.MedicalRecordTypes.Medication;
import main.java.Classes.MedicalRecordTypes.SocialHistory;
import main.java.Classes.MedicalRecordTypes.Surgery;
//Service
import main.java.Services.Interfaces.IMedicalRecordService;

@RestController
public class MedicalRecordController {
	@Autowired
	private IMedicalRecordService medicalRecordService;
	
        //grabs all the avalible records for a particular User
	@GetMapping("all-medicalrecords")
	public ResponseEntity<List<MedicalRecord>> getAllMedicalRecords(@RequestParam("id") String id){
		List<MedicalRecord> list = medicalRecordService.getAllMedicalRecords(Integer.parseInt(id));
		return new ResponseEntity<List<MedicalRecord>>(list, HttpStatus.OK);
	}
        
        @GetMapping("diagnosis")
        public ResponseEntity<Diagnosis> getDiagnosisRecord(@RequestParam("id") String id){
            Diagnosis record = medicalRecordService.getDiagnosisRecordById(Integer.parseInt(id));
            return new ResponseEntity<Diagnosis>(record, HttpStatus.OK);
        }
        
        @GetMapping("immunization")
        public ResponseEntity<Immunization> getImmunizationRecord(@RequestParam("id") String id){
            Immunization record = medicalRecordService.getImmunizationRecordById(Integer.parseInt(id));
            return new ResponseEntity<Immunization>(record, HttpStatus.OK);
        }
        
        @GetMapping("medicalTest")
        public ResponseEntity<MedicalTest> getMedicalTestRecord(@RequestParam("id") String id){
            MedicalTest record = medicalRecordService.getMedicalTestRecordById(Integer.parseInt(id));
            return new ResponseEntity<MedicalTest>(record, HttpStatus.OK);
        }
        
        @GetMapping("medication")
        public ResponseEntity<Medication> getMedicationRecord(@RequestParam("id") String id){
            Medication record = medicalRecordService.getMedicationRecordById(Integer.parseInt(id));
            return new ResponseEntity<Medication>(record, HttpStatus.OK);
        }
        
        @GetMapping("socialHistory")
        public ResponseEntity<SocialHistory> getSocialHistoryRecord(@RequestParam("id") String id){
            SocialHistory record = medicalRecordService.getSocialHistoryTestRecordById(Integer.parseInt(id));
            return new ResponseEntity<SocialHistory>(record, HttpStatus.OK);
        }
        
        @GetMapping("surgery")
        public ResponseEntity<Surgery> getSurgeryRecord(@RequestParam("id") String id){
            Surgery record = medicalRecordService.getSurgeryRecordById(Integer.parseInt(id));
            return new ResponseEntity<Surgery>(record, HttpStatus.OK);
        }
        
        @PostMapping("medicalRecord")
        public ResponseEntity<Integer> createMedicalRecord(@RequestBody MedicalRecord record) {
            //record sent in requires patientId, doctorId, the type of record (an int), and the date of the records creation
            int id = medicalRecordService.createMedicalRecord(record);
            return new ResponseEntity<Integer>(id, HttpStatus.CREATED);
        }
        
	@PostMapping("diagnosis")
        public ResponseEntity<Void> createDiagnosisRecord(@RequestBody Diagnosis record) {
            //record sent in requires patientId, doctorId, the type of record (an int), and the date of the records creation
            medicalRecordService.createDiagnosisRecord(record);
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        }
        
        @PostMapping("immunization")
        public ResponseEntity<Void> createImmunizationRecord(@RequestBody Immunization record) {
            //record sent in requires patientId, doctorId, the type of record (an int), and the date of the records creation
            medicalRecordService.createImmunizationRecord(record);
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        }
        
        @PostMapping("medicalTest")
        public ResponseEntity<Void> createMedicalTestRecord(@RequestBody MedicalTest record) {
            //record sent in requires patientId, doctorId, the type of record (an int), and the date of the records creation
            medicalRecordService.createMedicalTest(record);
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        }
        
        @PostMapping("medication")
        public ResponseEntity<Void> createMedicationRecord(@RequestBody Medication record) {
            //record sent in requires patientId, doctorId, the type of record (an int), and the date of the records creation
            medicalRecordService.createMedicationRecord(record);
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        }
        
        @PostMapping("socialHistory")
        public ResponseEntity<Void> createSocialHistoryRecord(@RequestBody SocialHistory record) {
            //record sent in requires patientId, doctorId, the type of record (an int), and the date of the records creation
            medicalRecordService.createSocialHistory(record);
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        }
        
        @PostMapping("surgery")
        public ResponseEntity<Void> createSurgeryRecord(@RequestBody Surgery record) {
            //record sent in requires patientId, doctorId, the type of record (an int), and the date of the records creation
            medicalRecordService.createSurgeryRecord(record);
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        }
}
