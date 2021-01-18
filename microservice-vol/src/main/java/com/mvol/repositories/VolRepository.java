package com.mvol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvol.entities.Vol;

@Repository
public interface VolRepository extends JpaRepository<Vol, Long> {

}
