package com.company;

public class Main {
    public static void main(String[] args) {
        //-------------------------------------------------------------------------
        System.out.println("1:");
        String name = "K";
        String surname = "M";
        double birthY = Math.round(Math.random()*1000+1);
        double currY = Math.round(Math.random()*2000+1);
        System.out.println(name+", "+surname+", AGE:"+(currY-birthY));
        //-------------------------------------------------------------------------
        System.out.println("2:");
        double x = Math.floor(Math.random()*5);
        double y = Math.floor(Math.random()*5);
        if(x>=y)
        {
            if(y==0){
                System.out.println("ERROR");
            }
            else {
                System.out.print("x=" + x + ", y=" + y);
                System.out.println(", x/y=" + Math.round((x / y) * 100) / 100f);
            }
        }
        else if (y>=x)
        {
            if(x==0){
                System.out.println("ERROR");
            }
            else {
                System.out.print("x=" + x + ", y=" + y);
                System.out.println(", y/x=" + Math.round((y / x) * 100) / 100f);
            }
        }
        //-------------------------------------------------------------------------
        System.out.println("3:");
        double rand1 = Math.ceil(Math.random()*25);
        double rand2 = Math.ceil(Math.random()*25);
        double rand3 = Math.ceil(Math.random()*25);
        System.out.printf("Num: "+rand1+" ,"+rand2+" ,"+rand3+" ");
        if(rand1>=rand2&&rand1<rand3)    System.out.println("Med: "+rand1);
        else if(rand1<rand2&&rand1>=rand3)    System.out.println("Med: "+rand1);
        else if(rand2>=rand1&&rand2<rand3)    System.out.println("Med: "+rand2);
        else if(rand2<rand1&&rand2>=rand3)    System.out.println("Med: "+rand2);
        else    System.out.println("Med: "+rand3);
        //-------------------------------------------------------------------------
        System.out.println("4:");
        int a = (int)Math.ceil(Math.random()*10);
        int b = (int)Math.ceil(Math.random()*10);
        int c = (int)Math.ceil(Math.random()*10);
        if(a+b>=c)
        {
            System.out.println("Trikampi sudaryti galima");
        }
        else System.out.println("Fail");
        //-------------------------------------------------------------------------
        System.out.println("5:");
        double rando1 = Math.floor(Math.random()*3);
        double rando2 = Math.floor(Math.random()*3);
        double rando3 = Math.floor(Math.random()*3);
        double rando4 = Math.floor(Math.random()*3);
        int num0 = 0;
        int num1 = 0;
        int num2 = 0;
        if(rando1==0) num0++;
        if(rando2==0) num0++;
        if(rando3==0) num0++;
        if(rando4==0) num0++;
        if(rando1==1) num1++;
        if(rando2==1) num1++;
        if(rando3==1) num1++;
        if(rando4==1) num1++;
        if(rando1==2) num2++;
        if(rando2==2) num2++;
        if(rando3==2) num2++;
        if(rando4==2) num2++;
        System.out.println("0 yra: "+num0+", 1 yra: "+num1+", 2 yra: "+num2);
        //-------------------------------------------------------------------------
        System.out.println("6:");
        double random1 = Math.ceil(Math.random()*20)-10;
        double random2 = Math.ceil(Math.random()*20)-10;
        double random3 = Math.ceil(Math.random()*20)-10;
        if(random1<0) System.out.printf("["+random1+"]");
        else if(random1>=0) System.out.printf("{"+random1+"}");
        else System.out.printf("("+random1+")");
        if(random2<0) System.out.printf("["+random2+"]");
        else if(random2>=0) System.out.printf("{"+random2+"}");
        else System.out.printf("("+random2+")");
        if(random3<0) System.out.printf("["+random3+"]");
        else if(random3>=0) System.out.printf("{"+random3+"}");
        else System.out.printf("("+random3+")");
        System.out.println();
        //-------------------------------------------------------------------------
        System.out.println("7:");
        double amount = Math.floor(Math.random()*2995+5);
        if(amount>=2000) System.out.println("Kaina 4%: "+(amount*0.96));
        else if(amount>=1000) System.out.println("Kaina 3%: "+(amount*0.97));
        else System.out.println("Kaina: "+amount);
        //-------------------------------------------------------------------------
        System.out.println("8:");
        double random81 = Math.floor(Math.random()*101);
        double random82 = Math.floor(Math.random()*101);
        double random83 = Math.floor(Math.random()*101);
        System.out.println("All Values: "+random81+", "+random82+", "+random83);
        System.out.println("Vid: "+ Math.round((random81+random82+random83)/3* 100) / 100f);
        double secondVid = 0;
        double amm = 0;
        if(random81>=10&&random81<90)
        {
            secondVid+=random81;
            amm++;
        }
        if(random82>=10&&random82<90){
            secondVid+=random82;
            amm++;
        }
        if(random83>=10&&random83<90){
            secondVid+=random83;
            amm++;
        }
        System.out.println("Correct numbers: "+amm+", Second Vid: "+ Math.round((secondVid)/amm * 100) / 100f);
        //-------------------------------------------------------------------------
        System.out.println("9:");
        int hour = (int) Math.floor(Math.random()*25);
        int minute = (int) Math.floor(Math.random()*60);
        int second = (int) Math.floor(Math.random()*60);
        System.out.println("Current time: "+hour+":"+minute+":"+second);
        int additionSeconds = (int) Math.floor(Math.random()*301);
        System.out.println("Seconds to be added: "+additionSeconds);
        int overMin = (int) Math.floor((second+additionSeconds)/60);
        second = second+additionSeconds-(overMin*60);
        int overH = (int) Math.floor((minute+overMin)/60);
        minute = minute+overMin-(overH*60);
        int overD = (int) Math.floor((hour+overH)/24);
        hour = hour+overH-(overD*24);
        System.out.println("New time: "+hour+":"+minute+":"+second);
        //-------------------------------------------------------------------------
        System.out.println("10:");
        double randNum1 = Math.floor(Math.random()*8999)+1000;
        double randNum2 = Math.floor(Math.random()*8999)+1000;
        double randNum3 = Math.floor(Math.random()*8999)+1000;
        double randNum4 = Math.floor(Math.random()*8999)+1000;
        double randNum5 = Math.floor(Math.random()*8999)+1000;
        double randNum6 = Math.floor(Math.random()*8999)+1000;
        double biggest1 = 0;
        double biggest2 = 0;
        double biggest3 = 0;
        double biggest4 = 0;
        double biggest5 = 0;
        double biggest6 = 0;
        boolean found1 = false;
        boolean found2 = false;
        boolean found3 = false;
        boolean found4 = false;
        boolean found5 = false;
        boolean found6 = false;

        if(     randNum1>=randNum2&&randNum1>=randNum3&&randNum1>=randNum4&&randNum1>=randNum5&&randNum1>=randNum6) {biggest1=randNum1; found1=true;}
        else if(randNum2>=randNum1&&randNum2>=randNum3&&randNum2>=randNum4&&randNum2>=randNum5&&randNum2>=randNum6) {biggest1=randNum2; found2=true;}
        else if(randNum3>=randNum1&&randNum3>=randNum2&&randNum3>=randNum4&&randNum3>=randNum5&&randNum3>=randNum6) {biggest1=randNum3; found3=true;}
        else if(randNum4>=randNum1&&randNum4>=randNum2&&randNum4>=randNum3&&randNum4>=randNum5&&randNum4>=randNum6) {biggest1=randNum4; found4=true;}
        else if(randNum5>=randNum1&&randNum5>=randNum2&&randNum5>=randNum3&&randNum5>=randNum4&&randNum5>=randNum6) {biggest1=randNum5; found5=true;}
        else if(randNum6>=randNum1&&randNum6>=randNum2&&randNum6>=randNum3&&randNum6>=randNum4&&randNum6>=randNum5) {biggest1=randNum6; found6=true;}
        else    System.out.println("ERROR in finding biggest1");

        if(     !found1&&biggest1>=randNum1&&randNum1>=randNum2&&randNum1>=randNum3&&randNum1>=randNum4&&randNum1>=randNum5&&randNum1>=randNum6) {biggest2=randNum1; found1=true;}
        else if(!found2&&biggest1>=randNum2&&randNum2>=randNum1&&randNum2>=randNum3&&randNum2>=randNum4&&randNum2>=randNum5&&randNum2>=randNum6) {biggest2=randNum2; found2=true;}
        else if(!found3&&biggest1>=randNum3&&randNum3>=randNum1&&randNum3>=randNum2&&randNum3>=randNum4&&randNum3>=randNum5&&randNum3>=randNum6) {biggest2=randNum3; found3=true;}
        else if(!found4&&biggest1>=randNum4&&randNum4>=randNum1&&randNum4>=randNum2&&randNum4>=randNum3&&randNum4>=randNum5&&randNum4>=randNum6) {biggest2=randNum4; found4=true;}
        else if(!found5&&biggest1>=randNum5&&randNum5>=randNum1&&randNum5>=randNum2&&randNum5>=randNum3&&randNum5>=randNum4&&randNum5>=randNum6) {biggest2=randNum5; found5=true;}
        else if(!found6&&biggest1>=randNum6&&randNum6>=randNum1&&randNum6>=randNum2&&randNum6>=randNum3&&randNum6>=randNum4&&randNum6>=randNum5) {biggest2=randNum6; found6=true;}
        else    System.out.println("ERROR in finding biggest2");

        if(     !found1&&biggest1>=randNum1&&biggest2>=randNum1&&randNum1>=randNum2&&randNum1>=randNum3&&randNum1>=randNum4&&randNum1>=randNum5&&randNum1>=randNum6) {biggest3=randNum1; found1=true;}
        else if(!found2&&biggest1>=randNum2&&biggest2>=randNum2&&randNum2>=randNum1&&randNum2>=randNum3&&randNum2>=randNum4&&randNum2>=randNum5&&randNum2>=randNum6) {biggest3=randNum2; found2=true;}
        else if(!found3&&biggest1>=randNum3&&biggest2>=randNum3&&randNum3>=randNum1&&randNum3>=randNum2&&randNum3>=randNum4&&randNum3>=randNum5&&randNum3>=randNum6) {biggest3=randNum3; found3=true;}
        else if(!found4&&biggest1>=randNum4&&biggest2>=randNum4&&randNum4>=randNum1&&randNum4>=randNum2&&randNum4>=randNum3&&randNum4>=randNum5&&randNum4>=randNum6) {biggest3=randNum4; found4=true;}
        else if(!found5&&biggest1>=randNum5&&biggest2>=randNum5&&randNum5>=randNum1&&randNum5>=randNum2&&randNum5>=randNum3&&randNum5>=randNum4&&randNum5>=randNum6) {biggest3=randNum5; found5=true;}
        else if(!found6&&biggest1>=randNum6&&biggest2>=randNum6&&randNum6>=randNum1&&randNum6>=randNum2&&randNum6>=randNum3&&randNum6>=randNum4&&randNum6>=randNum5) {biggest3=randNum6; found6=true;}
        else    System.out.println("ERROR in finding biggest3");

        if(     !found1&&biggest1>randNum1&&biggest2>randNum1&&biggest3>randNum1&&randNum1>randNum2&&randNum1>randNum3&&randNum1>randNum4&&randNum1>randNum5&&randNum1>randNum6) {biggest4=randNum1; found1=true;}
        else if(!found2&&biggest1>randNum2&&biggest2>randNum2&&biggest3>randNum2&&randNum2>randNum1&&randNum2>randNum3&&randNum2>randNum4&&randNum2>randNum5&&randNum2>randNum6) {biggest4=randNum2; found2=true;}
        else if(!found3&&biggest1>randNum3&&biggest2>randNum3&&biggest3>randNum3&&randNum3>randNum1&&randNum3>randNum2&&randNum3>randNum4&&randNum3>randNum5&&randNum3>randNum6) {biggest4=randNum3; found3=true;}
        else if(!found4&&biggest1>randNum4&&biggest2>randNum4&&biggest3>randNum4&&randNum4>randNum1&&randNum4>randNum2&&randNum4>randNum3&&randNum4>randNum5&&randNum4>randNum6) {biggest4=randNum4; found4=true;}
        else if(!found5&&biggest1>randNum5&&biggest2>randNum5&&biggest3>randNum5&&randNum5>randNum1&&randNum5>randNum2&&randNum5>randNum3&&randNum5>randNum4&&randNum5>randNum6) {biggest4=randNum5; found5=true;}
        else if(!found6&&biggest1>randNum6&&biggest2>randNum6&&biggest3>randNum6&&randNum6>randNum1&&randNum6>randNum2&&randNum6>randNum3&&randNum6>randNum4&&randNum6>randNum5) {biggest4=randNum6; found6=true;}
        else    System.out.println("ERROR in finding biggest4");

        if(     !found1&&biggest1>randNum1&&biggest2>randNum1&&biggest3>randNum1&&biggest4>randNum1&&randNum1>randNum2&&randNum1>randNum3&&randNum1>randNum4&&randNum1>randNum5&&randNum1>randNum6) {biggest5=randNum1; found1=true;}
        else if(!found2&&biggest1>randNum2&&biggest2>randNum2&&biggest3>randNum2&&biggest4>randNum2&&randNum2>randNum1&&randNum2>randNum3&&randNum2>randNum4&&randNum2>randNum5&&randNum2>randNum6) {biggest5=randNum2; found2=true;}
        else if(!found3&&biggest1>randNum3&&biggest2>randNum3&&biggest3>randNum3&&biggest4>randNum3&&randNum3>randNum1&&randNum3>randNum2&&randNum3>randNum4&&randNum3>randNum5&&randNum3>randNum6) {biggest5=randNum3; found3=true;}
        else if(!found4&&biggest1>randNum4&&biggest2>randNum4&&biggest3>randNum4&&biggest4>randNum4&&randNum4>randNum1&&randNum4>randNum2&&randNum4>randNum3&&randNum4>randNum5&&randNum4>randNum6) {biggest5=randNum4; found4=true;}
        else if(!found5&&biggest1>randNum5&&biggest2>randNum5&&biggest3>randNum5&&biggest4>randNum5&&randNum5>randNum1&&randNum5>randNum2&&randNum5>randNum3&&randNum5>randNum4&&randNum5>randNum6) {biggest5=randNum5; found5=true;}
        else if(!found6&&biggest1>randNum6&&biggest2>randNum6&&biggest3>randNum6&&biggest4>randNum6&&randNum6>randNum1&&randNum6>randNum2&&randNum6>randNum3&&randNum6>randNum4&&randNum6>randNum5) {biggest5=randNum6; found6=true;}
        else    System.out.println("ERROR in finding biggest5");

        if(     randNum1<=randNum2&&randNum1<=randNum3&&randNum1<=randNum4&&randNum1<=randNum5&&randNum1<=randNum6) {biggest6=randNum1; found1=true;}
        else if(randNum2<=randNum1&&randNum2<=randNum3&&randNum2<=randNum4&&randNum2<=randNum5&&randNum2<=randNum6) {biggest6=randNum2; found2=true;}
        else if(randNum3<=randNum1&&randNum3<=randNum2&&randNum3<=randNum4&&randNum3<=randNum5&&randNum3<=randNum6) {biggest6=randNum3; found3=true;}
        else if(randNum4<=randNum1&&randNum4<=randNum2&&randNum4<=randNum3&&randNum4<=randNum5&&randNum4<=randNum6) {biggest6=randNum4; found4=true;}
        else if(randNum5<=randNum1&&randNum5<=randNum2&&randNum5<=randNum3&&randNum5<=randNum4&&randNum5<=randNum6) {biggest6=randNum5; found5=true;}
        else if(randNum6<=randNum1&&randNum6<=randNum2&&randNum6<=randNum3&&randNum6<=randNum4&&randNum6<=randNum5) {biggest6=randNum6; found6=true;}
        else    System.out.println("ERROR in finding biggest6");

        System.out.println(biggest1+", "+biggest2+", "+biggest3+", "+biggest4+", "+biggest5+", "+biggest6);

        //Additional testeris
    }
}