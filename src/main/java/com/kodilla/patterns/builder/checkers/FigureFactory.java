package com.kodilla.patterns.builder.checkers;

public class FigureFactory {
    private final static String PAWN = "Pawn";
    private final static String QUEEN = "Queen";

    public static Figure makeFigure(String figureType, String color){
        if (figureType.equals(PAWN)) {
            return new Pawn(color);
        }
        else if (figureType.equals(QUEEN)) {
            return new Queen(color);
        }
        else {
            throw new IllegalStateException("Type of figure should be pawn or queen");
        }
    }
}
