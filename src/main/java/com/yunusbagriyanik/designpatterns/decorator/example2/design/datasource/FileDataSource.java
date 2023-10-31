package com.yunusbagriyanik.designpatterns.decorator.example2.design.datasource;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.util.Objects;

@Slf4j
public class FileDataSource implements DataSource {
    private final String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void write(String content) {
        File file = new File(name);
        try (OutputStream outStream = new FileOutputStream(file)) {
            outStream.write(content.getBytes(), 0, content.length());
        } catch (IOException ex) {
            log.error("Write Error: {}", ex.getMessage());
        }
    }

    @Override
    public String read() {
        char[] buffer = null;
        File file = new File(name);
        try (FileReader fileReader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            fileReader.read(buffer);
        } catch (IOException ex) {
            log.error("Read Error: {}", ex.getMessage());
        }

        return new String(Objects.requireNonNull(buffer));
    }
}
