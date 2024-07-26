package DP.MazeProject;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    List<Room> rooms = new ArrayList<>();

    public Maze() {
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Room getRoom(int roomNo) {
        return rooms.stream().filter(p -> p.getRoomNo() == roomNo).toList().getFirst();
    }


}
