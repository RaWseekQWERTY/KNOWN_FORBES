/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.knownforbes.models;

/**
 *
 * @author Rasik Kayastha
 */
public class KnownForbes {

    /**
     * variable Declaration*
     */
    private int rank;
    private String fullName;
    private double networth;
    private int age;
    private String gender;
    private String country;
    private String source;
    private int philanthropyScore;

    /**
     * Constructor*
     */
    public KnownForbes(int rank, String fullName, double Networth, int age, String gender, String country, String source, int philanthropyScore) {
        this.rank = rank;
        this.fullName = fullName;
        this.networth = Networth;
        this.age = age;
        this.gender = gender;
        this.country = country;
        this.source = source;
        this.philanthropyScore = philanthropyScore;
    }

    /**
     * Getter ( Accessor) method of Rank*
     */
    public int getRank() {
        return rank;
    }

    /**
     * Getter ( Accessor) method of fullname*
     */

    public String getFullName() {
        return fullName;
    }

    /**
     * Getter ( Accessor) method of networth*
     */

    public double getNetworth() {
        return networth;
    }

    /**
     * Getter ( Accessor) method of age*
     */

    public int getAge() {
        return age;
    }

    /**
     * Getter ( Accessor) method of gender*
     */

    public String getGender() {
        return gender;
    }

    /**
     * Getter ( Accessor) method of country*
     */

    public String getCountry() {
        return country;
    }

    /**
     * Getter ( Accessor) method of source*
     */

    public String getSource() {
        return source;
    }

    /**
     * Getter ( Accessor) method of score*
     */

    public int getPhilanthropyScore() {
        return philanthropyScore;
    }

    /**
     * Setter (Mutator) method of Rank*
     */

    public void setRank(int rank) {
        this.rank = rank;
    }

    /**
     * Setter (Mutator) method of name*
     */

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Setter (Mutator) method of networth*
     */

    public void setNetworth(double Networth) {
        this.networth = Networth;
    }

    /**
     * Setter (Mutator) method of age*
     */

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Setter (Mutator) method of gender*
     */

    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Setter (Mutator) method of country*
     */

    public void setCoutry(String country) {
        this.country = country;
    }

    /**
     * Setter (Mutator) method of source*
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Setter (Mutator) method of score*
     */

    public void setPhilanthropyScore(int philanthropyScore) {
        this.philanthropyScore = philanthropyScore;
    }

    // Update method to modify the attributes of the KnownForbes object
    public void updateForbes(int rank, String fullName, double networth, int age,
            String gender, String country, String source, int philScore) {
        this.rank = rank;
        this.fullName = fullName;
        this.networth = networth;
        this.age = age;
        this.gender = gender;
        this.country = country;
        this.source = source;
        this.philanthropyScore = philScore;
    }
}
