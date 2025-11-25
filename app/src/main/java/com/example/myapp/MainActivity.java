package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultText;
    private Button button;
    private int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialiser les vues
        resultText = findViewById(R.id.resultText);
        button = findViewById(R.id.button);

        // Configurer le click listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount++;
                updateResultText();
            }
        });

        // Message initial
        resultText.setText("Appuyez sur le bouton!");
    }

    private void updateResultText() {
        String message = "Vous avez cliqué " + clickCount + " fois!";
        resultText.setText(message);
    }
}
