package com.example.titin.myapplication;


import android.content.Intent;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE =  "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Di panggil ketika tombol di tekan
    public void sendMessage(View view){
        //Deklarasi Intent
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        //Ambil text dari inputan
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        //Kirimkan text ke intent
        intent.putExtra(EXTRA_MESSAGE, message);
        //Start activity baru
        startActivity(intent);
    }
}
