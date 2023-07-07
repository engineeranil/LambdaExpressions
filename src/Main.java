public class Main {
    public static void main(String[] args) {
        Math sum = (a,b) -> (a+b);
        Math extraction = (a,b) -> (a-b);
        Math strike = (a,b) -> (a*b);
        Math division = (a,b) -> {
            if(b==0){
                b=1;
            }
           return b/a;
        };
        System.out.println(sum.calculator(10,3));
        System.out.println(extraction.calculator(10,3));
        System.out.println(strike.calculator(10,3));
        System.out.println(division.calculator(9,3));



        Math sumMath = new Math() {
            @Override
            public int calculator(int a, int b) {
                return a+b;
            }
        };
        Math extractionMath = new Math() {
            @Override
            public int calculator(int a, int b) {
                return a-b;
            }
        };
        Math strikeMath = new Math() {
            @Override
            public int calculator(int a, int b) {
                return a*b;
            }
        };
        Math divisionMath = new Math() {
            @Override
            public int calculator(int a, int b) {
                return a/b;
            }
        };

    }
}
