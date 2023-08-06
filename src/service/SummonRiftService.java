package service;

import entities.Figure;
import entities.SummonRift;
import entities.Team;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class SummonRiftService {
    public SummonRift createMatch(Scanner scanner, TeamService teamService, FigureService figureService, ArrayList<Team> teams, ArrayList<Figure> figures) {
        System.out.println("Mời nhập thời gian trận đấu:");
        String timeString = scanner.nextLine();
        LocalDateTime timeStart = LocalDateTime.parse(timeString, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        for (int i = 0; i < 2; i++) {
            System.out.println("======= Thông tin team thứ " + (i + 1) + " ========");
            Team team = teamService.createTeam(scanner, figureService, figures);
            teams.add(team);
        }
        return new SummonRift(teams, timeStart);
    }
}
