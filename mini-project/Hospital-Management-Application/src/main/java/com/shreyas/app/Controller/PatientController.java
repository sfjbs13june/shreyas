package com.shreyas.app.Controller;


import com.shreyas.app.model.Appointment;
import com.shreyas.app.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    AppointmentRepository appointmentRepository;

    @GetMapping("/patientappointment")
    public List<Appointment> getPatientAppointment(@RequestParam String patientName){
        return appointmentRepository.findBypatientName(patientName);
    }

    @PostMapping("/save")
    public Appointment saveAppointment (@RequestBody Appointment appointment){
        appointment = appointmentRepository.save(appointment);
        return appointment;

    }
}
