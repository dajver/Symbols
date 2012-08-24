package desa.app;



import android.app.TabActivity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity 
{
	TabHost tabHost;
	
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        tabHost = getTabHost();
        
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        
		TabSpec cloth = tabHost.newTabSpec("tab1");             
		cloth.setIndicator("Одежда", getResources().getDrawable(R.drawable.icon_cloth));                            
		Intent clothIntent = new Intent(this, Clothing.class);
		cloth.setContent(clothIntent);
		
		tabHost.addTab(cloth); 
		
		TabSpec size = tabHost.newTabSpec("tab2");             
		size.setIndicator("Размеры", getResources().getDrawable(R.drawable.icon_size));
		Intent sizeIntent = new Intent(this, Sizebar.class);
		size.setContent(sizeIntent);
		
		tabHost.addTab(size);
		
		TabSpec numbers = tabHost.newTabSpec("tab3");
		numbers.setIndicator("Номера", getResources().getDrawable(R.drawable.icon_num));
		Intent numIntent = new Intent(this, Numbers.class);
		numbers.setContent(numIntent);
		
		tabHost.addTab(numbers);
		
		TabSpec pack = tabHost.newTabSpec("tab4");
		pack.setIndicator("Штрих код", getResources().getDrawable(R.drawable.icon_pack));
		Intent packIntent = new Intent(this, Packaging.class);
		pack.setContent(packIntent);
		
		tabHost.addTab(pack);
		
		TabSpec curr = tabHost.newTabSpec("tab5");
		curr.setIndicator("Валюта", getResources().getDrawable(R.drawable.icon_curr));
		Intent currIntent = new Intent(this, Currency.class);
		curr.setContent(currIntent);
		
		 tabHost.addTab(curr);
		 
		 for(int i=0;i<tabHost.getTabWidget().getChildCount();i++)
		 {
			 tabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.green);
		 }
		tabHost.getTabWidget().setCurrentTab(0);
		tabHost.getTabWidget().getChildAt(0).setBackgroundResource(R.drawable.green);

    }
    
    public void onTabChanged(String tabId) 
    {
    	 for(int i=0;i<tabHost.getTabWidget().getChildCount();i++)
    	 {
    		 tabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.green);
    	 }
    	 
    	 	tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundResource(R.drawable.green);
    }
    
    public void onConfigurationChanged(Configuration newConfig) {  
        super.onConfigurationChanged(newConfig);  
    }

}