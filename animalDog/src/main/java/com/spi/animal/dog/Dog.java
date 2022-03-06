package com.spi.animal.dog;

import com.ab.spi.animal.Animal;

public class Dog implements Animal {
    @Override
    public void say() {
        System.out.println("狗  汪汪汪");
    }
}
