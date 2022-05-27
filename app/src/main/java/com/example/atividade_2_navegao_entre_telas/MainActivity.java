package com.example.atividade_2_navegao_entre_telas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.TypedArrayUtils;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public Button btmAdd;
    public Button btmUpdade;
    public ListView itens;
    public Item item;
    public ArrayList<Integer> arrayIDs;
    public int idSelecionado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btmAdd = findViewById(R.id.btmAdd);
        btmUpdade = findViewById(R.id.btmUpdade);
        itens = findViewById(R.id.listaItens);

        for(Item i:item.itens){
            arrayIDs.add(i.id);
        }

        btmAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, Tela_Add.class);
                startActivity(it);
            }
        });
        btmUpdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Selecione O Id do item q deseja atualizar...");
                builder.setItems(arrayIDs, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int item) {
                        idSelecionado = item;
                        Update();
                        Intent it = new Intent(MainActivity.this, TelaUpdate.class);
                        startActivity(it);
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }
    public void Update(){
        Item i = item.BuscarItem(idSelecionado);
        item.itemSelecionadoUpdate = i;
        arrayIDs.get(5);
    }
}
