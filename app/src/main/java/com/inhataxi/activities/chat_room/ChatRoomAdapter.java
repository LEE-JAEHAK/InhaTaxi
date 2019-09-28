package com.inhataxi.activities.chat_room;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.inhataxi.R;
import com.inhataxi.RetrofitInterface;
import com.inhataxi.model.ChatRoomItem;
import com.inhataxi.response.ChattingRoomResponse;

import java.util.ArrayList;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.inhataxi.IngaTaxiApp.MEDIA_TYPE_JSON;
import static com.inhataxi.IngaTaxiApp.getRetrofitMethod;

public class ChatRoomAdapter extends RecyclerView.Adapter<ChatRoomAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<ChatRoomItem> mCartList;

    // 아이템 뷰를 저장하는 뷰홀더 클래스.
    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivChatRoomProfile;
        TextView tvChatRoomMaker;
        TextView tvChatRoomNum;
        TextView tvChatRoomDistance;
        TextView tvChatRoomDeparture;
        TextView tvChatRoomDestination;
        TextView tvChatRoomTime;
        TextView tvChatRoomJoin;

        ViewHolder(View itemView) {
            super(itemView);

            ivChatRoomProfile = itemView.findViewById(R.id.iv_chat_room_profile);
            tvChatRoomMaker = itemView.findViewById(R.id.tv_chat_room_name);
            tvChatRoomNum = itemView.findViewById(R.id.tv_chat_room_member_num);
            tvChatRoomDistance = itemView.findViewById(R.id.tv_chat_room_distance);
            tvChatRoomDeparture = itemView.findViewById(R.id.tv_chat_room_departure);
            tvChatRoomDestination = itemView.findViewById(R.id.tv_chat_room_destination);
            tvChatRoomTime = itemView.findViewById(R.id.tv_chat_room_time);
            tvChatRoomJoin = itemView.findViewById(R.id.tv_chat_roomt_join);

        }
    }

    // 생성자에서 데이터 리스트 객체를 전달받음.
    public ChatRoomAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    // getItemCount() - 전체 데이터 갯수 리턴.
    @Override
    public int getItemCount() {
        return mCartList.size();
    }

}
