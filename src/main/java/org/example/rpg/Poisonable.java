package org.example.rpg;

public interface Poisonable {

    default double poison(){
        return Constant.POISON_PERCENTAGE;
    }
}
