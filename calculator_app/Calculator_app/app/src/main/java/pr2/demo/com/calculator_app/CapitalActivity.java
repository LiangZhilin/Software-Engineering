package pr2.demo.com.calculator_app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class CapitalActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("本金计算");
        setContentView(R.layout.activity_capital);
        findViewById(R.id.btn_CalculateCapital).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("capital_calculate", "复利计算");

                EditText edit_result= (EditText) findViewById(R.id.result);
                double result =Double.parseDouble(edit_result.getText().toString());
                EditText edit_rate = (EditText)findViewById(R.id.rate_capital);
                double rate = Double.parseDouble(edit_rate.getText().toString());
                EditText edit_nper = (EditText)findViewById(R.id.nper_capital);
                double nper = Double.parseDouble(edit_nper.getText().toString());
//                复利计算：F=P（1+r）^n
//                double deposit = result/Math.pow((1+interest_rate),nper);
                double capital = result/Math.pow((1+rate),nper);
//                Log.i("Result", String.valueOf(result));
                TextView textView = (TextView) findViewById(R.id.capital_output);
                textView.setText(String.valueOf(capital));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_capital, menu);
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
