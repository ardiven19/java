import java.util.Scanner;
public class no2 {
    public static String reverse(String kalimat){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <kalimat.length(); i++) {
            sb.append(kalimat.charAt(i));
        }
        sb.reverse();
        return new String(sb);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String kalimat = sc.nextLine();
        System.out.println("Hasil: "+reverse(kalimat));
    }
}
