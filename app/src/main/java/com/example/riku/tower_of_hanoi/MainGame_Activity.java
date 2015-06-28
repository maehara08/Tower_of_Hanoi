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
    ImageView tumiki3;
    ImageView tumiki4;
    ImageView tumiki5;
    ImageView tumiki6;
    ImageView tumiki7;
    ImageView tumiki8;
    ImageView tumiki9;


    boolean[] tumicheck = new boolean[9];

    boolean treecheck1=false;
    boolean treecheck2=false;
    boolean treecheck3=false;


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
        tumiki1 = (ImageView) findViewById(R.id.tumi2);
        tumiki2 = (ImageView) findViewById(R.id.tumi3);
        tumiki3 = (ImageView) findViewById(R.id.tumi4);
        tumiki4 = (ImageView) findViewById(R.id.tumi5);
        tumiki5 = (ImageView) findViewById(R.id.tumi6);
        tumiki6 = (ImageView) findViewById(R.id.tumi7);
        tumiki7 = (ImageView) findViewById(R.id.tumi8);
        tumiki8 = (ImageView) findViewById(R.id.tumi9);

        for(int i = 0;i < 9;i++){
            if(i<3) tumicheck[i] = true;
            else tumicheck[i] = false;
        }


    }

    public void tree1(View v){
        if (treecheck1==false){


            treecheck1=true;


        }

    }
    public void tree2(View v){
        //２回目で２木がタップされた
        if(treecheck2==false){
            //木１がタップされてる
            if(treecheck1 == true){
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
            }
        }else{


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
