package com.example.xiaoxiaojisuanqi;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,btn_jia,btn_jian;
    private Button btn_cheng,btn_chu,btn_c,btn_deng,btn_dian,btn_left,btn_right;
    private TextView text_yunsuan,text_result;
    private String str_yunsuan, str_result;


    //实现OnClickListener接口
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //保存当前Activity的状态信息，便于下次提升加载速度，实际开发常用
        requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏注意这句一定要写在setContentView()方法的前面，不然会报错的
        setContentView(R.layout.activity_main);//设置捕获区域 activity_main.xml

        //初始化按钮监听
        Log.d("test", "4");
        initView();
        Log.d("test", "3");
    }

    // 方法：初始化View-》设置并绑定监视器
    private void initView() {
        //使用findViewById 得到对应的对象
        text_result = (TextView)findViewById(R.id.text_result);
        text_yunsuan = (TextView)findViewById(R.id.text_yunsuan);

        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_jia = (Button) findViewById(R.id.btn_jia);
        btn_jian = (Button) findViewById(R.id.btn_jian);
        btn_cheng = (Button) findViewById(R.id.btn_cheng);
        btn_chu = (Button) findViewById(R.id.btn_chu);
        btn_deng = (Button) findViewById(R.id.btn_deng);
        btn_dian = (Button) findViewById(R.id.btn_dian);
        btn_c = (Button) findViewById(R.id.btn_c);
        btn_right = (Button) findViewById(R.id.btn_right);
        btn_left = (Button) findViewById(R.id.btn_left);

        Log.d("test", "2");
        //按钮绑定点击事件的监听器
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_0.setOnClickListener(this);
        btn_jia.setOnClickListener(this);
        btn_jian.setOnClickListener(this);
        btn_cheng.setOnClickListener(this);
        btn_chu.setOnClickListener(this);
        btn_deng.setOnClickListener(this);
        btn_dian.setOnClickListener(this);
        btn_c.setOnClickListener(this);
        btn_right.setOnClickListener(this);
        btn_left.setOnClickListener(this);


        Log.d("test", "1");
        //文本框清空
        text_result.setText("");
        text_yunsuan.setText("");

        //存放算式和结果的变量清空
        str_result="";
        str_yunsuan="";
    }

    //方法：按钮的单击事件
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_1:
                str_yunsuan+="1"; //字符串尾端增加对应字符并修改计算过程框
                text_yunsuan.setText(str_yunsuan);
                break;
            case R.id.btn_2:
                str_yunsuan+="2";
                text_yunsuan.setText(str_yunsuan);
                break;
            case R.id.btn_3:
                str_yunsuan+="3";
                text_yunsuan.setText(str_yunsuan);
                break;
            case R.id.btn_4:
                str_yunsuan+="4";
                text_yunsuan.setText(str_yunsuan);
                break;
            case R.id.btn_5:
                str_yunsuan+="5";
                text_yunsuan.setText(str_yunsuan);
                break;
            case R.id.btn_6:
                str_yunsuan+="6";
                text_yunsuan.setText(str_yunsuan);
                break;
            case R.id.btn_7:
                str_yunsuan+="7";
                text_yunsuan.setText(str_yunsuan);
                break;
            case R.id.btn_8:
                str_yunsuan+="8";
                text_yunsuan.setText(str_yunsuan);
                break;
            case R.id.btn_9:
                str_yunsuan+="9";
                text_yunsuan.setText(str_yunsuan);
                break;
            case R.id.btn_0:
                str_yunsuan+="0";
                text_yunsuan.setText(str_yunsuan);
                break;
            case R.id.btn_dian :
                str_yunsuan+=".";
                text_yunsuan.setText(str_yunsuan);
                break;
            case R.id.btn_jia:
                str_yunsuan+="+";
                text_yunsuan.setText(str_yunsuan);
                break;
            case R.id.btn_jian:
                str_yunsuan+="-";
                text_yunsuan.setText(str_yunsuan);
                break;
            case R.id.btn_cheng:
                str_yunsuan+="*";
                text_yunsuan.setText(str_yunsuan);
                break;
            case R.id.btn_chu:
                str_yunsuan+="/";
                text_yunsuan.setText(str_yunsuan);
                break;
            case R.id.btn_right:
                str_yunsuan+=")";
                text_yunsuan.setText(str_yunsuan);
                break;
            case R.id.btn_left:
                str_yunsuan+="(";
                text_yunsuan.setText(str_yunsuan);
                break;

            case R.id.btn_deng:
                jisuan js = new jisuan();
                if(js.isNumber(str_yunsuan))//判断是否为数字，若是则直接输出，反之进行计算
                {str_result=str_yunsuan;text_result.setText(str_result);}
                else {
                    if(js.getResult(str_yunsuan)==null) //正确才进行运算
                        text_result.setText("出错");
                    else {
                    str_result=js.getResult(str_yunsuan).toString();
                    text_result.setText(str_result);
                    }
                }
                break;


            case R.id.btn_c:
                //文本框清空
                text_result.setText("");
                text_yunsuan.setText("");
                //存放算式和结果的变量清空
                str_result="";
                str_yunsuan="";
                break;
            default:
                break;
        }

    }

    //算法：java完成解析数学算式（计算器）一 —— 递归、正则直接遍历字符串解析 https://blog.csdn.net/qq_37969433/article/details/81174046
    public class jisuan {
        public boolean isNumber(String str) {//判断表达式是不是只有一个数字
            for(int i=0;i<str.length();i++) {
                if(!Character.isDigit(str.charAt(i)) && str.charAt(i)!='.') return false;
            }
            return true;
        }
        public Double getResult(String str) {
            if(str.isEmpty() || isNumber(str)) {//递归头
                return str.isEmpty() ? 0  : Double.parseDouble(str);
            }

            //递归体
            if(str.contains(")")) {
                int lIndex = str.lastIndexOf("(");//最后一个左括号
                int rIndex = str.indexOf(")", lIndex);//对于的右括号
                return getResult(str.substring(0,lIndex) + getResult(str.substring(lIndex+1, rIndex)) + str.substring(rIndex+1));
            }
            if(str.contains("+")) {
                int index = str.lastIndexOf("+");
                return getResult(str.substring(0,index)) + getResult(str.substring(index+1));
            }
            if(str.contains("-")) {
                int index = str.lastIndexOf("-");
                return getResult(str.substring(0,index)) - getResult(str.substring(index+1));
            }
            if(str.contains("*")) {
                int index = str.lastIndexOf("*");
                return getResult(str.substring(0,index)) * getResult(str.substring(index+1));
            }
            if(str.contains("/")) {
                int index = str.lastIndexOf("/");
                return getResult(str.substring(0,index)) / getResult(str.substring(index+1));
            }
            return null;//出错
        }
    }


}
