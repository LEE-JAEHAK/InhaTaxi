package com.newvement.android.newver.entities;

import com.google.gson.annotations.SerializedName;

public class RecentSendData {
    public RecentSendData(String name, String accountNo) {
        this.name = name;
        this.accountNo = accountNo;
    }
    @SerializedName("name")
    private String name;

    @SerializedName("accountNo")
    private String accountNo;


    public String getName() {
        return name;
    }

    public String getAccountNo() {
        return accountNo;
    }
}
