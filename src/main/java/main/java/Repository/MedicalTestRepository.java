package main.java.Repository;

import main.java.Repository.Interfaces.IMedicalTestRepository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import main.java.Classes.MedicalRecordTypes.MedicalTest;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class MedicalTestRepository implements IMedicalTestRepository{
    
    @PersistenceContext	
    private EntityManager entityManager;
    
    @Override
    public MedicalTest getMedicalTestById(int recordId) {
        return entityManager.find(MedicalTest.class, recordId);
    }
    
    @Override
    public void createMedicalTestRecord(MedicalTest record){
        entityManager.persist(record);
    }
}
