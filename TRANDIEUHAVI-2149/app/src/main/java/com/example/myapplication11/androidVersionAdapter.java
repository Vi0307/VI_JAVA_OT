package com.example.myapplication11;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class androidVersionAdapter extends RecyclerView.Adapter<androidVersionAdapter.ViewHolder> {

    private ArrayList<androidVersion> playerList;
    private ItemClicked activity;

    public interface ItemClicked {
        void onItemClicked(int index);
    }

    public androidVersionAdapter(Context context, ArrayList<androidVersion> list) {
        playerList = list;
        activity = (ItemClicked) context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivicon;
        TextView tvName, tvPosition;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivicon = itemView.findViewById(R.id.ivicon);
            tvName = itemView.findViewById(R.id.tvName);
            tvPosition = itemView.findViewById(R.id.tvPosition);

            itemView.setOnClickListener(v ->
                    activity.onItemClicked(getAdapterPosition())
            );
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        androidVersion player = playerList.get(position);
        holder.tvName.setText(player.getName());
        holder.tvPosition.setText("Vị trí: " + player.getPosition());
        holder.ivicon.setImageResource(player.getImageResId());
    }

    @Override
    public int getItemCount() {
        return playerList.size();
    }
}
