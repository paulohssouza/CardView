package com.cursoandroid.ph.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.cursoandroid.ph.cardview.R;
import com.cursoandroid.ph.cardview.adapter.AdapterPosts;
import com.cursoandroid.ph.cardview.model.Posts;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewPosts, recyclerViewPosts2;
    private List<Posts> posts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewPosts = findViewById(R.id.recyclerViewPosts);
        recyclerViewPosts2 = findViewById(R.id.recyclerViewPosts2);

        //Define layout
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        layoutManager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerViewPosts.setLayoutManager(layoutManager);
        recyclerViewPosts2.setLayoutManager(layoutManager1);

        //Define adapter
        this.setPosts();
        AdapterPosts adapterPosts = new AdapterPosts(posts);
        recyclerViewPosts.setAdapter(adapterPosts);
        recyclerViewPosts2.setAdapter(adapterPosts);
    }

    public void setPosts () {
        Posts post = new Posts("Paulo Henrique",
                "Agora mesmo", "#tbt de uma viagem fantástica",
                R.drawable.imagem1);
        this.posts.add(post);
        post = new Posts("Ana Rafaela",
                "Out 2022", "E a neblina tomou conta!!",
                R.drawable.imagem2);
        this.posts.add(post);
        post = new Posts("Daniel Santana",
                "Out 2022", "Cidade luz!!",
                R.drawable.imagem3);
        this.posts.add(post);
        post = new Posts("Maria Sabina",
                "Out 2022", "Freedom!!!",
                R.drawable.imagem4);
        this.posts.add(post);
    }

}