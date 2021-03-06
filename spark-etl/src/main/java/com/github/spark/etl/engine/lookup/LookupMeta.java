package com.github.spark.etl.engine.lookup;

import com.github.spark.etl.engine.BaseStepMeta;

/**
 * Lookup Step Meta Model
 *
 * Created by ccaspanello on 12/19/2016.
 */
public class LookupMeta extends BaseStepMeta {

    private String leftStep;
    private String rightStep;
    private String field;

    //<editor-fold desc="Getters & Setters">
    public LookupMeta(String name) {
        super(name);
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getLeftStep() {
        return leftStep;
    }

    public void setLeftStep(String leftStep) {
        this.leftStep = leftStep;
    }

    public String getRightStep() {
        return rightStep;
    }

    public void setRightStep(String rightStep) {
        this.rightStep = rightStep;
    }
    //</editor-fold>
}
