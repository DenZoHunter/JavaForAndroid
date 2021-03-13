package ru.geekbrains.lesson9;

public class MyArrayDataException extends Exception{
    int i,j;

    MyArrayDataException(int i,int j) {
        this.i = i;
        this.j = j;
    }
}
