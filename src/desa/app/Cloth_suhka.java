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

public class Cloth_suhka extends Activity 
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
        hm.put(BOOKKEY, "При высокой температуре");
        hm.put(PRICEKEY, "Сушить при высокой температуре");
        hm.put(IMGKEY, R.drawable.dry05); //i have images in res/raw folder
     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "При средней температуре");
        hm.put(PRICEKEY, "Сушить при средней температуре (нормальная сушка)");
        hm.put(IMGKEY,  R.drawable.dry04);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "При низкой температуре");
        hm.put(PRICEKEY, "Сушить при низкой температуре (щадящая сушка)");
        hm.put(IMGKEY,  R.drawable.dry03);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "Не выжимать");
        hm.put(PRICEKEY, "Нельзя выжимать и сушить в стиральной машине");
        hm.put(IMGKEY,  R.drawable.dry02);
     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "Можно выжимать");
        hm.put(PRICEKEY, "Можно отжимать и сушить в стиральной машине");
        hm.put(IMGKEY,  R.drawable.dry01);
     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "Сушить вертикально");
        hm.put(PRICEKEY, "Сушить вертекально без отжима");
        hm.put(IMGKEY,  R.drawable.dry11);
     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "Сушить горизонтально");
        hm.put(PRICEKEY, "Сушить на горизонтальной поверхности");
        hm.put(IMGKEY,  R.drawable.dry12);
     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "Можно сушить на веревку");
        hm.put(IMGKEY,  R.drawable.dry10);
     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "Ни сушить");
        hm.put(IMGKEY,  R.drawable.dry09);
     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "Сушить в тени");
        hm.put(IMGKEY,  R.drawable.dry3);
     
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
