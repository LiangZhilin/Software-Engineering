package pr2.demo.com.calculator_app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class CompoundActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("复利计算");
        setContentView(R.layout.activity_compound);
        findViewById(R.id.calculate_compound).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("compound_calculate", "复利计算");

                EditText edit_capital= (EditText) findViewById(R.id.capital_compound);
                double capital =Double.parseDouble(edit_capital.getText().toString());
                EditText edit_rate = (EditText)findViewById(R.id.rate_compound);
                double rate = Double.parseDouble(edit_rate.getText().toString());
                EditText edit_nper = (EditText)findViewById(R.id.nper_compound);
                double nper = Double.parseDouble(edit_nper.getText().toString());
//                复利计算：F=P（1+r）^n
                double result = capital*Math.pow((1+rate),nper);
//                Log.i("Result", String.valueOf(result));
                TextView textView = (TextView) findViewById(R.id.compound_output);
                textView.setText(String.valueOf(result));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_compound, menu);
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
