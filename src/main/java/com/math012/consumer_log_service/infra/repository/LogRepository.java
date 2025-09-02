package com.math012.consumer_log_service.infra.repository;

import com.math012.consumer_log_service.infra.model.LogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends JpaRepository<LogEntity, Long> {
}
