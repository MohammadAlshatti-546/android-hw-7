package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<pokemon> mypokemons = new ArrayList<>();

        pokemon p1 = new pokemon("Jigglypuff", R.drawable.jigglypuff , 45,270);
        pokemon p2 = new pokemon("Phanpy", R.drawable.phanpy , 60,330);
        pokemon p3 = new pokemon("Minccino",R.drawable.minccino ,50 ,300);
        pokemon p4 = new pokemon("Cubchoo",R.drawable.cubchoo ,70 ,305);
        pokemon p5 = new pokemon("Pancham",R.drawable.pancham ,82 ,348);
        pokemon p6 = new pokemon("Pichu",R.drawable.pichu ,40 ,205);
        mypokemons.add(p1);
        mypokemons.add(p2);
        mypokemons.add(p3);
        mypokemons.add(p4);
        mypokemons.add(p5);
        mypokemons.add(p6);

        RecyclerView bo =findViewById(R.id.recyclerview);

        bo.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        bo.setLayoutManager(lm);

    }
}