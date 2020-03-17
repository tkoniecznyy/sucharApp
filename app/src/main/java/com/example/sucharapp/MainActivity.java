package com.example.sucharapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String joke1 = "Rozmowa dwóch osób. \n - Najbardziej w życiu boję się dentysty i ciemności.\n - Dlaczego ciemności? \n - Nie wiadomo ilu w niej dentystów...";
    public String joke2 = "Co mówi nauczycielka Geografii przy mapie? \n  Witam państwa.";
    public String joke3 = "Ksiądz na lekcji religii pyta dzieci: \n- Co robimy gdy jest post? \nJasio się zgłasza:\n - Lajkujemy i udostępniamy";

    public void generateButtonOnClick (View view){
        TextView textJoke = findViewById(R.id.text_joke);
        Random rand = new Random();
        int x = rand.nextInt(3);
        ArrayList<String> jokes = new ArrayList<>();
        jokes.add(joke1);jokes.add(joke2);jokes.add(joke3);
        textJoke.setText(jokes.get(x));
    }
}

