package my.edu.tarc.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayName(View v) {
        TextView textViewName;
        EditText editTextName, editTextAge;

        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextAge = (EditText) findViewById(R.id.editTextAge);
        textViewName = (TextView) findViewById(R.id.textViewName);
        int age = Integer.parseInt(editTextAge.getText().toString())+1;
        textViewName.setText(getResources().getString(R.string.greeting) + " " + editTextName.getText() + ", you will be " + age + " in 2018");
    }

    public void removeName(View v){
        TextView textViewName = (TextView)findViewById(R.id.textViewName);
        textViewName.setText("Hello World");
    }
}

