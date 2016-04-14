package pr2.demo.com.calculator_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MemuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("菜单");
        setContentView(R.layout.activity_memu);
        findViewById(R.id.btn_SingleInterest).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Log.i("hdfjk","fhdsjfh");
                startActivity(new Intent(MemuActivity.this,SingleActivity.class));
            }
        });

        findViewById(R.id.btn_CompundInterest).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MemuActivity.this,CompoundActivity.class));
                Log.i("复利计算", "复利计算");
            }
        });

        findViewById(R.id.btn_CalculateCapital).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MemuActivity.this,CapitalActivity.class));
                Log.i("本金计算", "本金计算");
            }
        });

        findViewById(R.id.btn_CalculateNper).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MemuActivity.this,NperActivity.class));
                Log.i("时长计算", "时长计算");
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_memu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
