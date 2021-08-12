package Rahul.day03.array;



public class TestPractice {
    public static void main(String[] args) {
        Integer[] a = {1,3,4,0,10,0,8,0,7,0};

        int i = 0;
        int j = a.length - 1;
        while (i < j){
            if(a[j] != 0){
                j--;
                continue;
            }

            if(a[i] != 0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
                continue;
            }

            i++;
        }

        for(int ele : a){
            System.out.println(ele);
        }
    }
}
