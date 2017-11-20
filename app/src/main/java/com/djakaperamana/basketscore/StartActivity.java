package com.djakaperamana.basketscore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {

    // Deklarasi variable Object TextView
    TextView textViewTeamA;

    // Deklarasi variable Object Button
    Button buttonStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        //Inisiasi variable object TextView Team A
        textViewTeamA = findViewById(R.id.edtTeamA);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        //Script menampilkan menu
        MenuInflater inflater = new MenuInflater(StartActivity.this);
        inflater.inflate(R.menu.mainmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mnProfile:

                // script menampilkan halaman profile
                Intent intent = new Intent(StartActivity.this, ProfileActivity.class);
                startActivity(intent);

                break;
        }

        return super.onOptionsItemSelected(item);
    }

    // method btnStart untuk masuk ke mainActivity dengan membawa data dari edit text team A dan Team B
    public void btnStart(View view){

        //Inisiasi variable object TextView Team A
        textViewTeamA = findViewById(R.id.edtTeamA);

        // Masuk ke layout MainActivity dengan mengirim data
        Intent intent = new Intent(StartActivity.this, MainActivity.class);
        intent.putExtra(MainActivity.TEAM_A, textViewTeamA.getText().toString());
        startActivity(intent);
    }
}
