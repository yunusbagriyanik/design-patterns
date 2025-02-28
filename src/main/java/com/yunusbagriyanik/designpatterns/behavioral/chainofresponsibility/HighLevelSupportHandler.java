package com.yunusbagriyanik.designpatterns.behavioral.chainofresponsibility;

class HighLevelSupportHandler extends SupportHandler {
    @Override
    protected boolean canHandle(SupportRequest request) {
        return request.type() == SupportRequestType.HIGH;
    }

    @Override
    protected void processRequest(SupportRequest request) {
        System.out.println("High Level Support: Handling request - " + request.description());
    }
}
