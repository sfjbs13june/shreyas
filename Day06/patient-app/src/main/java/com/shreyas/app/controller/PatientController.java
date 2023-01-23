package com.shreyas.app.controller;


import com.shreyas.app.model.Patient;
import com.shreyas.app.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController {

    @Autowired
    PatientService patientService;


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



