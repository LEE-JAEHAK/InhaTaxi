package com.inhataxi.activities.chat_room;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.inhataxi.R;
import com.inhataxi.RetrofitInterface;
import com.inhataxi.model.ChatRoomItem;
import com.inhataxi.response.ChattingRoomResponse;
import com.inhataxi.response.SuperResponse;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.inhataxi.IngaTaxiApp.*;

public class ChatRoomActivity extends AppCompatActivity {

    ArrayList<ChatRoomItem> mArrayChat;
    RecyclerView mRvChatRoom;
    ChatRoomAdapter mChatRoomAdapter;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_room);
        mContext=this;
        this.initialize();

        try {

        } catch (Exception e) {

        }

        //this.postChattingRoom();

    }

    void initialize() {

        mArrayChat = new ArrayList<>();
        mChatRoomAdapter = new ChatRoomAdapter(this, mArrayChat);

        mRvChatRoom = findViewById(R.id.rv_chat_room);
        mRvChatRoom.setAdapter(mChatRoomAdapter);


    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_chat_room_setting:
                //햄버거뷰 클릭 시

                break;
        }
    }

    void postAsk(String ask) throws JSONException {
        JSONObject params = new JSONObject();
        params.put("type", 5);
        params.put("askType", "");
        params.put("content", ask);

        final RetrofitInterface retrofitInterface = getRetrofit(mContext).create(RetrofitInterface.class);
        retrofitInterface.postAsk(RequestBody.create( params.toString(), MEDIA_TYPE_JSON)).enqueue(new Callback<SuperResponse>() {
            @Override
            public void onResponse(@NonNull final Call<SuperResponse> call,
                                   @NonNull final Response<SuperResponse> response) {
//                hideProgressDialog();
                SuperResponse superResponse = response.body();
                if (superResponse == null) {
//                    showCustomToast(mContext, getString(R.string.network_error));
                }
                switch (superResponse.getCode()) {
                    case 100:
//                        showCustomToast(mContext, getString(R.string.ask_write_done));
                        finish();
                        break;
                    case 201:
                        break;
                    default:
                        break;
                }
            }
            @Override
            public void onFailure(@NonNull final Call<SuperResponse> call,
                                  @NonNull final Throwable throwable) {
//                hideProgressDialog();
//                showCustomToast(mContext, getString(R.string.network_error));
            }
        });
    }

}
