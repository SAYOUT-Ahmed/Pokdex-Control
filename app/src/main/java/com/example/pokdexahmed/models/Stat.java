package com.example.pokdexahmed.models;

import com.google.gson.annotations.SerializedName;

public class Stat {
    @SerializedName("base_stat")
    private int baseStat;


//baseStat --> name fl api
    @SerializedName("stat")
    private StatInfo stat;

    public int getBaseStat() {
        return baseStat;
    }

    public void setBaseStat(int baseStat) {
        this.baseStat = baseStat;
    }



    public StatInfo getStat() {
        return stat;
    }

    public void setStat(StatInfo stat) {
        this.stat = stat;
    }
}
