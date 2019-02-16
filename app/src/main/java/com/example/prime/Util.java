package com.example.prime;

@SuppressWarnings({"WeakerAccess", "SpellCheckingInspection"})
public class Util {
    public static boolean primo(int n) {
        if (n <= 0) return false;
        if (n == 1 || n == 2) return true;
        for (int i = 3; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
