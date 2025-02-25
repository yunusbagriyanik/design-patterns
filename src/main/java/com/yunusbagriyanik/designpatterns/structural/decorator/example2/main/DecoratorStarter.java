package com.yunusbagriyanik.designpatterns.structural.decorator.example2.main;

import com.yunusbagriyanik.designpatterns.structural.decorator.example2.design.datasource.DataSourceDecorator;
import com.yunusbagriyanik.designpatterns.structural.decorator.example2.design.compression.CompressedDataSourceDecorator;
import com.yunusbagriyanik.designpatterns.structural.decorator.example2.design.datasource.DataSource;
import com.yunusbagriyanik.designpatterns.structural.decorator.example2.design.datasource.FileDataSource;
import com.yunusbagriyanik.designpatterns.structural.decorator.example2.design.encryption.EncryptionDecorator;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoratorStarter {
    private static final String FILE_NAME = "src/main/resources/decorator.txt";

    public static void main(String[] args) {
        DataSource plain = new FileDataSource(FILE_NAME);

        String input = "Hello World!";
        DataSourceDecorator encoded = new EncryptionDecorator(new FileDataSource(FILE_NAME));
        encoded.write(input);
        log.info("\nEncoded\n{}", plain.read());
        log.info("\nDecoded\n{}", encoded.read());

        System.out.println("**");
        DataSourceDecorator encodedCompDecorator = new CompressedDataSourceDecorator(new EncryptionDecorator(new FileDataSource(FILE_NAME)));
        encodedCompDecorator.write(input);
        log.info("\nEncoded\n{}", plain.read());
        log.info("\nDecoded\n{}", encodedCompDecorator.read());
    }
}
