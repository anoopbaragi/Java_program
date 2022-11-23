import java.util.ArrayList;

public class Arraylist
{
    public static void main(String[] args)
    {
//        int i;
//        float j=2.365f;
//        double k=3.5;
//        String str = "Anoop";
//        char [] ch = str.toCharArray();
//        char c  ='A';
//        char [] arr = {'a','d','s'};
//        System.out.println(arr[2]);
//        String [] str1 = {"Moolya","Anoop"};
//        System.out.println(str1.length);

        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Hello");
        arrayList.add("Anoop");
        arrayList.add("Mysuru");
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        arrayList.add(2,"Baragi");
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        arrayList.remove(3);
        System.out.println(arrayList);
    }
}
