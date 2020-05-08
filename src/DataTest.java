import java.util.Scanner;

public class DataTest {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

//        float s = 1;
//        float s1 = s/(1000);

            int d = scanner.nextInt();
            int m = scanner.nextInt();
            int y = scanner.nextInt();

            if (d <= 0 || m <= 0 || y <= 0 || m > 12) {
                System.out.println("NO");
            }
            else {
                switch (m) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        if (d <= 31) {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if (d <= 30) {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                        break;
                    case 2:
                        int febDays = 28;
                        if (y % 400 == 0) {
                            febDays = 29;
                        } else if (y % 100 == 0) {
                            febDays = 28;
                        } else if (y % 4 == 0) {
                            febDays = 29;
                        }
                        if (d <= febDays) {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                        break;
                }
            }

//        System.out.println(s.equals(s12) || s.equals(s21));

            //        double s = (double) 100 * (V1 + V2) / V0;

//        int s = sss % 60;
//        int mm = sss / 60;
//        int m = mm % 60;
//        int hh = mm / 60;
//        int h = hh % 24;


        }
    }