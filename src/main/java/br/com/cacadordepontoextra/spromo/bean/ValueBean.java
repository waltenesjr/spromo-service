package br.com.cacadordepontoextra.spromo.bean;

import java.io.Serializable;

public class ValueBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private int key;
    private String value;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
