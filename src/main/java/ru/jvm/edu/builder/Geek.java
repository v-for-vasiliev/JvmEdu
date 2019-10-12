package ru.jvm.edu.builder;

public class Geek {

    private String name;

    private int experience;

    public Geek(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Geek{" +
            "name='" + name + '\'' +
            ", experience=" + experience +
            '}';
    }
}
