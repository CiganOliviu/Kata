package FactorialProcessor;

public class FactorialProcessor implements IFactorialProcessor {

    @Override
    public int GetFactorialNumber(int Factor) {

        if (Factor == 0) return 1;

        return Factor * GetFactorialNumber(Factor - 1);
    }
}
