package Amazon;


import Arrays.Array;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AmazonFires {


    public static void main(String[] args) {

        String csvFile = "/Users/313248/IdeaProjects/mastering-ds-algorithms/resources/test.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            Map<Integer,Integer> statistics = new HashMap<>();
            Map<Integer,Integer> summary = new HashMap<>();

            int lineCount =0;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);

                if(lineCount == 0){
                    lineCount++;
                    continue;
                }

                if(data.length==1){
                    lineCount =0;
                    continue;
                }

                if(data.length==4){

                    int year = Integer.parseInt(data[0]);
                    int fires = Integer.parseInt(data[3]);

                    if(statistics.containsKey(year)){
                        statistics.put(year, statistics.get(year)+fires);
                    } else {
                        statistics.put(year,fires);
                    }

                }

                if(data.length==2){

                    int year = Integer.parseInt(data[0]);
                    int fires = Integer.parseInt(data[1]);

                    if(summary.containsKey(year)){
                        summary.put(year, summary.get(year)+fires);
                    } else {
                        summary.put(year,fires);
                    }

                }



            }

            System.out.println(statistics);
            System.out.println(summary);

            System.out.println(statistics.equals(summary));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
