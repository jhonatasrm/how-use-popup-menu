package com.jhonatasrm.how_use_popup_menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    public void startPopupMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.inflate(R.menu.popup_menu);
        popupMenu.setOnMenuItemClickListener(this);
    }

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
