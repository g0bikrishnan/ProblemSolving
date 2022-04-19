import java.util.*;

public class Test {
    public static void main(String[] args) {
        String [] arr = {"var","home","test"},arr1 = {"usr","var","..","lib","test"},arr2 = {"usr","var",".","home","test"};
        List<String> list1=new ArrayList<>();
        String last = "";
        for (String s :arr1) {
            list1.add(s);
        }
        if(list1.contains(".."))
        {
            list1.remove(list1.indexOf("..")-1);
            list1.remove("..");
            for(String s :list1)
            {
                last=last+"/"+s;
            }
        }
        else if(list1.contains("."))
        {
            for(String s : list1.subList(list1.indexOf(".")+1,list1.size()))
            {
                last=last+"/"+s;
            }
        }
        else
        {
            for (String s : list1) {
                last=last+"/"+s;
            }
        }

        System.out.println(last);
    }
}


