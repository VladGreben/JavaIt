package Sharaga.FirstLab;
import java.io.PrintWriter;
import java.util.*;
public class SecondLab {


    public static void main(String[] args) {
            PrintWriter out=new PrintWriter(System.out,true);
            Scanner sc=new Scanner(System.in);
            out.println("Введите количество слов: ");
            int n=sc.nextInt();
            sc.nextLine();
            out.println("Введите количество учасников: ");
            int m=sc.nextInt();
            sc.nextLine();
            List<Integer> l=new ArrayList<Integer>();
            for (int i=1;i<=n;i++)
                l.add(i);

            int kol=n;
            int h=-1;
            while(kol>1) {
                h+=m;
                if (h>(l.size()-1)) {
                    h=(h%l.size());
                l.remove(h);
                h--;
                kol--;       }
                out.println("Позиция "+l.get(0));
        }
    }
}
