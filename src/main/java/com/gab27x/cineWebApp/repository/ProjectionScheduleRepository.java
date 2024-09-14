package com.gab27x.cineWebApp.repository;

import com.gab27x.cineWebApp.model.ProjectionSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectionScheduleRepository extends JpaRepository<ProjectionSchedule, Long> {
}
