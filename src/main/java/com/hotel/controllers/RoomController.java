package com.hotel.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    private static final String ROOM_FACILITIES_DELIMITER = "-";

    private RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    //TODO perhaps we will use one object posted in request
    @GetMapping(path = "/add-room", params = {"roomId", "doorNumber", "floorNumber", "size",
            "roomType", "roomFacilitiesList", "roomPrice", "roomDescription"})
    public ResponseEntity saveRoomToDb(String roomId, String doorNumber, String floorNumber, String size,
                                       String roomType, String roomFacilitiesList, String price, String roomDescription){
        int roomDoorNumber = Integer.parseInt(doorNumber);
        int roomFloorNumber = Integer.parseInt(floorNumber);
        int roomSize = Integer.parseInt(size);
        int roomPrice = Integer.parseInt(price);
        List<String> facilitiesList = Arrays.asList(roomFacilitiesList.split(ROOM_FACILITIES_DELIMITER));
        List<RoomFeature> roomFeatures = new ArrayList<>();
        facilitiesList.forEach(s -> roomFeatures.add(RoomFeature.valueOf(s)));
        RoomIdentifier roomIdentifier = new RoomIdentifier(roomId, roomDoorNumber, roomFloorNumber, roomSize, RoomType.valueOf(roomType));
        RoomFacilities roomFacilities = new RoomFacilities(roomFeatures);
        Room room = new Room(roomIdentifier, roomPrice, roomDescription,
                roomFacilities, RoomStatus.AVAILABLE);
        roomService.addRoom(room);
        return ResponseEntity.status(HttpStatus.OK).body("Room Added"); // TODO for body we might consider displaying room data
    }

}
