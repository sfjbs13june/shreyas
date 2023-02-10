package com.shreyas.app;


import com.shreyas.app.Controller.DoctorController;
import com.shreyas.app.Controller.PatientController;
import com.shreyas.app.model.Appointment;
import com.shreyas.app.model.Prescription;
import com.shreyas.app.repository.AppointmentRepository;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)

public class PatientControllerTest {


    @InjectMocks
    PatientController patientController;

    @Mock
    AppointmentRepository appointmentRepository;

    @Mock
    Appointment appointment;

    @BeforeEach
    void setup(){
        appointmentRepository = Mockito.mock(AppointmentRepository.class);
    }

    @Test
    public void getAppointmentTest(){
        List<Appointment> appointments = new ArrayList();
        Prescription prescription1 = new Prescription("123","23","Ear pain Due to Cough","abhishek","Dr.Ugale");
        Appointment appointment1 = new Appointment("23","abhishek","Dr.Ugale","10th Feb",prescription1);
        appointments.add(appointment1);
        when(appointmentRepository.findBypatientName(anyString())).thenReturn(appointments);
        List<Appointment> result = patientController.getPatientAppointment("Dr.Ugale");
        assertEquals(appointments.size(),1);
        assertEquals(appointments.get(0).getAppointmentId(),result.get(0).getAppointmentId());
        assertEquals(appointments.get(0).getPatientName(),result.get(0).getPatientName());
        assertEquals(appointments.get(0).getDoctorName(),result.get(0).getDoctorName());
        assertEquals(appointments.get(0).getDate(),result.get(0).getDate());
        assertEquals(appointments.get(0).getPrescription().getPrescriptionId(),result.get(0).getPrescription().getPrescriptionId());
        assertEquals(appointments.get(0).getPrescription().getAppointmentId(),result.get(0).getPrescription().getAppointmentId());
        assertEquals(appointments.get(0).getPrescription().getDescription(),result.get(0).getPrescription().getDescription());
        assertEquals(appointments.get(0).getPrescription().getDoctorName(),result.get(0).getPrescription().getDoctorName());


    }

    @Test
    public void saveAppointmentTest(){
        Prescription prescription = new Prescription("123","23","Ear pain Due to Cough","abhishek","Dr.Ugale");

        Appointment appointments = new Appointment("23","abhishek","Dr.Ugale","10th Feb",prescription);
        when(appointmentRepository.save(any(Appointment.class))).thenReturn(appointments);
        Appointment result = patientController.saveAppointment(appointment);
        assertEquals(appointments.getAppointmentId(),result.getAppointmentId());
        assertEquals(appointments.getDoctorName(),result.getDoctorName());
        assertEquals(appointments.getDate(),result.getDate());
        assertEquals(appointments.getPatientName(),result.getPatientName());
        assertEquals(appointments.getPrescription().getPrescriptionId(),result.getPrescription().getPrescriptionId());
        assertEquals(appointments.getPrescription().getAppointmentId(),result.getPrescription().getAppointmentId());
        assertEquals(appointments.getPrescription().getDescription(),result.getPrescription().getDescription());
        assertEquals(appointments.getPrescription().getPatientName(),result.getPrescription().getPatientName());
        assertEquals(appointments.getPrescription().getDoctorName(),result.getPrescription().getDoctorName());

    }




}
