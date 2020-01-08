package com.axiomevolveprojects.ewages;
/*
This app is intended to calculate an employee's monthly salary
 */
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private int baseSalary = 30000;//In South African Rands
    private String employeeName = "Ngoni Mahachi"
    private String employeeID ="113010"
    private int overtimeHours = 10;//In hours
    private int ratePerHour= 20;//In Percentage
    private int grossSalary;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
