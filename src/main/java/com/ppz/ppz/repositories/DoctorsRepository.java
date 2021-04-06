package com.ppz.ppz.repositories;

import com.ppz.ppz.models.Doctors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorsRepository extends JpaRepository<Doctors, Integer> {

    @Query(value = "SELECT name,email,gender FROM doctors WHERE username = 'test2' AND password = 'test2' ", nativeQuery = true)
    Doctors findByEmailAddress(String email,String password);
}
