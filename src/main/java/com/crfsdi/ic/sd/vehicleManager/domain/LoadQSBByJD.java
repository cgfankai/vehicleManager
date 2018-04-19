package com.crfsdi.ic.sd.vehicleManager.domain;

import com.crfsdi.ic.sd.vehicleManager.service.RowMapperToThis;

public class LoadQSBByJD implements RowMapperToThis {
    public String ID;
    public String JD;
    public String JDVALUE;

    public LoadQSBByJD() {
    }

    public String getID() {
        return ID;
    }

    public LoadQSBByJD setID(String ID) {
        this.ID = ID;
        return this;
    }

    public String getJD() {
        return JD;
    }

    public LoadQSBByJD setJD(String JD) {
        this.JD = JD;
        return this;
    }

    public String getJDVALUE() {
        return JDVALUE;
    }

    public LoadQSBByJD setJDVALUE(String JDVALUE) {
        this.JDVALUE = JDVALUE;
        return this;
    }
}
