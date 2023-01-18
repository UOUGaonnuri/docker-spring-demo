package com.example.dockerspringdemo.model.repository;

import com.example.dockerspringdemo.model.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestEntityRepository extends JpaRepository<TestEntity, Long> {
}
