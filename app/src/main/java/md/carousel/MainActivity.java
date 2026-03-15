package md.carousel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CardAdapter adapter;
    private List<CardItem> cardItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        // Horizontal layout manager
        LinearLayoutManager layoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        // Sample data
        cardItems = new ArrayList<>();
        cardItems.add(new CardItem(R.drawable.sl300,  "Mercedes-Benz 300SL",
                "Iconic 1950s sports car with gullwing doors, known for its innovative fuel injection system."));
        cardItems.add(new CardItem(R.drawable.sl500,  "Mercedes-Benz SL500",
                "Luxury roadster from the 1990s, blending V8 performance with refined comfort."));
        cardItems.add(new CardItem(R.drawable.sl65amg,  "Mercedes-Benz SL65 AMG",
                "High-performance variant with a twin-turbo V12 engine delivering immense power."));
        cardItems.add(new CardItem(R.drawable.slr_mclaren,  "Mercedes-Benz SLR McLaren",
                "Collaboration with McLaren, featuring carbon-fiber construction and supercar performance."));
        cardItems.add(new CardItem(R.drawable.sl63amg, "Mercedes-Benz SL63 AMG",
                "Modern AMG roadster with aggressive styling, advanced tech, and thrilling driving dynamics."));

        adapter = new CardAdapter(cardItems);
        recyclerView.setAdapter(adapter);


    }
}