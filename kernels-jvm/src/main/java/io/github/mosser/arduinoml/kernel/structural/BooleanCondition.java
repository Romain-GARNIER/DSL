package io.github.mosser.arduinoml.kernel.structural;

public class BooleanCondition extends Condition {
    public Operator operator;

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

}
