package io.mastercoding.sportsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.SportsViewHolder>{

    private List<Sports> sportsList;

    public CustomAdapter(List<Sports> sportsList) {
        this.sportsList = sportsList;
    }

    @NonNull
    @Override
    public SportsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_layout, parent, false);

        return new SportsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SportsViewHolder holder, int position) {
        Sports sports = sportsList.get(position);
        holder.textView.setText(sports.sportName);
        holder.imageView.setImageResource(sports.sportImg);

    }

    @Override
    public int getItemCount() {
        return sportsList.size();
    }


    public static class SportsViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        public SportsViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);
            imageView = itemView.findViewById(R.id.imageviewCard);
        }
    }
}
