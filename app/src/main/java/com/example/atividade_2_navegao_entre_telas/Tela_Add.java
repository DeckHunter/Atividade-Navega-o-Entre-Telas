package com.example.atividade_2_navegao_entre_telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Tela_Add extends AppCompatActivity {

    public EditText nomeAdd;
    public EditText descricaoAdd;
    public Button buttonAdd;
    public Item item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela__add);

        nomeAdd = findViewById(R.id.addNome);
        descricaoAdd = findViewById(R.id.addDescricao);
        buttonAdd = findViewById(R.id.add);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!nomeAdd.getText().toString().isEmpty()) {
                    if(!descricaoAdd.getText().toString().isEmpty()) {
                        item.AddItem(nomeAdd.getText().toString(),descricaoAdd.getText().toString());
                        Intent it = new Intent(Tela_Add.this, MainActivity.class);
                        startActivity(it);
                    }else{
                        Toast.makeText(getApplicationContext(), "Descrição Não Adicionado", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(getApplicationContext(), "Nome Não Adicionado", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
