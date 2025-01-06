package com.yunusbagriyanik.designpatterns.cretional.factory.example1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Sms implements Notification {
    @Override
    public void notifyUser() {
        log.info("Sms Notification");
    }
}
