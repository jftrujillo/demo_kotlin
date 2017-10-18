package com.example.jhonfredytrujilloortega.demomoneda;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.jhonfredytrujilloortega.demomoneda.models.Moneda;

public class MainActivityJava extends AppCompatActivity {

    Button buttonDolar,buttonEuro, buttonMexico;
    EditText pesos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_java);
        buttonDolar = (Button) findViewById(R.id.dolares);
        buttonEuro = (Button) findViewById(R.id.euros);
        buttonMexico = (Button) findViewById(R.id.mexicanos);
        pesos = (EditText) findViewById(R.id.pesos);

        final Moneda dolar = new Moneda();
        dolar.setNombre("Dolar");
        dolar.setValor(3000);
        dolar.setPais("Estados unidos");

        final Moneda euro = new Moneda();
        euro.setNombre("Euro");
        euro.setValor(3200);
        euro.setPais("Estados unidos");

        final Moneda mexico = new Moneda();
        mexico.setNombre("Peso mexicano");
        mexico.setValor(1700);
        mexico.setPais("Estados unidos");

        buttonDolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isValid(pesos.getText().toString())) {
                    int valorPesos = Integer.valueOf(pesos.getText().toString());
                    Toast.makeText(MainActivityJava.this, getTranformacion(valorPesos, dolar), Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(MainActivityJava.this,"valor invalido",Toast.LENGTH_SHORT).show();
            }
        });

        buttonEuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isValid(pesos.getText().toString())){
                int valorPesos = Integer.valueOf(pesos.getText().toString());
                Toast.makeText(MainActivityJava.this,getTranformacion(valorPesos,euro),Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(MainActivityJava.this,"valor invalido",Toast.LENGTH_SHORT).show();

            }
        });

        buttonMexico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isValid(pesos.getText().toString())){
                int valorPesos = Integer.valueOf(pesos.getText().toString());
                Toast.makeText(MainActivityJava.this,getTranformacion(valorPesos,mexico),Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(MainActivityJava.this,"valor invalido",Toast.LENGTH_SHORT).show();
            }
        });
    }


    public int getTranformacion(int valor, Moneda moneda){
        return valor/moneda.getValor();
    }

    public boolean isValid(String valor){
        return (valor.equals("") || valor.startsWith(" "));
    }

    @Override
    public void onBackPressed() {
       AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Advertencia");
        builder.setMessage("Esta seguro que desea salir?");
        builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("Cancelar",null);
        builder.setCancelable(true);
    }
}
