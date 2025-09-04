package com.example.uberreviewservice.repositories;

import com.example.uberreviewservice.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDriverRepository extends JpaRepository<Driver, Long> {
}
