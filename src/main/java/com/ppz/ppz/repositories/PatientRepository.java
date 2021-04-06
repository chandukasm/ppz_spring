package com.ppz.ppz.repositories;

import com.ppz.ppz.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient , Integer> {
}
