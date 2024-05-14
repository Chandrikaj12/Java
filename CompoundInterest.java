public class CompoundInterest {

    public static void main(String[] args) {
   
    double p = 15000, r = 5.5, t = 3;
   
    double compoundInterest = p * (Math.pow((1 + r / 100), t)) – p;
   
    System.out.println(“Compound Interest: ” + compoundInterest);
   
    }
   
   }