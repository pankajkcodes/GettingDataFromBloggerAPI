package com.pankajkcodes.bloggerapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pankajkcodes.bloggerapi.model.ItemModel;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.PostHolder> {

    private Context context;
    private List<ItemModel> list;

    public Adapter(Context context, List<ItemModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public PostHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.itemlist, parent, false);
        return new PostHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostHolder holder, int position) {

        ItemModel model = list.get(position);

        holder.title.setText(model.getTitle());
        holder.update.setText(model.getUpdated());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class PostHolder extends RecyclerView.ViewHolder {

        TextView title, update;

        public PostHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title_text);
            update = itemView.findViewById(R.id.update_time);
        }
    }
}
