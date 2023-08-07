package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class SummonRift {
    private ArrayList<Team> team1;
    private ArrayList<Team> team2;
    private LocalDateTime timeStart;


    public SummonRift(ArrayList<Team> team1, ArrayList<Team> team2, LocalDateTime timeStart) {
        this.team1 = team1;
        this.team2 = team2;
        this.timeStart = timeStart;
    }

    public ArrayList<Team> getTeam1() {
        return team1;
    }

    public void setTeam1(ArrayList<Team> team1) {
        this.team1 = team1;
    }

    public ArrayList<Team> getTeam2() {
        return team2;
    }

    public void setTeam2(ArrayList<Team> team2) {
        this.team2 = team2;
    }

    public LocalDateTime getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(LocalDateTime timeStart) {
        this.timeStart = timeStart;
    }

    @Override
    public String toString() {
        return "======== SummonRift =======" + "\n" +
                "Thời gian bắt đầu trận đấu: " + timeStart + "\n" +
                "------- Đội hình team 1 ---------" + "\n" + team1 + "\n" +
                "------- Đội hình team 2 ---------" + "\n" +team2;
    }
}
