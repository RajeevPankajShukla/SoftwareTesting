package anubhav.calculatorapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class UnitWeight extends AppCompatActivity {

    private EditText e1,e2;
    private Spinner s1,s2;
    private int count1=0;
    private ConvertingUnits.Weight ca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_weight);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        e1=(EditText)findViewById(R.id.item1);
        e2=(EditText)findViewById(R.id.item2);
        s1=(Spinner)findViewById(R.id.spinner1);
        s2=(Spinner)findViewById(R.id.spinner2);

        ca=new ConvertingUnits.Weight();
    }

    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.num0:
                e1.setText(e1.getText()+"0");
                break;

            case R.id.num1:
                e1.setText(e1.getText()+"1");
                break;

            case R.id.num2:
                e1.setText(e1.getText()+"2");
                break;

            case R.id.num3:
                e1.setText(e1.getText()+"3");
                break;

            case R.id.num4:
                e1.setText(e1.getText()+"4");
                break;

            case R.id.num5:
                e1.setText(e1.getText()+"5");
                break;

            case R.id.num6:
                e1.setText(e1.getText()+"6");
                break;

            case R.id.num7:
                e1.setText(e1.getText()+"7");
                break;

            case R.id.num8:
                e1.setText(e1.getText()+"8");
                break;

            case R.id.num9:
                e1.setText(e1.getText()+"9");
                break;

            case R.id.dot:
                if (count1==0)
                {
                    e1.setText(e1.getText()+".");
                    count1++;
                }
                break;

            case R.id.clear:
                e1.setText("");
                e2.setText("");
                count1=0;
                break;

            case R.id.backSpace:
                if(e1.length()!=0)
                {
                    String text=e1.getText().toString();
                    if(text.endsWith("."))
                        count1=0;
                    String newText=text.substring(0,text.length()-1);
                    e1.setText(newText);
                }
                break;

            case R.id.equal:
                int item1=s1.getSelectedItemPosition();
                int item2=s2.getSelectedItemPosition();
                double value1=Double.parseDouble(e1.getText().toString());
                double result=evaluate(item1,item2,value1);
                e2.setText(result+"");
                break;
        }
    }

    public double evaluate(int item1,int item2,double value)
    {
        double temp=0.0;
        if(item1==item2)
            return value;
        else
        {
            switch (item1)
            {
                case 0:
//                    temp = ca.MilliToKilo(value);
                    temp = (value/1000000);
                    break;
                case 1:
//                    temp = ca.CentiToKilo(value);
                    temp = (value/100000);
                    break;
                case 2:
//                    temp = ca.DeciToKilo(value);
                    temp = (value/10000);
                    break;
                case 3:
//                    temp=ca.GramToKilo(value);
                    temp = (value/1000);
                    break;
                case 4:
                    temp=value;
                    break;
                case 5:
//                    temp=ca.MetricTonnesToKilo(value);
                    temp = (value*1000);
                    break;
                case 6:
//                    temp = ca.PoundsToKilo(value);
                    temp =(value/2.20462);
                    break;
                case 7:
//                    temp = ca.OuncesToKilo(value);
                    temp =(value/35.274);
                    break;
            }

            switch (item2)
            {
                case 0:
//                    temp = ca.KiloToMilli(temp);
                    temp = (temp*1000000);
                    break;
                case 1:
//                    temp = ca.KiloToCenti(temp);
                    temp = (temp*100000);
                    break;
                case 2:
//                    temp = ca.KiloToDeci(temp);
                    temp = (temp*10000);
                    break;
                case 3:
//                    temp = ca.KiloToGram(temp);
                    temp = (temp*1000);
                    break;
                case 5:
//                    temp = ca.KiloToMetricTonnes(temp);
                    temp = (temp/1000);
                    break;
                case 6:
//                    temp = ca.KiloToPounds(temp);
                    temp = (temp*2.20462);
                    break;
                case 7:
//                    temp = ca.KiloToOunces(temp);
                    temp = (temp*35.274);
                    break;
            }
            return temp;
        }
    }
}
