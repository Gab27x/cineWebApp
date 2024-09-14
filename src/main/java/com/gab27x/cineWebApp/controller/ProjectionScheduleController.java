package com.gab27x.cineWebApp.controller;

import com.gab27x.cineWebApp.model.ProjectionSchedule;
import com.gab27x.cineWebApp.service.ProjectionScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projectionschedules")
public class ProjectionScheduleController {

    private final ProjectionScheduleService projectionScheduleService;

    @Autowired
    public ProjectionScheduleController(ProjectionScheduleService projectionScheduleService) {
        this.projectionScheduleService = projectionScheduleService;
    }

    @GetMapping("/getAll")
    public List<ProjectionSchedule> getAllProjectionSchedules() {
        return projectionScheduleService.getAllProjectionSchedules();
    }

    @PostMapping("/add")
    public ResponseEntity<ProjectionSchedule> createProjectionSchedule(@RequestBody ProjectionSchedule projectionSchedule) {
        ProjectionSchedule savedSchedule = projectionScheduleService.saveProjectionSchedule(projectionSchedule);
        return ResponseEntity.ok(savedSchedule);
    }
}
