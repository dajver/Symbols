package desa.app;

import java.util.ArrayList;
import java.util.HashMap;


import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class Cloth_him extends Activity 
{
	private ArrayList <HashMap<String, Object>> myBooks;
	private static final String BOOKKEY = "bookname";
	private static final String PRICEKEY = "bookprice";
	private static final String IMGKEY = "iconfromraw";

	
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.curr_list);
        
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        
        ListView listView = (ListView)findViewById(R.id.list);
        myBooks = new ArrayList<HashMap<String,Object>>();
        HashMap<String, Object> hm;
        
       
        //With the help of HashMap add Key, Values of Book, like name,price and icon path 
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "Чем угодно");
        hm.put(PRICEKEY, "Химчистка всеми общепринятыми растворителями");
        hm.put(IMGKEY, R.drawable.clean02); //i have images in res/raw folder
     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "С использование углеводорода");
        hm.put(PRICEKEY, "Химчистка с использованием углеводорода, хлорного этилена, монофтортрихлорметана (чистка на основе перхлорэтилена)");
        hm.put(IMGKEY,  R.drawable.clean03);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "С использование разных химикатов");
        hm.put(PRICEKEY, "Чистка с использованием углеводорода и трифтортрихлорметана (только фреонами или уайт-спиритом)");
        hm.put(IMGKEY,  R.drawable.clean04);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "Щадящая чистка");
        hm.put(PRICEKEY, "Щадящая чистка с использованием углеводорода, хлорного этилена, монофлотрихлорметана");
        hm.put(IMGKEY,  R.drawable.clean06);
     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "Щадящая чистка 2");
        hm.put(PRICEKEY, "Щадящая чистка с использованием углеводорода и трифлотрихлорметана");
        hm.put(IMGKEY,  R.drawable.clean07);
     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "Cухая чистка");
        hm.put(IMGKEY,  R.drawable.clean01);
     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "Химчистка запрещена");
        hm.put(IMGKEY,  R.drawable.clean05);
     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "Нельзя отбеливать");
        hm.put(PRICEKEY, "Нельзя отбеливать. При стирке не использовать средства, содержащие отбеливатели (хлор)");
        hm.put(IMGKEY,  R.drawable.bleach04);
     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "Можно отбеливать");
        hm.put(PRICEKEY, "Можно отбеливать с применением хлора (использовать только холодную воду, следить за полным растворением порошка)");
        hm.put(IMGKEY,  R.drawable.bleach02);
     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "Можно отбеливать");
        hm.put(PRICEKEY, "Можно отбеливать с применением хлора (использовать только холодную воду, следить за полным растворением порошка)");
        hm.put(IMGKEY,  R.drawable.bleach);
     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "Можно отбеливать 2");
        hm.put(PRICEKEY, "Можно отбеливать, но только без хлора");
        hm.put(IMGKEY,  R.drawable.smb038);
     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "Отбеливать только без хлора");
        hm.put(IMGKEY,  R.drawable.bleach03);
     
        myBooks.add(hm);
        
       SimpleAdapter adapter = new SimpleAdapter(this, myBooks, R.layout.list, new String[]{BOOKKEY,PRICEKEY,IMGKEY}, new int[]{R.id.text1, R.id.text2, R.id.img});
       		
        listView.setAdapter(adapter);
        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE); 
    }
    
    public boolean onKeyDown(int keyCode, KeyEvent event)  
    {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) 
        {
        	Intent lIntentObj = new Intent(this, MainActivity.class);
            startActivity(lIntentObj);
            finish();
            
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }
    
    public void onConfigurationChanged(Configuration newConfig) {  
        super.onConfigurationChanged(newConfig);  
    }
 }
