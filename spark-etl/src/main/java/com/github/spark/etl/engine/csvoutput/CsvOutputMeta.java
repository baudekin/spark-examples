package com.github.spark.etl.engine.csvoutput;

import com.github.spark.etl.engine.BaseStepMeta;

/**
 * CSV Output Step Meta Model
 *
 * Created by ccaspanello on 12/19/2016.
 */
public class CsvOutputMeta extends BaseStepMeta {

    private String filename;

    public CsvOutputMeta(String name) {
        super(name);
    }

    //<editor-fold desc="Getters & Setters">
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
    //</editor-fold>
}
