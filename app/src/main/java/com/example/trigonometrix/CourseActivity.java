package com.example.trigonometrix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class CourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        Button course1Button = findViewById(R.id.course1Button);
        Button course2Button = findViewById(R.id.course2Button);
        Button course3Button = findViewById(R.id.course3Button);
        Button course4Button = findViewById(R.id.course4Button);
        Button course5Button = findViewById(R.id.course5Button);
        Button course6Button = findViewById(R.id.course6Button);
        Button course7Button = findViewById(R.id.course7Button);

        Button quizzButton = findViewById(R.id.quizzButton);


        course1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CourseActivity.this, Course1Activity.class);
                startActivity(intent);
            }
        });

        course2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CourseActivity.this, Course2Activity.class);
                startActivity(intent);
            }
        });

        course3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CourseActivity.this, Course3Activity.class);
                startActivity(intent);
            }
        });

        course4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CourseActivity.this, Course4Activity.class);
                startActivity(intent);
            }
        });

        course5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CourseActivity.this, Course5Activity.class);
                startActivity(intent);
            }
        });

        course6Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CourseActivity.this, Course6Activity.class);
                startActivity(intent);
            }
        });

        course7Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CourseActivity.this, Course7Activity.class);
                startActivity(intent);
            }
        });

        quizzButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CourseActivity.this, QuizzActivity.class);
                startActivity(intent);
            }
        });
    }
}
