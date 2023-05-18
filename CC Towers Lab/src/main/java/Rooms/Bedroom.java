package Rooms;

import Guests.Guest;

import java.util.ArrayList;

public class Bedroom extends Room {
    private RoomType roomType;
    private int roomNum;
    public Bedroom(ArrayList<Guest> guests, RoomType roomType, int roomNum) {
        super(guests, roomType.getCapacity());
        this.roomType = roomType;
        this.roomNum = roomNum;
    }

    public int getRoomNum() {
        return this.roomNum;
    }

    public int getCapacity() {
        return roomType.getCapacity();
    }
}
