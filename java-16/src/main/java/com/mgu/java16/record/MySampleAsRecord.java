package com.mgu.java16.record;

/*
records are immutable so there is no setter.<br/>
getters are not prefixed by <b>get</b>.
 */
public record MySampleAsRecord(String name, String firstname) {
    // if I want to add custom code within the constructor
    public MySampleAsRecord {
        if(name.equals("doe")) {
            throw new IllegalArgumentException("forbidden name :)");
        }
    }
}
