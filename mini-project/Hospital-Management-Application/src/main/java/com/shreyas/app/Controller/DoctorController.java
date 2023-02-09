package com.shreyas.app.Controller;


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

    @GetMapping("/doctorAppointment")
    public List<Appointment> getAppointments(@RequestParam String doctorName) {
         return appointmentRepository.findBydoctorName(doctorName);
    }

    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        appointment = appointmentRepository.save(appointment);
        return appointment;

    }


}
