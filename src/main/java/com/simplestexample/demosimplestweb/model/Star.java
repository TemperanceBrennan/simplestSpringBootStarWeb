package com.simplestexample.demosimplestweb.model;


public class Star {

    private String starName;
    private String starDesignator;
    private String starOfConstellation;


    public Star(String starName, String starDesignator, String starOfConstellation) {
        this.starName = starName;
        this.starDesignator = starDesignator;
        this.starOfConstellation = starOfConstellation;
    }

    public String getStarName() {
        return starName;
    }

    public String getStarDesignator() {
        return starDesignator;
    }

    public String getStarOfConstellation() {
        return starOfConstellation;
    }

    @Override
    public String toString() {
        return "Star{" +
                "Name of the Star='" + starName + '\'' +
                ", designator='" + starDesignator + '\'' +
                ", of Constellation='" + starOfConstellation + '\'' +
                '}';
    }
}
