package com.yunusbagriyanik.designpatterns.behavioral.chainofresponsibility;

class LowLevelSupportHandler extends SupportHandler {
    @Override
    protected boolean canHandle(SupportRequest request) {
        return request.type() == SupportRequestType.LOW;
    }

    @Override
    protected void processRequest(SupportRequest request) {
        System.out.println("Low Level Support: Handling request - " + request.description());
    }
}
