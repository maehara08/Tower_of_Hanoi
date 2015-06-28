package com.example.riku.tower_of_hanoi;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainGame_Activity extends ActionBarActivity {

    ImageView tumiki0;//積木１の画像
    ImageView tumiki1;//積木２の画像
    ImageView tumiki2;//積木3の画像
    ImageView tumiki5;

    boolean[] tumicheck = new boolean[9];

    boolean check1=false;
    boolean check2=false;
    boolean check3=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game_);
        /*Button tu1= (Button) findViewById(R.id.tumi1);
        tu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //インテントのインスタンス生成
                Intent intent = new Intent(this,select_activity.class);
                //次のアクティビティ起動
                startActivity(intent);
            }


        });*/
        tumiki0 = (ImageView) findViewById(R.id.tumi1);
        tumiki5 = (ImageView) findViewById(R.id.tumi6);
        for(int i = 0;i < 9;i++){
            if(i<3) tumicheck[i] = true;
            else tumicheck[i] = false;
        }


    }

    public void tumi1(View v){
        check1 = true;

    }
    public void tumi2(View v){
        if(check2==false){
            if(check1 == true){
                if(tumicheck[0] = true){
                    if(tumicheck[5] == false) {
                        tumicheck[0] = false;
                        tumiki0.setVisibility(View.INVISIBLE);
                        tumiki5.setImageResource(R.drawable.tumi1);
                        tumiki5.setVisibility(View.VISIBLE);
                        tumicheck[5] = true;
                    }else if(tumicheck[6] == false){

                    }
                }else if(tumicheck[1]){

                }
            }else if(check3 == true){

            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_game_, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
