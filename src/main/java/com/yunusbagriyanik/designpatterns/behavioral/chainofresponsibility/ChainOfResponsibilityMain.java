package com.yunusbagriyanik.designpatterns.behavioral.chainofresponsibility;

public class ChainOfResponsibilityMain {
    public static void main(String[] args) {
        SupportHandler lowLevelSupport = new LowLevelSupportHandler();
        SupportHandler mediumLevelSupport = new MediumLevelSupportHandler();
        SupportHandler highLevelSupport = new HighLevelSupportHandler();

        lowLevelSupport.setNextHandler(mediumLevelSupport);
        mediumLevelSupport.setNextHandler(highLevelSupport);

        SupportRequest simpleRequest = new SupportRequest("low issue", SupportRequestType.LOW);
        SupportRequest mediumRequest = new SupportRequest("medium issue", SupportRequestType.MEDIUM);
        SupportRequest complexRequest = new SupportRequest("high issue", SupportRequestType.HIGH);

        lowLevelSupport.handleRequest(simpleRequest);
        lowLevelSupport.handleRequest(mediumRequest);
        lowLevelSupport.handleRequest(complexRequest);
    }
}
