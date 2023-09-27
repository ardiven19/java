import  java.util.Scanner;
public class no5 {
    public static String kode(double kolom, String kalimat){
        double baris = Math.ceil(kalimat.length()/kolom);
        char[][] rumus = new char[(int) baris][(int) kolom];
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (int i = 0; i < (int) baris; i++) {
            for (int j = 0; j < (int) kolom; j++) {
                if(index < kalimat.length()) {
                    rumus[i][j] = kalimat.charAt(index);
                    index++;
                }else {
                    rumus[i][j] = ' ';
                }
            }
        }
        int index2 = 0;
        for (int i = 0; i < (int) kolom; i++) {
            for (int j = 0; j < (int) Math.ceil(baris); j++) {
                sb.append(rumus[j][i]);
            }
        }
        return new String(sb);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan jumlah kolom = ");
        double kolom = sc.nextInt();
        sc.nextLine();
        System.out.print("masukan kalimatnya: ");
        String kalimat = sc.nextLine();
        System.out.println("Hasil: "+kode(kolom, kalimat));
    }
}
