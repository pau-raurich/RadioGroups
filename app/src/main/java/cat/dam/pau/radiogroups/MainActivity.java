package cat.dam.pau.radiogroups;


import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private RelativeLayout main;
    private RadioGroup opcions;
    private TextView seleccio;
    private RadioButton lletra, opcolor;
/*-------------------------------------------------------------------------------------------------*/
    private TextView tv_tmlletra;
    private RadioGroup rg_lletra;
    private RadioButton rb_moltPetita, rb_petita, rb_mitjana, rb_gran, rb_moltGran;
/*-------------------------------------------------------------------------------------------------*/
    private TextView tv_colorLletre;
    private RadioGroup rg_color;
    private RadioButton vermell,verd,blau,blanc, negre;
/*-------------------------------------------------------------------------------------------------*/
    private TextView tv_colorFons;
    private RadioGroup rg_colorFons;
    private RadioButton vermellFons, verdFons, blauFons, blancFons, negreFons;
/*-------------------------------------------------------------------------------------------------*/
    private TextView tv_colorBackground;
    private RadioGroup rg_colorBack;
    private RadioButton vermellBlack, verdBlack, blauBlack, blancBlack, negreBlack;
/*-------------------------------------------------------------------------------------------------*/
    private Button botoSeleccio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main = (RelativeLayout) findViewById(R.id.rL_main);
        seleccio = (TextView) findViewById(R.id.textPrincipal);
        botoSeleccio = (Button) findViewById(R.id.btn_seleccio);

        opcions = (RadioGroup) findViewById(R.id.textOpcions);
        lletra = (RadioButton) findViewById(R.id.opcionsLletre);
        opcolor = (RadioButton) findViewById(R.id.opcionsColor);

        tv_tmlletra = (TextView) findViewById(R.id.text_tamanyLletra);
        rg_lletra = (RadioGroup) findViewById(R.id.tamanyLletra);
        rb_moltPetita = (RadioButton) findViewById(R.id.lletre_mesPetita);
        rb_petita = (RadioButton) findViewById(R.id.lletre_petita);
        rb_mitjana = (RadioButton) findViewById(R.id.lletre_mitjana);
        rb_gran = (RadioButton) findViewById(R.id.lletre_gran);
        rb_moltGran = (RadioButton) findViewById(R.id.lletre_mesGran);

        tv_colorLletre = (TextView) findViewById(R.id.color_lletre);
        rg_color = (RadioGroup) findViewById(R.id.color);
        vermell = (RadioButton) findViewById(R.id.vermell);
        verd = (RadioButton) findViewById(R.id.verd);
        blau = (RadioButton) findViewById(R.id.blau);
        blanc = (RadioButton) findViewById(R.id.blanc);
        negre = (RadioButton) findViewById(R.id.negre);

        tv_colorFons = (TextView) findViewById(R.id.colorFonsPantalla);
        rg_colorFons = (RadioGroup) findViewById(R.id.colorFons);
        vermellFons = (RadioButton) findViewById(R.id.vermellFons);
        verdFons = (RadioButton) findViewById(R.id.verdFons);
        blauFons = (RadioButton) findViewById(R.id.blauFons);
        blancFons = (RadioButton) findViewById(R.id.blancFons);
        negreFons = (RadioButton) findViewById(R.id.negreFons);

        tv_colorBackground = (TextView) findViewById(R.id.colorBackgroundPantalla);
        rg_colorBack = (RadioGroup) findViewById(R.id.colorBack);
        vermellBlack = (RadioButton) findViewById(R.id.vermellBlack);
        verdBlack = (RadioButton) findViewById(R.id.verdBlack);
        blauBlack = (RadioButton) findViewById(R.id.blauBlack);
        blancBlack = (RadioButton) findViewById(R.id.blancBlack);
        negreBlack = (RadioButton) findViewById(R.id.negreBlack);

        opcions.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // troba quin radio button s'ha seleccionat
                if(checkedId == R.id.opcionsLletre) {
                    tv_tmlletra.setVisibility(View.VISIBLE);
                    rg_lletra.setVisibility(View.VISIBLE);

                    tv_colorLletre.setVisibility(View.INVISIBLE);
                    rg_color.setVisibility(View.INVISIBLE);
                    tv_colorFons.setVisibility(View.INVISIBLE);
                    rg_colorFons.setVisibility(View.INVISIBLE);
                    tv_colorBackground.setVisibility(View.INVISIBLE);
                    rg_colorBack.setVisibility(View.INVISIBLE);
                } else {
                    tv_colorLletre.setVisibility(View.VISIBLE);
                    rg_color.setVisibility(View.VISIBLE);
                    tv_colorFons.setVisibility(View.VISIBLE);
                    rg_colorFons.setVisibility(View.VISIBLE);
                    tv_colorBackground.setVisibility(View.VISIBLE);
                    rg_colorBack.setVisibility(View.VISIBLE);

                    tv_tmlletra.setVisibility(View.INVISIBLE);
                    rg_lletra.setVisibility(View.INVISIBLE);
                }
            }
        });

        rg_lletra.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if(checkedId == R.id.lletre_mesPetita){
                    seleccio.setTextSize(15);
                } else if(checkedId == R.id.lletre_petita) {
                    seleccio.setTextSize(25);
                } else if(checkedId == R.id.lletre_mitjana) {
                    seleccio.setTextSize(35);
                }else if(checkedId == R.id.lletre_gran) {
                    seleccio.setTextSize(45);
                } else {
                    seleccio.setTextSize(30);
                }
            }
        });

        rg_color.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if(checkedId == R.id.vermell){
                    seleccio.setTextColor(Color.RED);
                } else if(checkedId == R.id.verd){
                    seleccio.setTextColor(Color.GREEN);
                } else if(checkedId == R.id.blau){
                    seleccio.setTextColor(Color.BLUE);
                } else if(checkedId == R.id.blanc){
                    seleccio.setTextColor(Color.WHITE);
                } else {
                    seleccio.setTextColor(Color.BLACK);
                }
            }
        });

        rg_colorFons.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if(checkedId == R.id.vermellFons){
                    seleccio.setBackgroundColor(Color.RED);
                } else if(checkedId == R.id.verdFons){
                    seleccio.setBackgroundColor(Color.GREEN);
                } else if(checkedId == R.id.blauFons){
                    seleccio.setBackgroundColor(Color.BLUE);
                } else if(checkedId == R.id.blancFons){
                    seleccio.setBackgroundColor(Color.WHITE);
                } else {
                    seleccio.setBackgroundColor(Color.BLACK);
                }
            }
        });

        rg_colorBack.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if(checkedId == R.id.vermellBlack){
                    main.setBackgroundColor(Color.RED);

                    lletra.setTextColor(Color.BLACK);
                    opcolor.setTextColor(Color.BLACK);

                    tv_tmlletra.setTextColor(Color.BLACK);
                    tv_colorLletre.setTextColor(Color.BLACK);
                    tv_colorFons.setTextColor(Color.BLACK);
                    tv_colorBackground.setTextColor(Color.BLACK);

                    rb_moltPetita.setTextColor(Color.BLACK);
                    rb_petita.setTextColor(Color.BLACK);
                    rb_mitjana.setTextColor(Color.BLACK);
                    rb_gran.setTextColor(Color.BLACK);
                    rb_moltGran.setTextColor(Color.BLACK);

                    vermell.setTextColor(Color.BLACK);
                    verd.setTextColor(Color.BLACK);
                    blau.setTextColor(Color.BLACK);
                    blanc.setTextColor(Color.BLACK);
                    negre.setTextColor(Color.BLACK);

                    vermellFons.setTextColor(Color.BLACK);
                    verdFons.setTextColor(Color.BLACK);
                    blauFons.setTextColor(Color.BLACK);
                    blancFons.setTextColor(Color.BLACK);
                    negreFons.setTextColor(Color.BLACK);

                    vermellBlack.setTextColor(Color.BLACK);
                    verdBlack.setTextColor(Color.BLACK);
                    blauBlack.setTextColor(Color.BLACK);
                    blancBlack.setTextColor(Color.BLACK);
                    negreBlack.setTextColor(Color.BLACK);
                } else if(checkedId == R.id.verdBlack){
                    main.setBackgroundColor(Color.GREEN);

                    lletra.setTextColor(Color.BLACK);
                    opcolor.setTextColor(Color.BLACK);

                    tv_tmlletra.setTextColor(Color.BLACK);
                    tv_colorLletre.setTextColor(Color.BLACK);
                    tv_colorFons.setTextColor(Color.BLACK);
                    tv_colorBackground.setTextColor(Color.BLACK);

                    rb_moltPetita.setTextColor(Color.BLACK);
                    rb_petita.setTextColor(Color.BLACK);
                    rb_mitjana.setTextColor(Color.BLACK);
                    rb_gran.setTextColor(Color.BLACK);
                    rb_moltGran.setTextColor(Color.BLACK);

                    vermell.setTextColor(Color.BLACK);
                    verd.setTextColor(Color.BLACK);
                    blau.setTextColor(Color.BLACK);
                    blanc.setTextColor(Color.BLACK);
                    negre.setTextColor(Color.BLACK);

                    vermellFons.setTextColor(Color.BLACK);
                    verdFons.setTextColor(Color.BLACK);
                    blauFons.setTextColor(Color.BLACK);
                    blancFons.setTextColor(Color.BLACK);
                    negreFons.setTextColor(Color.BLACK);

                    vermellBlack.setTextColor(Color.BLACK);
                    vermellBlack.setTextColor(Color.BLACK);
                    verdBlack.setTextColor(Color.BLACK);
                    blauBlack.setTextColor(Color.BLACK);
                    blancBlack.setTextColor(Color.BLACK);
                    negreBlack.setTextColor(Color.BLACK);
                } else if(checkedId == R.id.blauBlack){
                    main.setBackgroundColor(Color.BLUE);

                    lletra.setTextColor(Color.BLACK);
                    opcolor.setTextColor(Color.BLACK);

                    tv_tmlletra.setTextColor(Color.BLACK);
                    tv_colorLletre.setTextColor(Color.BLACK);
                    tv_colorFons.setTextColor(Color.BLACK);
                    tv_colorBackground.setTextColor(Color.BLACK);

                    rb_moltPetita.setTextColor(Color.BLACK);
                    rb_petita.setTextColor(Color.BLACK);
                    rb_mitjana.setTextColor(Color.BLACK);
                    rb_gran.setTextColor(Color.BLACK);
                    rb_moltGran.setTextColor(Color.BLACK);

                    vermell.setTextColor(Color.BLACK);
                    verd.setTextColor(Color.BLACK);
                    blau.setTextColor(Color.BLACK);
                    blanc.setTextColor(Color.BLACK);
                    negre.setTextColor(Color.BLACK);

                    vermellFons.setTextColor(Color.BLACK);
                    verdFons.setTextColor(Color.BLACK);
                    blauFons.setTextColor(Color.BLACK);
                    blancFons.setTextColor(Color.BLACK);
                    negreFons.setTextColor(Color.BLACK);

                    vermellBlack.setTextColor(Color.BLACK);
                    vermellBlack.setTextColor(Color.BLACK);
                    verdBlack.setTextColor(Color.BLACK);
                    blauBlack.setTextColor(Color.BLACK);
                    blancBlack.setTextColor(Color.BLACK);
                    negreBlack.setTextColor(Color.BLACK);
                } else if(checkedId == R.id.blancBlack){
                    main.setBackgroundColor(Color.WHITE);

                    lletra.setTextColor(Color.BLACK);
                    opcolor.setTextColor(Color.BLACK);

                    tv_tmlletra.setTextColor(Color.BLACK);
                    tv_colorLletre.setTextColor(Color.BLACK);
                    tv_colorFons.setTextColor(Color.BLACK);
                    tv_colorBackground.setTextColor(Color.BLACK);

                    rb_moltPetita.setTextColor(Color.BLACK);
                    rb_petita.setTextColor(Color.BLACK);
                    rb_mitjana.setTextColor(Color.BLACK);
                    rb_gran.setTextColor(Color.BLACK);
                    rb_moltGran.setTextColor(Color.BLACK);

                    vermell.setTextColor(Color.BLACK);
                    verd.setTextColor(Color.BLACK);
                    blau.setTextColor(Color.BLACK);
                    blanc.setTextColor(Color.BLACK);
                    negre.setTextColor(Color.BLACK);

                    vermellFons.setTextColor(Color.BLACK);
                    verdFons.setTextColor(Color.BLACK);
                    blauFons.setTextColor(Color.BLACK);
                    blancFons.setTextColor(Color.BLACK);
                    negreFons.setTextColor(Color.BLACK);

                    vermellBlack.setTextColor(Color.BLACK);
                    vermellBlack.setTextColor(Color.BLACK);
                    verdBlack.setTextColor(Color.BLACK);
                    blauBlack.setTextColor(Color.BLACK);
                    blancBlack.setTextColor(Color.BLACK);
                    negreBlack.setTextColor(Color.BLACK);
                } else {
                    main.setBackgroundColor(Color.BLACK);

                    lletra.setTextColor(Color.WHITE);
                    opcolor.setTextColor(Color.WHITE);

                    tv_tmlletra.setTextColor(Color.WHITE);
                    tv_colorLletre.setTextColor(Color.WHITE);
                    tv_colorFons.setTextColor(Color.WHITE);
                    tv_colorBackground.setTextColor(Color.WHITE);

                    rb_moltPetita.setTextColor(Color.WHITE);
                    rb_petita.setTextColor(Color.WHITE);
                    rb_mitjana.setTextColor(Color.WHITE);
                    rb_gran.setTextColor(Color.WHITE);
                    rb_moltGran.setTextColor(Color.WHITE);

                    vermell.setTextColor(Color.WHITE);
                    verd.setTextColor(Color.WHITE);
                    blau.setTextColor(Color.WHITE);
                    blanc.setTextColor(Color.WHITE);
                    negre.setTextColor(Color.WHITE);

                    vermellFons.setTextColor(Color.WHITE);
                    verdFons.setTextColor(Color.WHITE);
                    blauFons.setTextColor(Color.WHITE);
                    blancFons.setTextColor(Color.WHITE);
                    negreFons.setTextColor(Color.WHITE);

                    vermellBlack.setTextColor(Color.WHITE);
                    vermellBlack.setTextColor(Color.WHITE);
                    verdBlack.setTextColor(Color.WHITE);
                    blauBlack.setTextColor(Color.WHITE);
                    blancBlack.setTextColor(Color.WHITE);
                    negreBlack.setTextColor(Color.WHITE);
                }
            }
        });

        botoSeleccio.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectId = rg_lletra.getCheckedRadioButtonId();
                //comprova quin radioButton ha estat marcat per el seu id
                if(selectId == rb_moltPetita.getId()){
                    Toast.makeText(getApplicationContext(),"Tamany de la lletra: Molt petita",Toast.LENGTH_SHORT).show();
                } else if(selectId == rb_petita.getId()){
                    Toast.makeText(getApplicationContext(),"Tamany de la lletra: Petita",Toast.LENGTH_SHORT).show();
                } else if(selectId == rb_mitjana.getId()){
                    Toast.makeText(getApplicationContext(),"Tamany de la lletra: Mitjana",Toast.LENGTH_SHORT).show();
                } else if(selectId == rb_gran.getId()){
                    Toast.makeText(getApplicationContext(),"Tamany de la lletra: Gran",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),"Tamany de la lletra: Molt gran",Toast.LENGTH_SHORT).show();
                }

                int selectColorLletra = rg_color.getCheckedRadioButtonId();
                //comprova quin radioButton ha estat marcat per el seu id
                if(selectColorLletra == vermell.getId()){
                    Toast.makeText(getApplicationContext(),"Color de la lletra: Vermell",Toast.LENGTH_SHORT).show();
                } else if(selectColorLletra == verd.getId()){
                    Toast.makeText(getApplicationContext(),"Color de la lletra: Verd",Toast.LENGTH_SHORT).show();
                } else if(selectColorLletra == blau.getId()){
                    Toast.makeText(getApplicationContext(),"Color de la lletra: Blau",Toast.LENGTH_SHORT).show();
                } else if(selectColorLletra == blanc.getId()){
                    Toast.makeText(getApplicationContext(),"Color de la lletra: Blanc",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),"Color de la lletra: Negre",Toast.LENGTH_SHORT).show();
                }

                int selectFonsLletra = rg_colorFons.getCheckedRadioButtonId();
                //comprova quin radioButton ha estat marcat per el seu id
                if(selectFonsLletra == vermellFons.getId()){
                    Toast.makeText(getApplicationContext(),"Color del fons de la lletra: Vermell",Toast.LENGTH_SHORT).show();
                } else if(selectFonsLletra == verdFons.getId()){
                    Toast.makeText(getApplicationContext(),"Color del fons de la lletra: Verd",Toast.LENGTH_SHORT).show();
                } else if(selectFonsLletra == blauFons.getId()){
                    Toast.makeText(getApplicationContext(),"Color del fons de la lletra: Blau",Toast.LENGTH_SHORT).show();
                } else if(selectFonsLletra == blancFons.getId()){
                    Toast.makeText(getApplicationContext(),"Color del fons de la lletra: Blanc",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),"Color del fons de la lletra: Negre",Toast.LENGTH_SHORT).show();
                }

                int selectFons = rg_colorBack.getCheckedRadioButtonId();
                //comprova quin radioButton ha estat marcat per el seu id
                if(selectFons == vermellBlack.getId()){
                    Toast.makeText(getApplicationContext(),"Color del fons: Vermell",Toast.LENGTH_SHORT).show();
                } else if(selectFons == verdBlack.getId()){
                    Toast.makeText(getApplicationContext(),"Color del fons: Verd",Toast.LENGTH_SHORT).show();
                } else if(selectFons == blauBlack.getId()){
                    Toast.makeText(getApplicationContext(),"Color del fons: Blau",Toast.LENGTH_SHORT).show();
                } else if(selectFons == blancBlack.getId()){
                    Toast.makeText(getApplicationContext(),"Color del fons: Blanc",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),"Color del fons: Negre",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
