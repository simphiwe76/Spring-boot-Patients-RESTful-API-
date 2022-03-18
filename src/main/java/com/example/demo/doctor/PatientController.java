package com.example.demo.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class PatientController {

    private  Patient patient;

    @Autowired
    private  PatientService patientService;

    @RequestMapping("/add")
    public  void  addPatient(@RequestBody Patient p){
        patientService.addPatient(p);
    }

    @RequestMapping("/deletePatient/{id}")
    public void deletePatient(@PathVariable Long id){
        patientService.deletePatient(id);
    }

    @RequestMapping(value = "/editPatient/{id}",method= {RequestMethod.PUT,RequestMethod.GET})
    public void editPatient(@RequestBody Patient p, Long id) {
        patientService.editProduct(p,id);
    }
    @RequestMapping(value = "/")
    public List<Patient> getAllPatient(){
        List<Patient> p = new ArrayList<>();
        p = patientService.getAllPatient();
        return p;
    }
    @RequestMapping(value = "/getPatient/{id}")
    public Optional<Patient> getPatient(@PathVariable  Long id){
        return patientService.getPatient(id);
    }

}
