package com.yunusbagriyanik.designpatterns.behavioral.chainofresponsibility;

class MediumLevelSupportHandler extends SupportHandler {
    @Override
    protected boolean canHandle(SupportRequest request) {
        return request.type() == SupportRequestType.MEDIUM;
    }

    @Override
    protected void processRequest(SupportRequest request) {
        System.out.println("Medium Level Support: Handling request - " + request.description());
    }
}
