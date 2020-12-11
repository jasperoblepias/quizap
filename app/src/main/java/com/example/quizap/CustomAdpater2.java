package com.example.quizap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdpater2  extends RecyclerView.Adapter<com.example.quizap.CustomAdpater2.MyViewHolder>{

    private Context context;

    private ArrayList user_id, user_name, user_score;

    CustomAdpater2(Context context, ArrayList user_id, ArrayList user_name, ArrayList user_score){
        this.context = context;
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_score = user_score;
    }

    @NonNull
    @Override
    public CustomAdpater2.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row1, parent, false);
        return new CustomAdpater2.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CustomAdpater2.MyViewHolder holder, final int position) {
//        holder.user_id_txt.setText(String.valueOf(user_id.get(position)));
//        holder.user_name_txt.setText(String.valueOf(user_name.get(position)));
        holder.user_score_txt.setText(String.valueOf(user_score.get(position)));
    }

    @Override
    public int getItemCount() {
        return user_id.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView user_id_txt, user_name_txt, user_score_txt;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);
//            user_id_txt = itemView.findViewById(R.id.user_id_txt);
//            user_name_txt = itemView.findViewById(R.id.user_name_txt);
            user_score_txt = itemView.findViewById(R.id.user_score_txt);
        }

    }
}
