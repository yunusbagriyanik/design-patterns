package com.yunusbagriyanik.designpatterns.decorator.example2.main;

import com.yunusbagriyanik.designpatterns.decorator.example2.design.datasource.DataSource;
import com.yunusbagriyanik.designpatterns.decorator.example2.design.datasource.DataSourceDecorator;
import com.yunusbagriyanik.designpatterns.decorator.example2.design.datasource.FileDataSource;
import com.yunusbagriyanik.designpatterns.decorator.example2.design.encryption.EncryptionDecorator;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoratorStarter {
    private static final String FILE_NAME = "src/main/resources/decorator.txt";

    public static void main(String[] args) {
        String input = "Hello World!";
        DataSourceDecorator encoded = new EncryptionDecorator(new FileDataSource(FILE_NAME));
        encoded.write(input);
        DataSource plain = new FileDataSource(FILE_NAME);
        log.info("\nEncoded\n{}", plain.read());
        log.info("\nDecoded\n{}", encoded.read());
    }
}
