package com.inhataxi.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.inhataxi.R;
import com.inhataxi.RetrofitInterface;
import com.inhataxi.response.ChattingRoomResponse;

import static com.inhataxi.IngaTaxiApp.getRetrofitMethod;

public class SelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_school_home);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.rl_go_school:
                //등교 액티비티로 이동
                //Intent intent = new Intent(this, );
                //intent.putExtra("select", 1);
                break;
            case R.id.rl_go_home:
                //하교 액티비티로 이동

                break;
        }
    }

}
