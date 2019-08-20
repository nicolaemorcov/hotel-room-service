package com.hotel.controllers;

import com.hotel.dto.*;
import com.hotel.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class RoomController {

    private RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping(value = "/rooms")
    public ResponseEntity.BodyBuilder saveRoomToDb(){
        RoomIdentifier roomIdentifier = new RoomIdentifier("1ab3", 7, 2, 4, RoomType.FAMILY);
        RoomFacilities roomFacilities = new RoomFacilities(Arrays.asList(RoomFeature.BALCONY, RoomFeature.FRIDGE, RoomFeature.TV));
        Room room = new Room(roomIdentifier, 48, "Large family room, up to 4 people.",
                roomFacilities, RoomStatus.AVAILABLE);
        roomService.addRoom(room);
        return ResponseEntity.status(HttpStatus.OK);
    }

}
