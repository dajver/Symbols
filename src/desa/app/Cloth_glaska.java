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

public class Cloth_glaska extends Activity 
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
        hm.put(BOOKKEY, "Можно погладить");
        hm.put(IMGKEY, R.drawable.iron01); //i have images in res/raw folder
     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "Высокая температура");
        hm.put(PRICEKEY, "Гладить при высокой температуре (до 200 С)  Хлопок, лёнт");
        hm.put(IMGKEY,  R.drawable.iron03);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "Определення температура нагрева");
        hm.put(PRICEKEY, "Гладить при температуре утюга не выше 140 градусов");
        hm.put(IMGKEY,  R.drawable.smb052);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "Средняя теспература нагрева");
        hm.put(PRICEKEY, "Гладить при средней температуре (до 130 С) Шерсть, шелк, вискоза, полиэфир, полиэстер");
        hm.put(IMGKEY,  R.drawable.iron04);
     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "Низкая температура нагрева");
        hm.put(PRICEKEY, "Гладить слегка нагретым утюгом (температура до 120 градусов по цельсию) Нейлон, капрон, вискоза, полиакрил, полиамид, ацетат");
        hm.put(IMGKEY,  R.drawable.iron05);
     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "Не гладить");
        hm.put(IMGKEY,  R.drawable.iro02);
     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "Не отпаривать");
        hm.put(IMGKEY,  R.drawable.iron06);
     
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
