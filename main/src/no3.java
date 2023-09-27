import java.util.Scanner;
public class no3 {
    public static String perubahan(String kalimat){
        StringBuilder arr = new StringBuilder();
        for (int i = 0; i < kalimat.length(); i++) {
            if(Character.isLetter(kalimat.charAt(i)) || Character.isDigit(kalimat.charAt(i)) || Character.isWhitespace(kalimat.charAt(i))){
                arr.append(kalimat.charAt(i));
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String kalimat = sc.nextLine();
        System.out.println("Hasil: "+perubahan(kalimat));
    }
}
