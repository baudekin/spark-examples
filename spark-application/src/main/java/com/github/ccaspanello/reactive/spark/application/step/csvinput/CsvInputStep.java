package com.github.ccaspanello.reactive.spark.application.step.csvinput;

import com.github.ccaspanello.reactive.spark.application.step.BaseStep;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ccaspanello on 12/19/2016.
 */
public class CsvInputStep extends BaseStep<CsvInputMeta> {

    private static final Logger LOG = LoggerFactory.getLogger(CsvInputStep.class);

    public CsvInputStep(CsvInputMeta meta) {
        super(meta);
    }

    @Override
    public void execute() {
        Dataset<Row> result = getSparkSession().read()
                .format("com.databricks.spark.csv")
                .option("header", true)
                .option("inferSchema", true)
                .load(getStepMeta().getFilename());
        LOG.info("{} - Read: {}", getStepMeta().getName(), result.count());

        setData(result);
    }
}
