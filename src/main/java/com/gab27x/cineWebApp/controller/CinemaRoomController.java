package com.gab27x.cineWebApp.controller;

import com.gab27x.cineWebApp.model.CinemaRoom;
import com.gab27x.cineWebApp.service.CinemaRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cinemarooms")
@CrossOrigin
public class CinemaRoomController {

    private final CinemaRoomService cinemaRoomService;

    @Autowired
    public CinemaRoomController(CinemaRoomService cinemaRoomService) {
        this.cinemaRoomService = cinemaRoomService;
    }

    @GetMapping("/getAll")
    public List<CinemaRoom> getAllCinemaRooms() {
        return cinemaRoomService.getAllCinemaRooms();
    }

    @PostMapping("/add")
    public ResponseEntity<CinemaRoom> createCinemaRoom(@RequestBody CinemaRoom cinemaRoom) {
        CinemaRoom savedRoom = cinemaRoomService.saveCinemaRoom(cinemaRoom);
        return ResponseEntity.ok(savedRoom);
    }
}
