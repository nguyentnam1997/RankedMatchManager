package service;

import entities.Figure;

import java.util.Scanner;

public class FigureService {
    public Figure createFigure(Scanner scanner, int index) {
        System.out.println("----- VỊ TƯỚNG THỨ " + index + "-----");
        System.out.println("Mời nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Mời nhập vị trí:");
        String position = scanner.nextLine();
        return new Figure(name, position);
    }
}
