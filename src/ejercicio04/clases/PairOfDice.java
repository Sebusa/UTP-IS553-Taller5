package ejercicio04.clases;

import java.util.Random;

public class PairOfDice implements Dice{
    private Integer dice1;
    private Integer dice2;
    Random randomRoll = new Random();

    @Override
    public void roll() {
        dice1 = randomRoll.nextInt(6)+1;
        dice2 = randomRoll.nextInt(6)+1;

        System.out.println("El valor del primer dado es: " + dice1);
        System.out.println("El valor del segundo dado es: " + dice2);
    }
}
