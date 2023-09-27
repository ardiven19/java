import  java.util.Scanner;
public class no1 {
    public static String titlecase(String kalimat){
        char [] arr = kalimat.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(i == 0){
                arr[i] = Character.toUpperCase(arr[i]);
            }
            if(arr[i] == ' '){
                arr[i+1] = Character.toUpperCase(arr[i+1]);
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String kalimat = sc.nextLine();
        System.out.println("Title Case: "+titlecase(kalimat));
    }
}