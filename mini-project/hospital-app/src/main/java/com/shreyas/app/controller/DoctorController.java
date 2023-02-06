package com.shreyas.app.controller;


import com.shreyas.app.model.Appointment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DoctorController {



    @GetMapping("/doctorappointment")
    public List<Appointment> getAppointments(@RequestParam String doctorName){
        List listAppointment= new ArrayList();
        Appointment appointment1= new Appointment("234","Abhishek","Dr.Ugale","25 Jan 2023","Paracetamol");
        Appointment appointment2= new Appointment("268","Prasad","Dr.Ugale","26 Jan 2023","Vicks 44 Cough");
        Appointment appointment3= new Appointment("302","Chinmay","Dr.Ugale","27 Jan 2023","Robitussin ");

        listAppointment.add(appointment1);
        listAppointment.add(appointment2);
        listAppointment.add(appointment3);
        return  listAppointment;
    }
}
