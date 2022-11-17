package com.Alex87.miApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.Alex87.miApp.entities.OnePiece;

import java.util.ArrayList;
import java.util.List;

public class Pokemonactivity extends AppCompatActivity {
    private ImageView imageViewOnePiece;
    private TextView textViewOnePiece;
    private TextView textViewOnePiecedescripcion;
    private Button buttonSiguiente;
    private Button buttonAnterior;
    private ArrayList<OnePiece> lstOnePiece = new ArrayList<>();
    private int currenIndex=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemonactivity);
        lstOnePiece=getOnePiece();
        InitView();
    }

    private void InitView(){
        imageViewOnePiece = findViewById(R.id.imageViewOnePiece);
        textViewOnePiece = findViewById(R.id.textViewOnePiece);
        textViewOnePiecedescripcion = findViewById(R.id.textViewOnePiecedescripcion);
        buttonSiguiente = findViewById(R.id.buttonSiguiente);
        buttonAnterior = findViewById(R.id.buttonAnterior);
        buttonSiguiente.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(currenIndex<lstOnePiece.size()-1)
                        {
                            currenIndex++;
                            setCurrentOnePiece(currenIndex);
                        }


                    }
                }
        );
        buttonAnterior.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(currenIndex>0)
                        {
                            currenIndex--;
                            setCurrentOnePiece(currenIndex);
                        }


                    }
                }
        );

        setCurrentOnePiece(currenIndex);
    }
    private void setCurrentOnePiece(int index){
        imageViewOnePiece.setImageResource(lstOnePiece.get(index).getImagen());
        textViewOnePiece.setText(lstOnePiece.get(index).getName());
        textViewOnePiecedescripcion.setText(lstOnePiece.get(index).getDescripcion());
    }

    private ArrayList<OnePiece> getOnePiece(){
        ArrayList<OnePiece> newOnePiece = new ArrayList<>();
        newOnePiece.add(new OnePiece("Luffy","Capitan",R.drawable.img));
        newOnePiece.add(new OnePiece("Zoro","Espadachin",R.drawable.zoro));
        newOnePiece.add(new OnePiece("Sanji","Cocinero",R.drawable.sanji));

        return newOnePiece;
    }
}