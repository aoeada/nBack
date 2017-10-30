package main.java.Repository;

import java.util.List;
import main.java.Repository.Interfaces.IRecordAccessRepository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import main.java.Classes.RecordAccess;

@Transactional
@Repository
public class RecordAccessRepository implements IRecordAccessRepository{
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public void createRecordAccess(RecordAccess recordAccess){
        entityManager.persist(recordAccess);
    }
    
    public void deleteRecordAccess(RecordAccess recordAccess){
        entityManager.remove(recordAccess);
    }
    
    public List recordsUserCanAccess(int userId){
        String hql1 = "SELECT recordId FROM RecordAccess as access WHERE access.userId = ?1";
        List records = entityManager.createQuery(hql1).setParameter(1, userId).getResultList();
        return records;
    }
}
