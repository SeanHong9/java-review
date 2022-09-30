# java-review
Prepare my java interview.

Java 複習
syso => System.out.println();
psvm => public static void main(String[] args){}

String 
	"abc"
int 
	1
float 
	5.99 5.99f
char 
	'a'
boolean 
	true
35e3 == 35*10^3
myvar != myVar
final後不可賦值

convert doublt to int:
    double numd = 1.11
    int numi = (int)numd;

operator:
    + - * / % ++ -- 
    = . += . -= . *= . /= . %= . &= . |= . ^=(XOR) . >>=(二進位左移增加) . <<=(二進位右移減少) 
    
    true    &=    true    ==>    true
    true    &=    false    ==>    false
    false    &=    true    ==>    false
    false    &=    false    ==>    false
    true    |=    true    ==>    true
    true    |=    false    ==>    true
    false    |=    true    ==>    true
    false    |=    false    ==>    false
    true    ^=    true    ==>    false
    true    ^=    false    ==>    true
    false    ^=    true    ==>    true
    false    ^=    false    ==>    false

    == . != . > . >= . <=
    && . || . !
跳脫字元\
換行 \n

數學運算:
    Math.max(a,b)
    Math.min(a,b)
    Math.sqrt(a) 開平方
    Math.abs(a) 絕對值

switch:
    switch(today){
        case "Monday":
            System.out.println("Today is " + today);
        default:
            System.out.println("This is " + today); 
    }

while:
    while(-){~};
    do{~}while(-);

for:
    for(int i=1;i<5;i++){
        System.out.println(i);    
    }

each:
    String[] cars = {"1","2","3","4"};
    for(String item : cars){
        System.out.println(item);
    }        

break: 跳出整個迴圈 
continue: 直接開始下次迴圈

static?
不需要初始話就可以調用的method
    物件方法，可以存取物件成員及類別成員。 
        Object method can access non-static field or static field.
    類別方法，只能存取類別成員。
        Static method can only access static field.

OOP程序導向差異
    物件導向:
        創建同時包含數據和函數對象
    程序導向:  
        編寫[對數據進行操作]的程序或函數
    
OOP優點:
    -更快更容易執行
    -程序有清晰的結構
    -DRY原則，讓程式容易維護、修改和測試
    -用更少的程式和更短的開發時間創建可重複利用的可能

物件初始化 Initialization:
    public class Car{
        x=5;

        psvm
            Car myCar1 = new Car();
            syso myCar1.x
    }
//Car.java

構造函數/建構元 Constructor:
    public class Car{
        int modelYear;
        String modelName;

        public Car(int modelYear,String modelName) {
            modelYear = Year;
            modelName = Name;
        }
        psvm
            Car myCar1 = new Car();
            syso myCar1.x
    }
//Car.java
    
封裝 Encapsulation:    
    目的:
        保護敏感數據不被用戶操作
    實現:
        -將變數和屬性聲明為私有Private
        -提供公共的getter和setter實現必要的查看和更新
    原因:
        -更好控制類別的屬性和方法
        -類別的數行可以是read only,或是write only
        -靈活->可以改變程式的一個部分而不影響整體
        -增加數據的安全
//Extendtest.java

Package:
    可以import Java提供或是自定義的Package
    如import java.util.Scanner => System.in讓使用者輸入
//mypack/MyPackage.java

繼承 Inheritance-Extend: 
    父類別 superclass: 被繼承的類別
    子類別 subclass:  繼承父類別的類別
    protected:父與子可用變數
//Extendtest.java

多型 polymorphism:
    繼承可以從父類別繼承屬性和方法，多型可以使用這些方法執行不同任務
        如果Animal為父類別有Sound()方法，
        子類別cat,dog繼承Animal後可以調用自己的Sound方法
//Sound.java

抽象類別和方法 abstract
    數據抽象是隱藏某些細節，僅向使用者顯示基本資訊的過程
    抽象可以通過抽象類別或介面interface
    abstract可以修飾類別和方法，抽象類別方法需要在子類別實作
        抽象類別:
            是受限制的類別，不能用於創建物件，必須從另一個類別繼承
        抽象方法:
            只能在抽象類別中使用，並且沒有主體，主體繼承自子類別
//AbstractTest.java

介面 interface:
    實現抽象的另外一種方式
    完全抽象類別，只有空方法，實作的子類別需要實作方法
    interface可以修飾類別和方法
//Interface.java

枚舉 enum:
    enum Level{
        LOW,MEDIUM,HIGH
    }
//EnumTest.java

輸入輸出:
import java.util.Scanner;
//InputAndOutput.java

異常處理 Exception:
    try{
        //試驗程序
    }catch(Exception e){
        //若try時出現錯誤
        syso e.toString(); //顯示錯誤
    }finally{
        //一定會執行
    }
    
    拋出異常
    if(age<18)
        throw new ArithmeticException("Access denied");

文件 File:
    新增文件:
    import java.io.File;
    File myObj = new File("filename.txt");

    對文件輸入:
    import java.io.FileWriter;
    myWriter = new FileWriter("filename.txt");
    myWriter.write("something");

    查看文件:
    
//FileTest.java





