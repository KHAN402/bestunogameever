/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author mahme
 */
public class Carde {

    public enum Suit {
        RED, BLUE, GREEN, YELLOW
    };

    public enum Value {
        ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
        NINE, SKIP, REVERSE, DRAWTWO, DRAWFOUR, WILD
    };
    private final Suit suit;
    private final Value value;

    public Carde(Suit s, Value gVal) {
        suit = s;
        value = gVal;
    }

    public Value getValue() {
        return this.value;
    }

    public Suit getSuit() {
        return this.suit;
    }

}
