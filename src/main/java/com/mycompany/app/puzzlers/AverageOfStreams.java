package com.mycompany.app.puzzlers;

public class AverageOfStreams {

    // Returns the new average after including x
    public static float getAvg(float prev_avg, int streamValue, int index) {
        System.out.println(prev_avg + " x : " + streamValue + " : n " + index);
        return ((prev_avg * index) + streamValue) / (index + 1);
    }

    /**
     * Stream avg numbers problem
     */
    public static void streamAvg(int arr[], int length) {
        float avg = 0;
        for (int i = 0; i < length; i++) {
            avg = getAvg(avg, arr[i], i);
            System.out.println("Average of " + (i + 1) + " numbers is " + avg + " n ");
        }

    }


    private static double avg = 0;
    private static long n = 0;

    public static double RunningAverage(double i) {
        return ((avg * n) + i) / ++n;
    }

    public static void streamAvg2(int arr[], int length) {

    }

    // Driver program to test above functions
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 60};
        int n = arr.length;
        streamAvg(arr, n);


    }

}
