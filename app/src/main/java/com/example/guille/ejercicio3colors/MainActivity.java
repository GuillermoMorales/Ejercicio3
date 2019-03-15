package com.example.guille.ejercicio3colors;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3;
    int contador=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializar();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(contador == 1)
                {
                    btn1.setBackgroundColor(getResources().getColor(R.color.rojo2));
                    contador++;
                }
                else if(contador == 2)
                {
                    btn1.setBackgroundColor(getResources().getColor(R.color.rojo3));
                    contador++;
                }
                else if(contador == 3)
                {
                    btn1.setBackgroundColor(getResources().getColor(R.color.rojo4));
                    contador++;
                }
                else if(contador==4)
                {
                    btn1.setBackgroundColor(getResources().getColor(R.color.rojo5));
                    contador++;
                }
                else if(contador==5)
                {
                    btn1.setBackgroundColor(getResources().getColor(R.color.rojo6));
                    contador = 1;
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(contador == 1)
                {
                    btn2.setBackgroundColor(getResources().getColor(R.color.verde2));
                    contador++;
                }
                else if(contador == 2)
                {
                    btn2.setBackgroundColor(getResources().getColor(R.color.verde3));
                    contador++;

                }
                else if(contador == 3)
                {
                    btn2.setBackgroundColor(getResources().getColor(R.color.verde4));
                    contador++;
                }
                else if(contador==4)
                {
                    btn2.setBackgroundColor(getResources().getColor(R.color.verde5));
                    contador++;
                }
                else if(contador==5)
                {
                    btn2.setBackgroundColor(getResources().getColor(R.color.verde6));
                    contador++;
                    contador = 1;
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(contador == 1)
                {
                    btn3.setBackgroundColor(getResources().getColor(R.color.azul2));
                    contador++;
                }
                else if(contador == 2)
                {
                    btn3.setBackgroundColor(getResources().getColor(R.color.azul3));
                    contador++;
                }
                else if(contador == 3)
                {
                    btn3.setBackgroundColor(getResources().getColor(R.color.azul4));
                    contador++;
                }
                else if(contador==4)
                {
                    btn3.setBackgroundColor(getResources().getColor(R.color.azul5));
                    contador++;
                }
                else if(contador==5)
                {
                    btn3.setBackgroundColor(getResources().getColor(R.color.azul6));
                    contador++;
                    contador = 1;
                }
            }
        });

    }



    public void inicializar()
    {
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
    }
}
