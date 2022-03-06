package com.spi;

import com.ab.spi.animal.Animal;

import java.util.Iterator;
import java.util.ServiceLoader;

public class zoo {

    public static void main(String[] args) {
        ServiceLoader<Animal> load = ServiceLoader.load(Animal.class);
        Iterator<Animal> iterator = load.iterator();
        while (iterator.hasNext()){
            iterator.next().say();
        }
    }
}
