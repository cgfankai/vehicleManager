package com.crfsdi.ic.sd.vehicleManager.domain;

import com.crfsdi.ic.sd.vehicleManager.service.RowMapperToThis;

public class LoadPcdByRq implements RowMapperToThis<LoadPcdByRq> {
    public String ID;
    public String PCDH;
    public String PCDATE;
    public String CH;
    public String CX;
    public String CARSJID;
    public String CARSJXM;
    public String BDSJ;
    public String ZBDDID;
    public String ZBDDXM;
    public String SQRID;
    public String SQRXM;
    public String SPRID;
    public String SPRXM;
    public String ISWC;
    public String SM;
    public String WCQK;
    public String NOTE;
    public String LC;
    public String PCRID;
    public String PCRXM;

    public LoadPcdByRq() {
    }

    @Override
    public String toString() {
        return "LoadPcdByRq{" +
                "ID='" + ID + '\'' +
                ", PCDH='" + PCDH + '\'' +
                ", PCDATE='" + PCDATE + '\'' +
                ", CH='" + CH + '\'' +
                ", CX='" + CX + '\'' +
                ", CARSJID='" + CARSJID + '\'' +
                ", CARSJXM='" + CARSJXM + '\'' +
                ", BDSJ='" + BDSJ + '\'' +
                ", ZBDDID='" + ZBDDID + '\'' +
                ", ZBDDXM='" + ZBDDXM + '\'' +
                ", SQRID='" + SQRID + '\'' +
                ", SQRXM='" + SQRXM + '\'' +
                ", SPRID='" + SPRID + '\'' +
                ", SPRXM='" + SPRXM + '\'' +
                ", ISWC='" + ISWC + '\'' +
                ", SM='" + SM + '\'' +
                ", WCQK='" + WCQK + '\'' +
                ", NOTE='" + NOTE + '\'' +
                ", LC='" + LC + '\'' +
                ", PCRID='" + PCRID + '\'' +
                ", PCRXM='" + PCRXM + '\'' +
                '}';
    }

    public String getID() {
        return ID;
    }

    public LoadPcdByRq setID(String ID) {
        this.ID = ID;
        return this;
    }

    public String getPCDH() {
        return PCDH;
    }

    public LoadPcdByRq setPCDH(String PCDH) {
        this.PCDH = PCDH;
        return this;
    }

    public String getPCDATE() {
        return PCDATE;
    }

    public LoadPcdByRq setPCDATE(String PCDATE) {
        this.PCDATE = PCDATE;
        return this;
    }

    public String getCH() {
        return CH;
    }

    public LoadPcdByRq setCH(String CH) {
        this.CH = CH;
        return this;
    }

    public String getCX() {
        return CX;
    }

    public LoadPcdByRq setCX(String CX) {
        this.CX = CX;
        return this;
    }

    public String getCARSJID() {
        return CARSJID;
    }

    public LoadPcdByRq setCARSJID(String CARSJID) {
        this.CARSJID = CARSJID;
        return this;
    }

    public String getCARSJXM() {
        return CARSJXM;
    }

    public LoadPcdByRq setCARSJXM(String CARSJXM) {
        this.CARSJXM = CARSJXM;
        return this;
    }

    public String getBDSJ() {
        return BDSJ;
    }

    public LoadPcdByRq setBDSJ(String BDSJ) {
        this.BDSJ = BDSJ;
        return this;
    }

    public String getZBDDID() {
        return ZBDDID;
    }

    public LoadPcdByRq setZBDDID(String ZBDDID) {
        this.ZBDDID = ZBDDID;
        return this;
    }

    public String getZBDDXM() {
        return ZBDDXM;
    }

    public LoadPcdByRq setZBDDXM(String ZBDDXM) {
        this.ZBDDXM = ZBDDXM;
        return this;
    }

    public String getSQRID() {
        return SQRID;
    }

    public LoadPcdByRq setSQRID(String SQRID) {
        this.SQRID = SQRID;
        return this;
    }

    public String getSQRXM() {
        return SQRXM;
    }

    public LoadPcdByRq setSQRXM(String SQRXM) {
        this.SQRXM = SQRXM;
        return this;
    }

    public String getSPRID() {
        return SPRID;
    }

    public LoadPcdByRq setSPRID(String SPRID) {
        this.SPRID = SPRID;
        return this;
    }

    public String getSPRXM() {
        return SPRXM;
    }

    public LoadPcdByRq setSPRXM(String SPRXM) {
        this.SPRXM = SPRXM;
        return this;
    }

    public String getISWC() {
        return ISWC;
    }

    public LoadPcdByRq setISWC(String ISWC) {
        this.ISWC = ISWC;
        return this;
    }

    public String getSM() {
        return SM;
    }

    public LoadPcdByRq setSM(String SM) {
        this.SM = SM;
        return this;
    }

    public String getWCQK() {
        return WCQK;
    }

    public LoadPcdByRq setWCQK(String WCQK) {
        this.WCQK = WCQK;
        return this;
    }

    public String getNOTE() {
        return NOTE;
    }

    public LoadPcdByRq setNOTE(String NOTE) {
        this.NOTE = NOTE;
        return this;
    }

    public String getLC() {
        return LC;
    }

    public LoadPcdByRq setLC(String LC) {
        this.LC = LC;
        return this;
    }

    public String getPCRID() {
        return PCRID;
    }

    public LoadPcdByRq setPCRID(String PCRID) {
        this.PCRID = PCRID;
        return this;
    }

    public String getPCRXM() {
        return PCRXM;
    }

    public LoadPcdByRq setPCRXM(String PCRXM) {
        this.PCRXM = PCRXM;
        return this;
    }


}
