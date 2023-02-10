package com.shreyas.app;

import com.shreyas.app.Controller.PrescriptionController;
import com.shreyas.app.model.Appointment;
import com.shreyas.app.model.Prescription;
import com.shreyas.app.repository.AppointmentRepository;
import com.shreyas.app.repository.PrescriptionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
public class PrescriptionControllerTest {
    @InjectMocks
    PrescriptionController prescriptionController;

    @Mock
    PrescriptionRepository prescriptionRepository;

    @Mock
    Prescription prescription;

    @BeforeEach
    void setup(){
        prescriptionRepository = Mockito.mock(PrescriptionRepository.class);
        prescription = Mockito.mock(Prescription.class);
    }

    @Test
    public void getPrescriptionTest(){

        List<Prescription> prescriptions = new ArrayList();
        Prescription prescription1 = new Prescription("123","23","Ear pain Due to Cough","abhishek","Dr.Ugale");
        prescriptions.add(prescription1);
        when(prescriptionRepository.findBypatientName(anyString())).thenReturn(prescriptions);
        List<Prescription> result = prescriptionController.getPrescription("Fever");

        assertEquals(prescriptions.size(),1);
        assertEquals(prescriptions.get(0).getPrescriptionId(),result.get(0).getPrescriptionId());
        assertEquals(prescriptions.get(0).getAppointmentId(),result.get(0).getAppointmentId());
        assertEquals(prescriptions.get(0).getDescription(),result.get(0).getDescription());
        assertEquals(prescriptions.get(0).getPatientName(),result.get(0).getPatientName());
        assertEquals(prescriptions.get(0).getDoctorName(),result.get(0).getDoctorName());

    }

    @Test
    public void savePrescriptionTest(){
        Prescription prescription1 = new Prescription("123","23","Ear pain Due to Cough","abhishek","Dr.Ugale");
        when(prescriptionRepository.save(any(Prescription.class))).thenReturn(prescription1);
        Prescription result = prescriptionController.savePrescription(prescription);


        assertEquals(prescription1.getPrescriptionId(),result.getPrescriptionId());
        assertEquals(prescription1.getAppointmentId(),result.getAppointmentId());
        assertEquals(prescription1.getPatientName(),result.getPatientName());
        assertEquals(prescription1.getDoctorName(),result.getDoctorName());
        assertEquals(prescription1.getDescription(),result.getDescription());
    }
}
