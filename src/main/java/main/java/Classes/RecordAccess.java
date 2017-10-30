package main.java.Classes;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="recordAccess")
public class RecordAccess implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int rowId;
    @JoinColumn(name="recordId")
    private int recordId;
    @JoinColumn(name="userId")
    private int userId;
    
    public RecordAccess(int recordId, int userId){
        super();
        this.recordId = recordId;
        this.userId = userId;
    }
    
    public RecordAccess(){
        super();
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
