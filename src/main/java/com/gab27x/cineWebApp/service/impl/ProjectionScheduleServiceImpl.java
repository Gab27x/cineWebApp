package com.gab27x.cineWebApp.service.impl;

import com.gab27x.cineWebApp.model.ProjectionSchedule;
import com.gab27x.cineWebApp.repository.ProjectionScheduleRepository;
import com.gab27x.cineWebApp.service.ProjectionScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectionScheduleServiceImpl implements ProjectionScheduleService {

    @Autowired
    private ProjectionScheduleRepository projectionScheduleRepository;

    @Override
    public List<ProjectionSchedule> getAllProjectionSchedules() {
        return projectionScheduleRepository.findAll();
    }

    @Override
    public Optional<ProjectionSchedule> getProjectionScheduleById(Long id) {
        return projectionScheduleRepository.findById(id);
    }

    @Override
    public ProjectionSchedule saveProjectionSchedule(ProjectionSchedule projectionSchedule) {
        return projectionScheduleRepository.save(projectionSchedule);
    }

    @Override
    public void deleteProjectionSchedule(Long id) {
        projectionScheduleRepository.deleteById(id);
    }
}
