package main.java.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import main.java.Classes.MedicalRecordTypes.SocialHistory;
import main.java.Repository.Interfaces.ISocialHistoryRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class SocialHistoryRepository implements ISocialHistoryRepository{
    
    @PersistenceContext	
    private EntityManager entityManager;
    
    @Override
    public SocialHistory getSocialHistoryById(int recordId) {
        return entityManager.find(SocialHistory.class, recordId);
    }
    
    @Override
    public void createSocialHistoryRecord(SocialHistory record){
        entityManager.persist(record);
    }
}
