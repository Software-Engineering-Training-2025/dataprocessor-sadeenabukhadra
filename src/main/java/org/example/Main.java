package org.example;

import org.example.dataprocessor.DataProcessor;
import org.example.dataprocessor.Clean.Clean;
import org.example.dataprocessor.enums.*;
import org.example.dataprocessor.analysis.*;
import org.example.dataprocessor.output.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        DataProcessor dp = new DataProcessor();
        dp.process(CleaningType.REMOVE_NEGATIVES,
                AnalysisType.MEAN,
                OutputType.CONSOLE,
                Arrays.asList(5, -2, 7, 8));
    }
}
