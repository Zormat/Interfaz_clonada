package com.example.zcorp.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Button  boton = (Button) findViewById(R.id.btEntrar);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario =( (EditText)findViewById(R.id.etUsuario)).getText().toString();
                String pwd =( (EditText)findViewById(R.id.etClave)).getText().toString();
                if(usuario.equals("ivan") && pwd.equals("123456")){
                    Intent receta = new Intent(principal.this,perfil.class);
                    startActivity(receta);

                }
                else{
                    Toast.makeText(getApplicationContext(),"Usuario o clave incorrectos",Toast.LENGTH_SHORT);

                }
            }
        });
    }
}
