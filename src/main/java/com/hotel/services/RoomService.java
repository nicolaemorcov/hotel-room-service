package com.hotel.services;

import com.hotel.dto.Room;
import com.hotel.dto.RoomIdentifier;

import java.util.List;

public interface RoomService {

    void addRoom(Room room);

    void deleteRoom(RoomIdentifier roomIdentifier);

    public Room findRoomByRoomId(String roomId);

    public List<Room> findAllAvailableRooms();

}
