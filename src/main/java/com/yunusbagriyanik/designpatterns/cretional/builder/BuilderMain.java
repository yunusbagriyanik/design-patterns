package com.yunusbagriyanik.designpatterns.cretional.builder;

public class BuilderMain {
    public static void main(String[] args) {
        HTMLBuilder htmlBuilder = new HTMLBuilder();
        String html = htmlBuilder.addTitle("Builder Pattern")
                .addParagraph("Builder Pattern - Creational Category")
                .addParagraph("The builder pattern separates the construction of a complex object from its representation.")
                .addSourceLink("https://en.wikipedia.org/wiki/Builder_pattern")
                .build();
        System.out.println(html);
    }
}
