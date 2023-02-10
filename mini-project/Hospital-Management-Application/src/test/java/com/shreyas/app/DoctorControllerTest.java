package com.shreyas.app;


import com.shreyas.app.Controller.DoctorController;
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
public class DoctorControllerTest {

    @InjectMocks
    DoctorController doctorController;

    @Mock
    AppointmentRepository appointmentRepository;

    @Mock
    Appointment appointment;

    @BeforeEach
    void setup(){
        appointmentRepository = Mockito.mock(AppointmentRepository.class);
        appointment = Mockito.mock(Appointment.class);
    }

    @Test
    public void getAppointmentTest(){
        List<Appointment> appointments= new ArrayList();
        Appointment appointment1 = new Appointment();
        appointment1.getAppointmentId("123");
        appointment1.setDoctorName("doc1");
        appointment1.getDate("10th Feb");
        appointment1.setPatientName("Abhishek");
        when(appointmentRepository.findBydoctorName(anyString())).thenReturn(appointments);
        List result = doctorController.getAppointments("Dr.Ugale");
        assertEquals(appointments,result);

    }

    @Test
    public void saveAppointmentTest(){
        Appointment appointment1 = new Appointment();
        when(appointmentRepository.save(any(Appointment.class))).thenReturn(appointment1);

        Appointment result = doctorController.saveAppointment(appointment);
        assertEquals(appointment1,result);

    }


}
