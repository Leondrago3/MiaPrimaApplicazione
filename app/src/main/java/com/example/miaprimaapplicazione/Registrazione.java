package com.example.miaprimaapplicazione;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Registrazione extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registrazione);



            Button button = findViewById(R.id.Registrazione2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Registrazione.this, SecondActivity.class);
                startActivity(intent);
            }
        });


        //collegamento elementi grafici
        EditText nome = findViewById(R.id.Nome);
        EditText cognome = findViewById(R.id.Cognome);
        EditText username = findViewById(R.id.Username);
        EditText password = findViewById(R.id.Password);
        EditText data = findViewById(R.id.DataNascita);
        Button registrazione = findViewById(R.id.Registrazione2);

        registrazione.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Utente utente = new Utente(nome.getText().toString(), cognome.getText().toString(), username.getText().toString(), password.getText().toString(), data.getText().toString());
                //uso dei log
                Log.d("Registrazione", "Nome: " + nome.getText().toString() + " Cognome: " + cognome.getText().toString() + " Username: " + username.getText().toString() + " Password: " + password.getText().toString() + " Data: " + data.getText().toString());
                //messaggio di registrazione
                Toast.makeText(Registrazione.this, "Registrazione avvenuta con successo", Toast.LENGTH_SHORT).show();
            }
        });
    }
}