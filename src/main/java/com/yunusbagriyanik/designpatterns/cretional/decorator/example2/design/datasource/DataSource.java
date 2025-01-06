package com.yunusbagriyanik.designpatterns.cretional.decorator.example2.design.datasource;

public interface DataSource {
    void write(String content);

    String read();
}
