package com.cursoandroid.ph.cardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cursoandroid.ph.cardview.R;
import com.cursoandroid.ph.cardview.model.Posts;

import java.util.List;

public class AdapterPosts extends RecyclerView.Adapter<AdapterPosts.MyViewHolder> {
    private List<Posts> posts;
    public AdapterPosts(List<Posts> post) {
        this.posts = post;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.posts_layout, parent, false);
        return new MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Posts post = posts.get(position);
        holder.user.setText(post.getUser());
        holder.date.setText(post.getDate());
        holder.post.setText(post.getPost());
        holder.postImage.setImageResource(post.getImagePost());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView user, date, post;
        private ImageView postImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            user = itemView.findViewById(R.id.textViewUser);
            date = itemView.findViewById(R.id.textViewDate);
            post = itemView.findViewById(R.id.textViewPost);
            postImage = itemView.findViewById(R.id.imageViewPost);
        }
    }

}
