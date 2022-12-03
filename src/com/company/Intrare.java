package com.company;

public class Intrare {
    private String deumire;
    private int security;

    public String getDeumire() {
        return deumire;
    }

    public void setDeumire(String deumire) {
        this.deumire = deumire;
    }

    public int getSecurity() {
        return security;
    }

    public void setSecurity(int security) {
        this.security = security;
    }

    public Intrare(String deumire, int security) {
        this.deumire = deumire;
        this.security = security;
    }
}
