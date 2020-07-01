import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Main {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        //String line;
        String line = "";
        String cvsSplitBy = ",";
        Map<Integer,Integer> statistics = new HashMap<>();
        Map<Integer,Integer> summary = new HashMap<>();

        int lineCount =0;

        while ((line = in.readLine()) != null) {
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
        System.out.println(statistics.equals(summary));
    }
}