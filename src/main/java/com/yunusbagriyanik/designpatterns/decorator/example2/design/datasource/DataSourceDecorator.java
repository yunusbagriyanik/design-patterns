package com.yunusbagriyanik.designpatterns.decorator.example2.design.datasource;

public class DataSourceDecorator implements DataSource {
    private final DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void write(String content) {
        dataSource.write(content);
    }

    @Override
    public String read() {
        return dataSource.read();
    }
}
