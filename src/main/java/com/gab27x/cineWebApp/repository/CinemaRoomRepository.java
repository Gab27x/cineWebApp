package com.gab27x.cineWebApp.repository;

import com.gab27x.cineWebApp.model.CinemaRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaRoomRepository extends JpaRepository<CinemaRoom, Long> {
}
