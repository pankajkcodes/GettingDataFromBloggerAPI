package com.pankajkcodes.bloggerapi;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pankajkcodes.bloggerapi.api.ApiUtilities;
import com.pankajkcodes.bloggerapi.model.BlogDataModel;
import com.pankajkcodes.bloggerapi.model.ItemModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Button loadBtn;

    private String url = "";
    private String nextToken = "";
    private List<ItemModel> itemList;

    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        loadBtn = findViewById(R.id.loadmore_btn);

        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("loading...");

        loadPost();

    }

    private void loadPost() {

        Call<BlogDataModel> postList = ApiUtilities.getService().getPostList();

        postList.enqueue(new Callback<BlogDataModel>() {
            @Override
            public void onResponse(Call<BlogDataModel> call, Response<BlogDataModel> response) {

                BlogDataModel model = response.body();

                Adapter adapter = new Adapter(MainActivity.this, model.getItems());
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<BlogDataModel> call, Throwable t) {

            }
        });

    }
}