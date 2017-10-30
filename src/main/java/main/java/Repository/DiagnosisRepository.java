package main.java.Repository;

import main.java.Repository.Interfaces.IDiagnosisRepository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import main.java.Classes.MedicalRecordTypes.Diagnosis;

@Transactional
@Repository
public class DiagnosisRepository implements IDiagnosisRepository{
    
    @PersistenceContext	
    private EntityManager entityManager;
    
    @Override
    public Diagnosis getDiagnosisById(int recordId) {
        return entityManager.find(Diagnosis.class, recordId);
    }
    
    @Override
    public void createDiagnosisRecord(Diagnosis record){
        entityManager.persist(record);
    }
}
