package com.example.user.calculator;

import android.content.Intent;
import android.icu.math.BigDecimal;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Stack;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_equal;
    Button btn_add;
    Button btn_point;
    Button btn_clear;
    Button btn_del;
    Button btn_divide;
    Button btn_mul;
    Button btn_sin;
    Button btn_cos;
    Button btn_tan;
    Button btn_sqrt;
    Button btn_square;
    EditText et_input;
    boolean clear_flag;
    boolean isPoint = false;
    private int count = 0;

    Stack<BigDecimal> number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swc = (Switch) findViewById(R.id.swc);
        btn_binary = (Button) findViewById(R.id.btn_binary);
        btn_octal = (Button) findViewById(R.id.btn_octal);
        btn_hexadecima = (Button) findViewById(R.id.btn_hexadecima);
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_reduce = (Button) findViewById(R.id.btn_reduce);
        btn_equal = (Button) findViewById(R.id.btn_equal);
        btn_add = (Button) findViewById(R.id.btn_add);
        btn_point = (Button) findViewById(R.id.btn_point);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_del = (Button) findViewById(R.id.btn_del);
        btn_divide = (Button) findViewById(R.id.btn_divide);
        btn_mul = (Button) findViewById(R.id.btn_mul);
        btn_sin = (Button) findViewById(R.id.btn_sin);
        btn_cos = (Button) findViewById(R.id.btn_cos);
        btn_tan = (Button) findViewById(R.id.btn_tan);
        btn_sqrt = (Button) findViewById(R.id.btn_sqrt);
        btn_square = (Button) findViewById(R.id.btn_square);
        et_input = (EditText) findViewById(R.id.et_input);


        btn_binary.setOnClickListener(this);
        btn_octal.setOnClickListener(this);
        btn_hexadecima.setOnClickListener(this);
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_del.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
        btn_reduce.setOnClickListener(this);
        btn_equal.setOnClickListener(this);
        btn_add.setOnClickListener(this);
        btn_mul.setOnClickListener(this);
        btn_point.setOnClickListener(this);
        btn_sin.setOnClickListener(this);
        btn_cos.setOnClickListener(this);
        btn_tan.setOnClickListener(this);
        btn_sqrt.setOnClickListener(this);
        btn_square.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        swc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Intent intent = new Intent(MainActivity.this, ExchangeActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "单位转换", Toast.LENGTH_SHORT).show();

+                }
            }
        });
    }


    public void onClick(View v) {
        String str = et_input.getText().toString();//取出显示的内容
        switch (v.getId()) {
            case R.id.btn_0:
            case R.id.btn_1:
            case R.id.btn_2:
            case R.id.btn_3:
            case R.id.btn_4:
            case R.id.btn_5:
            case R.id.btn_6:
            case R.id.btn_7:
            case R.id.btn_8:
            case R.id.btn_9:
            case R.id.btn_point:
                if (clear_flag) {
                    clear_flag = false;
                    str = "";
                    et_input.setText("");
                }
                et_input.setText(str + ((Button) v).getText());
                break;
            case R.id.btn_reduce:
            case R.id.btn_add:
            case R.id.btn_divide:
            case R.id.btn_mul:
            case R.id.btn_sin:
            case R.id.btn_cos:
            case R.id.btn_tan:
            case R.id.btn_sqrt:
            case R.id.btn_square:
                if (clear_flag) {
                    clear_flag = false;
                    str = "";
                    et_input.setText("");
                }
                et_input.setText(str + " " + ((Button) v).getText() + " ");
                break;
            case R.id.btn_clear:
                et_input.setText("");
                break;
            case R.id.btn_del:
                if (clear_flag) {
                    clear_flag = false;
                    str = "";
                    et_input.setText("");
                }
                if (str != null && !str.equals("")) {
                et_input.setText(str.substring(0, str.length() - 1));
            }
                break;
            case R.id.btn_equal:
                getResult();
                break;
            case R.id.btn_binary:
                convertToBinary();
                break;
            case R.id.btn_octal:
                convertToOctal();
                break;
            case R.id.btn_hexadecima:
                convertToHexadecima();
                break;
        }
    }

    bin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            display.setText(Integer.toBinaryString((int) number[currentNumber]));
        }
    });

    oct.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            display.setText(Integer.toOctalString((int) number[currentNumber]));
        }
    });

    hex.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            display.setText(Integer.toHexString((int) number[currentNumber]));
        }
    });

}

    private void getResult() {
        String exp = et_input.getText().toString();
        if (exp.equals(" ") && exp == null) {
            return;
        }
        if (!exp.contains(" ")) {
            return;
        }
        if (clear_flag) {
            clear_flag = false;
            return;
        }
        clear_flag = true;
        String str1 = exp.substring(0, exp.indexOf(" "));/*第一个数字*/

        double result = 0;

        if (exp.substring(exp.indexOf(" ") + 1, exp.indexOf(" ") + 2).equals("＋") || exp.substring(exp.indexOf(" ") + 1, exp.indexOf(" ") + 2).equals("－") || exp.substring(exp.indexOf(" ") + 1, exp.indexOf(" ") + 2).equals("×") || exp.substring(exp.indexOf(" ") + 1, exp.indexOf(" ") + 2).equals("÷")) {
            String str3 = exp.substring(exp.indexOf(" ") + 3);
            String str2 = exp.substring(exp.indexOf(" ") + 1, exp.indexOf(" ") + 2);
            if (!str1.equals("") && !str3.equals("")) {
                if (ch == '(')
                    weightPlus += 4;
                if (ch == ')')
                    weightPlus -= 4;
                if (ch == '-' && flag == 1 || ch == '+' || ch == '×'
                        || ch == '÷' || ch == 's' || ch == 'c' || ch == 't'
                        || ch == 'g' || ch == 'l' || ch == '!' || ch == '^') {
                    switch (ch) {
                        // +-的优先级最低，为1
                        case '+':
                        case '-':
                            weightTemp = 1 + weightPlus;
                            break;
                        // x÷的优先级稍高，为2
                        case '×':
                        case '÷':
                            weightTemp = 2 + weightPlus;
                            break;
                        case 's':
                        case 'c':
                        case 't':
                        case 'g':
                        case 'l':
                        case '!':
                            weightTemp = 3 + weightPlus;
                            break;
                        default:
                            weightTemp = 4 + weightPlus;
                            break;
                    }
                if (!str1.contains(".") && !str3.contains(".") && !str2.equals("÷")) {
                    int r = (int) result;
                    et_input.setText(r + "");
                } else {
                    et_input.setText(result + "");
                }
            } else if (str1.equals("") && !str3.equals("")) {
                double s3 = Double.parseDouble(str3);
                if (str2.equals("＋")) {
                    result = 0 + s3;
                } else if (str2.equals("－")) {
                    result = 0 - s3;
                } else if (str2.equals("×")) {
                    result = 0;
                } else if (str2.equals("÷")) {
                    result = 0;
                }
                if (!str3.contains(".")) {
                    int r = (int) result;
                    et_input.setText(r + "");
                } else {
                    et_input.setText(result + "");
                }
            } else if (!str1.equals("") && str3.equals("")) {
                et_input.setText(exp);
            } else {
                et_input.setText("");
            }
        }

        if (exp.substring(exp.indexOf(" ") + 1, exp.indexOf(" ") + 4).equals("sin") || exp.substring(exp.indexOf(" ") + 1, exp.indexOf(" ") + 4).equals("cos") || exp.substring(exp.indexOf(" ") + 1, exp.indexOf(" ") + 4).equals("tan") || exp.substring(exp.indexOf(" ") + 1, exp.indexOf(" ") + 4).equals("sqr") || exp.substring(exp.indexOf(" ") + 1, exp.indexOf(" ") + 4).equals("squ")) {
            String str2 = exp.substring(exp.indexOf(" ") + 1, exp.indexOf(" ") + 4);
            if (!str1.equals("")) {
                double s1 = Double.parseDouble(str1);
                if (str2.equals("sin")) {
                    result = Math.sin(s1);
                } else if (str2.equals("cos")) {
                    result = Math.cos(s1);
                } else if (str2.equals("tan")) {
                    result = Math.tan(s1);
                } else if (str2.equals("sqr")) {
                    result = Math.sqrt(s1);
                    result = Math.sqrt(s1);
                } else if (str2.equals("squ")) {
                    result = s1 * s1;
                }
                et_input.setText(result + "");
            }
        }

    void inputIntegerPart(int num) {
        number[currentNumber] = number[currentNumber] * 10 + num * sign;
        currentIntegerDigit++;
        if (!hasEdited)
            hasEdited = true;
    }

    void inputFractionPart(double num) {
        currentFractionDigit++;
        number[currentNumber] += sign * num * Math.pow(0.1, currentFractionDigit);
        nf.setMinimumFractionDigits(currentFractionDigit);
        if (!hasEdited)
            hasEdited = true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id) {
            case R.id.action_search:
                //查找
                SearchDialog();
                return true;
            case R.id.action_insert:
                //新增单词
                InsertDialog();
                return true;
        }
    }
    */
    }
}