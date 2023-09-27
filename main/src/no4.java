import java.util.Scanner;
public class no4 {
    public static String revers2 (String kalimat){
        StringBuilder sb = new StringBuilder();
        String [] arr = kalimat.split(" ");
        for (int i = 0; i < arr.length; i++) {
            for (int j =arr[i].length()-1; j >=0 ; j--) {
                sb.append(arr[i].charAt(j));
            }
            sb.append(' ');
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String kalimat = sc.nextLine();
        System.out.println("Hasil: "+revers2(kalimat));
    }
}
