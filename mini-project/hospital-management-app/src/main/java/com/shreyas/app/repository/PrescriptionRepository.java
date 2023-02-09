package com.shreyas.app.repository;

import com.shreyas.app.model.Prescription;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


    public interface PrescriptionRepository extends MongoRepository<Prescription,String> {

        public Prescription save(Prescription prescription);
        public List<Prescription> findByPatientName(String patientName);
}
