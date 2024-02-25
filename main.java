public class main
{
    public static void main(String[] args) {
        int n=6;
        int pos=3;
       int bistMask=1<<pos;
       if((bistMask & n)==0){
        System.out.println("bit was zero");
       }
       else{
        System.out.println("bit was one");
       }
    }
}