package com.company;

/*

@FunctionalInterface
interface myFunctionalInterface {
    void method1();
//    void methodd2();
}

class KeyPadPhone{
    @Deprecated
    public void sendMessage(){
        System.out.println("Text message sent!");
    }
}
class AndroidPhone extends KeyPadPhone{
   @Override // annotation
    public void sendMessage(){
        System.out.println("Message sent via WhatsApp!");
    }
}

public class cwh_108_annotations {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        AndroidPhone Samsung = new AndroidPhone();
        Samsung.sendMessage();
 */
@FunctionalInterface
interface myFunctionalInteface{
    void thisMethod();
//    void thisMethod2();
}

class NewPhone extends Phone{
//   @Override
    public void showTime(){
        System.out.println("Time is 8PM");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}
public class cwh_108_annotations {
    @SuppressWarnings("deprecation")// compiler ki aawaz ko dabana
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showTime();
        phone.sum(5, 6);
    }
}


