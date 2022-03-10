package co.edu.unipiloto.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Exercise44 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise44);
    }

    public void toExercise45(View view) {
        Intent intent = new Intent(this, Exercise45.class);
        startActivity(intent);
    }
}