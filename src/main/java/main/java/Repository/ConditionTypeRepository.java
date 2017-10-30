package main.java.Repository;

import main.java.Repository.Interfaces.IConditionTypeRepository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import main.java.Classes.ConditionType;

@Transactional
@Repository
public class ConditionTypeRepository implements IConditionTypeRepository{
    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public ConditionType getConditionTypeById(int conditionTypeId){
        return entityManager.find(ConditionType.class, conditionTypeId);
    }
    
    @Override
    public void createConditionType(ConditionType conditionType){
        entityManager.persist(conditionType);
    }
}
