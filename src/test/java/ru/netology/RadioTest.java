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
}