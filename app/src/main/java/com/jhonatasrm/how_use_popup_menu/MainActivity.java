package com.jhonatasrm.how_use_popup_menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

// implementando onMenuItemClickListener para o PopupMenu
public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    // método onCreate da classe
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    // inicializa o PopupMenu
    public void startPopupMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.inflate(R.menu.popup_menu);
        popupMenu.setOnMenuItemClickListener(this);
    }

    // verifica o item clicado no menu exibindo um toast com a mensagem
    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        if(menuItem.getItemId() == R.id.next){
            Toast.makeText(this, "NEXT", Toast.LENGTH_SHORT).show();
            return true;
        }else if (menuItem.getItemId() == R.id.previous){
            Toast.makeText(this, "PREVIOUS", Toast.LENGTH_SHORT).show();
            return true;
        }else if (menuItem.getItemId() == R.id.reload){
            Toast.makeText(this, “RELOAD”, Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }
}
