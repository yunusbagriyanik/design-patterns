package com.yunusbagriyanik.designpatterns.cretional.factory.example2;

public class TransactionProcessorFactory {
    public static TransactionProcessor getProcessor(String blockchainType) {
        return switch (blockchainType.toLowerCase()) {
            case "bitcoin" -> new BitcoinTransactionProcessor();
            case "ethereum" -> new EthereumTransactionProcessor();
            default -> throw new IllegalArgumentException("Unsupported blockchain type: " + blockchainType);
        };
    }
}
