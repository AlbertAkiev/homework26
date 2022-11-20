package com.company;

public class Boxclass <L> {
    private L name;
    private L sorname;

    public Boxclass(L name, L sorname) {
        this.name = name;
        this.sorname = sorname;
    }

    public L getName() {
        return name;
    }

    public void setName(L name) {
        this.name = name;
    }

    public L getSorname() {
        return sorname;
    }

    public void setSorname(L sorname) {
        this.sorname = sorname;
    }

    @Override
    public String toString() {
        return "Boxclass{" +
                "name=" + name +
                ", sorname=" + sorname +
                '}';
    }public <L> L met(L Boxclass){
        return Boxclass;
    }
}
