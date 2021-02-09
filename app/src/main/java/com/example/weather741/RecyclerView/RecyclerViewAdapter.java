package com.example.weather741.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weather741.Data.ListItem;
import com.example.weather741.R;
import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    List<String> list_;

    public RecyclerViewAdapter( List<String> list) {
        updateList(list);
    }

    public void updateList(List<String> list){
        this.list_ = list;
        notifyDataSetChanged();

    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.date_time_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txt_ada_time.setText(position);

    }

    @Override
    public int getItemCount() {
        return list_.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txt_ada_time;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_ada_time = itemView.findViewById(R.id.date_time);
        }
    }
}
