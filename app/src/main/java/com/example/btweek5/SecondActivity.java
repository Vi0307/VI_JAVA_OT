package com.example.btweek5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView fact1 = findViewById(R.id.fact1);
        TextView fact2 = findViewById(R.id.fact2);
        TextView fact3 = findViewById(R.id.fact3);

        fact1.setText("Mật ong không bao giờ hỏng – có thể ăn sau hàng nghìn năm.");
        fact2.setText("Não con người tiêu thụ khoảng 20% lượng oxy trong cơ thể.");
        fact3.setText("Bạch tuộc có ba trái tim và máu màu xanh.");
    }
}