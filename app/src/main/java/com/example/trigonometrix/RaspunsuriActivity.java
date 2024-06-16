package com.example.trigonometrix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import android.widget.ImageView;


public class RaspunsuriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raspunsuri);

        TextView textView = findViewById(R.id.titlu);

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.r1);

        ImageView imageView2 = findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.r2);

        ImageView imageView3 = findViewById(R.id.imageView3);
        imageView3.setImageResource(R.drawable.r4);

        ImageView imageView4 = findViewById(R.id.imageView4);
        imageView4.setImageResource(R.drawable.r3);

        ImageView imageView5 = findViewById(R.id.imageView5);
        imageView5.setImageResource(R.drawable.r5);

        Button backButton = findViewById(R.id.buttonBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RaspunsuriActivity.this, CourseActivity.class);
                startActivity(intent);
            }
        });
    }

    private String getTextFromRawResource(int resourceId) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            InputStream inputStream = getResources().openRawResource(resourceId);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
