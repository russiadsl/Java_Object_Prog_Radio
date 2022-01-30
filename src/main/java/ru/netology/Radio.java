package ru.netology;

public class Radio {

    private int currentStation;
    private final int maxStation = 9;
    private final int minStation = 0;
    private int currentVolume;
    private final int minVolume = 0;
    private final int maxVolume = 100;

    public Radio() {
    }

    public Radio(int currentStation) {
        this.currentStation = currentStation;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void increaseStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else currentStation = currentStation + 1;
    }

    public void decreaseStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else currentStation = maxStation;
    }



    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else currentVolume = maxVolume;
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else currentVolume = minVolume;
    }
}