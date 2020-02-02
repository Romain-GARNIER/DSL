package io.github.mosser.arduinoml.kernel.behavioral;

import io.github.mosser.arduinoml.kernel.generator.Visitable;
import io.github.mosser.arduinoml.kernel.generator.Visitor;
import io.github.mosser.arduinoml.kernel.structural.BooleanCondition;
import io.github.mosser.arduinoml.kernel.structural.Condition;

import java.util.ArrayList;

public class SinkError  implements Visitable {
    private Condition condition;
    private ArrayList<BooleanCondition> booleanConditions = new ArrayList<>();
    int value;

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public ArrayList<BooleanCondition> getBooleanConditions() {
        return booleanConditions;
    }

    public void setBooleanConditions(ArrayList<BooleanCondition> booleanConditions) {
        this.booleanConditions = booleanConditions;
    }

    public void addBooleanCondition(BooleanCondition condition){
        booleanConditions.add(condition);
    }

    public SinkError(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
