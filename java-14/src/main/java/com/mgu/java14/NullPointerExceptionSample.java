package com.mgu.java14;

/*
With Java14, NPE stack traces are more helpful

Exception in thread "main" java.lang.NullPointerException: Cannot store to int array because "arr" is null
	at com.afklm.tecc.java14.NullPointerExceptionSample.main(NullPointerExceptionSample.java:6)

 */
public class NullPointerExceptionSample {
    public static void main(String[] args) {
        int[] arr = null;
        arr[0] = 1;
    }
}
