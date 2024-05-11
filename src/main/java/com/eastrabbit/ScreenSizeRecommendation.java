package com.eastrabbit;

public class ScreenSizeRecommendation {

    private static final int STANDARD_RESOLUTION_PER_INCH = Resolution.FULL_HD.getValue() / 24;

    public static void main(String[] args) {
        result(50);
    }

    public static void result(int monitorSize) {
        System.out.println("monitor size' " + monitorSize);
        System.out.println(Resolution.FULL_HD.getName()+" = " + getResult(Resolution.FULL_HD, monitorSize));
        System.out.println(Resolution.TWO.getName()+" = " + getResult(Resolution.TWO, monitorSize));
        System.out.println(Resolution.FOUR.getName()+" = " + getResult(Resolution.FOUR, monitorSize));
        System.out.println(Resolution.EIGHT.getName()+" = " + getResult(Resolution.EIGHT, monitorSize));
    }

    private static boolean getResult(Resolution resolution, int monitorSize) {
        return resolution.getValue() / monitorSize >= STANDARD_RESOLUTION_PER_INCH;
    }
}
