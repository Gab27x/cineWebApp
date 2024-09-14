package com.gab27x.cineWebApp.service.impl;

import com.gab27x.cineWebApp.model.CinemaRoom;
import com.gab27x.cineWebApp.repository.CinemaRoomRepository;
import com.gab27x.cineWebApp.service.CinemaRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CinemaRoomServiceImpl implements CinemaRoomService {

    @Autowired
    private CinemaRoomRepository cinemaRoomRepository;

    @Override
    public List<CinemaRoom> getAllCinemaRooms() {
        return cinemaRoomRepository.findAll();
    }

    @Override
    public Optional<CinemaRoom> getCinemaRoomById(Long id) {
        return cinemaRoomRepository.findById(id);
    }

    @Override
    public CinemaRoom saveCinemaRoom(CinemaRoom cinemaRoom) {
        return cinemaRoomRepository.save(cinemaRoom);
    }

    @Override
    public void deleteCinemaRoom(Long id) {
        cinemaRoomRepository.deleteById(id);
    }
}
