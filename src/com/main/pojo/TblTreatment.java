package com.main.pojo;
// Generated Jan 2, 2017 3:34:16 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * TblTreatment generated by hbm2java
 */
public class TblTreatment  implements java.io.Serializable {


     private Integer id;
     private Date proceduredate;
     private String procedureperform;
     private String diagnosis;
     private String summary;
     private String comment;

    public TblTreatment() {
    }

    public TblTreatment(Date proceduredate, String procedureperform, String diagnosis, String summary, String comment) {
       this.proceduredate = proceduredate;
       this.procedureperform = procedureperform;
       this.diagnosis = diagnosis;
       this.summary = summary;
       this.comment = comment;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Date getProceduredate() {
        return this.proceduredate;
    }
    
    public void setProceduredate(Date proceduredate) {
        this.proceduredate = proceduredate;
    }
    public String getProcedureperform() {
        return this.procedureperform;
    }
    
    public void setProcedureperform(String procedureperform) {
        this.procedureperform = procedureperform;
    }
    public String getDiagnosis() {
        return this.diagnosis;
    }
    
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    public String getSummary() {
        return this.summary;
    }
    
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }




}


