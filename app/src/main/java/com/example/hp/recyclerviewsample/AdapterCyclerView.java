package com.example.hp.recyclerviewsample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 8/19/2016.
 */
public class AdapterCyclerView extends RecyclerView.Adapter<AdapterCyclerView.RecyclerViewHolder> {
    private List<String> list= new ArrayList<>();

    public AdapterCyclerView(List<String> list) {
        this.list = list;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.item_on_recyclerview,parent,false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.textView.setText("thao dep trai");

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            textView= (TextView) itemView.findViewById(R.id.txt_item);
        }
    }
}
