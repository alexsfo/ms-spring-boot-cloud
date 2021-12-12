package com.alexsandro.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexsandro.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
