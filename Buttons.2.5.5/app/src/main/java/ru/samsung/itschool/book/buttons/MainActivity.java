package ru.samsung.itschool.book.buttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //объявляем переменные для компонент (виджетов)
    TextView txt;
    EditText etxt;
    Button bt1,bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // инициализируем переменные объектами связанными с ID виджетов
        txt = (TextView)findViewById(R.id.txt1);
        etxt = (EditText)findViewById(R.id.etxt1);
        bt1 = (Button)findViewById(R.id.bt1);
        bt2 = (Button)findViewById(R.id.bt2);
        //создаем обработчик
        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View v){
                switch(v.getId()){
                    case R.id.bt1: txt.setText(etxt.getText().toString()); break;
                    case R.id.bt2: txt.setText("ничего не напишу!"); break;
                }
            }
        };
        bt1.setOnClickListener(listener);
        bt2.setOnClickListener(listener);
    }


    // декларативно заданный обработчик (атрибут onClick)
    public void quit(View view){
        finish();
    }


}
