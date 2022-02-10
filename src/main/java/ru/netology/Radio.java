package ru.netology;

public class Radio {

    private int currentStation;
    private final int minStation = 0;
    private int maxStation;
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

    public void increaseStation(int maxStation) {
        if (currentStation >= maxStation) {
            currentStation = minStation;
        }
        else this.currentStation = currentStation + 1;
    }

    public void decreaseStation(int maxStation) {
        if (currentStation <= minStation) {
            currentStation = maxStation;
        } else this.currentStation = currentStation - 1;
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