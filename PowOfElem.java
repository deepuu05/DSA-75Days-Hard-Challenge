
public class PowOfElem {
    private static int powOfElem(int a, int b) {
        // TODO Auto-generated method stub
     int result=0;
      if(b==1){

        return a;

      }
      else{

        result = a*powOfElem(a, b-1);
      }
  return result;
    }
    public static void main(String[] args) {
        
      int a=2;
      int b=2;
      int result = powOfElem(a,b)  ;
      System.out.println(result);
    }

}
