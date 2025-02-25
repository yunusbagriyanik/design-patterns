package com.yunusbagriyanik.designpatterns.structural.decorator.example2.design.compression;

import com.yunusbagriyanik.designpatterns.structural.decorator.example2.design.datasource.DataSourceDecorator;
import com.yunusbagriyanik.designpatterns.structural.decorator.example2.design.datasource.DataSource;
import lombok.extern.slf4j.Slf4j;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

@Slf4j
public class CompressedDataSourceDecorator extends DataSourceDecorator {
    private static final int COMPRESSION_LEVEL = 7;
    private static final int SIZE = 512;

    public CompressedDataSourceDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void write(String data) {
        super.write(compress(data));
    }

    @Override
    public String read() {
        return decompress(super.read());
    }

    private String compress(String stringData) {
        byte[] byteArrayData = stringData.getBytes();
        try {
            ByteArrayOutputStream byteArrayOutStream = new ByteArrayOutputStream(SIZE);
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutStream, new Deflater(COMPRESSION_LEVEL));
            deflaterOutputStream.write(byteArrayData);
            deflaterOutputStream.close();
            byteArrayOutStream.close();
            return Base64.getEncoder().encodeToString(byteArrayOutStream.toByteArray());
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    private String decompress(String stringData) {
        byte[] byteArrayData = Base64.getDecoder().decode(stringData);
        try {
            InputStream inputStream = new ByteArrayInputStream(byteArrayData);
            InflaterInputStream inflaterInStream = new InflaterInputStream(inputStream);
            ByteArrayOutputStream arrayOutStream = new ByteArrayOutputStream(SIZE);
            int b;
            while ((b = inflaterInStream.read()) != -1) {
                arrayOutStream.write(b);
            }
            inputStream.close();
            inflaterInStream.close();
            arrayOutStream.close();
            return arrayOutStream.toString();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
