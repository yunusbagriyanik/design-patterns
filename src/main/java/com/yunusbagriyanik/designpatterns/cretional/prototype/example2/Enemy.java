package com.yunusbagriyanik.designpatterns.cretional.prototype.example2;

public interface Enemy extends Cloneable {
    Enemy clone();

    void attack();
}
