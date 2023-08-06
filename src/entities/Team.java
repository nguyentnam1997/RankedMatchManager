package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Team {
    private ArrayList<Figure> figures;
    private String teamName;

    public Team(ArrayList<Figure> figures, String teamName) {
        this.figures = figures;
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public ArrayList<Figure> getFigures() {
        return figures;
    }

    public void setFigures(ArrayList<Figure> figures) {
        this.figures = figures;
    }

    @Override
    public String toString() {
        return "figures=" + figures +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}
