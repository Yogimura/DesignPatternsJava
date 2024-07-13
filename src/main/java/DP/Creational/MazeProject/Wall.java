package DP.Creational.MazeProject;

public class Wall extends MapSite{

    public Wall() {
    }

    @Override
    void Enter() {
        System.out.println("Te has golpeado contra un solido muro");
    }
}
