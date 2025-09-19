package com.example.sonia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private int licznikPrzyciskow = 0;
    private TextView textViewPytanie;

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
        textViewPytanie = findViewById(R.id.textView);
    }

    public void test(View view) {
        Toast.makeText(this, R.string.zla_odpowiedz, Toast.LENGTH_SHORT).show();
    }
    public void test2(View view) {
        Toast.makeText(this, "Zły przycisk", Toast.LENGTH_SHORT).show();
        view.setVisibility(View.INVISIBLE);
        licznikPrzyciskow++;
        if(licznikPrzyciskow == 4){
            textViewPytanie.setText(R.string.brawo);
        }
    }
}