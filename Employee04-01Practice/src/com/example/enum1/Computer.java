package com.example.enum1;

import com.example.enum1.example.PowerStatus;

public class Computer {
    private PowerStatus status;  // 0=OFF, 1=ON, 2=SLEEP

    public PowerStatus getStatus() {
        return status;
    }

    public void setStatus(PowerStatus status) {
        this.status = status;
    }
}
