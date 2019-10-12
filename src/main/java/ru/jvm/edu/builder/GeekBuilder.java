package ru.jvm.edu.builder;

public class GeekBuilder {

    private String name;

    private int experience;

    public GeekBuilder() {

    }

    public GeekBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public GeekBuilder setExperience(int experience) {
        this.experience = experience;
        return this;
    }

    public Geek build() {
        return new Geek(name, experience);
    }
}
