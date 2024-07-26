package DP.MazeProject;

public class EnchantedRoom extends Room{
    private Spell spell;
    public EnchantedRoom(int roomNo, Spell spell) {
        super(roomNo);
        this.spell = spell;
    }
}
