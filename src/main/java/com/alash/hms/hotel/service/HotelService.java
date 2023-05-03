package com.alash.hms.hotel.service;

import com.alash.hms.hotel.dtos.CreateHotelRequest;
import com.alash.hms.hotel.dtos.CreateHotelResponse;
import com.alash.hms.hotel.model.Hotel;

import java.util.List;

public interface HotelService {

    List<Hotel> getAllHotels();
    CreateHotelResponse createHotel(CreateHotelRequest createHotelRequest);


}
