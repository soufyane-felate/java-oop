package com.example.ex2_java;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       EditText name =findViewById(R.id.name);
       EditText pass =findViewById(R.id.password);
       Button click =findViewById(R.id.login);

       String txtName=name.getText().toString();
       String txtPass=pass.getText().toString();

        click.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (txtName.equals("admin")&&txtPass.equals("admin")){
                    Intent intent=new Intent(getApplicationContext(), sescend.class);
                }else if (txtName.isEmpty()||txtPass.isEmpty()){
                    Toast.makeText(MainActivity.this,"is empty",Toast.LENGTH_SHORT).show();
                }else   Toast.makeText(MainActivity.this,"inccorect",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
