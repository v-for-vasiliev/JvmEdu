package ru.jvm.edu.builder;

public class BuilderTests {

    public static void launch() {
        GeekBuilder geekBuilder = new GeekBuilder();
        createDeveloperVasya(geekBuilder);
        createJunior(geekBuilder);
        System.out.println(geekBuilder.build());
    }

    private static void createDeveloperVasya(GeekBuilder geekBuilder) {
        geekBuilder.setName("Vasya");
    }

    private static void createJunior(GeekBuilder geekBuilder) {
        geekBuilder.setExperience(1);
    }

    private static void createMiddle(GeekBuilder geekBuilder) {
        geekBuilder.setExperience(3);
    }
}
