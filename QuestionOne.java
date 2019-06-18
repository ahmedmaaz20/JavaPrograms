class questionOneMore{

    void test(){
        System.out.println("Hey!");
    }
}

class QuestionOne extends questionOneMore{

    void test(){
        try {
            System.out.println(2/0);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String args[]){
        QuestionOne q = new QuestionOne();
        q.test();
    }
}
