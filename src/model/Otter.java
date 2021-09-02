/**
 * @author NAE (Noah Ertz) - naertz
 * CIS-175 - Fall 2021
 * Sep 2, 2021
 */

package model;

public class Otter {
    // Instance Variable(s) ==========
    private String species; // Species
    private int age;        // Age
    private double length;  // Length
    // ===============================
    
    // Constructor(s) ====================================
    // Default
    public Otter() {
        setSpecies("Unknown");
        setAge(0);
        setLength(2.0);
    }
    
    // Main
    public Otter(String species, int age, double length) {
        setSpecies(species);
        setAge(age);
        setLength(length);
    }
    // ===================================================
    
    // Setter(s) ===========================
    // Species
    public void setSpecies(String species) {
        this.species = species;
    }
    
    // Age
    public void setAge(int age) {
        this.age = age;
    }
    
    // Length
    public void setLength(double length) {
        this.length = length;
    }
    // =====================================
    
    // Getter(s) ===============
    // Species
    public String getSpecies() {
        return species;
    }
    
    // Age
    public int getAge() {
        return age;
    }
    
    // Length
    public double getLength() {
        return length;
    }
    // =========================
    
    // Helper Method(s) =================================================================
    // Speak
    public String speak() {
        return "chirp";
    }
    
    // toString Override
    @Override
    public String toString() {
        return "Otter [species=" + species + ", age=" + age + ", length=" + length + "]";
    }
    // ==================================================================================
}
