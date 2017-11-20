package com.djakaperamana.basketscore;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    deklarasi variable static untuk menerima data yang dikirim dari start activity
    public static String TEAM_A = "TEAM_A";

//    deklarasi variable object TextView untuk Team A
    TextView textViewTeamA;

//    deklarasi variable object TextView untuk Score Team A
    TextView textViewScoreTeamA;

//    deklarasi variable bilangan bulat untuk Score Team A
    int scoreTeamA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Menampilkan Tanda Panah untuk kembali ke halaman utama
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        deklarasi variable team a yang berisi nulai dari variable TEAM_A
        String teamA = getIntent().getStringExtra(TEAM_A);

        textViewTeamA = findViewById(R.id.txtTeamA);
        textViewTeamA.setText(teamA);

        textViewScoreTeamA = findViewById(R.id.scoreTeamA);
        textViewScoreTeamA.setText(String.valueOf(scoreTeamA));
    }


    //    method increase 1 Team A
    public void btnPlusSatuTeamA(View view){
        scoreTeamA += 1;
        textViewScoreTeamA = findViewById(R.id.scoreTeamA);
        textViewScoreTeamA.setText(String.valueOf(scoreTeamA));
    }

    //    method increase 2 Team A
    public void btnPlusDuaTeamA(View view){
        scoreTeamA += 2;
        textViewScoreTeamA = findViewById(R.id.scoreTeamA);
        textViewScoreTeamA.setText(String.valueOf(scoreTeamA));
    }

    //    method increase 3 Team C
    public void btnPlusTigaTeamA(View view){
        scoreTeamA += 3;
        textViewScoreTeamA = findViewById(R.id.scoreTeamA);
        textViewScoreTeamA.setText(String.valueOf(scoreTeamA));
    }

    public void btnResset(View view){
//        masukan source kode untuk meresset kedua score dari team a dan team b


    }


//    Method yang Mengimplementasi interface menu select item
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if( id == android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
