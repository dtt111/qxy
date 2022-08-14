package com.qxy.guanfang2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ListAdapter;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MoviesActivity extends AppCompatActivity {
    private ListView listViewInfo;
    private List<Map<String, ?>> listItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        this.listItems = this.getListItems();

        InfoAdapter adapter = new InfoAdapter(this.listItems, this);

        this.listViewInfo = (ListView) findViewById(R.id.ListMovies);

        this.listViewInfo.setAdapter(adapter);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }
    private List<Map<String, ?>> getListItems() {
        List<Map<String, ?>> listItems = new ArrayList<>();

        Map<String, Object> item01 = new HashMap<>();
        item01.put("id", 1);
//        item01.put("imgIcon", R.drawable.photo01);
        item01.put("txtMovieName", "人生大事");
        item01.put("txtMovieScore", "100");
        item01.put("txtMovieTime", new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss").format(new Date()));
//        item01.put("layoutImages", "0");
//        item01.put("layoutReplys", "1");

        listItems.add(item01);

        Map<String, Object> item02 = new HashMap<>();
        item02.put("id", 1);
        item02.put("txtMovieName", "人生大事");
        item02.put("txtMovieScore", "100");
        item02.put("txtMovieTime", new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss").format(new Date()));

        listItems.add(item02);

        Map<String, Object> item03 = new HashMap<>();
        item03.put("id", 1);
        item03.put("txtMovieName", "人生大事");
        item03.put("txtMovieScore", "100");
        item03.put("txtMovieTime", new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss").format(new Date()));

        listItems.add(item03);

        return listItems;
    }
}