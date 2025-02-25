package com.yunusbagriyanik.designpatterns.cretional.builder;

public class HTMLBuilder {
    private final StringBuilder html;

    public HTMLBuilder() {
        html = new StringBuilder();
    }

    public HTMLBuilder addTitle(String title) {
        html.append("<h1>").append(title).append("</h1>");
        return this;
    }

    public HTMLBuilder addParagraph(String text) {
        html.append("<p>").append(text).append("</p>");
        return this;
    }

    public String build() {
        return html.toString();
    }

    public HTMLBuilder addSourceLink(String url) {
        html.append("<p>Source: <a href=\"").append(url).append("\">").append(url).append("</a></p>");
        return this;
    }
}
