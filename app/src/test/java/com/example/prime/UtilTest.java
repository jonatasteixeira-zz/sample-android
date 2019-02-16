package com.example.prime;

import com.example.prime.Util;

import org.junit.Test;

import static org.junit.Assert.*;

@SuppressWarnings("SpellCheckingInspection")
public class UtilTest {
    @Test
    public void primo_zero() {
        assertFalse(Util.primo(0));
    }

    @Test
    public void primo_um() {
        assertTrue(Util.primo(1));
    }

    @Test
    public void primo_dois() {
        assertTrue(Util.primo(2));
    }

    @Test
    public void primo_grande() {
        assertTrue(Util.primo(9973));
    }

    @Test
    public void primo_900() {
        assertFalse(Util.primo(900));
    }

    @Test
    public void primo_negativo() {
        assertFalse(Util.primo(-11));
    }
}