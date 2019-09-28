package com.inhataxi.activities.chat_room;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.inhataxi.R;
import com.inhataxi.RetrofitInterface;
import com.inhataxi.response.ChattingRoomResponse;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.inhataxi.IngaTaxiApp.*;

public class ChatRoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_room);

        this.postChattingRoom();

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_chat_room_setting:
                //햄버거뷰 클릭 시

                break;
        }
    }

    void postChattingRoom(RequestBody params) {
        final RetrofitInterface chatRetrofitInterface = getRetrofitMethod(this);
        chatRetrofitInterface.postChatRoom(RequestBody.create(MEDIA_TYPE_JSON, params.toString())).enqueue(new Callback<ChattingRoomResponse>() {
            @Override
            public void onResponse(Call<ChattingRoomResponse> call, Response<ChattingRoomResponse> response) {

                final ChattingRoomResponse chattingRoomResponse = response.body();
                if (chattingRoomResponse == null) {

                    return;
                }
                //가져오기 성공
                if (chattingRoomResponse.isSuccess()) {

                    //가져오기 실패
                } else {
                }
            }

            @Override
            public void onFailure(Call<ChattingRoomResponse> call, Throwable t) {

            }
        });

    }


}
