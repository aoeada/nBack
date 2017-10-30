package main.java.Repository;

import main.java.Repository.Interfaces.IMedicalRecordRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import main.java.Classes.MedicalRecord;
import main.java.Repository.Interfaces.IRecordAccessRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Transactional
@Repository
public class MedicalRecordRepository implements IMedicalRecordRepository{

	@PersistenceContext	
	private EntityManager entityManager;
        @Autowired
        private IRecordAccessRepository recordAccessRepository;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<MedicalRecord> getAllMedicalRecords(int id) {
                List records = recordAccessRepository.recordsUserCanAccess(id);
                String hql2 = "FROM MedicalRecord as record WHERE record.recordId IN ?1";
                List<MedicalRecord> resultList = (entityManager.createQuery(hql2).setParameter(1, records)).getResultList();
                return resultList;
	}
	
	@Override
	public MedicalRecord getMedicalRecordById(int recordId) {
		return entityManager.find(MedicalRecord.class, recordId);
	}
	
	@Override
	public int createMedicalRecord(MedicalRecord medicalRecord) {
                entityManager.persist(medicalRecord);
                return medicalRecord.getRecordId();
	}
	
	@Override
	public void updateMedicalRecord(MedicalRecord medicalRecord) {
		MedicalRecord holderMedicalRecord = getMedicalRecordById(medicalRecord.getRecordId());
		//set your values to be updated based on the input from the Api
		//holderMedicalRecord.set(medicalRecord.getFirstName());
		//holderMedicalRecord.set(medicalRecord.getLastName());
		entityManager.flush();
	}
	
	@Override
	public void deleteMedicalRecord(int recordId) {
		entityManager.remove(getMedicalRecordById(recordId));
	}
}
