/*
package com.example.scopemeal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.scopemeal.retrofit.RetrofitClient;
import com.example.scopemeal.retrofit.User;
import com.google.android.material.button.MaterialButton;
import com.rengwuxian.materialedittext.MaterialEditText;

import java.util.function.Consumer;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

public class LoginActivityy extends AppCompatActivity {
    User myAPI;
    CompositeDisposable compositeDisposable = new CompositeDisposable();

    MaterialEditText edt_email,edt_password;
    MaterialButton btn_register,btn_login;


    @Override
    protected void onStop() {
        compositeDisposable.clear();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        compositeDisposable.clear();
        super.onDestroy();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activityy);

        //Init api
        Retrofit retrofit = RetrofitClient.getInstance();
        myAPI = retrofit.create(User.class);

        //View
        btn_login = (MaterialButton) findViewById(R.id.login_button);
        btn_register = (MaterialButton) findViewById(R.id.register_button);

        edt_email = (MaterialEditText) findViewById(R.id.edt_email);
        edt_password = (MaterialEditText) findViewById(R.id.edt_password);

        //event
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginUser(edt_email.getText().toString(),edt_password.getText().toString());
            }
        });



    }

    private void loginUser(String email, String password) {
        compositeDisposable.add(myAPI.loginUser(email, password)
        .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new  Consumer<String>(){

                    @Override
                    public void accept(String s) {

                    }
                })

        );
    }
}*/
