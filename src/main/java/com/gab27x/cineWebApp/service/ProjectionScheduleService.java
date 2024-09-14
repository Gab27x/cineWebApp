package com.gab27x.cineWebApp.service;

import com.gab27x.cineWebApp.model.ProjectionSchedule;
import java.util.List;
import java.util.Optional;

public interface ProjectionScheduleService {
    List<ProjectionSchedule> getAllProjectionSchedules();
    Optional<ProjectionSchedule> getProjectionScheduleById(Long id);
    ProjectionSchedule saveProjectionSchedule(ProjectionSchedule projectionSchedule);
    void deleteProjectionSchedule(Long id);
}
