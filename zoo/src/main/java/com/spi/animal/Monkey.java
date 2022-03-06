package com.spi.animal;

import com.ab.spi.animal.Animal;

public class Monkey implements Animal {
    @Override
    public void say() {
        System.out.println("猴子。。。。");
    }
}
