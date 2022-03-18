package com.example.demo.doctor;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private  Long id;
    private  String name;
    private  String surname;
    private  String patientNo;

    public Patient() {
    }

    public Patient(Long id, String name, String surname, String patientNo) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patientNo = patientNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;

    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patientNo='" + patientNo + '\'' +
                '}';
    }
}
