package DP.MazeProject;

public class MazeGame {
    Maze createMazeF() {
        Maze maze = new Maze();
        Room r1 = new Room(1);
        Room r2 = new Room(2);
        Door theDoor = new Door(r1, r2);

        maze.addRoom(r1);
        maze.addRoom(r2);

        r1.setSide(Direction.North, new Wall());
        r1.setSide(Direction.East, theDoor);
        r1.setSide(Direction.South, new Wall());
        r1.setSide(Direction.West, new Wall());

        r2.setSide(Direction.North, new Wall());
        r2.setSide(Direction.East, new Wall());
        r2.setSide(Direction.South, new Wall());
        r2.setSide(Direction.West, theDoor);

        return maze;
    }

    Maze CreateMaze(MazeFactory factory) {
        Maze maze = factory.MakeMaze();
        Room r1 = factory.MakeRoom(1);
        Room r2 = factory.MakeRoom(2);
        Door door = factory.MakeDoor(r1, r2);

        maze.addRoom(r1);
        maze.addRoom(r2);

        r1.setSide(Direction.North, factory.MakeWall());
        r1.setSide(Direction.East, door);
        r1.setSide(Direction.South, factory.MakeWall());
        r1.setSide(Direction.West, factory.MakeWall());

        r2.setSide(Direction.North, factory.MakeWall());
        r2.setSide(Direction.East, factory.MakeWall());
        r2.setSide(Direction.South, factory.MakeWall());
        r2.setSide(Direction.West, door);

        return maze;
    }
}
