package service;

import entities.Figure;
import entities.Team;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class TeamService {
    public Team createTeam(Scanner scanner, FigureService figureService, ArrayList<Figure> figures) {
        System.out.println("Mời nhập tên của team:");
        String teamName = scanner.nextLine();
        System.out.println("Mời bạn nhập số vị tướng trong team:");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            Figure figure = figureService.createFigure(scanner, (i + 1));  //Khởi tạo tướng
            figures.add(figure);  //Thêm tướng vào team
        }
        return new Team(figures, teamName);   //Trả về thông tin của Team
    }
}
