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

    ImageView tumiki0;//積木１
    ImageView tumiki1;
    ImageView tumiki2;
    ImageView tumiki3;
    ImageView tumiki4;
    ImageView tumiki5;
    ImageView tumiki6;
    ImageView tumiki7;
    ImageView tumiki8;
    ImageView tumiki9;
    ImageView tr1;
    ImageView tr2;
    ImageView tr3;





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

                Intent intent = new Intent(this,select_activity.class);


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



            //２から1へ移動させる
            if(treecheck2==true){
                //一番上はどれ？
                if (tumicheck[3]==true){

                    //１の空いてる場所を探していく
                    if (tumicheck[2]==false){

                        tumicheck[3] = false;
                        tumiki3.setVisibility(View.INVISIBLE);
                        tumiki2.setImageDrawable(tumiki3.getDrawable());
                        tumiki2.setVisibility(View.VISIBLE);

                        tumicheck[2] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;




                    }else if (tumicheck[1]==false){
                        tumicheck[3] = false;
                        tumiki3.setVisibility(View.INVISIBLE);
                        tumiki1.setImageDrawable(tumiki3.getDrawable());
                        tumiki1.setVisibility(View.VISIBLE);

                        tumicheck[1] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;



                    }else if (tumicheck[0]==false){
                        tumicheck[3] = false;
                        tumiki3.setVisibility(View.INVISIBLE);
                        tumiki0.setImageDrawable(tumiki3.getDrawable());
                        tumiki0.setVisibility(View.VISIBLE);

                        tumicheck[0] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;

                    }



                }else if (tumicheck[4]==true){
                    //１の空いてる場所を探していく
                    if (tumicheck[2]==false){
                       /* tumicheck[3]=false;
                        tumiki3.setVisibility(View.INVISIBLE);
                        tumiki2.setImageResource(R.drawable.tumiki111);
                        tumiki2.setVisibility(View.VISIBLE);
                        tumicheck[2]=true;*/

                        tumicheck[4] = false;
                        tumiki4.setVisibility(View.INVISIBLE);
                        tumiki2.setImageDrawable(tumiki4.getDrawable());
                        tumiki2.setVisibility(View.VISIBLE);

                        tumicheck[2] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;




                    }else if (tumicheck[1]==false){
                        tumicheck[4] = false;
                        tumiki4.setVisibility(View.INVISIBLE);
                        tumiki1.setImageDrawable(tumiki4.getDrawable());
                        tumiki1.setVisibility(View.VISIBLE);

                        tumicheck[1] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;



                    }else if (tumicheck[0]==false){
                        tumicheck[4] = false;
                        tumiki4.setVisibility(View.INVISIBLE);
                        tumiki0.setImageDrawable(tumiki4.getDrawable());
                        tumiki0.setVisibility(View.VISIBLE);

                        tumicheck[0] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;

                    }

                }else if (tumicheck[5]==true){

                    //１の空いてる場所を探していく
                    if (tumicheck[2]==false){
                       /* tumicheck[3]=false;
                        tumiki3.setVisibility(View.INVISIBLE);
                        tumiki2.setImageResource(R.drawable.tumiki111);
                        tumiki2.setVisibility(View.VISIBLE);
                        tumicheck[2]=true;*/

                        tumicheck[5] = false;
                        tumiki5.setVisibility(View.INVISIBLE);
                        tumiki2.setImageDrawable(tumiki5.getDrawable());
                        tumiki2.setVisibility(View.VISIBLE);

                        tumicheck[2] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;




                    }else if (tumicheck[1]==false){
                        tumicheck[5] = false;
                        tumiki5.setVisibility(View.INVISIBLE);
                        tumiki1.setImageDrawable(tumiki5.getDrawable());
                        tumiki1.setVisibility(View.VISIBLE);

                        tumicheck[1] = true;

                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;



                    }else if (tumicheck[0]==false){
                        tumicheck[5] = false;
                        tumiki5.setVisibility(View.INVISIBLE);
                        tumiki0.setImageDrawable(tumiki5.getDrawable());
                        tumiki0.setVisibility(View.VISIBLE);

                        tumicheck[0] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;

                    }

                }else {
                    treecheck1=false;
                    treecheck2=false;
                    treecheck3=false;
                    //移動せせる積木がない

                }



                //3から１へ
            }else if (treecheck3==true){
                //一番上はどれ？
                if (tumicheck[6]==true){

                    //3の空いてる場所を探していく
                    if (tumicheck[2]==false){

                        tumicheck[6] = false;
                        tumiki6.setVisibility(View.INVISIBLE);
                        tumiki2.setImageDrawable(tumiki6.getDrawable());
                        tumiki2.setVisibility(View.VISIBLE);
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;

                        tumicheck[2] = true;




                    }else if (tumicheck[1]==false){
                        tumicheck[6] = false;
                        tumiki6.setVisibility(View.INVISIBLE);
                        tumiki1.setImageDrawable(tumiki6.getDrawable());
                        tumiki1.setVisibility(View.VISIBLE);

                        tumicheck[1] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;



                    }else if (tumicheck[0]==false){
                        tumicheck[6] = false;
                        tumiki6.setVisibility(View.INVISIBLE);
                        tumiki0.setImageDrawable(tumiki6.getDrawable());
                        tumiki0.setVisibility(View.VISIBLE);

                        tumicheck[0] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;

                    }



                }else if (tumicheck[7]==true){
                    //3の空いてる場所を探していく
                    if (tumicheck[2]==false){


                        tumicheck[7] = false;
                        tumiki7.setVisibility(View.INVISIBLE);
                        tumiki2.setImageDrawable(tumiki7.getDrawable());
                        tumiki2.setVisibility(View.VISIBLE);

                        tumicheck[2] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;



                    }else if (tumicheck[1]==false){
                        tumicheck[7] = false;
                        tumiki7.setVisibility(View.INVISIBLE);
                        tumiki1.setImageDrawable(tumiki7.getDrawable());
                        tumiki1.setVisibility(View.VISIBLE);

                        tumicheck[1] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;




                    }else if (tumicheck[0]==false){
                        tumicheck[7] = false;
                        tumiki7.setVisibility(View.INVISIBLE);
                        tumiki0.setImageDrawable(tumiki7.getDrawable());
                        tumiki0.setVisibility(View.VISIBLE);

                        tumicheck[0] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;



                    }

                }else if (tumicheck[8]==true){

                    //１の空いてる場所を探していく
                    if (tumicheck[2]==false){
                       /* tumicheck[3]=false;
                        tumiki3.setVisibility(View.INVISIBLE);
                        tumiki2.setImageResource(R.drawable.tumiki111);
                        tumiki2.setVisibility(View.VISIBLE);
                        tumicheck[2]=true;*/

                        tumicheck[8] = false;
                        tumiki8.setVisibility(View.INVISIBLE);
                        tumiki2.setImageDrawable(tumiki8.getDrawable());
                        tumiki2.setVisibility(View.VISIBLE);

                        tumicheck[8] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;




                    }else if (tumicheck[1]==false){
                        tumicheck[8] = false;
                        tumiki8.setVisibility(View.INVISIBLE);
                        tumiki1.setImageDrawable(tumiki8.getDrawable());
                        tumiki1.setVisibility(View.VISIBLE);

                        tumicheck[1] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;


                    }else if (tumicheck[0]==false){
                        tumicheck[8] = false;
                        tumiki8.setVisibility(View.INVISIBLE);
                        tumiki0.setImageDrawable(tumiki8.getDrawable());
                        tumiki0.setVisibility(View.VISIBLE);

                        tumicheck[0] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;
                    }

                }else {
                    //移動せせる積木がない

                }


            } else {
                treecheck1=true;


            }

        }else{
            treecheck1=false;
        }









    }
    public void tree2(View v){

        if(treecheck2==false){
            //1から２へ
            if(treecheck1 == true){
                if(tumicheck[0] == true){
                    if(tumicheck[5] == false) {
                        tumicheck[0] = false;
                        tumiki0.setVisibility(View.INVISIBLE);
                        tumiki5.setImageDrawable(tumiki0.getDrawable());
                        tumiki5.setVisibility(View.VISIBLE);
                        tumicheck[5] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;

                    }else if(tumicheck[4] == false){
                        tumicheck[0] = false;
                        tumiki0.setVisibility(View.INVISIBLE);
                        tumiki4.setImageDrawable(tumiki0.getDrawable());
                        tumiki4.setVisibility(View.VISIBLE);
                        tumicheck[4] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;

                    }else if (tumicheck[3]==false){
                        tumicheck[0] = false;
                        tumiki0.setVisibility(View.INVISIBLE);
                        tumiki3.setImageDrawable(tumiki0.getDrawable());
                        tumiki3.setVisibility(View.VISIBLE);
                        tumicheck[3] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;

                    }
                }else if(tumicheck[1]==true){
                    if(tumicheck[5] == false) {
                        tumicheck[1] = false;
                        tumiki1.setVisibility(View.INVISIBLE);
                        tumiki5.setImageDrawable(tumiki1.getDrawable());
                        tumiki5.setVisibility(View.VISIBLE);
                        tumicheck[5] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;

                    }else if(tumicheck[4] == false){
                        tumicheck[1] = false;
                        tumiki1.setVisibility(View.INVISIBLE);
                        tumiki4.setImageDrawable(tumiki1.getDrawable());
                        tumiki4.setVisibility(View.VISIBLE);
                        tumicheck[4] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;

                    }else if (tumicheck[3]==false){
                        tumicheck[1] = false;
                        tumiki1.setVisibility(View.INVISIBLE);
                        tumiki3.setImageDrawable(tumiki1.getDrawable());
                        tumiki3.setVisibility(View.VISIBLE);
                        tumicheck[3] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;

                    }


                }else if (tumicheck[2]==true){
                    if(tumicheck[5] == false) {
                        tumicheck[2] = false;
                        tumiki2.setVisibility(View.INVISIBLE);
                        tumiki5.setImageDrawable(tumiki2.getDrawable());
                        tumiki5.setVisibility(View.VISIBLE);
                        tumicheck[5] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;

                    }else if(tumicheck[4] == false){
                        tumicheck[2] = false;
                        tumiki2.setVisibility(View.INVISIBLE);
                        tumiki4.setImageDrawable(tumiki2.getDrawable());
                        tumiki4.setVisibility(View.VISIBLE);
                        tumicheck[4] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;

                    }else if (tumicheck[3]==false){
                        tumicheck[2] = false;
                        tumiki2.setVisibility(View.INVISIBLE);
                        tumiki3.setImageDrawable(tumiki2.getDrawable());
                        tumiki3.setVisibility(View.VISIBLE);
                        tumicheck[3] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;

                    }

                }
                //3から2へ
            }else if (treecheck3==true){
                if (tumicheck[6]==true){
                    if (tumicheck[5]==false){
                        tumicheck[6] = false;
                        tumiki6.setVisibility(View.INVISIBLE);
                        tumiki5.setImageDrawable(tumiki6.getDrawable());
                        tumiki5.setVisibility(View.VISIBLE);
                        tumicheck[5] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;


                    }else if (tumicheck[4]==false){
                        tumicheck[6] = false;
                        tumiki6.setVisibility(View.INVISIBLE);
                        tumiki4.setImageDrawable(tumiki6.getDrawable());
                        tumiki4.setVisibility(View.VISIBLE);
                        tumicheck[4] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;


                    }else if (tumicheck[3]==false){
                        tumicheck[6] = false;
                        tumiki6.setVisibility(View.INVISIBLE);
                        tumiki4.setImageDrawable(tumiki6.getDrawable());
                        tumiki4.setVisibility(View.VISIBLE);
                        tumicheck[4] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;

                    }

                }
                else if (tumicheck[7]==true){
                    if (tumicheck[5]==false){
                        tumicheck[7] = false;
                        tumiki7.setVisibility(View.INVISIBLE);
                        tumiki5.setImageDrawable(tumiki7.getDrawable());
                        tumiki5.setVisibility(View.VISIBLE);
                        tumicheck[5] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;


                    }else if (tumicheck[4]==false){
                        tumicheck[7] = false;
                        tumiki7.setVisibility(View.INVISIBLE);
                        tumiki4.setImageDrawable(tumiki7.getDrawable());
                        tumiki4.setVisibility(View.VISIBLE);
                        tumicheck[4] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;

                    }else if (tumicheck[3]==false){
                        tumicheck[7] = false;
                        tumiki7.setVisibility(View.INVISIBLE);
                        tumiki3.setImageDrawable(tumiki7.getDrawable());
                        tumiki3.setVisibility(View.VISIBLE);
                        tumicheck[3] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;

                    }

                }
                else if (tumicheck[8]==true){
                    if (tumicheck[5]==false){
                        tumicheck[8] = false;
                        tumiki8.setVisibility(View.INVISIBLE);
                        tumiki5.setImageDrawable(tumiki8.getDrawable());
                        tumiki5.setVisibility(View.VISIBLE);
                        tumicheck[5] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;

                    }else if (tumicheck[4]==false){
                        tumicheck[8] = false;
                        tumiki8.setVisibility(View.INVISIBLE);
                        tumiki4.setImageDrawable(tumiki8.getDrawable());
                        tumiki4.setVisibility(View.VISIBLE);
                        tumicheck[4] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;

                    }else if (tumicheck[3]==false){
                        tumicheck[8] = false;
                        tumiki8.setVisibility(View.INVISIBLE);
                        tumiki3.setImageDrawable(tumiki8.getDrawable());
                        tumiki3.setVisibility(View.VISIBLE);
                        tumicheck[3] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;

                    }

                }

            }else{
                treecheck2=true;

            }
        }else{
            treecheck2=false;


        }
    }

    public void tree3(View v){
        if (treecheck3==false){



            //1から3へ移動させる
            if(treecheck1==true){
                //一番上はどれ？
                if (tumicheck[0]==true){

                    //3の空いてる場所を探していく
                    if (tumicheck[8]==false){

                        tumicheck[0]= false;
                        tumiki0.setVisibility(View.INVISIBLE);
                        tumiki8.setImageDrawable(tumiki0.getDrawable());
                        tumiki8.setVisibility(View.VISIBLE);

                        tumicheck[8] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;




                    }else if (tumicheck[7]==false){
                        tumicheck[0] = false;
                        tumiki0.setVisibility(View.INVISIBLE);
                        tumiki7.setImageDrawable(tumiki0.getDrawable());
                        tumiki7.setVisibility(View.VISIBLE);

                        tumicheck[7] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;



                    }else if (tumicheck[6]==false){
                        tumicheck[0] = false;
                        tumiki0.setVisibility(View.INVISIBLE);
                        tumiki6.setImageDrawable(tumiki0.getDrawable());
                        tumiki6.setVisibility(View.VISIBLE);

                        tumicheck[6] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;

                    }



                }else if (tumicheck[1]==true){
                    //3の空いてる場所を探していく
                    if (tumicheck[8]==false){
                       /* tumicheck[3]=false;
                        tumiki3.setVisibility(View.INVISIBLE);
                        tumiki2.setImageResource(R.drawable.tumiki111);
                        tumiki2.setVisibility(View.VISIBLE);
                        tumicheck[2]=true;*/

                        tumicheck[1] = false;
                        tumiki1.setVisibility(View.INVISIBLE);
                        tumiki8.setImageDrawable(tumiki1.getDrawable());
                        tumiki8.setVisibility(View.VISIBLE);

                        tumicheck[8] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;




                    }else if (tumicheck[7]==false){
                        tumicheck[1] = false;
                        tumiki1.setVisibility(View.INVISIBLE);
                        tumiki7.setImageDrawable(tumiki1.getDrawable());
                        tumiki7.setVisibility(View.VISIBLE);

                        tumicheck[7] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;



                    }else if (tumicheck[6]==false){
                        tumicheck[1] = false;
                        tumiki1.setVisibility(View.INVISIBLE);
                        tumiki6.setImageDrawable(tumiki1.getDrawable());
                        tumiki6.setVisibility(View.VISIBLE);

                        tumicheck[6] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;

                    }

                }else if (tumicheck[2]==true){

                    //１の空いてる場所を探していく
                    if (tumicheck[8]==false){
                       /* tumicheck[3]=false;
                        tumiki3.setVisibility(View.INVISIBLE);
                        tumiki2.setImageResource(R.drawable.tumiki111);
                        tumiki2.setVisibility(View.VISIBLE);
                        tumicheck[2]=true;*/

                        tumicheck[2] = false;
                        tumiki2.setVisibility(View.INVISIBLE);
                        tumiki8.setImageDrawable(tumiki2.getDrawable());
                        tumiki8.setVisibility(View.VISIBLE);

                        tumicheck[8] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;




                    }else if (tumicheck[7]==false){
                        tumicheck[2] = false;
                        tumiki2.setVisibility(View.INVISIBLE);
                        tumiki7.setImageDrawable(tumiki2.getDrawable());
                        tumiki7.setVisibility(View.VISIBLE);

                        tumicheck[7] = true;

                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;



                    }else if (tumicheck[6]==false){
                        tumicheck[2] = false;
                        tumiki2.setVisibility(View.INVISIBLE);
                        tumiki6.setImageDrawable(tumiki2.getDrawable());
                        tumiki6.setVisibility(View.VISIBLE);

                        tumicheck[6] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;

                    }

                }else {
                    treecheck1=false;
                    treecheck2=false;
                    treecheck3=false;
                    //移動せせる積木がない

                }



                //2から3へ移動させる
            }else if (treecheck2==true){
                //一番上はどれ？
                if (tumicheck[3]==true){

                    //3の空いてる場所を探していく
                    if (tumicheck[8]==false){

                        tumicheck[3] = false;
                        tumiki3.setVisibility(View.INVISIBLE);
                        tumiki8.setImageDrawable(tumiki3.getDrawable());
                        tumiki8.setVisibility(View.VISIBLE);
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;

                        tumicheck[8] = true;




                    }else if (tumicheck[7]==false){
                        tumicheck[3] = false;
                        tumiki3.setVisibility(View.INVISIBLE);
                        tumiki7.setImageDrawable(tumiki3.getDrawable());
                        tumiki7.setVisibility(View.VISIBLE);

                        tumicheck[7] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;



                    }else if (tumicheck[6]==false){
                        tumicheck[3] = false;
                        tumiki3.setVisibility(View.INVISIBLE);
                        tumiki6.setImageDrawable(tumiki3.getDrawable());
                        tumiki6.setVisibility(View.VISIBLE);

                        tumicheck[6] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;

                    }



                }else if (tumicheck[4]==true){
                    //3の空いてる場所を探していく
                    if (tumicheck[8]==false){
                       /* tumicheck[3]=false;
                        tumiki3.setVisibility(View.INVISIBLE);
                        tumiki2.setImageResource(R.drawable.tumiki111);
                        tumiki2.setVisibility(View.VISIBLE);
                        tumicheck[2]=true;*/

                        tumicheck[4] = false;
                        tumiki4.setVisibility(View.INVISIBLE);
                        tumiki8.setImageDrawable(tumiki4.getDrawable());
                        tumiki8.setVisibility(View.VISIBLE);

                        tumicheck[8] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;



                    }else if (tumicheck[7]==false){
                        tumicheck[4] = false;
                        tumiki4.setVisibility(View.INVISIBLE);
                        tumiki7.setImageDrawable(tumiki4.getDrawable());
                        tumiki7.setVisibility(View.VISIBLE);

                        tumicheck[7] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;



                    }else if (tumicheck[6]==false){
                        tumicheck[4] = false;
                        tumiki4.setVisibility(View.INVISIBLE);
                        tumiki6.setImageDrawable(tumiki4.getDrawable());
                        tumiki6.setVisibility(View.VISIBLE);

                        tumicheck[6] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;

                    }

                }else if (tumicheck[5]==true){

                    //１の空いてる場所を探していく
                    if (tumicheck[8]==false){
                       /* tumicheck[3]=false;
                        tumiki3.setVisibility(View.INVISIBLE);
                        tumiki2.setImageResource(R.drawable.tumiki111);
                        tumiki2.setVisibility(View.VISIBLE);
                        tumicheck[2]=true;*/

                        tumicheck[5] = false;
                        tumiki5.setVisibility(View.INVISIBLE);
                        tumiki8.setImageDrawable(tumiki5.getDrawable());
                        tumiki8.setVisibility(View.VISIBLE);

                        tumicheck[8] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;




                    }else if (tumicheck[7]==false){
                        tumicheck[5] = false;
                        tumiki5.setVisibility(View.INVISIBLE);
                        tumiki7.setImageDrawable(tumiki5.getDrawable());
                        tumiki7.setVisibility(View.VISIBLE);

                        tumicheck[7] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;


                    }else if (tumicheck[6]==false){
                        tumicheck[5] = false;
                        tumiki5.setVisibility(View.INVISIBLE);
                        tumiki6.setImageDrawable(tumiki5.getDrawable());
                        tumiki6.setVisibility(View.VISIBLE);

                        tumicheck[6] = true;
                        treecheck1=false;
                        treecheck2=false;
                        treecheck3=false;

                    }

                }else {
                    //移動せせる積木がない

                }


            } else {
                treecheck3=true;


            }

        }else{
            treecheck3=false;
        }


    }

    public void treeimage1(View v){
        if (treecheck1==true){
            tr1.setVisibility(View.VISIBLE);


        }
        else{
            tr1.setVisibility(View.INVISIBLE);
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
