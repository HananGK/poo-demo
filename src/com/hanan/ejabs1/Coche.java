package com.hanan.ejabs1;

/*Crear un objeto de tipo Coche, donde declararemos en la superclase los metodos
getModel, getColor y getMaxSpeed. Esta clase se completara con dos metodos abstractos:
acelerar() y frenar(). Se deben crear al menos tres clases distintas que extiendan
de la clase Coche.
*/

public abstract class Coche {
    private String model;
    private String color;
    private int maxSpeed;

    public Coche(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public abstract void acelerar();

    public abstract void frenar();
}
