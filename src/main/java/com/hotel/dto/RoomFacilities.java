package com.hotel.dto;

import java.util.List;

//TODO find a proper name for this class
public class RoomFacilities {

    private final List<RoomFeature> facilitiesList;

    public RoomFacilities(List<RoomFeature> facilitiesList) {
        this.facilitiesList = facilitiesList;
    }

    public List<RoomFeature> getFacilitiesList() {
        return facilitiesList;
    }

    @Override
    public String toString() {
        return "RoomFacilities{" +
                "facilitiesList=" + facilitiesList +
                '}';
    }
}
