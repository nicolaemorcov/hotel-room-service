package com.hotel.dto;

public class RoomIdentifier {

//    @GeneratedValue(strategy = GenerationType.AUTO)
    private final String roomId;

    private final int roomDoorNumber;

    private final int roomFloor;

    private final int roomSize;//todo rename to something more appropriate

    private final RoomType roomType;

    public RoomIdentifier(String roomId, int roomDoorNumber, int roomFloor, int roomSize, RoomType roomType) {
        this.roomId = roomId;
        this.roomDoorNumber = roomDoorNumber;
        this.roomFloor = roomFloor;
        this.roomSize = roomSize;
        this.roomType = roomType;
    }

    public String getRoomId() {
        return roomId;
    }

    public int getRoomDoorNumber() {
        return roomDoorNumber;
    }

    public int getRoomFloor() {
        return roomFloor;
    }

    public int getRoomSize() {
        return roomSize;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    @Override
    public String toString() {
        return "RoomIdentifier{" +
                "roomId='" + roomId + '\'' +
                ", roomDoorNumber=" + roomDoorNumber +
                ", roomFloor=" + roomFloor +
                ", roomSize=" + roomSize +
                ", roomType=" + roomType +
                '}';
    }
}
