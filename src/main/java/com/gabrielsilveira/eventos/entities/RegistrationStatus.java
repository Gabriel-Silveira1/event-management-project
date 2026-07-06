package com.gabrielsilveira.eventos.entities;

public enum RegistrationStatus {
    PENDING(1),
    CONFIRMED(2),
    CANCELLED(3);

    private int code;

    RegistrationStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static RegistrationStatus valueof(int code) {
        for (RegistrationStatus value : RegistrationStatus.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid RegistrationStatus code: " + code);
    }
}
