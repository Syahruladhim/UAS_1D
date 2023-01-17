import java.util.ArrayList;
import java.util.Scanner;

public class JAWABANNO3 {
    public static void main (String[]  args) {
        int jum=4;
        UASID mymessage = new UASID();
        Scanner sc = new Scanner(System.in);
        mymessage.setMessageID(sc.nextLine());
        ArrayList<String> context = new ArrayList<>();
        for (int index=0; index<jum;index++) {
            context.add(sc.nextLine());
        }
        mymessage.setContext(context);
        //
        //
        //
        System.out.println(" kata yang dicari : ");
        String cari = sc.nextLine();
        System.out.println(mymessage.Findwords(context,cari));// output "Index ke 0 1"
    }
}