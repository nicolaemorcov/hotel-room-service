package com.hotel.services;

import com.hotel.dto.Room;
import com.hotel.dto.RoomIdentifier;
import com.hotel.repository.RoomRepository;
import com.hotel.dto.RoomStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService{

    private RoomRepository roomRepository;

    @Autowired
    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public void addRoom(Room room){
        roomRepository.insert(room);
    }

    @Override
    public void deleteRoom(RoomIdentifier roomIdentifier){
        roomRepository.deleteById(roomIdentifier);
    }

    @Override
    public Room findRoomByRoomId(String roomId){
        return roomRepository.findRoomByRoomId(roomId);
    }

    @Override
    public List<Room> findAllAvailableRooms(){
        return roomRepository.findAllAvailableRooms(RoomStatus.AVAILABLE.toString());
    }

}
