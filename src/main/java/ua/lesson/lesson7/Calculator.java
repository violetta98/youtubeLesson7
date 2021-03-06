package ua.lesson.lesson7;

/**
 * Created by Violetta on 12-07-2017.
 */
public class Calculator {
    private int result;

    public void add(int ... params) { // переменное количество аргументов (Создается массив int params[] и в него
        for (int param : params)      // будут записаны переданные параметры. То есть количество элементов в массиве
            this.result += param;     // определяется тем, сколько будет передано аргументов и каждый раз это количество
    }                                 // может быть разным﻿

    public void div(int ... args) throws UserException, IllegalArgumentException {
        if (args.length > 0) {
            result = args[0];
            for (int arg : args) {
                if (arg == 0)
                    throw new IllegalArgumentException("You try to divide by zero. Please, change argument!");
                result /= arg;
            }
        }
        else
            throw new UserException("There are not any args!");
    }

    public int getResult() {
        return this.result;
    }

    public void cleanResult() {
        this.result = 0;
    }
}
