package main.java.Classes;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="conditionType")
public class ConditionType implements Serializable
{
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="conditionId")
    private int conditionId;
    @Column(name="conditionName")
    private String conditionName;
    
    public ConditionType(String conditionName){
        super();
        this.setConditionName(conditionName);
    }
    
    public ConditionType(){
        super();
    }
    
    public int getConditionId(){
        return conditionId;
    }
 
    public String getConditionName(){
        return conditionName;
    }
    
    public void setConditionName(String conditionName){
        this.conditionName = conditionName;
    }
}
