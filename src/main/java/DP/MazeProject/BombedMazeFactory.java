package DP.MazeProject;

public class BombedMazeFactory extends MazeFactory {
    @Override
    public Wall MakeWall() {
        return new BombedWall();
    }

    @Override
    public Room MakeRoom(int n) {
        return new RoomWithABomb(n);
    }
}
