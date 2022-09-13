package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio(15);

    @Test
    public void setCurrentStation() {
        int expected = 14;
        radio.setCurrentStation(expected);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationOutLimit() {
        radio.setCurrentStation(15);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setCurrentVolume() {
        int expected = 50;
        radio.setCurrentVolume(expected);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeOutLimit() {
        radio.setCurrentVolume(120);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextStationInLimit() {
        radio.setCurrentStation(13);
        int currentStation = radio.nextStation();
        radio.setCurrentStation(currentStation);
        assertEquals(14, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationInLimit() {
        radio.setCurrentStation(10);
        int currentStation = radio.prevStation();
        radio.setCurrentStation(currentStation);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationMax() {
        radio.setCurrentStation(14);
        int currentStation = radio.nextStation();
        radio.setCurrentStation(currentStation);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationMin() {
        radio.setCurrentStation(0);
        int currentStation = radio.prevStation();
        radio.setCurrentStation(currentStation);
        assertEquals(14, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseVolumeInLimit() {
        radio.setCurrentVolume(70);
        int currentVolume = radio.increaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(71, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeInLimit() {
        radio.setCurrentVolume(61);
        int currentVolume = radio.decreaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(60, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeMax() {
        radio.setCurrentVolume(100);
        int currentVolume = radio.increaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeMin() {
        radio.setCurrentVolume(0);
        int currentVolume = radio.decreaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextStationOutLimit() {
        radio.setCurrentStation(16);
        int currentStation = radio.nextStation();
        radio.setCurrentStation(currentStation);
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationOutLimit() {
        radio.setCurrentStation(-1);
        int currentStation = radio.prevStation();
        radio.setCurrentStation(currentStation);
        assertEquals(14, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseVolumeOutLimit() {

        radio.setCurrentVolume(110);
        int currentVolume = radio.increaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeOutLimit() {
        radio.setCurrentVolume(-1);
        int currentVolume = radio.decreaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setMaxStation() {
        int expected = 14;
        radio.setNumberStation(radio.getMaxStation());
        assertEquals(expected, radio.getMaxStation());
    }

    @Test
    public void setMinStation() {
        int expected = 0;
        radio.setNumberStation(radio.getMinStation());
        assertEquals(expected, radio.getMinStation());
    }

    @Test
    public void setNumberStation() {
        int expected = 5;
        radio.setNumberStation(expected);
        assertEquals(expected, radio.getNumberStation());

    }

    @Test
    public void setMaxVolume() {
        int expected = 100;
        radio.setCurrentVolume(radio.getMaxVolume());
        assertEquals(expected, radio.getMaxVolume());
    }

    @Test
    public void setMinVolume() {
        int expected = 0;
        radio.setCurrentVolume(radio.getMinVolume());
        assertEquals(expected, radio.getMinVolume());
    }


}