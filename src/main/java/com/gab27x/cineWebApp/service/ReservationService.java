package com.gab27x.cineWebApp.service;

import com.gab27x.cineWebApp.model.Reservation;
import java.util.List;
import java.util.Optional;

public interface ReservationService {
    List<Reservation> getAllReservations();
    Optional<Reservation> getReservationById(Long id);
    Reservation saveReservation(Reservation reservation);
    void deleteReservation(Long id);
}
