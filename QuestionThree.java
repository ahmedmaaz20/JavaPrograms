

interface A{
    void a();
    void b();
    void c();
    void d();
}


abstract class B implements A{
    public void c(){System.out.println("MI");}
}


class C extends B{
    public void a(){System.out.println("KKR");}
    public void b(){System.out.println("CSK");}
    public void d(){System.out.println("RCB");}
}


class QuestionThree{
    public static void main(String args[]){
        A a=new C();
        a.a();
        a.b();
        a.c();
        a.d();
    }}

