package anhtester.javaBasic.variable.learn_Collection;

import java.util.*;

public class khaiBao_suDung {
    public void T1() {
//        ArrayList<String> arrayList = new ArrayList<String>();
//        arrayList.add("Java");
//        arrayList.add("C#");
//        arrayList.add("C++");
//        arrayList.add("JS");
//        arrayList.add("Node");
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
        String testArr[] = {
                "test1",
                "test2",
                "test3"
        };
        String x = "test4";
        List arrList = new ArrayList(Arrays.asList(testArr));
        arrList.add(x);
        testArr = (String[]) arrList.toArray(testArr);
        System.out.println(Arrays.toString(testArr));
        for (int i = 0; i< testArr.length; i++){
            System.out.println(testArr[i]);
        }

    }
    public void T2(){
        List<String> arrT = new ArrayList<String>();
        arrT.add("Selenium");
        arrT.add("Java");
        arrT.add("JS");
    }
    public static void T3(){
         Map<String,String> StringMap = new HashMap<String,String>();
        StringMap.put("Company","FPT");
        StringMap.put("Company","Kamora");
        StringMap.put("Company","CMC");
        StringMap.put("t1","T1");
        System.out.println(StringMap);
//        System.out.println(StringMap.get("Company"));
    }
    public static void T4(){
        // new TreeMap() sẽ sắp xếp các phần tử dự vào key của chúng
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Windows", "2000");
        hashMap.put("Windows", "XP");
        hashMap.put("Language2", "Java");
        hashMap.put("Language1", ".Net");
        System.out.println("Các phần tử của Map");
        System.out.print("\t" + hashMap);
    }
    public static void main(String[] args){
        T3();
        T4();
    }
}
