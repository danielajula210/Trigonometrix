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


public class Course5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course5);

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.fig5);

        ImageView imageView2 = findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.fig5_2);

        TextView textView = findViewById(R.id.textViewCourse5);
        String text = getTextFromRawResource(R.raw.ciorna5);
        textView.setText(text);

        TextView textView2 = findViewById(R.id.textViewCourse5_2);
        String text2 = getTextFromRawResource(R.raw.ciorna5_2);
        textView2.setText(text2);

        TextView textView3 = findViewById(R.id.titlu);

        Button backButton = findViewById(R.id.buttonBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Course5Activity.this, CourseActivity.class);
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
