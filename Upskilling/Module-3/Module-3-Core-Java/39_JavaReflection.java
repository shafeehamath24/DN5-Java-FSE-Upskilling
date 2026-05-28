/* 39. Reflection in Java
• Objective: Use Java Reflection API.
• Task: Load a class and invoke methods dynamically.
• Instructions:
o Use Class.forName(), getDeclaredMethods(), and invoke() to call a method without directly referencing it in code.
o Print the method names and parameters. */

import java.lang.reflect.Method;

class JavaReflection {

    public void display() {

        System.out.println("Reflection Method Invoked");

    }

    public static void main(String[] args) {

        try {

            Class<?> cls = Class.forName("JavaReflection");

            Object obj = cls.getDeclaredConstructor().newInstance();

            Method[] methods = cls.getDeclaredMethods();

            System.out.println("Methods:");

            for (Method method : methods) {

                System.out.println(method.getName());

            }

            Method method = cls.getDeclaredMethod("display");

            method.invoke(obj);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }
    }
}