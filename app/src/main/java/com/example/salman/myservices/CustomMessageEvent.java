package com.example.salman.myservices;

import android.content.Intent;

/**
 * Created by Salman on 12/20/2017.
 */

class CustomMessageEvent {
    private int Number;

    public CustomMessageEvent(Integer number) {
        Number = number;
    }

    public Integer getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }
}
