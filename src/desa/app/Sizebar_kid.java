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

public class Sizebar_kid extends Activity 
{
	private ArrayList <HashMap<String, Object>> myBooks;
	private static final String BOOKKEY = "bookname";
	private static final String PRICEKEY = "bookprice";

	
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.curr_list);
        
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        
        ListView listView = (ListView)findViewById(R.id.list);
        myBooks = new ArrayList<HashMap<String,Object>>();
        HashMap<String, Object> hm;
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "бђрэфр№ђ юфхцфћ");     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "XS");
        hm.put(PRICEKEY, "30-32");     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "S");
        hm.put(PRICEKEY, "32-34");     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "M");
        hm.put(PRICEKEY, "34-36");     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "L");
        hm.put(PRICEKEY, "36-38");     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "XL");
        hm.put(PRICEKEY, "38-40");     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "XLL");
        hm.put(PRICEKEY, "42-44");     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "XXXL");
        hm.put(PRICEKEY, "44-46");     
        myBooks.add(hm);
        
        
        //ттттттттттттттттттттттттттттттттттттттттттттттттттттттт
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "бђрэфр№ђ юсѓтш");   
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "XS");
        hm.put(PRICEKEY, "17");     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "S");
        hm.put(PRICEKEY, "17.5");     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "M");
        hm.put(PRICEKEY, "18");     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "L");
        hm.put(PRICEKEY, "18.5");     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "XL");
        hm.put(PRICEKEY, "19");     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "XLL");
        hm.put(PRICEKEY, "19.5 - 20");     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "XXXL");
        hm.put(PRICEKEY, "21 - 21.5");     
        myBooks.add(hm);
        
        
        
       SimpleAdapter adapter = new SimpleAdapter(this, myBooks, R.layout.listtext, new String[]{BOOKKEY,PRICEKEY}, new int[]{R.id.text1, R.id.text2});
       		
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
