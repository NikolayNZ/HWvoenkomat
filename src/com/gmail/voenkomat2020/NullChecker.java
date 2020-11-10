package com.gmail.voenkomat2020;

public class NullChecker {
    public static final int NOT_NULL = 6;
    public static int checkNull(Object a, Object b) {
        if(a == null && b == null) {
            return 0;
        }
        if(a != null && b == null) {
            return -1;
        }
        if(b != null && a == null) {
            return 1;
        }
        return NOT_NULL;
    }

}
