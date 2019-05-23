package com.ivan.design.principle.demter;

public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.Command(teamLeader);
    }
}
