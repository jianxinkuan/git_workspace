package jxk.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private Button btn_reset,btn_back;
    private TextView textView_result;

    private Button[] buttons=new Button[17];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //重置按钮
        btn_reset= (Button) findViewById(R.id.btn_reset);
        //显示结果的文本框
        textView_result= (TextView) findViewById(R.id.textView_result);

        //重置
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_result.setText("0");
            }
        });

        //删除按钮
        btn_back= (Button) findViewById(R.id.btn_back);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = textView_result.getText().toString();
                if(content.length()==1){
                    textView_result.setText("0");
                }else{
                    textView_result.setText(content.substring(0,content.length()-1));
                }
            }
        });

        buttons[0]= (Button) findViewById(R.id.btn_mod);
        buttons[1]= (Button) findViewById(R.id.btn_division);
        buttons[2]= (Button) findViewById(R.id.btn_seven);
        buttons[3]= (Button) findViewById(R.id.btn_eight);
        buttons[4]= (Button) findViewById(R.id.btn_nine);
        buttons[5]= (Button) findViewById(R.id.btn_multiplication);
        buttons[6]= (Button) findViewById(R.id.btn_four);
        buttons[7]= (Button) findViewById(R.id.btn_five);
        buttons[8]= (Button) findViewById(R.id.btn_six);
        buttons[9]= (Button) findViewById(R.id.btn_minus);
        buttons[10]= (Button) findViewById(R.id.btn_one);
        buttons[11]= (Button) findViewById(R.id.btn_two);
        buttons[12]= (Button) findViewById(R.id.btn_three);
        buttons[13]= (Button) findViewById(R.id.btn_plus);
        buttons[14]= (Button) findViewById(R.id.btn_point);
        buttons[15]= (Button) findViewById(R.id.btn_zero);
        buttons[16]= (Button) findViewById(R.id.btn_bracket);


        for(int i=0;i<buttons.length;i++){
            buttons[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {

        Button now_btn= (Button) view;
        String content = textView_result.getText().toString();
        if("0".equals(content)){
            textView_result.setText(now_btn.getText());
        }else{
            textView_result.setText(content+now_btn.getText());
        }
    }
}
