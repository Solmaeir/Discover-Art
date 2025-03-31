package com.example.discoverart;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button ArchitectureCategory;
    Button PaintingsCategory;
    Button SculptureCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArchitectureCategory= findViewById(R.id.GoToArchitecture);
        PaintingsCategory= findViewById(R.id.GoToPaintings);
        SculptureCategory= findViewById(R.id.GoToSculpture);

        ArchitectureCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ArchitectureActivity.class);
                startActivity(intent);
            }
        });
        PaintingsCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, PaintingsActivity.class);
                startActivity(intent1);
            }
        });
        SculptureCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, SculptureActivty.class);
                startActivity(intent2);
            }
        });


    }
}