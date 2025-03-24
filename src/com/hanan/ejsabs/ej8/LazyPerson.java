package com.hanan.ejsabs.ej8;

public class LazyPerson extends Person{
    @Override
    public void eat() {
        System.out.println("Perezoso comiendo McDonald's");
    }

    @Override
    public void exercise() {
        System.out.println("EL flojo solo se mueve del sofá a la nevera para coger su cerveza");
    }
}
