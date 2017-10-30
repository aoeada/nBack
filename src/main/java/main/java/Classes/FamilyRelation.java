package main.java.Classes;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="userRelation")
public class FamilyRelation implements Serializable {
    
    @Id @JoinColumn(name="userid")
    private int patientId;
    @Id @JoinColumn(name="userid")
    private int relationId;
    @Column(name="relation")
    private String relation;
    
    public FamilyRelation(int patientId, int relationId, String relation){
        super();
        this.setPatientId(patientId);
        this.setRelationId(relationId);
        this.setRelation(relation);
    }
    
    public FamilyRelation(){
        super();
    }
    
    public int getPatientId(){
        return patientId;
    }
    
    public void setPatientId(int patientId){
        this.patientId = patientId;
    }
    
    public int getRelationId(){
        return relationId;
    }
    public void setRelationId(int relationId){
        this.relationId = relationId;
    }
    
    public String getRelation(){
        return relation;
    }
    
    public void setRelation(String relation){
        this.relation = relation;
    }
    
}
