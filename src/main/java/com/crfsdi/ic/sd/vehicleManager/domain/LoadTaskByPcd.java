package com.crfsdi.ic.sd.vehicleManager.domain;

import com.crfsdi.ic.sd.vehicleManager.service.RowMapperToThis;

public class LoadTaskByPcd implements RowMapperToThis<LoadTaskByPcd> {
    public String ID;
    public String PCDH;
    public String YCDW;
    public String YCR;
    public String DH;
    public String KSSJ;
    public String JSSJ;
    public String BDDD;
    public String TASK;
    public String LB;
    public String SM;

    public LoadTaskByPcd() {
    }

    public String getID() {
        return ID;
    }

    public LoadTaskByPcd setID(String ID) {
        this.ID = ID;
        return this;
    }

    public String getPCDH() {
        return PCDH;
    }

    public LoadTaskByPcd setPCDH(String PCDH) {
        this.PCDH = PCDH;
        return this;
    }

    public String getYCDW() {
        return YCDW;
    }

    public LoadTaskByPcd setYCDW(String YCDW) {
        this.YCDW = YCDW;
        return this;
    }

    public String getYCR() {
        return YCR;
    }

    public LoadTaskByPcd setYCR(String YCR) {
        this.YCR = YCR;
        return this;
    }

    public String getDH() {
        return DH;
    }

    public LoadTaskByPcd setDH(String DH) {
        this.DH = DH;
        return this;
    }

    public String getKSSJ() {
        return KSSJ;
    }

    public LoadTaskByPcd setKSSJ(String KSSJ) {
        this.KSSJ = KSSJ;
        return this;
    }

    public String getJSSJ() {
        return JSSJ;
    }

    public LoadTaskByPcd setJSSJ(String JSSJ) {
        this.JSSJ = JSSJ;
        return this;
    }

    public String getBDDD() {
        return BDDD;
    }

    public LoadTaskByPcd setBDDD(String BDDD) {
        this.BDDD = BDDD;
        return this;
    }

    public String getTASK() {
        return TASK;
    }

    public LoadTaskByPcd setTASK(String TASK) {
        this.TASK = TASK;
        return this;
    }

    public String getLB() {
        return LB;
    }

    public LoadTaskByPcd setLB(String LB) {
        this.LB = LB;
        return this;
    }

    public String getSM() {
        return SM;
    }

    public LoadTaskByPcd setSM(String SM) {
        this.SM = SM;
        return this;
    }

    @Override
    public String toString() {
        return "LoadTaskByPcd{" +
                "ID='" + ID + '\'' +
                ", PCDH='" + PCDH + '\'' +
                ", YCDW='" + YCDW + '\'' +
                ", YCR='" + YCR + '\'' +
                ", DH='" + DH + '\'' +
                ", KSSJ='" + KSSJ + '\'' +
                ", JSSJ='" + JSSJ + '\'' +
                ", BDDD='" + BDDD + '\'' +
                ", TASK='" + TASK + '\'' +
                ", LB='" + LB + '\'' +
                ", SM='" + SM + '\'' +
                '}';
    }
}
