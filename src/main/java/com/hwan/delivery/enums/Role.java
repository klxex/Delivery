package com.hwan.delivery.enums;

public enum Role {

    GUEST("ROLE_GUEST", "손님"),
    USER("ROLE_USER", "유저"),
    ADMIN("ROLE_ADMIN", "관리자");

    private final String key;
    private final String title;

    public String getKey() {
        return this.key;
    }

    public String getTitle() {
        return this.title;
    }

    private Role(String key, String title) {
        this.key = key;
        this.title = title;
    }
}
