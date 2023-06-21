package swaglabs.domain;

public enum swaglabsUser {
    STANDARD_USER("standard_user", "secret_sauce");

    public final String username;
    public final String password;

    swaglabsUser(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
