package com.hanan.ejinterfaz5;

//Escribe un programa Java para crear una interfaz Resizable con los métodos
// resizeWidth(int width) y resizeHeight(int height) que permitan cambiar el
// tamaño de un objeto. Crea una clase Rectangle que implemente la interfaz
// Resizable e implemente los métodos de cambio de tamaño.

public interface Resizable {
    int resizeWidth(int width);
    int resizeHeight(int height);
}
