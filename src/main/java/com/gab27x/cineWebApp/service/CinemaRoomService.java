package com.gab27x.cineWebApp.service;

import com.gab27x.cineWebApp.model.CinemaRoom;
import java.util.List;
import java.util.Optional;

public interface CinemaRoomService {
    List<CinemaRoom> getAllCinemaRooms();
    Optional<CinemaRoom> getCinemaRoomById(Long id);
    CinemaRoom saveCinemaRoom(CinemaRoom cinemaRoom);
    void deleteCinemaRoom(Long id);
}
