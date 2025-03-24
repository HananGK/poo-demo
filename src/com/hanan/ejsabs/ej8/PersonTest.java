package com.hanan.ejsabs.ej8;

public class PersonTest {
    public static void main(String[] args) {
        LazyPerson perezoso =  new LazyPerson();
        Athlete atleta =  new Athlete();

        Person[] personas = {perezoso,atleta};
        for (Person persona : personas){
            persona.eat();
            persona.exercise();
        }
    }

}
