package com.example.trigonometrix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuizzActivity extends AppCompatActivity {

    private String[] questions = {
            "1. Care este sinusul unghiului de 30°?",
            "2. Calculează sin(30°) + cos(60°).",
            "3. Care este cosinusul unghiului de 60°?",
            "4. Care este sinusul ungiului de 90°?.",
            "5. Care este sinusul ungiului de 180°?",
            "6. Care este sinusul unghiului de 15°?",
            "7. Care este cosinusul unghiului de 0°?",
            "8. Daca sinx=3/5, cât este cosx?",
            "9. Care este tangenta unghiului de 60°?",
            "10. Calculează sin(60°) * cos(30°)?."
    };

    private String[] answers = {
            "0.5",
            "1",
            "0.5",
            "1",
            "0",
            "0.26",
            "1",
            "0.8",
            "0.26",
            "0.75"
    };

    private int currentQuestionIndex = 0;
    private int score = 0;

    private TextView questionTextView;
    private EditText answerEditText;
    private Button submitButton;
    private TextView resultTextView;
    private TextView scoreTextView;
    private Button raspButton;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz);

        questionTextView = findViewById(R.id.questionTextView);

        answerEditText = findViewById(R.id.answerEditText);

        submitButton = findViewById(R.id.submitButton);

        resultTextView = findViewById(R.id.resultTextView);

        scoreTextView = findViewById(R.id.scoreTextView);

        raspButton = findViewById(R.id.buttonRasp);
        raspButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizzActivity.this, RaspunsuriActivity.class);
                startActivity(intent);
            }
        });

        backButton = findViewById(R.id.buttonBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizzActivity.this, CourseActivity.class);
                startActivity(intent);
            }
        });

        displayQuestion();

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer();
            }
        });
    }
    private void displayQuestion() {
        scoreTextView.setVisibility(View.GONE);
        raspButton.setVisibility(View.GONE);
        backButton.setVisibility(View.GONE);
        if (currentQuestionIndex < questions.length) {
            questionTextView.setText(questions[currentQuestionIndex]);
            answerEditText.setText("");
            resultTextView.setText("");
        } else {
            showFinalScore();
        }
    }

    private void checkAnswer() {
        String userAnswer = answerEditText.getText().toString();
        String correctAnswer = answers[currentQuestionIndex];
        if (userAnswer.equals(correctAnswer)) {
            score++;
        }
        currentQuestionIndex++;
        displayQuestion();
    }

    private void showFinalScore() {
        questionTextView.setVisibility(View.GONE);
        answerEditText.setVisibility(View.GONE);
        submitButton.setVisibility(View.GONE);
        scoreTextView.setVisibility(View.VISIBLE);
        scoreTextView.setText("Scor final: " + score + "/" + questions.length);
        raspButton.setVisibility(View.VISIBLE);
        backButton.setVisibility(View.VISIBLE);

        resultTextView.setText("Răspunsuri corecte:\n\n");

        for (int i = 0; i < questions.length; i++) {
            resultTextView.append(questions[i] + " - " + answers[i] + "\n");
        }
    }
}
