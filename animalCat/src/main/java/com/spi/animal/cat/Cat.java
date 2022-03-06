package com.spi.animal.cat;

import com.ab.spi.animal.Animal;

public class Cat implements Animal {
    @Override
    public void say() {
        System.out.println("猫  喵喵喵");
    }
}
