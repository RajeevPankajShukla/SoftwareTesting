package anubhav.calculatorapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class UnitLength extends AppCompatActivity {

    private EditText e1,e2;
    private Spinner s1,s2;
    private int count1=0;
    private ConvertingUnits.Length ca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_length);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        e1=(EditText)findViewById(R.id.item1);
        e2=(EditText)findViewById(R.id.item2);
        s1=(Spinner)findViewById(R.id.spinner1);
        s2=(Spinner)findViewById(R.id.spinner2);

        ca=new ConvertingUnits.Length();
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
//                    temp=ca.NanoToMeter(value);
                    temp = value/1000000000;
                    break;
                case 1:
//                    temp=ca.MilliToMeter(value);
                    temp = (value)/1000;
                    break;
                case 2:
//                    temp=ca.CentiToMeter(value);
                    temp = (value)/100;
                    break;
                case 3:
                    temp = value;
                    break;
                case 4:
//                    temp=ca.KiloToMeter(value);
                    temp = value*1000;
                    break;
                case 5:
//                    temp=ca.InchToMeter(value);
                    temp = (value)/39.3701;
                    break;
                case 6:
//                    temp=ca.FootToMeter(value);
                    temp = (value)/3.28084;
                    break;
                case 7:
//                    temp=ca.YardToMeter(value);
                    temp = (value)/1.09361;
                    break;
                case 8:
//                    temp=ca.MileToMeter(value);
                    temp = (value)/0.000621371;
                    break;
            }

            switch (item2)
            {
                case 0:
//                    temp=ca.MeterToNano(temp);
                    temp = (temp)*1000000000;
                    break;
                case 1:
//                    temp=ca.MeterToMilli(temp);
                    temp = (temp)*1000;
                    break;
                case 2:
//                    temp=ca.MeterToCenti(temp);
                    temp = (temp)*100;
                    break;
                case 4:
//                    temp=ca.MeterToKilo(temp);
                    temp = (temp)/1000;
                    break;
                case 5:
//                    temp=ca.MeterToInch(temp);
                    temp = (temp)*39.3701;
                    break;
                case 6:
//                    temp=ca.MeterToFoot(temp);
                    temp = (temp)*3.28084;
                    break;
                case 7:
//                    temp=ca.MeterToYard(temp);
                    temp = (temp)*1.09361;
                    break;
                case 8:
//                    temp=ca.MeterToMile(temp);
                    temp = (temp)*0.000621371;
                    break;
            }
            return temp;
        }
    }
}
