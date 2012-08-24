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

public class Num_ukr extends Activity 
{
	private ArrayList <HashMap<String, Object>> myBooks;
	private static final String BOOKKEY = "bookname";
	private static final String PRICEKEY = "bookprice";
	
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.curr_list);
        
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        
        ListView listView = (ListView)findViewById(R.id.list);
        myBooks = new ArrayList<HashMap<String,Object>>();
        HashMap<String, Object> hm;

        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "652");
        hm.put(PRICEKEY, "Код Симферополя");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "432");
        hm.put(PRICEKEY, "Код Винницы");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "3222");
        hm.put(PRICEKEY, "Код Луцка");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "562");
        hm.put(PRICEKEY, "Код Днепропетровска");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "62");
        hm.put(PRICEKEY, "Код Донецка");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "412");
        hm.put(PRICEKEY, "Код Житомира");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "3122, 312, 31");
        hm.put(PRICEKEY, "Код Ужгорода ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "612, 61");
        hm.put(PRICEKEY, "Код Запорожья");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "3422,342,34");
        hm.put(PRICEKEY, "Код Ивано-Франковска");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "44");
        hm.put(PRICEKEY, "Код Киева");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "52, 522");
        hm.put(PRICEKEY, "Код Кировограда");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "64,642");
        hm.put(PRICEKEY, "Код Луганска");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "32, 322");
        hm.put(PRICEKEY, "Код Львова");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "51,512");
        hm.put(PRICEKEY, "Код Николаева");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "48, 482");
        hm.put(PRICEKEY, "Код Одессы");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "53, 522, 5322");
        hm.put(PRICEKEY, "Код Полтавы");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "36, 362, 3622");
        hm.put(PRICEKEY, "Код Ровно");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "54,542");
        hm.put(PRICEKEY, "Код Сумм");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "35, 352");
        hm.put(PRICEKEY, "Код Тернополя");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "57, 572");
        hm.put(PRICEKEY, "Код Харькова");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "55, 552");
        hm.put(PRICEKEY, "Код Херсона");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "38, 382, 3822");
        hm.put(PRICEKEY, "Код Хмельницкого");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "47, 472");
        hm.put(PRICEKEY, "Код Черкасс");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "46, 462, 4622");
        hm.put(PRICEKEY, "Код Чернигова");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "37, 372, 3722");
        hm.put(PRICEKEY, "Код Черновцов ");        
        myBooks.add(hm);
        
        
       SimpleAdapter adapter = new SimpleAdapter(this, myBooks, R.layout.list, new String[]{BOOKKEY,PRICEKEY}, new int[]{R.id.text1, R.id.text2});
       		
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
