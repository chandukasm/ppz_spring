package com.ppz.ppz.repositories;

import com.ppz.ppz.models.Diagnose;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiagnoseRepository extends JpaRepository<Diagnose, Integer> {


}
