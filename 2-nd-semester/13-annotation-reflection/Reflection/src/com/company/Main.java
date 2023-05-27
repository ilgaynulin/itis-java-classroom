package com.company;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        MyClass obj = new MyClass();

	    Class clazz = obj.getClass();
        System.out.println(clazz.getSimpleName());

        Method[] methods = clazz.getDeclaredMethods();

        for(Method m : methods) {
            try {
                System.out.println(m.getName());
                System.out.print("Анотации метода: ");
                for(Annotation a : m.getAnnotations()) {
                    System.out.print(a.toString() + ", ");
                }
                System.out.println("\nВызываем метод");
                m.setAccessible(true);
                m.invoke(obj);
                System.out.println("\n");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        invokeMethods(clazz, obj);

        Field[] fields = clazz.getDeclaredFields();

        for(Field field: fields) {
            System.out.println(field.getName());
            try {
                field.setAccessible(true);
                System.out.println(field.get(obj));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        Object newObjectFromReflection = null;
        try {
            Constructor constructor = clazz.getDeclaredConstructor(int.class, double.class);
            newObjectFromReflection = constructor.newInstance(5, 10.0);
            invokeMethods(clazz, newObjectFromReflection);
            System.out.println(newObjectFromReflection);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    public static void invokeMethods(Class clazz, Object obj) {
        for(Method m : clazz.getDeclaredMethods()) {
            try {
                System.out.println(m.getName());
                System.out.print("Анотации метода: ");
                for(Annotation a : m.getAnnotations()) {
                    System.out.print(a.toString() + ", ");
                }
                System.out.println("\nВызываем метод");
                m.setAccessible(true);
                Object o = m.invoke(obj);
                System.out.println(o);
                System.out.println("\n");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
