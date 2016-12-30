package com.main.pojo;
// Generated Dec 30, 2016 1:45:05 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * TblTreatment generated by hbm2java
 */
public class TblTreatment  implements java.io.Serializable {


     private Integer id;
     private String summary;
     private String diagnosis;
     private String procedurePerformed;
     private Date dateProcedure;
     private String comment;

    public TblTreatment() {
    }

    public TblTreatment(String summary, String diagnosis, String procedurePerformed, Date dateProcedure, String comment) {
       this.summary = summary;
       this.diagnosis = diagnosis;
       this.procedurePerformed = procedurePerformed;
       this.dateProcedure = dateProcedure;
       this.comment = comment;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getSummary() {
        return this.summary;
    }
    
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public String getDiagnosis() {
        return this.diagnosis;
    }
    
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    public String getProcedurePerformed() {
        return this.procedurePerformed;
    }
    
    public void setProcedurePerformed(String procedurePerformed) {
        this.procedurePerformed = procedurePerformed;
    }
    public Date getDateProcedure() {
        return this.dateProcedure;
    }
    
    public void setDateProcedure(Date dateProcedure) {
        this.dateProcedure = dateProcedure;
    }
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }




}

