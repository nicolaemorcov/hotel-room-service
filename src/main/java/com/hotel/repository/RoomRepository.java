package com.hotel.repository;

import com.hotel.dto.Room;
import com.hotel.dto.RoomIdentifier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends MongoRepository<Room, String> {

    @Query("{'roomId' : ?0}")
    Room findRoomByRoomId(String roomId);

    @Query("{'roomStatus' : ?0}")
    List<Room> findAllAvailableRooms(String roomStatus);

}
