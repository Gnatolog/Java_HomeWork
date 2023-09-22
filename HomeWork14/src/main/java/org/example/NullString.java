package org.example;

public class NullString extends Exception{

    private static final int error = 404;
    @Override
    public String toString() {
        return String.format("Ошибка ввода пустой строки %d", error);
    }
}
