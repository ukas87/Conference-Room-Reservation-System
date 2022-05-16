package com.sda.conferenceroomreservationsystem.mapper;

import com.sda.conferenceroomreservationsystem.model.dto.ReservationDto;
import com.sda.conferenceroomreservationsystem.model.entity.ConferenceRoom;
import com.sda.conferenceroomreservationsystem.model.entity.Reservation;
import com.sda.conferenceroomreservationsystem.model.request.ReservationRequest;

public class ReservationMapper {
    public static Reservation mapToEntity(final ConferenceRoom conferenceRoom, final ReservationRequest request) {
        final Reservation reservation = new Reservation();
        reservation.setReservationStart(request.getReservationStart());
        reservation.setReservationEnd(request.getReservationEnd());
        reservation.setConferenceRoom(conferenceRoom);

        return reservation;
    }

    public static Reservation mapToEntity(final ReservationRequest request) {
        final Reservation reservation = new Reservation();
        reservation.setReservationStart(request.getReservationStart());
        reservation.setReservationEnd(request.getReservationEnd());

        return reservation;
    }

    public static ReservationDto mapToDto(final Reservation reservation) {
        return ReservationDto.Builder()
                .withReservationIdentifier(reservation.getReservationIdentifier())
                .withReservationStart(reservation.getReservationStart())
                .withReservationEnd(reservation.getReservationEnd())
                .build();
    }
}
