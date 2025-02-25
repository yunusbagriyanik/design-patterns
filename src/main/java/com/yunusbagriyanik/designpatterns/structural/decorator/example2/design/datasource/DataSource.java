package com.yunusbagriyanik.designpatterns.structural.decorator.example2.design.datasource;

public interface DataSource {
    void write(String content);

    String read();
}
