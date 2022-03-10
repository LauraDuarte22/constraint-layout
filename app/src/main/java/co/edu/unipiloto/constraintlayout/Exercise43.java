package co.edu.unipiloto.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Exercise43 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise43);
    }

    public void toExercise44(View view) {
        Intent intent = new Intent(this, Exercise44.class);
        startActivity(intent);
    }
}