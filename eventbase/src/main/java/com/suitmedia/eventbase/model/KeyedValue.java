package com.suitmedia.eventbase.model;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Aldio Firando on 8/9/2016.
 */
public class KeyedValue extends RealmObject {

    @PrimaryKey
    private String key;
    private RealmList<RealmString> value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public RealmList<RealmString> getValue() {
        return value;
    }

    public void setValue(RealmList<RealmString> value) {
        this.value = value;
    }
}
