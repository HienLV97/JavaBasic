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
        for (int i = 0; i < testArr.length; i++) {
            System.out.println(testArr[i]);
        }

    }

    public void T2() {
        List<String> arrT = new ArrayList<String>();
        arrT.add("Selenium");
        arrT.add("Java");
        arrT.add("JS");
    }

    public static void T3() {
        Map<String, String> StringMap = new HashMap<String, String>();
        StringMap.put("Company", "FPT");
        StringMap.put("Company", "Kamora");
        StringMap.put("Company", "CMC");
        StringMap.put("t1", "T1");
        System.out.println(StringMap);
//        System.out.println(StringMap.get("Company"));
    }

    public static void T4() {
        // new TreeMap() sẽ sắp xếp các phần tử dự vào key của chúng
        Map<String, String> hashMap = new HashMap<String, String>();
//        hashMap.put("Windows", "2000");
        String windows = hashMap.put("Windows", "2000");
        hashMap.put("Windows", "XP");
        hashMap.put("Language2", "Java");
        hashMap.put("Language1", ".Net");
        System.out.println("Các phần tử của Map");
        System.out.print("\t" + hashMap);
    }

    // add value
    private static void addValue(Map<String, List<String>> map, String key, String value) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }

    public static void T5() {
        // Tạo một HashMap với key là String và giá trị là List<String>
        Map<String, List<String>> multiValuesMap = new HashMap<>();

        // Thêm các giá trị vào map
        addValue(multiValuesMap, "Windows", "2000");
        addValue(multiValuesMap, "Windows", "XP");
        addValue(multiValuesMap, "Language", ".Net");
        addValue(multiValuesMap, "Language", "Java");

        // Lấy giá trị cho key "Windows"
        List<String> windowsVersions = multiValuesMap.get("Windows");
        List<String> LanguageVersions = multiValuesMap.get("Language");

        // In ra các giá trị của key "Windows"
        if (windowsVersions != null) {
            for (String version : windowsVersions) {
                System.out.println("Windows: " + version);
            }
        }
        for (String option : LanguageVersions) {
            System.out.println("Language: " + option);
        }
        System.out.println(multiValuesMap);
    }

    public static List<String> T6() {
        List<String> arrayList = new ArrayList<>();
        // adding String object to arrayList
        arrayList.add("Java");
        arrayList.add("C");
        arrayList.add("C++");
        arrayList.add("PHP");
        arrayList.add("Python");
//        for (String s : arrayList) {
//            System.out.println(s);
//        }
//        for (int i = 0; i < arrayList.size(); i++){
//            System.out.println(arrayList.get(i));
//        }
        return arrayList;
    }

    public static void main(String[] args) {
        List<String> returnArrList = T6();
        returnArrList.remove(0);
        for (String s : returnArrList) {
            System.out.println(s);
        }
        System.out.println("Check: " + returnArrList.contains("Java"));
        System.out.println("Check: " + returnArrList.contains("C"));

    }
}
