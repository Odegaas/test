import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
        public static void main(String[] args){
            System.out.print("Input: ");
            String example = in.nextLine();
            String [] EXAMPLE = example.split(" ");
            int arrayLength = EXAMPLE.length;
            if(arrayLength != 3)
                System.err.println("Error! Check again. \n Enter a number from << 1 to 10 >> !");

                KarakalpakstanPrint karakalpakstanObject = new KarakalpakstanPrint();
                Roume roumeObject = new Roume();
                char x = EXAMPLE[0].charAt(0);
                int xx = (int) x;
                char y = EXAMPLE[2].charAt(0);
                int yy = (int) y;

            if((xx >= 49 && xx <=57) && (yy >= 49 && yy <= 57))
                    karakalpakstanObject.numbersKarakalpakstan(example);
            else if(((xx==73)||(xx==86)||(xx==88))&&((yy==73)||(yy==86)||(yy==88)))
                roumeObject.numbersRoume(example);
            else
                System.err.println("Error! Chech again!");
    }
}
class Karakalpakstan{
    int res;
    public void numbersKarakalpakstan(String karakalpakstanNumber){
        String [] ExampleKarakalpak = karakalpakstanNumber.split(" ");
        int A = Integer.parseInt(ExampleKarakalpak[0]);
        int B = Integer.parseInt(ExampleKarakalpak[2]);
        int arrayLength = ExampleKarakalpak.length;
        if(arrayLength == 3){
            if((0 < A && A <= 10) && (0 < B && B <= 10)){
                switch (ExampleKarakalpak[1]) {
                    case "+":
                        res = A + B;
                        break;
                    case "-":
                        res = A - B;
                        break;
                    case "*":
                        res = A * B;
                        break;
                    case "/":
                        res = A / B;
                        break;
                    default:
                        System.err.println("ERRRRR");
                }
            }else System.out.println("Enter a number from << 1 to 10 >> !");
        }else System.err.println("Invalid Number!");
    }
}
class KarakalpakstanPrint{
    int res;
    public void numbersKarakalpakstan(String karakalpakstanNumber){
        String [] ExampleKarakalpak = karakalpakstanNumber.split(" ");
        int A = Integer.parseInt(ExampleKarakalpak[0]);
        int B = Integer.parseInt(ExampleKarakalpak[2]);
        int arrayLength = ExampleKarakalpak.length;
        if(arrayLength == 3){
            if((0 < A && A <= 10) && (0 < B && B <= 10)){
                switch (ExampleKarakalpak[1]) {
                    case "+":
                        System.out.println("output: " + (res = A + B));
                        break;
                    case "-":
                        System.out.println("output: " + (res = A - B));
                        break;
                    case "*":
                        System.out.println("output: " + (res = A * B));
                        break;
                    case "/":
                        System.out.println("output: " + (res = A / B));
                        break;
                    default:
                        System.err.println("Errorr");
                        break;
                }
            }else System.out.println("Enter a number from << 1 to 10 >> !");
        }else System.err.println("Invalid Number!");
    }
}
class Roume {
    public void numbersRoume(String roumeNumber) {
        String[] roumeNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] karakalpakstanNumbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] ExampleRoume = roumeNumber.split(" ");
        for (int i = 0; i < 10; i++)
            if (roumeNumbers[i] == ExampleRoume[0].intern()) {
                int a1 = Integer.parseInt(karakalpakstanNumbers[i]);
                for (int j = 0; j < 10; j++) {
                    if (roumeNumbers[j] == ExampleRoume[2].intern()) {
                    int a2 = Integer.parseInt(karakalpakstanNumbers[j]);
                    String reverseRoume = a1 + " " + ExampleRoume[1] + " " + a2;
                    Karakalpakstan karakalpakstan = new Karakalpakstan();
                    karakalpakstan.numbersKarakalpakstan(reverseRoume);
                    Convert result = new Convert();
                    result.RoumeConvert(karakalpakstan.res);
                    if (karakalpakstan.res <= 0) {
                        System.err.println("Chek again!");
                    }
                }
            }
        }
    }
}
class Convert{
    public void RoumeConvert (int number){
        int[] Roume1 = new int[]{100, 90, 50, 40, 10, 9, 5, 4, 1};
        String [] Roume2 = new String[]{"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < Roume1.length; i+=1) {
            while (number >= Roume1[i]){
                number -= Roume1[i];
                stringBuilder.append(Roume2[i]);
            }
        }
        System.out.println(stringBuilder);
    }
}
