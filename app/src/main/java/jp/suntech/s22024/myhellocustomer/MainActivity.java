package jp.suntech.s22024.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btDis = findViewById(R.id.btDis);

        HelloListener listener = new HelloListener();

        btDis.setOnClickListener(listener);

        Button btClearname = findViewById(R.id.btClearname);
        btClearname.setOnClickListener(listener);

        Button btClearrise = findViewById(R.id.btClearresi);
        btClearrise.setOnClickListener(listener);
    }

    private class HelloListener implements View.OnClickListener{


        @Override
        public void onClick(View view){
            EditText input1 = findViewById(R.id.etName);
            EditText input2 = findViewById(R.id.etResi);
            TextView output = findViewById(R.id.tvOutput);

            int id = view.getId();

                if(id == R.id.btDis) {
                    String inputStr1 = input1.getText().toString();
                    String inputStr2 = input2.getText().toString();
                    output.setText(inputStr2 + "にお住いの" + inputStr1 + "さん、こんにちは！");

                }

                if(id == R.id.btClearname){
                    String inputStr1 = input1.getText().toString();
                    String inputStr2 = input2.getText().toString();
                    input1.setText("");
                    output.setText(inputStr2 + "にお住いの" + inputStr1 + "さん、こんにちは！");
                }

                if(id == R.id.btClearresi){
                    input2.setText("");
                    output.setText("");
                }

        }

    }

}