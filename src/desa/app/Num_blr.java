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

public class Num_blr extends Activity 
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
        hm.put(BOOKKEY, "162");
        hm.put(PRICEKEY, "Брест");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "163");
        hm.put(PRICEKEY, "Барановичи");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1643");
        hm.put(PRICEKEY, "Береза");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1646");
        hm.put(PRICEKEY, "Ганцевичи ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1644");
        hm.put(PRICEKEY, "Дрогичин ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1641");
        hm.put(PRICEKEY, "Жабинка");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1652");
        hm.put(PRICEKEY, "Иваново");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1645");
        hm.put(PRICEKEY, "Ивацевичи");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1631 ");
        hm.put(PRICEKEY, "Каменец ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1642 ");
        hm.put(PRICEKEY, "Кобрин ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1647 ");
        hm.put(PRICEKEY, "Лунинец ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1633 ");
        hm.put(PRICEKEY, "Ляховичи ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1651 ");
        hm.put(PRICEKEY, "Малорита ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "165 ");
        hm.put(PRICEKEY, "Пинск ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1632 ");
        hm.put(PRICEKEY, "Пружаны ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1655 ");
        hm.put(PRICEKEY, "Столин ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "212 ");
        hm.put(PRICEKEY, "Витебск ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2131 ");
        hm.put(PRICEKEY, "Бешенковичи ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2153 ");
        hm.put(PRICEKEY, "Браслав ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2151 ");
        hm.put(PRICEKEY, "Верхнедвинск ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2156 ");
        hm.put(PRICEKEY, "Глубокое ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2157  ");
        hm.put(PRICEKEY, "Докшицы  ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2137 ");
        hm.put(PRICEKEY, "Дуброва ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2132 ");
        hm.put(PRICEKEY, "Лепель ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2138 ");
        hm.put(PRICEKEY, "Лиозно ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2152 ");
        hm.put(PRICEKEY, "Миоры ");        
        myBooks.add(hm);

        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "214 ");
        hm.put(PRICEKEY, "Новополоцк ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2161 ");
        hm.put(PRICEKEY, "Орша ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "214 ");
        hm.put(PRICEKEY, "Полоцк ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2155 ");
        hm.put(PRICEKEY, "Поставы ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2159 ");
        hm.put(PRICEKEY, "Россоны ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2135 ");
        hm.put(PRICEKEY, "Сенно ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2136 ");
        hm.put(PRICEKEY, "Толочин ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2158 ");
        hm.put(PRICEKEY, "Ушачи ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2133 ");
        hm.put(PRICEKEY, "Чашники ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2154 ");
        hm.put(PRICEKEY, "Шарковщина ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2130 ");
        hm.put(PRICEKEY, "Шумилино ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "163");
        hm.put(PRICEKEY, "Гомель ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2336  ");
        hm.put(PRICEKEY, "Буда- Кошелево");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2344 ");
        hm.put(PRICEKEY, "Брагин ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2330 ");
        hm.put(PRICEKEY, "Ветка ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2333 ");
        hm.put(PRICEKEY, "Добруш ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2354 ");
        hm.put(PRICEKEY, "Ельск ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2353 ");
        hm.put(PRICEKEY, "Житковичи ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2345 ");
        hm.put(PRICEKEY, "Калинковичи ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2337 ");
        hm.put(PRICEKEY, "Корма ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2356 ");
        hm.put(PRICEKEY, "Лельчицы ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2347 ");
        hm.put(PRICEKEY, "Лоев ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2355  ");
        hm.put(PRICEKEY, "Наровля  ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2357 ");
        hm.put(PRICEKEY, "Октябрьский ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2350 ");
        hm.put(PRICEKEY, "Петриков ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2340 ");
        hm.put(PRICEKEY, "Речица ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2339 ");
        hm.put(PRICEKEY, "Рогачев ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2342 ");
        hm.put(PRICEKEY, "Светлогорск ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2346 ");
        hm.put(PRICEKEY, "Хойники ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2332 ");
        hm.put(PRICEKEY, "Чечерск ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1522 ");
        hm.put(PRICEKEY, "Гродно ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1511 ");
        hm.put(PRICEKEY, "Берестовица ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1512 ");
        hm.put(PRICEKEY, "Волковыск ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1594 ");
        hm.put(PRICEKEY, "Вороново ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1563 ");
        hm.put(PRICEKEY, "Дятлово ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1564 ");
        hm.put(PRICEKEY, "Зельва ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1595 ");
        hm.put(PRICEKEY, "Ивье ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1596 ");
        hm.put(PRICEKEY, "Кореличи ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1561 ");
        hm.put(PRICEKEY, "Лида ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1515 ");
        hm.put(PRICEKEY, "Мосты ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1597 ");
        hm.put(PRICEKEY, "Новогрудок ");        
        myBooks.add(hm);


        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1591 ");
        hm.put(PRICEKEY, "Островец ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1593 ");
        hm.put(PRICEKEY, "Ошмяны ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1513 ");
        hm.put(PRICEKEY, "Свислочь ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1562 ");
        hm.put(PRICEKEY, "Слоним ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1592 ");
        hm.put(PRICEKEY, "Сморгонь ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1514 ");
        hm.put(PRICEKEY, "Щучин ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "17 ");
        hm.put(PRICEKEY, "Минск ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1715 ");
        hm.put(PRICEKEY, "Березино ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1777 ");
        hm.put(PRICEKEY, "Борисов ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "163");
        hm.put(PRICEKEY, "Барановичи");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1771 ");
        hm.put(PRICEKEY, "Вилейка ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1772 ");
        hm.put(PRICEKEY, "Воложин ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1716 ");
        hm.put(PRICEKEY, "Дзержинск ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1775 ");
        hm.put(PRICEKEY, "Жодино ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1793 ");
        hm.put(PRICEKEY, "Клецк ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1719 ");
        hm.put(PRICEKEY, "Копыль ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1796 ");
        hm.put(PRICEKEY, "Крупки ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1774 ");
        hm.put(PRICEKEY, "Логойск ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1794 ");
        hm.put(PRICEKEY, "Любань ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1713 ");
        hm.put(PRICEKEY, "Марьина Горка");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1773 ");
        hm.put(PRICEKEY, "Молодечно ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1797 ");
        hm.put(PRICEKEY, "Мядель ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1797 ");
        hm.put(PRICEKEY, "Нарочь ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1770 ");
        hm.put(PRICEKEY, "Несвиж ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1779 ");
        hm.put(PRICEKEY, "Плещеницы ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1713 ");
        hm.put(PRICEKEY, "Пуховичи ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1795 ");
        hm.put(PRICEKEY, "Слуцк ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1776 ");
        hm.put(PRICEKEY, "Смолевичи ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1710 ");
        hm.put(PRICEKEY, "Солигорск ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1792 ");
        hm.put(PRICEKEY, "Ст. Дороги ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1717 ");
        hm.put(PRICEKEY, "Столбцы ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1718 ");
        hm.put(PRICEKEY, "Узда ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "1714 ");
        hm.put(PRICEKEY, "Червень ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "222 ");
        hm.put(PRICEKEY, "Могилев ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2232 ");
        hm.put(PRICEKEY, "Белыничи ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2251 ");
        hm.put(PRICEKEY, "Бобруйск ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "225 ");
        hm.put(PRICEKEY, "Бобруйск ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2231 ");
        hm.put(PRICEKEY, "Быхов ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2230 ");
        hm.put(PRICEKEY, "Глуск ");        
        myBooks.add(hm);

        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2233 ");
        hm.put(PRICEKEY, "Горки ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2248 ");
        hm.put(PRICEKEY, "Дрибин ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2237 ");
        hm.put(PRICEKEY, "Кировск ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2244 ");
        hm.put(PRICEKEY, "Климовичи ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2236 ");
        hm.put(PRICEKEY, "Кличев ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2245 ");
        hm.put(PRICEKEY, "Костюковичи ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2238 ");
        hm.put(PRICEKEY, "Краснополье ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2241 ");
        hm.put(PRICEKEY, "Кричев ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2234 ");
        hm.put(PRICEKEY, "Круглое ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2240 ");
        hm.put(PRICEKEY, "Мстиславль ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2235 ");
        hm.put(PRICEKEY, "Осиповичи ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2246 ");
        hm.put(PRICEKEY, "Славгород ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2247 ");
        hm.put(PRICEKEY, "Хотимск ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2242 ");
        hm.put(PRICEKEY, "Чаусы ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2243 ");
        hm.put(PRICEKEY, "Чериков ");        
        myBooks.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, "2239 ");
        hm.put(PRICEKEY, "Шклов ");        
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
