package com.main.services;

import com.main.pojo.TblPatient;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;

public class PatientService {

    public static Session session = null;
    public static Transaction transaction = null;


    public static boolean checkStatus() {
        try {
            if (session == null) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void saveEntity(Object entity) throws Exception {
        session = DatabaseUtility.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(entity);
        transaction.commit();
        session.close();
    }

    public static void updateEntity(Object entity) throws Exception {
        session = DatabaseUtility.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.update(entity);
        transaction.commit();
        session.close();
    }

    public static void deleteEntity(Object entity) throws Exception {
        session = DatabaseUtility.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.delete(entity);
        transaction.commit();
        session.close();
    }

    public static <T> List<T> listEntity(T entity) throws Exception {
        session = DatabaseUtility.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(entity.getClass());
        return criteria.list();
    }

    public static ArrayList<TblPatient> listSearchALL(String id, String fname, String lname) {
        ArrayList<TblPatient> arrayList = new ArrayList<>();
        Query query = null;
        try {
            Session session = DatabaseUtility.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            query = session.createQuery("from TblPatient");
            arrayList = (ArrayList<TblPatient>) query.list();
            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public static List<Integer> loadComboID() {
        Session session = DatabaseUtility.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(TblPatient.class);
        criteria.setProjection(Projections.distinct(Projections.property("id")));
        List list = criteria.list();
        session.close();
        return list;
    }

    public static List<String> loadComboFirstName() {
        Session session = DatabaseUtility.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(TblPatient.class);
        criteria.setProjection(Projections.distinct(Projections.property("firstName")));
        List list = criteria.list();
        session.close();
        return list;
    }

    public static List<String> loadComboLastName() {
        Session session = DatabaseUtility.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(TblPatient.class);
        criteria.setProjection(Projections.distinct(Projections.property("lastName")));
        List list = criteria.list();
        session.close();
        return list;
    }
    public static void main(String[] args) {

    }

}
