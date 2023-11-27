package com.example.conversor;

public class Conversion {
    private double usd;
    private double mxn;
    private final double usdValue = 17.12d;
    private final double mxnValue = 0.05841121;

    public Conversion(double usd, double mxn) {
        this.usd = usd;
        this.mxn = mxn;
    }

    public Conversion(double mxn) {
        this.usd = usd;
        this.mxn = mxn;
    }

    public double mxnToUsd(){
        return mxn / usdValue;
    }

    public double usdToMxn(){
        return usdValue * mxn;
    }

    public double getUsd() {
        return usd;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }

    public double getMxn() {
        return mxn;
    }

    public void setMxn(double mxn) {
        this.mxn = mxn;
    }

    public double getUsdValue() {
        return usdValue;
    }

    public double getMxnValue() {
        return mxnValue;
    }
}
