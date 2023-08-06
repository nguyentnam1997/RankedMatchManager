package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class SummonRift {
    private ArrayList<Team> teams;

    private LocalDateTime timeStart;

    public SummonRift(ArrayList<Team> teams, LocalDateTime timeStart) {
        this.teams = teams;
        this.timeStart = timeStart;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
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
                ", Thời gian bắt đầu trận đấu" + timeStart +
                "zTeam" + "\n" +teams +
                '}';
    }
}
