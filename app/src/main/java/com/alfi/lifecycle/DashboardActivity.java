package com.alfi.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    TextView shows;
    String pesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        shows = findViewById(R.id.tv_shows);

        pesan = getIntent().getStringExtra("pesan");
        shows.setText(pesan);
    }
}
