package com.gabrielsilveira.eventos.entities;

public enum EventStatus {
    DRAFT(1),
    PUBLISHED(2),
    ONGOING(3),
    FINISHED(4),
    CANCELLED(5);

    private int code;

    EventStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static EventStatus valueOf(int code) {
        for (EventStatus value : EventStatus.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid EventStatus code: " + code);
    }
}
