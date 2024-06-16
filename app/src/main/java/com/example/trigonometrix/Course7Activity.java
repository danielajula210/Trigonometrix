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


public class Course7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course7);

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.fig7_1);

        ImageView imageView2 = findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.fig7r);

        ImageView imageView3 = findViewById(R.id.imageView3);
        imageView3.setImageResource(R.drawable.fig7_2);

        ImageView imageView4 = findViewById(R.id.imageView4);
        imageView4.setImageResource(R.drawable.fig7_2r);

        ImageView imageView5 = findViewById(R.id.imageView5);
        imageView5.setImageResource(R.drawable.fig7_3);

        ImageView imageView6 = findViewById(R.id.imageView6);
        imageView6.setImageResource(R.drawable.fig7_3r);

        ImageView imageView7 = findViewById(R.id.imageView7);
        imageView7.setImageResource(R.drawable.fig7_4);

        ImageView imageView8 = findViewById(R.id.imageView8);
        imageView8.setImageResource(R.drawable.fig7_4r);

        TextView textView = findViewById(R.id.titlu);

        Button backButton = findViewById(R.id.buttonBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Course7Activity.this, CourseActivity.class);
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
