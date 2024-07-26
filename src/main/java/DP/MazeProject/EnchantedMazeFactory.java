package DP.MazeProject;

public class EnchantedMazeFactory extends MazeFactory{
    public EnchantedMazeFactory() {}

    @Override
    public Room MakeRoom(int n) {
        return new EnchantedRoom(n, CastSpell());
    }

    @Override
    public Door MakeDoor(Room r1, Room r2) {
        return new DoorNeedingSpell(r1, r2);
    }

    protected Spell CastSpell() {return new Spell();}
}
