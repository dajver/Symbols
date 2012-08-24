package desa.app;

import java.util.ArrayList;
import java.util.HashMap;


import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class Currency  extends Activity 
{
	private ArrayList <HashMap<String, Object>> myBooks;
	private static final String BOOKKEY = "bookname";
	private static final String PRICEKEY = "bookprice";
	private static final String IMGKEY = "iconfromraw";
	
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.curr_list);
        
        ListView listView = (ListView)findViewById(R.id.list);
        myBooks = new ArrayList<HashMap<String,Object>>();
        HashMap<String, Object> hm;
        
       
        //With the help of HashMap add Key, Values of Book, like name,price and icon path 
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "������");
        hm.put(PRICEKEY, "�������");
        hm.put(IMGKEY, R.drawable.uah); //i have images in res/raw folder
     
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "������");
        hm.put(PRICEKEY, "���");
        hm.put(IMGKEY,  R.drawable.usd);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "����");
        hm.put(PRICEKEY, "����������� ����������");
        hm.put(IMGKEY,  R.drawable.eur);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "���� ����������");
        hm.put(PRICEKEY, "��������������");
        hm.put(IMGKEY,  R.drawable.gbp);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "����");
        hm.put(PRICEKEY, "������");
        hm.put(IMGKEY,  R.drawable.jpy);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "�����");
        hm.put(PRICEKEY, "������");
        hm.put(IMGKEY,  R.drawable.rub);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "������");
        hm.put(PRICEKEY, "�������");
        hm.put(IMGKEY,  R.drawable.ils);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "�����");
        hm.put(PRICEKEY, "�����");
        hm.put(IMGKEY,  R.drawable.inr);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "����");
        hm.put(PRICEKEY, "�����");
        hm.put(IMGKEY,  R.drawable.krw);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "�����");
        hm.put(PRICEKEY, "�������");
        hm.put(IMGKEY,  R.drawable.ngn);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "���");
        hm.put(PRICEKEY, "�������");
        hm.put(IMGKEY,  R.drawable.thb);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "����");
        hm.put(PRICEKEY, "�������");
        hm.put(IMGKEY,  R.drawable.vnd);
        
        myBooks.add(hm);
        
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "���");
        hm.put(PRICEKEY, "����");
        hm.put(IMGKEY,  R.drawable.lak);
        
        myBooks.add(hm);
        
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "�����");
        hm.put(PRICEKEY, "��������");
        hm.put(IMGKEY,  R.drawable.khr);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "������");
        hm.put(PRICEKEY, "��������");
        hm.put(IMGKEY,  R.drawable.mnt);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "����");
        hm.put(PRICEKEY, "���������");
        hm.put(IMGKEY,  R.drawable.php);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "�����");
        hm.put(PRICEKEY, "�����-����");
        hm.put(IMGKEY,  R.drawable.crc);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "�������");
        hm.put(PRICEKEY, "��������");
        hm.put(IMGKEY,  R.drawable.pyg);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "������");
        hm.put(PRICEKEY, "����������");
        hm.put(IMGKEY,  R.drawable.afn);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "����");
        hm.put(PRICEKEY, "����");
        hm.put(IMGKEY,  R.drawable.ghc);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "���");
        hm.put(PRICEKEY, "����������� ����������");
        hm.put(IMGKEY,  R.drawable.xeu);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "������");
        hm.put(PRICEKEY, "�������");
        hm.put(IMGKEY,  R.drawable.esp);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "�����");
        hm.put(PRICEKEY, "�������");
        hm.put(IMGKEY,  R.drawable.frf);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "����");
        hm.put(PRICEKEY, "������");
        hm.put(IMGKEY,  R.drawable.itl);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "������-�������");
        hm.put(PRICEKEY, "����������");
        hm.put(IMGKEY,  R.drawable.nlg);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "������");
        hm.put(PRICEKEY, "������");
        hm.put(IMGKEY,  R.drawable.grd);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "��������");
        hm.put(PRICEKEY, "��������");
        hm.put(IMGKEY,  R.drawable.brz);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "�������");
        hm.put(PRICEKEY, "���������");
        hm.put(IMGKEY,  R.drawable.ara);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "����");
        hm.put(IMGKEY,  R.drawable.ghc);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "�����");
        hm.put(IMGKEY,  R.drawable.mill);
        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "�������");
        hm.put(IMGKEY,  R.drawable.pfen1);
        
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
