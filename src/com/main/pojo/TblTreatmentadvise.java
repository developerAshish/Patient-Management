package com.main.pojo;
// Generated Jan 2, 2017 5:30:01 PM by Hibernate Tools 4.3.1



/**
 * TblTreatmentadvise generated by hbm2java
 */
public class TblTreatmentadvise  implements java.io.Serializable {


     private Integer id;
     private String drugname;
     private String genericname;
     private String doses;
     private String timing;
     private String duration;

    public TblTreatmentadvise() {
    }

    public TblTreatmentadvise(String drugname, String genericname, String doses, String timing, String duration) {
       this.drugname = drugname;
       this.genericname = genericname;
       this.doses = doses;
       this.timing = timing;
       this.duration = duration;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDrugname() {
        return this.drugname;
    }
    
    public void setDrugname(String drugname) {
        this.drugname = drugname;
    }
    public String getGenericname() {
        return this.genericname;
    }
    
    public void setGenericname(String genericname) {
        this.genericname = genericname;
    }
    public String getDoses() {
        return this.doses;
    }
    
    public void setDoses(String doses) {
        this.doses = doses;
    }
    public String getTiming() {
        return this.timing;
    }
    
    public void setTiming(String timing) {
        this.timing = timing;
    }
    public String getDuration() {
        return this.duration;
    }
    
    public void setDuration(String duration) {
        this.duration = duration;
    }




}


