package ru.mirea.practice.work2;

interface AbstractChairFactory {
    VictorianChair createVictorianChair();

    MagicChair createMagicChair();

    Functionalchair createFunctionalchair();
}
