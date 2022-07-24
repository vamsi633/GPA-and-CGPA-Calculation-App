package com.example.gpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button calculate;
    TextView result;

    double totalcredit=0,totalgradepoint=0;
   double credit1,credit2,credit3,credit4,credit5,credit6,credit7,credit8;
    String grade1,grade2,grade3,grade4,grade5,grade6,grade7,grade8;
    double gradepoint1=0,gradepoint2=0,gradepoint3=0,gradepoint4=0,gradepoint5=0,gradepoint6=0,gradepoint7=0,gradepoint8=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner c1 = (Spinner) findViewById(R.id.c1);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.credits, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        c1.setAdapter(adapter1);

        Spinner g1 = (Spinner) findViewById(R.id.g1);
        ArrayAdapter<CharSequence> adapter11 = ArrayAdapter.createFromResource(this,
                R.array.grades, android.R.layout.simple_spinner_item);
        adapter11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        g1.setAdapter(adapter11);


        //c2 g2
        Spinner c2 = (Spinner) findViewById(R.id.c2);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.credits, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        c2.setAdapter(adapter2);

        Spinner g2 = (Spinner) findViewById(R.id.g2);
        ArrayAdapter<CharSequence> adapter22 = ArrayAdapter.createFromResource(this,
                R.array.grades, android.R.layout.simple_spinner_item);
        adapter22.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        g2.setAdapter(adapter22);


        //c3 g3
        Spinner c3 = (Spinner) findViewById(R.id.c3);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.credits, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        c3.setAdapter(adapter3);

        Spinner g3 = (Spinner) findViewById(R.id.g3);
        ArrayAdapter<CharSequence> adapter33 = ArrayAdapter.createFromResource(this,
                R.array.grades, android.R.layout.simple_spinner_item);
        adapter33.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        g3.setAdapter(adapter33);


        //c4 g4
        Spinner c4 = (Spinner) findViewById(R.id.c4);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,
                R.array.credits, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        c4.setAdapter(adapter4);

        Spinner g4 = (Spinner) findViewById(R.id.g4);
        ArrayAdapter<CharSequence> adapter44= ArrayAdapter.createFromResource(this,
                R.array.grades, android.R.layout.simple_spinner_item);
        adapter44.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        g4.setAdapter(adapter44);

        //c5 g5
        Spinner c5 = (Spinner) findViewById(R.id.c5);
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this,
                R.array.credits, android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        c5.setAdapter(adapter5);

        Spinner g5 = (Spinner) findViewById(R.id.g5);
        ArrayAdapter<CharSequence> adapter55= ArrayAdapter.createFromResource(this,
                R.array.grades, android.R.layout.simple_spinner_item);
        adapter55.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        g5.setAdapter(adapter55);


        //c6 g6
        Spinner c6 = (Spinner) findViewById(R.id.c6);
        ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(this,
                R.array.credits, android.R.layout.simple_spinner_item);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        c6.setAdapter(adapter6);

        Spinner g6 = (Spinner) findViewById(R.id.g6);
        ArrayAdapter<CharSequence> adapter66= ArrayAdapter.createFromResource(this,
                R.array.grades, android.R.layout.simple_spinner_item);
        adapter66.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        g6.setAdapter(adapter66);

        //c7 g7
        Spinner c7 = (Spinner) findViewById(R.id.c7);
        ArrayAdapter<CharSequence> adapter7 = ArrayAdapter.createFromResource(this,
                R.array.credits, android.R.layout.simple_spinner_item);
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        c7.setAdapter(adapter7);

        Spinner g7 = (Spinner) findViewById(R.id.g7);
        ArrayAdapter<CharSequence> adapter77= ArrayAdapter.createFromResource(this,
                R.array.grades, android.R.layout.simple_spinner_item);
        adapter77.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        g7.setAdapter(adapter77);

        //c8 g8
        Spinner c8 = (Spinner) findViewById(R.id.c8);
        ArrayAdapter<CharSequence> adapter8 = ArrayAdapter.createFromResource(this,
                R.array.credits, android.R.layout.simple_spinner_item);
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        c8.setAdapter(adapter8);

        Spinner g8 = (Spinner) findViewById(R.id.g8);
        ArrayAdapter<CharSequence> adapter88= ArrayAdapter.createFromResource(this,
                R.array.grades, android.R.layout.simple_spinner_item);
        adapter88.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        g8.setAdapter(adapter88);



        calculate=findViewById(R.id.calculate);
        result=findViewById(R.id.result);

        calculate.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                //c1g1
                credit1= Double.parseDouble(c1.getSelectedItem().toString());
                grade1=(g1.getSelectedItem().toString());
                if(grade1.equals("S")){
                    gradepoint1=10*credit1;

                }
                if(grade1.equals("A")){
                    gradepoint1=9*credit1;

                }
                if(grade1.equals("B")){
                    gradepoint1=8*credit1;

                }
                 if(grade1.equals("C")){
                    gradepoint1=7*credit1;
                }
                if(grade1.equals("D")){
                    gradepoint1=6*credit1;
                }
                if(grade1.equals("E")){
                    gradepoint1=5*credit1;
                }
                if(grade1.equals("F")){
                    gradepoint1=0*credit1;
                }
                //c2g2
                credit2=Double.parseDouble(c2.getSelectedItem().toString());
                grade2=(g2.getSelectedItem().toString());
                if(grade2.equals("S")){
                    gradepoint2=10*credit2;

                }
                if(grade2.equals("A")){
                    gradepoint2=9*credit2;

                }
                if(grade2.equals("B")){
                    gradepoint2=8*credit2;

                }
                if(grade2.equals("C")){
                    gradepoint2=7*credit2;
                }
                if(grade2.equals("D")){
                    gradepoint2=6*credit2;
                }
                if(grade2.equals("E")){
                    gradepoint2=5*credit2;
                }
                if(grade2.equals("F")){
                    gradepoint2=0*credit2;
                }

                //c3g3
                credit3=Double.parseDouble(c3.getSelectedItem().toString());
                grade3=(g3.getSelectedItem().toString());
                if(grade3.equals("S")){
                    gradepoint3=10*credit3;

                }
                if(grade3.equals("A")){
                    gradepoint3=9*credit3;

                }
                if(grade3.equals("B")){
                    gradepoint3=8*credit3;

                }
                if(grade3.equals("C")){
                    gradepoint3=7*credit3;
                }
                if(grade3.equals("D")){
                    gradepoint3=6*credit3;
                }
                if(grade3.equals("E")){
                    gradepoint3=5*credit3;
                }
                if(grade3.equals("F")){
                    gradepoint3=0*credit3;
                }

                //c4g4
                credit4=Double.parseDouble(c4.getSelectedItem().toString());
                grade4=(g4.getSelectedItem().toString());
                if(grade4.equals("S")){
                    gradepoint4=10*credit4;

                }
                if(grade4.equals("A")){
                    gradepoint4=9*credit4;

                }
                if(grade4.equals("B")){
                    gradepoint4=8*credit4;

                }
                if(grade4.equals("C")){
                    gradepoint4=7*credit4;
                }
                if(grade4.equals("D")){
                    gradepoint4=6*credit4;
                }
                if(grade4.equals("E")){
                    gradepoint4=5*credit4;
                }
                if(grade4.equals("F")){
                    gradepoint4=0*credit4;
                }

                //c5g5
                credit5=Double.parseDouble(c5.getSelectedItem().toString());
                grade5=(g5.getSelectedItem().toString());
                if(grade5.equals("S")){
                    gradepoint5=10*credit5;

                }
                if(grade5.equals("A")){
                    gradepoint5=9*credit5;

                }
                if(grade5.equals("B")){
                    gradepoint5=8*credit5;

                }
                if(grade5.equals("C")){
                    gradepoint5=7*credit5;
                }
                if(grade5.equals("D")){
                    gradepoint5=6*credit5;
                }
                if(grade5.equals("E")){
                    gradepoint5=5*credit5;
                }
                if(grade5.equals("F")){
                    gradepoint5=0*credit5;
                }

                //c6g6
                credit6=Double.parseDouble(c6.getSelectedItem().toString());
                grade6=(g6.getSelectedItem().toString());
                if(grade6.equals("S")){
                    gradepoint6=10*credit6;
                }
                if(grade6.equals("A")){
                    gradepoint6=9*credit6;

                }
                if(grade6.equals("B")){
                    gradepoint1=8*credit6;

                }
                if(grade6.equals("C")){
                    gradepoint6=7*credit6;
                }
                if(grade6.equals("D")){
                    gradepoint6=6*credit6;
                }
                if(grade6.equals("E")){
                    gradepoint1=5*credit6;
                }
                if(grade6.equals("F")){
                    gradepoint6=0*credit6;
                }
                

                //c7g7
                credit7=Double.parseDouble(c7.getSelectedItem().toString());
                grade7=(g7.getSelectedItem().toString());
                if(grade7.equals("S")){
                    gradepoint7=10*credit7;

                }
                if(grade7.equals("A")){
                    gradepoint7=9*credit7;

                }
                if(grade7.equals("B")){
                    gradepoint7=8*credit7;

                }
                if(grade7.equals("C")){
                    gradepoint7=7*credit7;
                }
                if(grade7.equals("D")){
                    gradepoint7=6*credit7;
                }
                if(grade7.equals("E")){
                    gradepoint7=5*credit7;
                }
                if(grade7.equals("F")){
                    gradepoint7=0*credit7;
                }

                //c8g8
                credit8=Double.parseDouble(c8.getSelectedItem().toString());
                grade8=(g8.getSelectedItem().toString());
                if(grade8.equals("S")){
                    gradepoint8=10*credit8;

                }
                if(grade8.equals("A")){
                    gradepoint8=9*credit8;

                }
                if(grade8.equals("B")){
                    gradepoint8=8*credit8;

                }
                if(grade8.equals("C")){
                    gradepoint8=7*credit8;
                }
                if(grade8.equals("D")){
                    gradepoint8=6*credit8;
                }
                if(grade8.equals("E")){
                    gradepoint8=5*credit8;
                }
                if(grade8.equals("F")){
                    gradepoint1=0*credit8;
                }
                totalgradepoint=gradepoint1+gradepoint2+gradepoint3+gradepoint4+gradepoint5+gradepoint6+gradepoint7+gradepoint8;
                totalcredit=credit1+credit2+credit3+credit4+credit5+credit6+credit7+credit8;

                double gpa=totalgradepoint/totalcredit;
                result.setText("your gpa is :-"+Double.toString(gpa));
            }


        });

    }
}