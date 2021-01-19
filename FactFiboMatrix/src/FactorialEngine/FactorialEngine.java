package FactorialEngine;

public class FactorialEngine implements IFactorialEngine {

    @Override
    public int getFactorialNumber(int index) {

        if (isNumberOne(index))
            return 1;

        return index * getFactorialNumber(index - 1);
    }

    private boolean isNumberOne(int index) {

        return index == 1;
    }
}
