package org.nsh.tugas3_elvinaafriani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_menu);
    }

    public void clickHospital(View view) {
        //icon rumah sakit
        Intent intent = new Intent(this, Hospital.class);
        startActivity(intent);
    }
}
