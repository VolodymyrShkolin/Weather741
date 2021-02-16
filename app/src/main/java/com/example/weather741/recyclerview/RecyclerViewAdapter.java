package com.example.weather741.recyclerview;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.weather741.SecondActivity;
import com.example.weather741.data.ListItem;
import com.example.weather741.R;
import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    List<ListItem> list_;
    public RecyclerViewAdapter(List<ListItem> list_) {
        this.list_ = list_;
    }

    @NonNull @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.date_time_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.txt_ada_time.setText(String.format("Date and time: %s ",
                list_.get(position).getDtTxt()));

        String temp = String.format("Temperature: %s C'.", list_.get(position).getMain().getTemp());
        String hum = String.format("Humidity: %s.", list_.get(position).getMain().getHumidity());
        String press = String.format("Pressure: %s Pa.", list_.get(position).getMain().getPressure());

        holder.txt_ada_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SecondActivity.class);
                intent.putExtra("temp", temp);
                intent.putExtra("humidity", hum);
                intent.putExtra("press", press);
                v.getContext().startActivity(intent);
            }

        });
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
