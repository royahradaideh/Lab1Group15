import javax.swing.JFrame;
import java.awt.event.ActionListener;

import javax.swing.JButton;
public class CalculatorJFrame extends JFrame{
    double Current,Stored=0;
    double DecimalPlace=0.1;
    boolean deciPressed=false;
    char sign='N';

    JButton One=new JButton("1");
    JButton Two=new JButton("2");
    JButton Three=new JButton("3");
    JButton Four=new JButton("4");
    JButton Five=new JButton("5");
    JButton Six=new JButton("6");
    JButton Seven=new JButton("7");
    JButton Eight=new JButton("8");
    JButton Nine=new JButton("9");
    JButton Zero=new JButton("0");

    JButton Decimal= new JButton(".");
    JButton Addition= new JButton("+");
    JButton Subtraction=new JButton("-");
    JButton Multiplication=new JButton("*");
    JButton Division=new JButton("÷");

    JButton Equals= new JButton("=");


    CalculatorJFrame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000,1000);
        this.setLayout(null);
        this.setVisible(true);

        this.add(One);
        One.addActionListener(
            e->{
                if(deciPressed){
                    Current+=1*DecimalPlace;
                    DecimalPlace*=0.1;
                }
                else{
                Current=Current*10+1;
                }
            }
        );
        this.add(Two);
        Two.addActionListener(
            e->{
                if(deciPressed){
                    Current+=2*DecimalPlace;
                    DecimalPlace*=0.1;
                }
                else{

                Current=Current*10+2;
                }
            }

        );
        this.add(Three);
        Three.addActionListener(
            e->{
                if(deciPressed){
                    Current+=DecimalPlace*3;
                    DecimalPlace*=0.1;
                }
                else{
                    Current=Current*10+3;
                }
            }
        );
        this.add(Four);
        Four.addActionListener(
            e->{
                if(deciPressed){
                    Current+=DecimalPlace*4;
                    DecimalPlace*=0.1;
                }
                else{
                    Current=Current*10+4;
                }
            }
        );
        this.add(Five);
        Five.addActionListener(
            e->{
                if(deciPressed){
                    Current+=DecimalPlace*5;
                    DecimalPlace*=0.1;
                }
                else{
                    Current=Current*10+5;
                }
            }
        );
        this.add(Six);
        Six.addActionListener(
            e->{
                if(deciPressed){
                    Current+=DecimalPlace*6;
                    DecimalPlace*=0.1;
                }
                else{
                    Current=Current*10+6;
                }
            }
        );
        this.add(Seven);
        Seven.addActionListener(
            e->{
                if(deciPressed){
                    Current+=DecimalPlace*7;
                    DecimalPlace*=0.1;
                }
                else{
                    Current=Current*10+7;
                }
            }
        );
        this.add(Eight);
        Eight.addActionListener(
            e->{
                if(deciPressed){
                    Current+=DecimalPlace*8;
                    DecimalPlace*=0.1;
                }
                else{
                    Current=Current*10+8;
                }
            }
        );
        this.add(Nine);
        Nine.addActionListener(
            e->{
                if(deciPressed){
                    Current+=DecimalPlace*9;
                    DecimalPlace*=0.1;
                }
                else{
                    Current=Current*10+9;
                }
            }
        );
        this.add(Zero);
        Zero.addActionListener(
            e->{
                if(deciPressed){
                    DecimalPlace*=0.1;
                }
                else{
                    Current*=10;
                }
            }
        );


        this.add(Decimal);
        Decimal.addActionListener(
            e->deciPressed=true
        );

        


        this.add(Addition);
        Addition.addActionListener(
            e->{
                if(Current!=0){//that means we are in the middle of another operation
                    Apply();
                    sign='+';
                    Stored=Current;
                    Current=0;
                }
                else{
                    sign='+';
                }
                // sign='+';
                // Stored=Current;
                // Current=0;
            }
            
        );

        this.add(Subtraction);
        Subtraction.addActionListener(
            e->{
                if(Current!=0){//that means we are in the middle of another operation
                    Apply();
                    sign='-';
                    Stored=Current;
                    Current=0; 
                }
                else{
                    sign='-';
                }
                // sign='-';
                // Stored=Current;
                // Current=0;
            }
        );


        this.add(Multiplication);
        Multiplication.addActionListener(
            e->{
                if(Current!=0){
                    Apply();
                    sign='*';
                    Stored=Current;
                    Current=0;
                }
                else{
                    sign='*';
                }
                // sign='*';
                // Stored=Current;
                // Current=0;
            }
        );


        this.add(Division);
        Division.addActionListener(
            e->{
                if(Current!=0){
                    Apply();
                    Stored=Current;
                    Current=0;
                    sign='/';
                }
                else{
                    sign='/';
                }
                // Stored=Current;
                // Current=0;
                // sign='/';
            }
        );

        this.add(Equals);
        Equals.addActionListener(
            e->{
                Apply();
                System.out.println(Current);
            }
        );






        One.setBounds(300,100,100,100);
        Two.setBounds(400,100,100,100);
        Three.setBounds(500,100,100,100);
        Four.setBounds(300,200,100,100);
        Five.setBounds(400,200,100,100);
        Six.setBounds(500,200,100,100);
        Seven.setBounds(300,300,100,100);
        Eight.setBounds(400,300,100,100);
        Nine.setBounds(500,300,100,100);
        Zero.setBounds(400,400,100,100);

        Decimal.setBounds(300,400,100,100);



        Addition.setBounds(600,100,100,100);
        Subtraction.setBounds(600,200,100,100);
        Multiplication.setBounds(600,300,100,100);
        Division.setBounds(500,400,100,100);
        Equals.setBounds(600,400,100,100);
    } 





    public static void main(String[] args){
        CalculatorJFrame yo=new CalculatorJFrame();
    }


    void Apply(){
        if(sign=='+'){
            Current+=Stored;
        }
        if(sign=='-'){
            Current=Stored-Current;
        }
        if(sign=='*'){
            Current=Current*Stored;
        }
        if(sign=='/'){
            Current=Stored/Current;
        }
        Stored=0;
        sign='N';
    }  
}
