package com.alash.hms.hotel.service;

import com.alash.hms.hotel.dtos.CreateHotelRequest;
import com.alash.hms.hotel.dtos.CreateHotelResponse;
import com.alash.hms.hotel.model.Hotel;
import com.alash.hms.hotel.repository.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService{

    private HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository){
        this.hotelRepository = hotelRepository;
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public CreateHotelResponse createHotel(CreateHotelRequest createHotelRequest) {
        return new CreateHotelResponse();
    }
}
