package pr2.demo.com.calculator_app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class SingleActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("单利计算");
        setContentView(R.layout.activity_single);
        findViewById(R.id.calculate_single).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("single_calculate","单利计算");
                EditText edit_capital= (EditText) findViewById(R.id.capital_single);
                double capital =Double.parseDouble(edit_capital.getText().toString());
                EditText edit_rate = (EditText)findViewById(R.id.rate_single);
                double rate = Double.parseDouble(edit_rate.getText().toString());
                EditText edit_nper = (EditText)findViewById(R.id.nper_single);
                double nper = Double.parseDouble(edit_nper.getText().toString());
//                单利计算：F=P（1+r*n)
                double result = capital*(1+rate*nper);
//                Log.i("Result", String.valueOf(result));
                TextView textView = (TextView) findViewById(R.id.single_output);
                textView.setText(String.valueOf(result));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_single, menu);
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
