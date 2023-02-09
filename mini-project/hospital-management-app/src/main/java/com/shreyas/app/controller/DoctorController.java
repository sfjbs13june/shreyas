package com.shreyas.app.controller;


import com.shreyas.app.model.Appointment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctor")
public class DoctorController {



    @RequestMapping(value = "/doctorappointment",method = RequestMethod.GET)
    public String getAppointments(@RequestParam("doctorName") String doctorName)
    {
        return (doctorName);
    }



    @RequestMapping(value = "/save/doctorappointment",method = RequestMethod.POST)
    public Appointment saveAppointment(@RequestBody Appointment appointment)
    {

        return appointment;
    }
}
