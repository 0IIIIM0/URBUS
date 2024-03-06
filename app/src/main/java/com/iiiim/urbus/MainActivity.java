package com.iiiim.urbus;


import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText etUsuario,etContraseña;
    private Button bAcceder,bRegistrarse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etContraseña=findViewById(R.id.editTextTextPassword);
        etUsuario=findViewById(R.id.editTextTextPersonName);
        bAcceder=findViewById(R.id.button);
        bRegistrarse=findViewById(R.id.button2);

        bAcceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etUsuario.getText().toString().trim();
                String password = etContraseña.getText().toString().trim();
                if (email.equals("") && password.equals("")){
                    Toast.makeText(getApplicationContext(),"favor de ingresar datos al campo ",Toast.LENGTH_LONG).show();
                }else{
                    if (email.equals("nachito") && password.equals("1234")){
                        Intent intent1 =new Intent(getApplicationContext(),MainActivity2.class);
                        startActivity(intent1);
                        finish();


                    }else{
                        Toast.makeText(getApplicationContext(),"Datos incorrectos. Favor de verificar datos",Toast.LENGTH_LONG).show();
                    }
                }
            }

        });


        bRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 =new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(intent2);
            }
        });

    }
}