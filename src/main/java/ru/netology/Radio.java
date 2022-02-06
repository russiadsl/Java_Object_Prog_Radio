package ru.netology;

public class Radio {

    private int currentStation;
    private int maxStation;
    private final int minStation = 0;
    private int currentVolume;
    private final int minVolume = 0;
    private final int maxVolume = 100;

    public Radio() {
    }

    public Radio(int currentStation, int maxStation) {
        this.currentStation = currentStation;
        this.maxStation = maxStation;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void increaseStation() {
        if (currentStation >= maxStation) {
            currentStation = minStation;
            return;
        }
        if (currentStation < minStation) {
            currentStation = minStation;
        } else this.currentStation = currentStation + 1;
    }

    public void decreaseStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        if (currentStation < minStation) {
            currentStation = maxStation;
            return;
        }
        if (currentStation > maxStation) {
            currentStation = maxStation;
        } else currentStation = currentStation - 1;
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