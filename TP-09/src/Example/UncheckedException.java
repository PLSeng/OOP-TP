package Example;

public class UncheckedException {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try{
            System.out.println(a/b);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
