package com.eastrabbit;

public class ScreenSizeRecommendation {
    private static final int RESOLUTION_1K = 1920 * 1080;
    private static final int RESOLUTION_2K = 2560 * 1440;
    private static final int RESOLUTION_4K = 3840 * 1160;
    private static final int RESOLUTION_8K = 7680 * 4320;
    private static final int STANDARD_RESOLUTION_PER_INCH = RESOLUTION_1K / 24;

    public static void main(String[] args) {
        result(50);
    }

    public static void result(int monitorSize) {
        boolean result1k = RESOLUTION_1K / monitorSize >= STANDARD_RESOLUTION_PER_INCH;
        boolean result2k = RESOLUTION_2K / monitorSize >= STANDARD_RESOLUTION_PER_INCH;
        boolean result4k = RESOLUTION_4K / monitorSize >= STANDARD_RESOLUTION_PER_INCH;
        boolean result8k = RESOLUTION_8K / monitorSize >= STANDARD_RESOLUTION_PER_INCH;
        System.out.println("monitor size' " + monitorSize);
        System.out.println("1k = " + result1k);
        System.out.println("2k = " + result2k);
        System.out.println("4k = " + result4k);
        System.out.println("8k = " + result8k);
        System.out.println("===神奇的分隔線===");
    }
}
