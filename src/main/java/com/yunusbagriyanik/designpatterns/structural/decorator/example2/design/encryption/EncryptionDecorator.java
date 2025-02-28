package com.yunusbagriyanik.designpatterns.structural.decorator.example2.design.encryption;

import com.yunusbagriyanik.designpatterns.structural.decorator.example2.design.datasource.DataSource;
import com.yunusbagriyanik.designpatterns.structural.decorator.example2.design.datasource.DataSourceDecorator;

import java.util.Base64;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void write(String data) {
        super.write(encode(data));
    }

    @Override
    public String read() {
        return decode(super.read());
    }

    private String encode(String data) {
        byte[] dataBytes = data.getBytes();
        for (int i = 0; i < dataBytes.length; i++) {
            dataBytes[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(dataBytes);
    }

    private String decode(String data) {
        byte[] dataBytes = Base64.getDecoder().decode(data);
        for (int i = 0; i < dataBytes.length; i++) {
            dataBytes[i] -= (byte) 1;
        }
        return new String(dataBytes);
    }
}
