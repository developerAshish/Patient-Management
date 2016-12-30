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
    private String columnsName[] = {"#", "Patient_ID", "First Name", "Last Name", "Mobile No", "Age", "Sex", "Address", "Reference BY", "Date Admit", "Time Admit"};
    private Class columnsClass[] = {String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class};

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
        TblPatient patient = list.get(rowIndex);
        switch (columnIndex) {
            case 1:
                return rowIndex + 1;
            case 2:
                return patient.getId();
            case 3:
                System.out.println("patient = " + patient.getFirstName());
                return patient.getFirstName();
            case 4:
                System.out.println("patient = " + patient.getLastName());
                return patient.getLastName();
            case 5:
                return patient.getPhoneNo();
            case 6:
                return patient.getAge();
            case 7:
                return patient.getSex();
            case 8:
                return patient.getAddress();
            case 9:
                return patient.getReference();
            case 10:
                return patient.getDateAddmission();
            case 11:
                return patient.getTimeAddmission();
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
