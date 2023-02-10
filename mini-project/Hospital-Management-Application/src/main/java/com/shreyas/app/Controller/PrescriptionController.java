package com.shreyas.app.Controller;


import com.shreyas.app.model.Prescription;
import com.shreyas.app.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prescription")
public class PrescriptionController {

    @Autowired
    PrescriptionRepository prescriptionRepository;

    @GetMapping("/viewPrescription")
    public List<Prescription> getPrescription(@RequestParam String patientName){
        return prescriptionRepository.findBypatientName(patientName);
    }

    @PostMapping("/savePrescription")
    public Prescription savePrescription(@RequestBody Prescription prescription){
        prescription = prescriptionRepository.save(prescription);
        return prescription;
    }


}
