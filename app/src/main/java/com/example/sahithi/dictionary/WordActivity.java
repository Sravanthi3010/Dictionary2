package com.example.sahithi.dictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WordActivity extends AppCompatActivity {
    private int value;
    private TextView synonym,antonym,meaning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);
        Intent intent=getIntent();
        int value=intent.getIntExtra("value",0);

        synonym=findViewById(R.id.synonym);
        meaning=findViewById(R.id.meaning);
        antonym=findViewById(R.id.antonym);

        if(value==0){
            meaning.setText("quiet, modest, reserved");
            synonym.setText("timid");
            antonym.setText("bold");
        }
        else if(value==1){
            meaning.setText("showing care in doing one's work");
            synonym.setText("hard-working");
            antonym.setText("lazy");
        }
        else if(value==2){
            meaning.setText("to steal money by falsifying records");
            synonym.setText("misuse");
            antonym.setText("compensate");
        }
        else if(value==3){
            meaning.setText("sensitivity to another's feelings as if they were one's own");
            synonym.setText("pity");
            antonym.setText("hatred");
        }
        else if(value==4){
            meaning.setText("learned or scholarly");
            synonym.setText("brainy");
            antonym.setText("ignorant");
        }
        else if(value==5){
            meaning.setText("in an opposing direction");
            synonym.setText("unlucky");
            antonym.setText("lucky");
        }
        else if(value==6){
            meaning.setText("chronologically misplaced");
            synonym.setText("old");
            antonym.setText("present");
        }
        else if(value==7){
            meaning.setText("being of questionable authenticity");
            synonym.setText("wrong");
            antonym.setText("true");
        }
        else if(value==8){
            meaning.setText("the quality of being honest and straightforward");
            synonym.setText("openness");
            antonym.setText("lying");
        }
        else if(value==9){
            meaning.setText("surround so as to force to give up");
            synonym.setText("disappoint");
            antonym.setText("help");
        }
        else if(value==10){
            meaning.setText("a feeling of deep regret, usually for some misdeed");
            synonym.setText("sympathy");
            antonym.setText("mercilessness");
        }
        else if(value==11){
            meaning.setText("go against, as of rules and laws");
            synonym.setText("fight");
            antonym.setText("stay");
        }
        else if(value==12){
            meaning.setText("so thin as to transmit light");
            synonym.setText("thin");
            antonym.setText("thick");
        }
        else if(value==13){
            meaning.setText("conspicuously and outrageously bad or reprehensible");
            synonym.setText("extreme");
            antonym.setText("slight");
        }
        else if(value==14){
            meaning.setText("anything short-lived, as an insect that lives only for a day");
            synonym.setText("volatile");
            antonym.setText("permanent");
        }
        else if(value==15){
            meaning.setText("appropriate to a purpose");
            synonym.setText("wise");
            antonym.setText("incorrect");
        }
        else if(value==16){
            meaning.setText("a shackle for the ankles or feet");
            synonym.setText("restrict");
            antonym.setText("liberate");
        }
        else if(value==17){
            meaning.setText("someone who attacks cherished ideas or institutions");
            synonym.setText("unbeliever");
            antonym.setText("protester");
        }
        else if(value==18){
            meaning.setText("lacking moral discipline");
            synonym.setText("loose");
            antonym.setText("controlled");
        }
        else if(value==19){
            meaning.setText("the lowest point of anything");
            synonym.setText("low point");
            antonym.setText("top");
        }
        }

    }
