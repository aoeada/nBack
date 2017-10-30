package main.java.Repository;

import main.java.Repository.Interfaces.IMedicationRepository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import main.java.Classes.MedicalRecordTypes.Medication;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class MedicationRepository implements IMedicationRepository {
    
    @PersistenceContext	
    private EntityManager entityManager;
    
    @Override
    public Medication getMedicationById(int recordId) {
        return entityManager.find(Medication.class, recordId);
    }
    
    @Override
    public void createMedicationRecord(Medication record){
        entityManager.persist(record);
    }
}
