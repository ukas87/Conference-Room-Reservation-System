package com.sda.conferenceroomreservationsystem.rest;

import com.sda.conferenceroomreservationsystem.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ReservationController {

    private final ReservationService reservationService;
}
