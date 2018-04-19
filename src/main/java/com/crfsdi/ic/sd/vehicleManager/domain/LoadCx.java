package com.crfsdi.ic.sd.vehicleManager.domain;

import com.crfsdi.ic.sd.vehicleManager.service.RowMapperToThis;

public class LoadCx implements RowMapperToThis {
    public String cx;

    public LoadCx() {
    }

    public String getCx() {
        return cx;
    }

    public LoadCx setCx(String cx) {
        this.cx = cx;
        return this;
    }
}
