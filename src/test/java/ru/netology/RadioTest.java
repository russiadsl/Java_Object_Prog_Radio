package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void testNewStationInTheRange() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testNextStationOutOfRange() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 1;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testPreviousStationOutOfRange() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseStation() {
        Radio radio = new Radio();

        radio.increaseStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseStationInRange() {
        Radio radio = new Radio();

        radio.increaseStation(5);

        int expected = 6;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseStation() {
        Radio radio = new Radio();

        radio.decreaseStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseStationInRange() {
        Radio radio = new Radio();

        radio.decreaseStation(5);

        int expected = 4;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testCurrentVolumeInRange() {
        Radio radio = new Radio();

        radio.setCurrentVolume(7);

        int expected = 7;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testMoreVolumeOutOfRange() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testLessVolumeOutOfRange() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testVolumeLessThenMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-5);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();

        radio.increaseVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeInRange() {
        Radio radio = new Radio();

        radio.increaseVolume(5);

        int expected = 6;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();

        radio.decreaseVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolumeInRange() {
        Radio radio = new Radio();

        radio.decreaseVolume(5);

        int expected = 4;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}