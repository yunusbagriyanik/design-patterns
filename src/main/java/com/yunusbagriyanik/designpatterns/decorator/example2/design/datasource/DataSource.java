package com.yunusbagriyanik.designpatterns.decorator.example2.design.datasource;

public interface DataSource {
    void write(String content);

    String read();
}
