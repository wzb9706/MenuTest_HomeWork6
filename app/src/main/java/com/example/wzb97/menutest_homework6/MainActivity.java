package com.example.wzb97.menutest_homework6;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by wzb97 on 2016/8/30.
 */
public class MainActivity extends Activity implements View.OnClickListener,PopupMenu.OnMenuItemClickListener{
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setMenu();
    }
    private void setMenu(){
        t1=(TextView)findViewById(R.id.menuText1);
        registerForContextMenu(t1);
        t2=(TextView)findViewById(R.id.menuText2);
        t2.setOnClickListener(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater=this.getMenuInflater();
        inflater.inflate(R.menu.menu1,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.menuItem1:Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();break;
            case R.id.menuItem2:Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();break;
            case R.id.menuItem3:Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();break;
            case R.id.menuItem4:Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();break;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.menuText2){
            PopupMenu popup = new PopupMenu(this, view);
            popup.setOnMenuItemClickListener(this);
            popup.inflate(R.menu.menu1);
            popup.show();
        }
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch(item.getItemId()){
            case R.id.menuItem1:Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();break;
            case R.id.menuItem2:Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();break;
            case R.id.menuItem3:Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();break;
            case R.id.menuItem4:Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();break;
        }
        return false;
    }
}
