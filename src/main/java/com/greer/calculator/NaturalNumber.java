package com.greer.calculator;

public interface NaturalNumber extends NaturalNumberKernel {
    /**
     * Adds n to this.
     *
     * @param n
     * @requires |this| >= |n|
     */
    void add(NaturalNumber n);

    /**
     * Subtracts n from this.
     *
     * @param n
     * @requires this >= n
     */
    void subtract(NaturalNumber n);

    /**
     * Adds one to this.
     */
    void increment();

    /**
     * Subtracts one from this.
     */
    void decrement();
}
