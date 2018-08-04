package com.greer.calculator;

public interface NaturalNumberKernel {

    /**
     * Sets this back to the default value.
     */
    void clear();

    /**
     * Replaces the value of this with n.
     *
     * @param n the value to replace this
     * @clears n
     */
    void transferFrom(NaturalNumber n);

    /** Converts this to a String.
     *
     * @return this as a String
     */
    String toString();

    /**
     * Multiplies this by 10 and adds n.
     *
     * @param n the number to be added
     * @requires 0 <= n < 10
     * @ensures this = 10 * #this + n
     */
    void multiplyBy10(int n);

    /**
     * Divides this by 10 and returns the remainder.
     *
     * @return the remainder
     * @ensures 0 <= divideBy10 < 10
     */
    int divideBy10();

    /**
     * Reports whether this is zero.
     *
     * @return true iff this is zero
     */
    boolean isZero();
}
