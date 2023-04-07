class IniAnimal{
    public static void showInfo(){
        System.out.println("歡迎進入冰雪奇緣系統");
    }
        
    String name;
    int height;
    int weight;
    int fast;
    String gender;
    String snow;

    void show(){
        System.out.println("Name:"+ name +" Height:"+height+" Weight:"+weight+" Fast:"+fast);
    }

    void show1(){
        System.out.println("Name:"+ name +" Height:"+height+" Weight:"+weight+" Gender:"+gender+" Fast:"+fast);
    }

    void show2(){
        System.out.println("Name:"+ name +" Height:"+height+" Weight:"+weight+" Gender:"+gender+" Snow:"+snow+" Fast:"+fast);
    }
    

    int distance(int x){
        int z;
        z=x*this.fast;
        return z;
    }
    double distance(int x,double y){
        double i;
        i=x*y*this.fast;
        return i;
    }
    // public void gender(int n){
    //     this.gender=n;
    // }

    // public void snow(int m){
    //     this.snow=m;
    // }

}

class human extends IniAnimal{
    // int gender;
    // human(){
    //     System.out.println("Name:"+ name +" Height:"+height+" Weight:"+weight+" Gender:"+gender+" Fast:"+fast);
    // }
}

class snow extends human{
    // int snow;
    // snow(){
    //     System.out.println("Name:"+ name +" Height:"+height+" Weight:"+weight+" Gender:"+gender+" Snow:"+snow+" Fast:"+fast);
    // }
}

public class A1103361_0331{
    public static void main(String[]argv){
        IniAnimal.showInfo();
        IniAnimal animal1,animal2;
        animal1=new IniAnimal();
        animal2=new IniAnimal(); 

        animal1.name="雪寶";
        animal1.height=110;
        animal1.weight=52;
        animal1.gender="無";
        animal1.snow="無";
        animal1.fast=100;
        
        animal2.name="驢子";
        animal2.height=150;
        animal2.weight=99;
        animal2.gender="無";
        animal2.snow="無";
        animal2.fast=200;
        
        
        animal1.show();
        animal2.show();
        
        IniAnimal human1,human2,human3;
        human1=new human();
        human2=new human();
        human3=new human();

        human1.name="阿克";
        human1.height=190;
        human1.weight=80;
        human1.gender="男生";
        human1.snow="無";
        human1.fast=150;

        human2.name="漢斯";
        human2.height=180;
        human2.weight=78;
        human2.gender="男生";
        human2.snow="無";
        human2.fast=130;

        human3.name="安那";
        human3.height=170;
        human3.weight=48;
        human3.gender="女生";
        human3.snow="無";
        human3.fast=120;

        
        human1.show1();
        human2.show1();
        human3.show1();

        IniAnimal snow1;
        snow1=new snow();

        snow1.name="愛沙";
        snow1.height=170;
        snow1.weight=50;
        snow1.gender="女生";
        snow1.snow="yes";
        snow1.fast=120;

        
        snow1.show2();
    }
}
