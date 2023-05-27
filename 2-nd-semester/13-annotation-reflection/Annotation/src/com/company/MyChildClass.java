package com.company;

import com.company.annotation.MyAnnotation;

@Deprecated
public class MyChildClass extends MyClass {
    @MyAnnotation
    @Deprecated
    private int field;

    @Override
    @MyAnnotation
    public void myMethod(@MyAnnotation int i) {

    }
}
