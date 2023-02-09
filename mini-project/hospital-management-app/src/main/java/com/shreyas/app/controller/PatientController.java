package com.shreyas.app.controller;


import com.shreyas.app.model.Appointment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @RequestMapping(value = "/myappointment",method = RequestMethod.GET)
    public String getAppointments(@RequestParam("patientName") String patientName)
    {
        return (patientName);
    }


    @PostMapping("/save/patientappointment")
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        return appointment;

    }
}
