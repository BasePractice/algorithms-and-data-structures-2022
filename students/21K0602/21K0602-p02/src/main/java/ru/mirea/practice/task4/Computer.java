package ru.mirea.practice.task4;

import java.util.Objects;

public class Computer {

    private String name;
    private String color;
    private String graphicCard;
    private String memoryCard;

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String getMemoryCard() {
        return memoryCard;
    }

    public void setMemoryCard(String memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Computer computer = (Computer) o;
        return Objects.equals(name, computer.name) && Objects.equals(color, computer.color)
                && Objects.equals(graphicCard, computer.graphicCard)
                && Objects.equals(memoryCard, computer.memoryCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, graphicCard, memoryCard);
    }
}
