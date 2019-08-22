package com.hotel.dto;

import org.springframework.data.annotation.Id;

public class Room {

    @Id
    private final String id;
//    private final RoomIdentifier roomIdentifier;

    private final double roomPrice;

    private final String roomDescription;

    private final RoomFacilities roomFacilities;

    private final RoomStatus roomStatus;

    public Room(String id, double roomPrice, String roomDescription, RoomFacilities roomFacilities, RoomStatus roomStatus) {
        this.id = id;
        this.roomPrice = roomPrice;
        this.roomDescription = roomDescription;
        this.roomFacilities = roomFacilities;
        this.roomStatus = roomStatus;
    }

    public String getId() {
        return id;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public RoomFacilities getRoomFacilities() {
        return roomFacilities;
    }

    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id='" + id + '\'' +
                ", roomPrice=" + roomPrice +
                ", roomDescription='" + roomDescription + '\'' +
                ", roomFacilities=" + roomFacilities +
                ", roomStatus=" + roomStatus +
                '}';
    }
}
