package com.example.demo.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    private Patient patient;
    @Autowired
    private PatientRepository patientRepository;

    public Optional<Patient> getPatient(Long id) {
        return patientRepository.findById(id);
    }
    public void addPatient(Patient p) {
        patientRepository.save(p);
    }

    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }

    public void editProduct(Patient p, Long id) {
        patientRepository.save(p);
    }

    public List<Patient> getAllPatient() {

        return patientRepository.findAll();
    }


}
