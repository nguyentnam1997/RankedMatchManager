import entities.Figure;
import entities.SummonRift;
import entities.Team;
import service.FigureService;
import service.SummonRiftService;
import service.TeamService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TeamService teamService = new TeamService();
        FigureService figureService = new FigureService();
        SummonRiftService summonRiftService = new SummonRiftService();

        ArrayList<Figure> figures = new ArrayList<>();
        ArrayList<Team> teams = new ArrayList<>();

        SummonRift summonRift = summonRiftService.createMatch(scanner, teamService, figureService, teams, figures);
        System.out.println(summonRift);
    }
}