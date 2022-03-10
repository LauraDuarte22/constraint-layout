package co.edu.unipiloto.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.appsearch.ReportSystemUsageRequest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Exercise46 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise46);
    }

    public void toReport(View view) {
        Intent intent = new Intent(this, Report.class);
        startActivity(intent);
    }
}