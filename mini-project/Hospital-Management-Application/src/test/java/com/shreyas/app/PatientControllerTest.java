package com.shreyas.app;


import com.shreyas.app.Controller.DoctorController;
import com.shreyas.app.Controller.PatientController;
import com.shreyas.app.model.Appointment;
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
        List<Appointment> patientAppointment = new ArrayList();
        when(appointmentRepository.findBypatientName(anyString())).thenReturn(patientAppointment);
        List result = patientController.getPatientAppointment("abhishek");
        assertEquals(patientAppointment,result);

    }

    @Test
    public void saveAppointmentTest(){
        Appointment appointment1 = new Appointment();
        when(appointmentRepository.save(any(Appointment.class))).thenReturn(appointment1);

        Appointment result = patientController.saveAppointment(appointment);
        assertEquals(appointment1,result);

    }
}
