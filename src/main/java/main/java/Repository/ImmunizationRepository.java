package main.java.Repository;

import main.java.Repository.Interfaces.IImmunizationRepository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import main.java.Classes.MedicalRecordTypes.Immunization;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class ImmunizationRepository implements IImmunizationRepository{
        
    @PersistenceContext	
    private EntityManager entityManager;
    
    @Override
    public Immunization getImmunizationById(int recordId) {
        return entityManager.find(Immunization.class, recordId);
    }
    
    @Override
    public void createImmunizationRecord(Immunization record){
        entityManager.persist(record);
    }
}
