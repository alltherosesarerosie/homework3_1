package com.geektech.homework3_1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderZoo extends RecyclerView.ViewHolder {

    private TextView TVzoo;

    public ViewHolderZoo(@NonNull View itemView) {
        super(itemView);
        TVzoo = itemView.findViewById(R.id.tv_zoo);
    }

    public void bind(String animal){
        TVzoo.setText(animal);
    }
}
