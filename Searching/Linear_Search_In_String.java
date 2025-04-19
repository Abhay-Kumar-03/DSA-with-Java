import java.util.Arrays;

public class Linear_Search_In_String {
    public static void main(String[] args) {
        String name = "abhay";
        char target = 'h';
//        System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search(String name, char target){
        if(name.length() ==  0) return false;
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == target) return true;
        }
        return false;
    }

    static boolean search2(String str, char target){
        if(str.length() == 0) return false;
        for(char ch : str.toCharArray()){
            if(ch == target) return true;
        }
        return false;
    }



}
