package ru.mirea.practice.task2;

interface AbstractChairFactory {
    VictorianChair createVictorianChair();

    MagicChair createMagicChair();

    Functionalchair createFunctionalchair();
}