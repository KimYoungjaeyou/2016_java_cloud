package com.skcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcc.domain.concert.Concert;

public interface ConcertRepository extends JpaRepository<Concert, Integer>{
}
