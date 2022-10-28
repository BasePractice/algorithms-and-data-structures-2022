package ru.mirea.practice.task4;

import java.util.Objects;

public class Computer  {

    private String Name;
    private String Color;
    private String GraphicCard;
    private String MemoryCard;

    public void setColor(String color) {
        Color = color;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getColor() {
        return Color;
    }

    public String getGraphicCard() {
        return GraphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        GraphicCard = graphicCard;
    }

    public String getMemoryCard() {
        return MemoryCard;
    }

    public void setMemoryCard(String memoryCard) {
        MemoryCard = memoryCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(Name, computer.Name) && Objects.equals(Color, computer.Color) && Objects.equals(GraphicCard, computer.GraphicCard) && Objects.equals(MemoryCard, computer.MemoryCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash( Name, Color, GraphicCard, MemoryCard);
    }


}
