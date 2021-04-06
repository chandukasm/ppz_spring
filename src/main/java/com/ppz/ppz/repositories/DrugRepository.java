package com.ppz.ppz.repositories;

import com.ppz.ppz.models.Doctors;
import com.ppz.ppz.models.Drug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface DrugRepository extends JpaRepository<Drug, Integer> {


    //    @Query(value = "SELECT name,email,gender FROM doctors WHERE username = 'test2' AND password = 'test2' ", nativeQuery = true)
    @Query(value = "update drug set  quantity = (select quantity q from drug d where d.id=?1) -?2 where id=?3  returning quantity", nativeQuery = true)
    int editQuantityPerDiagnose(int id1, int quantity2, int id3);


}
