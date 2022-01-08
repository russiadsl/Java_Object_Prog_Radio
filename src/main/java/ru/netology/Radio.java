package ru.netology;

public class Radio {

    private int currentStation;

    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            newCurrentStation = currentStation + 9;
        }
        if (newCurrentStation > 9) {
            newCurrentStation = currentStation + 1;
        }
        this.currentStation = newCurrentStation;
    }

    public void increaseStation(int newStationForIncrease) {
        if (newStationForIncrease < 9) {
            newStationForIncrease = newStationForIncrease + 1;
        }
        this.currentStation = newStationForIncrease;
    }

    public void decreaseStation(int newStationForDecrease) {
        if (newStationForDecrease > 1) {
            newStationForDecrease = newStationForDecrease - 1;
        }
        this.currentStation = newStationForDecrease;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return newCurrentVolume;
        }
        if (newCurrentVolume > 10) {
            newCurrentVolume = currentVolume + 10;
        }
        this.currentVolume = newCurrentVolume;
        return newCurrentVolume;
    }

    public void increaseVolume(int newCurrentVolumeForIncrease) {
        if (newCurrentVolumeForIncrease < 10) {
            newCurrentVolumeForIncrease = newCurrentVolumeForIncrease + 1;
        }
        this.currentVolume = newCurrentVolumeForIncrease;
    }

    public void decreaseVolume(int newCurrentVolumeForDecrease) {
        if (newCurrentVolumeForDecrease > 0) {
            newCurrentVolumeForDecrease = newCurrentVolumeForDecrease - 1;
        }
        this.currentVolume = newCurrentVolumeForDecrease;
    }
}