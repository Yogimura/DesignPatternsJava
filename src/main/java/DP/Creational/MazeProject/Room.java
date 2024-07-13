package DP.Creational.MazeProject;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Getter @Setter
public class Room extends MapSite{
    int roomNo;
    Map<Direction, MapSite> sides = new HashMap<>();

    public Room(int roomNo) {
        this.roomNo = roomNo;
        sides.put(Direction.North, null);
        sides.put(Direction.East, null);
        sides.put(Direction.South, null);
        sides.put(Direction.West, null);
    }

    void setSide(Direction direction, MapSite mapSite) {
        sides.replace(direction, mapSite);
    }

    MapSite getSide(Direction direction) {
        return sides.get(direction);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return getRoomNo() == room.getRoomNo() && Objects.equals(getSides(), room.getSides());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRoomNo(), getSides());
    }

    @Override
    void Enter() {
        getSide(Player.direction).Enter();
    }
}
