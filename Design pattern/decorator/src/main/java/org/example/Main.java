package org.example;

import org.example.base.MilkTea;
import org.example.base.MilkTeaDecorator;
import org.example.decorator.*;

public class Main {
    public static void main(String[] args) {
        MilkTeaDecorator firstMilkTea = new EggPudding(new FruitPudding(new Bubble(new BlackSugar(new MilkTea()))));
        System.out.printf("EggPuddingFruitPuddingBubbleBlackSugarMilkTea cost is %s\n", firstMilkTea.cost());
        MilkTeaDecorator secondMilkTea = new EggPudding(new BlackSugar(new WhiteBubble(new MilkTea())));
        System.out.printf("EggPuddingBlackSugarWhiteBubbleMilkTea cost is %s\n", secondMilkTea.cost());
    }
}
