package ru.netology;

public class Radio {

    private int currentStation;

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

    private int currentVolume;

//    public void increaseVolume(int newCurrentVolume) {
//        if (newCurrentVolume < 10){
//            newCurrentVolume = currentVolume + 1;
//        }
//    }

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
}