import entities.Figure;
import entities.SummonRift;
import entities.Team;
import service.FigureService;
import service.SummonRiftService;
import service.TeamService;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TeamService teamService = new TeamService();
        FigureService figureService = new FigureService();
        SummonRiftService summonRiftService = new SummonRiftService();

        ArrayList<Figure> figures1 = new ArrayList<>();
        ArrayList<Figure> figures2 = new ArrayList<>();
        ArrayList<Team> team1 = new ArrayList<>();
        ArrayList<Team> team2 = new ArrayList<>();

        SummonRift summonRift = summonRiftService.createMatch(scanner, teamService, figureService,figures1, figures2, team1, team2);
        System.out.println(summonRift);
    }
}