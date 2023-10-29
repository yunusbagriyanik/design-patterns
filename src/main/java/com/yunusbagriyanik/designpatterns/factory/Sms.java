package com.yunusbagriyanik.designpatterns.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Sms implements Notification {
    @Override
    public void notifyUser() {
        log.info("Sms Notification");
    }
}
