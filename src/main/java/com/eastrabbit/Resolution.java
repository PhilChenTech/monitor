package com.eastrabbit;

public enum Resolution {

    FULL_HD("FULL HD", 1920 * 1080), TWO("2K", 2560 * 1440), FOUR("4k", 3840 * 1160), EIGHT("8K", 7680 * 4320);


    private String name;
    private int value;

    Resolution(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }


}
