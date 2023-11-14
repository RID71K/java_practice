import java.util.*;
class test{
    public static void main(String[] args){

        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        boolean present=false;
        ArrayList<Integer>new_arr=new ArrayList<>();
        for (int i=0;i<arr.size();i++){
            int val=arr.get(i);
            System.out.println(val);
            for(int j=0;j<new_arr.size();j++){
                if(val==new_arr.get(j)){
                    present=true;
                    break;
                }


            }
        if(!present){
                new_arr.add(val);
            }


        }

        System.out.println(new_arr);
    }
}