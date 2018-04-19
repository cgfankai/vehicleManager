package com.crfsdi.ic.sd.vehicleManager.domain;

import com.crfsdi.ic.sd.vehicleManager.service.RowMapperToThis;

public class LoadChByCx implements RowMapperToThis {
    public String id;
    public String ch;
    public String cx;
    public String zt;
    public String note;

    public LoadChByCx() {
    }

    public String getId() {
        return id;
    }

    public LoadChByCx setId(String id) {
        this.id = id;
        return this;
    }

    public String getCh() {
        return ch;
    }

    public LoadChByCx setCh(String ch) {
        this.ch = ch;
        return this;
    }

    public String getCx() {
        return cx;
    }

    public LoadChByCx setCx(String cx) {
        this.cx = cx;
        return this;
    }

    public String getZt() {
        return zt;
    }

    public LoadChByCx setZt(String zt) {
        this.zt = zt;
        return this;
    }

    public String getNote() {
        return note;
    }

    public LoadChByCx setNote(String note) {
        this.note = note;
        return this;
    }
}
