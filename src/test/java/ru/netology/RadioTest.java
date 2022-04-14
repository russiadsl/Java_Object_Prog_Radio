package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    Radio radio = new Radio();

    @Test
    public void testIncreaseStation10() {

        Radio radio = new Radio(9);
        radio.increaseStation(10);

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseStation4() {

        Radio radio = new Radio(9);
        radio.increaseStation(5);

        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseStation5() {

        Radio radio = new Radio(9);
        radio.increaseStation(5);

        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseStation20() {

        Radio radio = new Radio(1);
        radio.increaseStation(20);

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testDecreaseStation8() {

        Radio radio = new Radio(9);
        radio.decreaseStation(8);

        assertEquals(7, radio.getCurrentStation());

    }

    @Test
    public void testDecreaseStation9() {

        Radio radio = new Radio(9);
        radio.decreaseStation(9);

        assertEquals(8, radio.getCurrentStation());

    }

    @Test
    public void testDecreaseStation0() {

        Radio radio = new Radio(9);
        radio.decreaseStation(0);

        assertEquals(10, radio.getCurrentStation());

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