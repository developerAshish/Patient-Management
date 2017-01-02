/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.model;

import com.main.pojo.TblPatient;
import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author ashish
 */
public class ViewTableModel implements TableModel {

    ArrayList<TblPatient> list;
    private String columnsName[] = {"#", "Patient_ID", "First Name", "Last Name", "Mobile No", "Age", "Sex", "Address", "Spouse Name", "Spouse Age", "Date Admit", "Reference BY", "Time Admit"};
    private Class columnsClass[] = {Integer.class,String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class,String.class};

    public ViewTableModel(ArrayList<TblPatient> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return columnsName.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnsName[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnsClass[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        System.out.println("rowIndex = " + rowIndex);
        TblPatient patient = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return rowIndex + 1;
            case 1:
                return patient.getId();
            case 2:
                return patient.getFirstName();
            case 3:
                return patient.getLastName();
            case 4:
                return patient.getMobile();
            case 5:
                return patient.getAge();
            case 6:
                return patient.getSex();
            case 7:
                return patient.getAddress();
            case 8:
                return patient.getSpousename();
            case 9:
                return patient.getSpouseage();
            case 10:
                return patient.getDateaddmission();
            case 11:
                return patient.getReference();
            case 12:
                return patient.getTimeaddmission();
        }
        return patient;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }

}
