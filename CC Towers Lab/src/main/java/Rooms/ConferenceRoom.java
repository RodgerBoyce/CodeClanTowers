package Rooms;

import Guests.Guest;

import java.util.ArrayList;

public class ConferenceRoom extends Room {
    private RoomType roomType;
    private int roomNum;
    private String name;
    public ConferenceRoom(String name, int roomNum, ArrayList<Guest> guests) {
        super(guests, RoomType.CONFERENCE.getCapacity());
        this.name = name;
        this.roomNum = roomNum;
    }
}
