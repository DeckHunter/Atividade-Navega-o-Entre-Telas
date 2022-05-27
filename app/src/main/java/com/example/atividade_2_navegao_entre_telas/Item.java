package com.example.atividade_2_navegao_entre_telas;

import java.util.ArrayList;

public class Item {
    ArrayList<Item> itens;

    Item itemSelecionadoUpdate;
    String nome = "";
    String descrição = "";
    int id;

    public void AddItem(String n, String d){
        Item i = new Item();
        i.nome = n;
        i.descrição = d;
        i.id = GerarIdItem();
    }

    public int GerarIdItem(){
        return itens.size() + 1;
    }

    public boolean FindItem(int id){
        boolean result = false;
        for (Item item : itens)
        {
            if(item.id == id){
                result = true;
            }else{
                result = false;
            }
        }
        return result;
    }

    public boolean UpdateItem(Item item){
        boolean result = false;

        for(Item i : itens){
            if(i.id == item.id){
                i.nome = item.nome;
                i.descrição = item.descrição;
                result = true;
            }
        }
        return result;
    }

    public Item BuscarItem(int id){
        Item itemRetornar = new Item();
        for (Item i : itens){
            if(i.id == id){
                itemRetornar = i;
            }
        }
        return itemRetornar;
    }

}
