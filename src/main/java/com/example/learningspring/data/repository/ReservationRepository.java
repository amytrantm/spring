package com.example.learningspring.data.repository;

import com.example.learningspring.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    //find reservation by date
    Iterable<Reservation> findReservationByReservationDate(Date date);
}
