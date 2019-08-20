package com.hotel.controllers;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.dto.Room;
import com.hotel.dto.RoomFacilities;
import com.hotel.dto.RoomFeature;
import com.hotel.dto.RoomIdentifier;
import com.hotel.dto.RoomStatus;
import com.hotel.dto.RoomType;
import com.hotel.services.RoomService;

@RestController
public class RoomController {

    private RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping(value = "/rooms")
    public Room saveRoomToDb(){
        RoomIdentifier roomIdentifier = new RoomIdentifier("1ab3", 7, 2, 4, RoomType.FAMILY);
        RoomFacilities roomFacilities = new RoomFacilities(Arrays.asList(RoomFeature.BALCONY, RoomFeature.FRIDGE, RoomFeature.TV));
        Room room = new Room(roomIdentifier, 48, "Large family room, up to 4 people.",
                roomFacilities, RoomStatus.AVAILABLE);
        roomService.addRoom(room);
        return room;
    }

}
