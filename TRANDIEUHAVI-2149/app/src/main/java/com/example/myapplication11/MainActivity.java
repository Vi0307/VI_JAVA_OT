package com.example.myapplication11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements androidVersionAdapter.ItemClicked {

    RecyclerView recyclerView;
    androidVersionAdapter myAdapter;
    ArrayList<androidVersion> players;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.ListR);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Danh sách tuyển thủ T1
        players = new ArrayList<>();
        players.add(new androidVersion("Faker", "Mid", R.drawable.faker));
        players.add(new androidVersion("Gumayusi", "ADC", R.drawable.gumayusi));
        players.add(new androidVersion("Oner", "Jungle", R.drawable.oner));
        players.add(new androidVersion("Doran", "Top", R.drawable.doran));
        players.add(new androidVersion("Keria", "Support", R.drawable.keria));
        players.add(new androidVersion("Zeus", "Top (Cựu)", R.drawable.zeus));
        players.add(new androidVersion("Bang", "ADC (Cựu)", R.drawable.bang));
        players.add(new androidVersion("Wolf", "Support (Cựu)", R.drawable.wolf));
        players.add(new androidVersion("Bengi", "Jungle (Cựu)", R.drawable.bengi));
        players.add(new androidVersion("kkOma", "Coach", R.drawable.kkoma));

        myAdapter = new androidVersionAdapter(this, players);
        recyclerView.setAdapter(myAdapter);
    }

    @Override
    public void onItemClicked(int index) {
        Toast.makeText(this,
                "Tuyển thủ: " + players.get(index).getName(),
                Toast.LENGTH_SHORT).show();
    }
}
