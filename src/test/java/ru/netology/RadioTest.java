package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    Radio radio = new Radio();

    @Test
    public void testSetNewStation() {

        Radio radio = new Radio (6, 9);
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseStation11() {

        Radio radio = new Radio (11, 9);
        radio.increaseStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseStationMinus50() {

        Radio radio = new Radio (-50, 9);
        radio.increaseStation();


        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseStation0() {

        Radio radio = new Radio (0, 9);
        radio.increaseStation();

        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseStation1() {

        Radio radio = new Radio (1, 9);
        radio.increaseStation();

        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseStation2() {
        Radio radio = new Radio (2, 9);
        radio.increaseStation();

        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseStation3() {

        Radio radio = new Radio (3, 9);
        radio.increaseStation();

        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseStation4() {

        Radio radio = new Radio (4, 9);
        radio.increaseStation();

        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseStation5() {

        Radio radio = new Radio (5, 9);
        radio.increaseStation();

        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseStation6() {

        Radio radio = new Radio (6, 9);
        radio.increaseStation();

        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseStation7() {

        Radio radio = new Radio (7, 9);
        radio.increaseStation();

        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseStation8() {

        Radio radio = new Radio (8, 9);
        radio.increaseStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseStation9() {

        Radio radio = new Radio (9, 9);
        radio.increaseStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseStation50() {

        Radio radio = new Radio (50, 9);
        radio.increaseStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testDecreaseStation35() {

        Radio radio = new Radio(35, 9);
        radio.decreaseStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testDecreaseStation9() {

        Radio radio = new Radio(9, 9);
        radio.decreaseStation();

        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void testDecreaseStation8() {

        Radio radio = new Radio(8, 9);
        radio.decreaseStation();

        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void testDecreaseStation7() {

        Radio radio = new Radio(7, 9);
        radio.decreaseStation();

        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void testDecreaseStation6() {

        Radio radio = new Radio(6, 9);
        radio.decreaseStation();

        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void testDecreaseStation5() {

        Radio radio = new Radio(5, 9);
        radio.decreaseStation();

        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void testDecreaseStation4() {

        Radio radio = new Radio(4, 9);
        radio.decreaseStation();

        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void testDecreaseStation3() {

        Radio radio = new Radio(3, 9);
        radio.decreaseStation();

        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void testDecreaseStation2() {

        Radio radio = new Radio(2, 9);
        radio.decreaseStation();

        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void testDecreaseStation1() {

        Radio radio = new Radio(1, 9);
        radio.decreaseStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testDecreaseStation0() {

        Radio radio = new Radio(0, 9);
        radio.decreaseStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testDecreaseStationMinus50() {

        Radio radio = new Radio(-50, 9);
        radio.decreaseStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentVolume() {

        Radio radio = new Radio();
        radio.setCurrentVolume(7);

        assertEquals(7, radio.getCurrentVolume());
    }


    @Test
    public void increaseVolume100() {

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolume0() {

        radio.setCurrentVolume(0);
        radio.increaseVolume();

        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolume100() {

        radio.setCurrentVolume(100);
        radio.decreaseVolume();

        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolume0() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeLess0() {
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolumeMore100() {
        radio.setCurrentVolume(101);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }
}