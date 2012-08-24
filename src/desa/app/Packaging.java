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

public class Packaging  extends Activity 
{
	private ArrayList <HashMap<String, Object>> myBooks;
	private static final String BOOKKEY = "bookname";
	private static final String PRICEKEY = "bookprice";
	
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pack);
        
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        
        ListView listView = (ListView)findViewById(R.id.list);
        myBooks = new ArrayList<HashMap<String,Object>>();
        HashMap<String, Object> hm;
        
      
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "00-13");
        hm.put(PRICEKEY, "��� � ������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "30-37");
        hm.put(PRICEKEY, "�������");
        myBooks.add(hm);

        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "380");
        hm.put(PRICEKEY, "��������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "383");
        hm.put(PRICEKEY, "��������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "385");
        hm.put(PRICEKEY, "��������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "387");
        hm.put(PRICEKEY, "������-�����������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "400-440");
        hm.put(PRICEKEY, "��������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "45 � 49");
        hm.put(PRICEKEY, "������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "460-469");
        hm.put(PRICEKEY, "������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "471");
        hm.put(PRICEKEY, "�������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "474");
        hm.put(PRICEKEY, "�������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "475");
        hm.put(PRICEKEY, "������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "476");
        hm.put(PRICEKEY, "�����������");
        myBooks.add(hm);

        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "477");
        hm.put(PRICEKEY, "�����");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "478");
        hm.put(PRICEKEY, "����������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "479");
        hm.put(PRICEKEY, "��� �����");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "480");
        hm.put(PRICEKEY, "���������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "481v");
        hm.put(PRICEKEY, "����������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "482");
        hm.put(PRICEKEY, "�������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "484");
        hm.put(PRICEKEY, "�������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "485");
        hm.put(PRICEKEY, "�������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "486");
        hm.put(PRICEKEY, "������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "487");
        hm.put(PRICEKEY, "���������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "489");
        hm.put(PRICEKEY, "�������");
        myBooks.add(hm);

        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "50");
        hm.put(PRICEKEY, "��������������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "520");
        hm.put(PRICEKEY, "������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "528");
        hm.put(PRICEKEY, "�����");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "529");
        hm.put(PRICEKEY, "����");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "531");
        hm.put(PRICEKEY, "���������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "535");
        hm.put(PRICEKEY, "������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "539");
        hm.put(PRICEKEY, "��������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "54");
        hm.put(PRICEKEY, "������� � ����������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "560");
        hm.put(PRICEKEY, "����������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "569");
        hm.put(PRICEKEY, "��������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "57");
        hm.put(PRICEKEY, "�����");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "590");
        hm.put(PRICEKEY, "������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "594");
        hm.put(PRICEKEY, "�������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "599");
        hm.put(PRICEKEY, "�������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "600-601");
        hm.put(PRICEKEY, "���");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "609");
        hm.put(PRICEKEY, "��������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "611");
        hm.put(PRICEKEY, "�������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "613");
        hm.put(PRICEKEY, "�����");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "616");
        hm.put(PRICEKEY, "�����");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "619");
        hm.put(PRICEKEY, "�����");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "621");
        hm.put(PRICEKEY, "�����");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "622");
        hm.put(PRICEKEY, "������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "625");
        hm.put(PRICEKEY, "��������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "626");
        hm.put(PRICEKEY, "����");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "628");
        hm.put(PRICEKEY, "���������� ������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "64");
        hm.put(PRICEKEY, "���������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "690-693");
        hm.put(PRICEKEY, "���");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "70");
        hm.put(PRICEKEY, "��������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "729");
        hm.put(PRICEKEY, "�������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "73");
        hm.put(PRICEKEY, "������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "740");
        hm.put(PRICEKEY, "���������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "741");
        hm.put(PRICEKEY, "���������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "742");
        hm.put(PRICEKEY, "��������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "743");
        hm.put(PRICEKEY, "���������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "744");
        hm.put(PRICEKEY, "����� ����");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "745");
        hm.put(PRICEKEY, "������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "746");
        hm.put(PRICEKEY, "������������� ����������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "750");
        hm.put(PRICEKEY, "�������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "759");
        hm.put(PRICEKEY, "���������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "76");
        hm.put(PRICEKEY, "���������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "770");
        hm.put(PRICEKEY, "��������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "773");
        hm.put(PRICEKEY, "�������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "775");
        hm.put(PRICEKEY, "����");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "779");
        hm.put(PRICEKEY, "���������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "780");
        hm.put(PRICEKEY, "����");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "784");
        hm.put(PRICEKEY, "��������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "786");
        hm.put(PRICEKEY, "�������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "789");
        hm.put(PRICEKEY, "��������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "80-83");
        hm.put(PRICEKEY, "������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "84");
        hm.put(PRICEKEY, "�������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "850");
        hm.put(PRICEKEY, "����");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "858");
        hm.put(PRICEKEY, "��������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "859");
        hm.put(PRICEKEY, "�����");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "860");
        hm.put(PRICEKEY, "���������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "867");
        hm.put(PRICEKEY, "�������� �����");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "869");
        hm.put(PRICEKEY, "������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "87");
        hm.put(PRICEKEY, "����������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "880");
        hm.put(PRICEKEY, "����� �����");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "885");
        hm.put(PRICEKEY, "�������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "888");
        hm.put(PRICEKEY, "��������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "890");
        hm.put(PRICEKEY, "�����");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "893");
        hm.put(PRICEKEY, "�������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "899");
        hm.put(PRICEKEY, "���������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "90-91");
        hm.put(PRICEKEY, "�������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "93");
        hm.put(PRICEKEY, "���������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "94");
        hm.put(PRICEKEY, "����� ��������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "955");
        hm.put(PRICEKEY, "�������");
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "958");
        hm.put(PRICEKEY, "�����");
        myBooks.add(hm);
        
        
       SimpleAdapter adapter = new SimpleAdapter(this, myBooks, R.layout.listtext, new String[]{BOOKKEY,PRICEKEY}, new int[]{R.id.text1, R.id.text2,});
       		
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
