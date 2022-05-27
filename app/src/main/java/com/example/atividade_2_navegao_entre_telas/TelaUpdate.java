package com.example.atividade_2_navegao_entre_telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaUpdate extends AppCompatActivity {

    public EditText nomeUpdate;
    public EditText descricaoUpdade;
    public Button buttonUpdate;
    public Item item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_update);

        nomeUpdate = findViewById(R.id.AtualizarNome);
        descricaoUpdade = findViewById(R.id.AtualizarDescricao);
        buttonUpdate = findViewById(R.id.atualizar);

        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(item.UpdateItem(item.itemSelecionadoUpdate)) {
                    Intent it = new Intent(TelaUpdate.this, MainActivity.class);
                    startActivity(it);
                }
            }
        });
    }
}
