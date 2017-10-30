package main.java.Classes;

import java.util.Date;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class Transaction implements Serializable
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="transactionId")
    private int transactionId;
    @JoinColumn(name="userId")
    private int patientId;
    @JoinColumn(name="recordId")
    private int recordId;
    @Column(name="recordDate")
    private Date recordDate;
    @Column(name="PaymentSource")
    private String paymentSource;
    @Column(name="paymentDestination")
    private String paymentDestination;
    @Column(name="amount")
    private int amount;
    @Column(name="currency")
    private String currency;
    
    public Transaction(int patientId, int recordId, Date recordDate, String paymentSource, String paymentDestination, int amount, String currency){
        super();
        this.patientId = patientId;
        this.recordId = recordId;
        this.recordDate = recordDate;
        this.paymentSource = paymentSource;
        this.paymentDestination = paymentDestination;
        this.amount = amount;
        this.currency = currency;
    }
    
    public Transaction(){
        super();
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public String getPaymentSource() {
        return paymentSource;
    }

    public void setPaymentSource(String paymentSource) {
        this.paymentSource = paymentSource;
    }

    public String getPaymentDestination() {
        return paymentDestination;
    }

    public void setPaymentDestination(String paymentDestination) {
        this.paymentDestination = paymentDestination;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
 }