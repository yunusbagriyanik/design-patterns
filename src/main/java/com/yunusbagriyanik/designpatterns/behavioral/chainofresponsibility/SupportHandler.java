package com.yunusbagriyanik.designpatterns.behavioral.chainofresponsibility;

public abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public boolean handleRequest(SupportRequest request) {
        if (canHandle(request)) {
            processRequest(request);
            return true;
        } else if (nextHandler != null)
            return nextHandler.handleRequest(request);

        return false;
    }

    protected abstract boolean canHandle(SupportRequest request);

    protected abstract void processRequest(SupportRequest request);
}
