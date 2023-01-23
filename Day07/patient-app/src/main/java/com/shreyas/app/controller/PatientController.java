package com.shreyas.app.controller;


import com.shreyas.app.exception.*;
import com.shreyas.app.model.Patient;
import com.shreyas.app.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController {

    @Autowired
    PatientService patientService;

    public Patient savPatient(@RequestBody Patient patient) throws PatientIdNotFound, PatientNameNotFound, PatientAgeNotFound, PatientGenderNotFound, PatientDiseaseNotFound
    {
        if(patient.getId()==null){
            throw new PatientIdNotFound("Patient id is not available");
        }
        if(patient.getName()==null){
            throw new PatientNameNotFound("Patient name is not available");
        }
        if(patient.getAge()==null){
            throw new PatientAgeNotFound("Patient age is not available");
        }
        if(patient.getGender()==null){
            throw new PatientGenderNotFound("Patient gender is not available");
        }
        if(patient.getDisease()==null){
            throw new PatientDiseaseNotFound("Patient disease is not available");
        }

        String name = null;
        System.out.println(name);
        System.out.println(patient);
        return patient;
    }
    @PostMapping("/patient/save")
        public Patient savePatient(@RequestBody Patient patient ){
            System.out.print(patient);
            return patient;
        }

    @PutMapping("/patient/update")
    public Patient updatePatient(@RequestBody Patient patient, @RequestParam("disease") String disease ){
        return patientService.updateDetail(patient,disease);
    }
    }



