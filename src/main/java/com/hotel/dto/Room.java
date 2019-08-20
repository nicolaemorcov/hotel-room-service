package com.hotel.dto;

public class Room {

    private final RoomIdentifier roomIdentifier;

    private final double roomPrice;

    private final String roomDescription;

    private final RoomFacilities roomFacilities;

    private final RoomStatus roomStatus;

    public Room(RoomIdentifier roomIdentifier, double roomPrice, String roomDescription,
                RoomFacilities roomFacilities, RoomStatus roomStatus) {
        this.roomIdentifier = roomIdentifier;
        this.roomPrice = roomPrice;
        this.roomDescription = roomDescription;
        this.roomFacilities = roomFacilities;
        this.roomStatus = roomStatus;
    }

    public RoomIdentifier getRoomIdentifier() {
        return roomIdentifier;
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
                "roomIdentifier=" + roomIdentifier +
                ", roomPrice=" + roomPrice +
                ", roomDescription='" + roomDescription + '\'' +
                ", roomFacilities=" + roomFacilities +
                ", roomStatus=" + roomStatus +
                '}';
    }
}
