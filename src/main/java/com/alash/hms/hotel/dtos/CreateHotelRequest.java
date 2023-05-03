package com.alash.hms.hotel.dtos;

import com.alash.hms.hotel.model.enums.Rating;

import java.util.List;

public class CreateHotelRequest {

    private String hotelName;
    private String hotelLocation;
    private Rating rating;
    private Long noOfRooms;

}
