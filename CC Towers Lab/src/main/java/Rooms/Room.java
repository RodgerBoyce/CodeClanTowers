package Rooms;

public abstract class Room {

    private RoomType roomType;
    private int roomNum;

    public Room(RoomType roomType, int roomNum){
        this.roomType = roomType;
        this.roomNum = roomNum;
    }

    public RoomType getRoomType(){
        return this.roomType;
    }
    public int getRoomNum(){
        return this.roomNum;
    }

    public void setRoomType(RoomType roomType){
        this.roomType = roomType;
    }

    public int getValueFromEnum(){
        return this.roomType.getValue();
    }
}