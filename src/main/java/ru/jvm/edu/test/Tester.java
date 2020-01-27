package ru.jvm.edu.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Tester {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TestableHuman human = new TestableHuman();
        Tester.start(TestableHuman.class, human);
    }

    public static void start(Class clazz, Object object) throws InvocationTargetException, IllegalAccessException {
        if (getAnnotatedMethods(clazz, BeforeSuit.class).size() > 1) {
            throw new RuntimeException("More than one BeforeSuit.class annotated methods found");
        }
        if (getAnnotatedMethods(clazz, AfterSuit.class).size() > 1) {
            throw new RuntimeException("More than one AfterSuit.class annotated methods found");
        }
        List<Method> before = getAnnotatedMethods(clazz, BeforeSuit.class);
        before.get(0).invoke(object);

        List<Method> tests = getAnnotatedMethods(clazz, Test.class);
        Collections.sort(tests, new Comparator<Method>() {
            @Override
            public int compare(Method o1, Method o2) {
                if (o1.getAnnotation(Test.class).priority() == o2.getAnnotation(Test.class).priority()) {
                    return 0;
                }
                if (o1.getAnnotation(Test.class).priority() < o2.getAnnotation(Test.class).priority()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        for (Method test : tests) {
            test.invoke(object);
        }

        List<Method> after = getAnnotatedMethods(clazz, AfterSuit.class);
        after.get(0).invoke(object);
    }

    private static List<Method> getAnnotatedMethods(Class clazz, Class<? extends Annotation> annotationClass) {
        List<Method> foundMethods = new ArrayList<>();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(annotationClass)) {
                foundMethods.add(m);
            }
        }
        return foundMethods;
    }
}
