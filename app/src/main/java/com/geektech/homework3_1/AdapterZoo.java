package com.geektech.homework3_1;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterZoo extends RecyclerView.Adapter<ViewHolderZoo> {
    private ArrayList<String> zoo_an;

    public AdapterZoo(ArrayList<String> zoo_an) {
        this.zoo_an = zoo_an;
    }

    @NonNull
    @Override
    public ViewHolderZoo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderZoo(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_zoo,parent,false));
    }

    @Override
     public void onBindViewHolder(@NonNull ViewHolderZoo holder, int position) {
        holder.bind(zoo_an.get(position));

    }

    @Override
    public int getItemCount() {
        return zoo_an.size();
    }
}
