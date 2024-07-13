package DP.Creational.MazeProject;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Door extends MapSite{
    DoorLink doorLink;
    Boolean Open;

    public Door(Room thisRoom, Room otherRoom) {
        this.doorLink = new DoorLink(thisRoom, otherRoom);
    }

    Room OtherSideFrom(Room room) {
        Room result = doorLink.otherRoom();
        doorLink = new DoorLink(doorLink.otherRoom(), doorLink.thisRoom());
        return result;
    }

    @Override
    void Enter() {
        if (Open) {
            Player.location = OtherSideFrom(doorLink.thisRoom());
        } else {
            System.out.println("La puerta esta cerrada");
        }
    }
}
