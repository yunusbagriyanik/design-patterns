package com.yunusbagriyanik.designpatterns.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Email implements Notification {
    @Override
    public void notifyUser() {
        log.info("Email Notification");
    }
}
