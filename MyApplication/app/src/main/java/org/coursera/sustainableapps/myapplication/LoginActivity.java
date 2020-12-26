package org.coursera.sustainableapps.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    //instance variables for various views in app
    private TextView emailView;
    private TextView passwordView;
    private TextView passwordTextView;
    private TextView emailTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //these are the variables for the login boxes
        emailView=(TextView) findViewById(R.id.emailView);
        passwordView=(TextView) findViewById(R.id.passwordView);
        //these text views will display the error messages
        passwordTextView=(TextView) findViewById(R.id.passwordTextView);
        emailTextView=(TextView) findViewById(R.id.emailTextView);
        passwordTextView.setText("");
        emailTextView.setText("");
    }
    //event called on onClick method
    public void buttonClick(View view){
        String emailResult=checkEmail(emailView.getText().toString());
        String passwordResult=checkPassword(passwordView.getText().toString());
        //checks to see if both email and password are valid
        //otherwise, checks to see if both email and password are invalid
        //otherwise, only one of them is invalid, so it finds th invalid option
        if(passwordResult.equals(emailResult)){
            emailTextView.setText("Login Success");
            passwordTextView.setText("");
        }else if (!passwordResult.equals("Login success") && !emailResult.equals("Login success")){
            emailTextView.setText(emailResult);
            passwordTextView.setText(passwordResult);
        }else if(emailResult.equals("Login success")){
            passwordTextView.setText(passwordResult);
            emailTextView.setText("");
        }else{
            emailTextView.setText(emailResult);
            passwordTextView.setText("");
        }
    }
    //method to check password, returns corresponding message if password is bad
    public String checkPassword(String text){
        //creating string as long as text that's just spaces
        String spaces="";
        for(int k=0;k<text.length();k++){
            spaces+=" ";
        }
        if(text.length()<=8){
            return "The provided password is too short";
        }else if(text.equals(spaces)){
            return "The provided password is invalid";
        }else{
            return "Login success";
        }
    }
    //method to check email, similar to password method
    public String checkEmail(String text){
        //if text doesn't contain an @
        if(!text.contains("@")){
           return "Invalid email address";
        }//tests if email has characters before @
        else if(text.substring(0,text.indexOf("@")).length()<1){
            return "Invalid email address";
        }//test if email has 3 or more chars after @
        else if(text.substring(text.indexOf("@")+1).length()<3){
            return "Invalid email address";
        }//else returns success
        else{
            return "Login success";
        }
    }

}