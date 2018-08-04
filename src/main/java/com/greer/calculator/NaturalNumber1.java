package com.greer.calculator;
import java.util.LinkedList;

public class NaturalNumber1 extends NaturalNumberSecondary {

    private LinkedList<Integer> rep;

    private void createNewRep() {
        this.rep = new LinkedList<>();
    }

    /* Constructor Implementations */
    public NaturalNumber1() {
        this.createNewRep();
    }

    public NaturalNumber1(String s) {
        this.createNewRep();

        // Turns the characters into digits and adds them
        char[] characters = s.toCharArray();
        for (char x: characters) {
            this.rep.add(Character.digit(x, 10));
        }
    }

    /* Kernel Implementation */

    @Override
    public void clear() {
        this.createNewRep();
    }

    @Override
    public void transferFrom(NaturalNumber n) {
        NaturalNumber1 localSource = (NaturalNumber1) n;
        this.rep = localSource.rep;
        localSource.createNewRep();

    }

    @Override
    public String toString() {
        StringBuilder natNumString = new StringBuilder();

        // Remove any leading zeroes
        while (this.rep.getFirst() == 0) {
            this.rep.removeFirst();
        }

        // Create a string of all the digits
        for (Integer x: this.rep) {
            natNumString.append(x);
        }

        return natNumString.toString();
    }


    @Override
    public void multiplyBy10(int n) {
        this.rep.add(n);
    }

    @Override
    public int divideBy10() {
        return this.rep.removeLast();
    }

    @Override
    public boolean isZero() {
        boolean isZero = false;
        if (this.rep.size() == 0) {
            isZero = true;
        }
        return isZero;
    }
}
