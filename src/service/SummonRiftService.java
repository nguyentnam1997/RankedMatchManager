package service;

import entities.Figure;
import entities.SummonRift;
import entities.Team;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class SummonRiftService {
    public SummonRift createMatch(Scanner scanner, TeamService teamService, FigureService figureService, ArrayList<Figure> figures, ArrayList<Team> team1, ArrayList<Team> team2) {
        System.out.println("Mời nhập thời gian trận đấu:");
        String timeString = scanner.nextLine();
        LocalDateTime timeStart = LocalDateTime.parse(timeString, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                System.out.println("======= Thông tin team thứ " + (i + 1) + " ========");
                Team team = teamService.createTeam(scanner, figureService, figures);  //Khởi tạo 1 team bao gồm ... tướng
                team1.add(team);    //Thêm 1 team vào mảng các team (teams)
            }
            else {
                figures.clear();
                System.out.println("======= Thông tin team thứ " + (i + 1) + " ========");
                Team team = teamService.createTeam(scanner, figureService, figures);  //Khởi tạo 1 team bao gồm ... tướng
                team2.add(team);    //Thêm 1 team vào mảng các team (teams)
            }

        }
        return new SummonRift(team1, team2, timeStart);   //Trả về thông tin của trận đấu`
    }
}
