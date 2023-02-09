package com.shreyas.app.controller;


import com.shreyas.app.model.Appointment;
import com.shreyas.app.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {


    @Autowired
    AppointmentRepository appointmentRepository;

    @GetMapping("/doctorappointment")
    public List<Appointment> getAppointment(@RequestParam String doctorName) {
        return appointmentRepository.findBydoctorName(doctorName);
    }

    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment) {
        appointment = appointmentRepository.save(appointment);
        return appointment;

    }
}

