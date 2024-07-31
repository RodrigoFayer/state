package org.example;

public class User {
    private String name;
    private UserState state;

    public User() {
        this.state =  UserStateStarter.getInstance();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserState getState() {
        return state;
    }

    public void setState(UserState state) {
        this.state = state;
    }

    public String getStateName() {
        return this.state.getState();
    }

    public boolean canSwapToLegacy() {
        return this.state.canSwapToLegacy();
    }

    public boolean canSwapToStarter() {
        return this.state.canSwapToStarter();
    }

    public boolean canSwapToPro() {
        return this.state.canSwapToPro();
    }

    public boolean canSwapToPremium() {
        return this.state.canSwapToPremium();
    }

    public boolean canSwapToEnterprise() {
        return this.state.canSwapToEnterprise();
    }
}
