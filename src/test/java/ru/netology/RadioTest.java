package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    Radio radio = new Radio();


    @Test
    public void testSetNewStation() {

        Radio radio = new Radio(6);
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseStation15() {

        Radio radio = new Radio(15);
        radio.increaseStation(20);

        assertEquals(16, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseStation20() {

        Radio radio = new Radio(20);
        radio.increaseStation(20);

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testDecreaseStation8() {

        Radio radio = new Radio(8);
        radio.decreaseStation(11);

        assertEquals(7, radio.getCurrentStation());

    }

    @Test
    public void testDecreaseStation0() {

        Radio radio = new Radio(0);
        radio.decreaseStation(9);

        assertEquals(9, radio.getCurrentStation());

    }

    @Test
    public void testSetCurrentVolume() {

        radio.setCurrentVolume(7);

        assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolume0() {

        radio.setCurrentVolume(0);
        radio.increaseVolume();

        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolume38() {

        radio.setCurrentVolume(38);
        radio.increaseVolume();

        assertEquals(39, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolume100() {

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolume100() {

        radio.setCurrentVolume(100);
        radio.decreaseVolume();

        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolume60() {

        radio.setCurrentVolume(60);
        radio.decreaseVolume();

        assertEquals(59, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolume0() {

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }
}