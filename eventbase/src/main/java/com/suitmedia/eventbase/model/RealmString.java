package com.suitmedia.eventbase.model;

import io.realm.RealmObject;

/**
 * Created by Aldio Firando on 7/21/2016.
 */
public class RealmString extends RealmObject {

    private String val;

    public RealmString(){

    }

    public RealmString(String val){
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
