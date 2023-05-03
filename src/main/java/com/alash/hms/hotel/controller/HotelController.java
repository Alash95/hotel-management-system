package com.alash.hms.hotel.controller;

import com.alash.hms.hotel.dtos.CreateHotelRequest;
import com.alash.hms.hotel.dtos.CreateHotelResponse;
import com.alash.hms.hotel.model.Hotel;
import com.alash.hms.hotel.service.HotelService;
import lombok.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/hotel")
public class HotelController {

    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("/get-hotels")
    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }

    @PostMapping("/create-hotel")
    public CreateHotelResponse createHotel(@RequestBody @NonNull CreateHotelRequest createHotelRequest) {
        return hotelService.createHotel(createHotelRequest);
    }




}
