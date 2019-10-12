package ru.jvm.edu.oop;

import ru.jvm.edu.oop.incapsulation.iface.Animal;
import ru.jvm.edu.oop.incapsulation.iface.Cat;
import ru.jvm.edu.oop.incapsulation.iface.Fox;
import ru.jvm.edu.oop.inheritance.Spotify;
import ru.jvm.edu.oop.inheritance.SpotifyPremium;
import ru.jvm.edu.oop.polymorphism.AbdulTukTuk;
import ru.jvm.edu.oop.polymorphism.TukTuk;

import java.util.Arrays;
import java.util.List;

public class OOPTests {

    public static void launch() {
        incapsulationTest();
        inheritanceTest();
        polymorphismTest();
    }

    public static void incapsulationTest() {
        triggerAnimal(new Cat());
        triggerAnimal(new Fox());
    }

    private static void triggerAnimal(Animal animal) {
        animal.say();
    }

    public static void inheritanceTest() {
        Spotify spotify = new Spotify();
        SpotifyPremium spotifyPremium = new SpotifyPremium();
        spotify.playShuffle();
        spotifyPremium.playShuffle();
        spotifyPremium.playMyOrder();
    }

    public static void polymorphismTest() {
        List<TukTuk> availableTukTuks = Arrays.asList(new TukTuk(), new AbdulTukTuk());
        for (TukTuk tukTuk : availableTukTuks) {
            tukTuk.askPrice();
        }
    }
}
