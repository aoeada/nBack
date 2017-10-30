package main.java.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import main.java.Classes.MedicalRecordTypes.Surgery;
import main.java.Repository.Interfaces.ISurgeryRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class SurgeryRepository implements ISurgeryRepository{
    
    @PersistenceContext	
    private EntityManager entityManager;
    
    @Override
    public Surgery getSurgeryById(int recordId) {
        return entityManager.find(Surgery.class, recordId);
    }
    
    @Override
    public void createSurgeryRecord(Surgery record){
        entityManager.persist(record);
    }
    
}
