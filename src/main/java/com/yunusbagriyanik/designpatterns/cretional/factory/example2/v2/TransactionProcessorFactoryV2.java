package com.yunusbagriyanik.designpatterns.cretional.factory.example2.v2;

import com.yunusbagriyanik.designpatterns.cretional.factory.example2.TransactionProcessor;

import java.util.HashMap;
import java.util.Map;

public class TransactionProcessorFactoryV2 {
    private static final Map<String, TransactionProcessor> processorMap = new HashMap<>();

    public static void registerProcessor(String blockchainType, TransactionProcessor processor) {
        processorMap.put(blockchainType.toLowerCase(), processor);
    }

    public static TransactionProcessor getProcessor(String blockchainType) {
        TransactionProcessor processor = processorMap.get(blockchainType.toLowerCase());
        if (processor == null) {
            throw new IllegalArgumentException("Unsupported blockchain type: " + blockchainType);
        }
        return processor;
    }
}
