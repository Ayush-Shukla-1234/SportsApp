package io.mastercoding.sportsapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Sports> sportsList;

    private CustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView = findViewById(R.id.recyclerView);
        sportsList = new ArrayList<>();

        Sports s1 = new Sports("Football", R.drawable.football);
        Sports s2 = new Sports("Basketball", R.drawable.basketball);
        Sports s3 = new Sports("Volleyball", R.drawable.volley);
        Sports s4 = new Sports("Tennis", R.drawable.tennis);
        Sports s5 = new Sports("Ping Pong", R.drawable.ping);

        sportsList.add(s1);
        sportsList.add(s2);
        sportsList.add(s3);
        sportsList.add(s4);
        sportsList.add(s5);

        myAdapter = new CustomAdapter(sportsList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);



    }
}