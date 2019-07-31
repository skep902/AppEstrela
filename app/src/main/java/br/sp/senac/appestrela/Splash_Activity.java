package br.sp.senac.appestrela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);
    }

    public void abrirJanela(View view) {

        //Toast.makeText(getApplicationContext(), "Cliquei Aqui (: ", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(getApplicationContext(), Login_Activity.class);
        startActivity(intent);
    }
}
