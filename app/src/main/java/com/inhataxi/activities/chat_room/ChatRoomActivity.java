package com.inhataxi.activities;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.inhataxi.R;

public class ChatRoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_room);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_chat_room_setting:
                //햄버거뷰 클릭 시

                break;
        }
    }

    
}
