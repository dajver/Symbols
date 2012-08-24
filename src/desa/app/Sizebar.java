package desa.app;


import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Sizebar  extends Activity implements OnClickListener
{
	ImageButton woman;
	ImageButton man;
	ImageButton kids;
	
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.size);
            
            woman = (ImageButton) findViewById(R.id.imageButton5);
            woman.setOnClickListener(this);
            
            man = (ImageButton) findViewById(R.id.imageButton6);
            man.setOnClickListener(this);
            
            kids = (ImageButton) findViewById(R.id.imageButton7);
            kids.setOnClickListener(this);
            
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
        
        public void onClick(View v)
        {
        	Intent intent = new Intent();
        
        	switch(v.getId())
        	{
	        	case R.id.imageButton5:
	        	{
	        		intent.setClass(this, Sizebar_woman.class);
	        		startActivity(intent);
	        	}break;
	        	
	        	case R.id.imageButton6:
	        	{
	        		intent.setClass(this, Sizebar_man.class);
	        		startActivity(intent);
	        	}break;
	        	
	        	case R.id.imageButton7:
	        	{
	        		intent.setClass(this, Sizebar_kid.class);
	        		startActivity(intent);
	        	}break;
        	}
            finish();
        }
}
