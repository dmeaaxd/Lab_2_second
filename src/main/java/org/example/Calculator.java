package org.example;

public abstract class Calculator {

    protected double precision;

    public Calculator(double precision) {
        this.precision = precision;
    }

    public abstract double calc(double x);
}