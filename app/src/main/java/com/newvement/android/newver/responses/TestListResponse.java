package com.newvement.android.newver.responses;

import com.google.gson.annotations.SerializedName;
import com.newvement.android.newver.entities.TestData;

import java.util.ArrayList;

public class TestListResponse extends SuperResponse {
    @SerializedName("result")
    private ArrayList<TestData> result;
}
