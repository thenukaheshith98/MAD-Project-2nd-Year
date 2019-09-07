package com.example.student.mywallet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AddAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_account);
    }

    public void addaccount(View view) {
        Intent intent = new Intent(AddAccount.this, Account.class);
        startActivity(intent);
    }

    public void addData1(View view) {
        Intent intent = new Intent(AddAccount.this, Daily.class);
        startActivity(intent);
    }

    public void addData2(View view) {
        Intent intent = new Intent(AddAccount.this, expenses_category.class);
        startActivity(intent);
    }

    public void addData3(View view) {
        Intent intent = new Intent(AddAccount.this, income_category.class);
        startActivity(intent);
    }

    public void addData4(View view) {
        Intent intent = new Intent(AddAccount.this, My_Wallet_Repot.class);
        startActivity(intent);
    }
}
