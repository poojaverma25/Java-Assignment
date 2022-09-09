package assign; 

public class Assignment4{
    static double AbsoluteError,RelativeError,PercentageError;
    public static double getAbsoluteError(double av,double ev) {
        if(av==0) {
            System.out.println("exit");
        }
        else
            AbsoluteError =ev-av;
            return AbsoluteError;
    }
    public static double getRelativeError(double av,double ev) {
        if(av==0) {
            System.out.println("exit");
        }
        else
            RelativeError=(AbsoluteError/av);
            return RelativeError;
    }
    public static double getPercentageError(double av,double ev) {
        if(av==0) {
            System.out.println("exit");
        }
        else
            PercentageError=RelativeError*100;
            return PercentageError;
} 

   public static void main(String[] args) {
        // TODO Auto-generated method stub
        double ansolute=getAbsoluteError(12,34);
        System.out.printf("Absolute error is"+" %.3f "+"units\n" ,AbsoluteError );
        double ralative=getRelativeError(12,34);
        System.out.printf("Relative error is"+" %.3f "+"units\n",RelativeError );
        double percentage=getPercentageError(12,34);
        if(PercentageError>1)
            System.out.printf("Percentage error is "+" %.3f "+"units\n",PercentageError );
        else
            System.out.println("Percentage Error is less than one "); 

   } 

}

