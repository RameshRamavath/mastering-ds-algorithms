package practice;

import java.util.LinkedList;

public class FindWinner {


        static String Winner(String input_arr){

            String [] insects = input_arr.split("");
            LinkedList list = new LinkedList();

            for (int i=2; i<= insects.length-1; i++){
                list.add(insects[i]);
            }

            for (int i =1; i<= list.size()-1; i++){
                if(list.get(i).equals("T") && list.get(i-1).equals("A")){
                    list.remove(i-1);
                }
            }

            int AntCount =0;
            int TermitesCount =0;
            for (int i = 0; i < list.size(); i++)
            {
                if (list.get(i).equals("A"))
                    AntCount+=1;
                else if (list.get(i).equals("T"))
                    TermitesCount+=1;
            }
            if (AntCount==TermitesCount){
                return "Tie";
            }else if(AntCount > TermitesCount){
                return "Ant";
            }else{
                return "Termites";
            }

        }



    public static void main(String[] args) {
        String res1 = Winner("3 ATA");
        String res2 =  Winner("2 AT");

        System.out.println(res1);
        System.out.println(res2);

    }

}
