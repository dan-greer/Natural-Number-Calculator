package com.greer.calculator;

public abstract class NaturalNumberSecondary implements NaturalNumber {
    @Override
    public void add (NaturalNumber n) {

        // Get last digits
        int thisLastDig = this.divideBy10();
        int nLastDig = n.divideBy10();

        // Recursively go to the very first digit
        if (!n.isZero()) {
            this.add(n);
        }

        // Add the digits
        int totDig = thisLastDig + nLastDig;

        // If the total is greater than 10, take care of the carry
        if (totDig > 9) {
            totDig -= 10;
            this.increment();
        }

        // Put the digit back into this
        this.multiplyBy10(totDig);


    }

    @Override
    public void subtract (NaturalNumber n) {

        // Get last digits
        int thisLastDig = this.divideBy10();
        int nLastDig = n.divideBy10();

        // Recursively go to the very first digit
        if (!n.isZero()) {
            this.subtract(n);
        }

        // Subtract the digits
        int totDig = thisLastDig - nLastDig;

        // If the total is negative, borrow from the next digit
        if (totDig < 0) {
            totDig += 10;
            this.decrement();
        }

        // Put the digit back into this
        this.multiplyBy10(totDig);



    }

    @Override
    public void increment() {

        // If the number is 0, just make it 1, otherwise increment it properly
        if (this.isZero()) {
            NaturalNumber one = new NaturalNumber1("1");
            this.transferFrom(one);

        } else {

            // Get and increment the last digit
            int lastDig = this.divideBy10();
            int newDig = lastDig + 1;

            // If there's a carry, recursively take care of it
            if (newDig == 10) {
                newDig = 0;
                this.increment();
            }

            // Put the new digit back on
            this.multiplyBy10(newDig);
        }


    }

    @Override
    public void decrement() {

        // Get and decrement the last digit
        int lastDig = this.divideBy10();
        int newDig = lastDig - 1;

        // If there's a carry, recursively take care of it
        if (newDig == -1) {
            newDig = 9;
            this.decrement();
        }

        // Put the new digit back on
        this.multiplyBy10(newDig);


    }
}
