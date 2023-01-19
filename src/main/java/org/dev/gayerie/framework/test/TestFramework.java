package org.dev.gayerie.framework.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestFramework {
    public static void run(Object o) {
        Method[] methods = o.getClass().getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                runTest(o, method);
            }
        }
    }

    private static void runTest(Object o, Method method) {
        try {
            method.invoke(o);
            System.out.println("Test " + method.getName() + " ok");
        } catch (InvocationTargetException e) {
            System.err.println("Test " + method.getName() + " ko");
            e.getTargetException().printStackTrace();
        } catch (Exception e) {
            System.err.println("Test " + method.getName() + " ko");
            e.printStackTrace();
        }
    }
}
