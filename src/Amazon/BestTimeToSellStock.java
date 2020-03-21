package Amazon;

public class BestTimeToSellStock {

    public static Integer maxProfit(Integer[] stockPrices){

        int len = stockPrices.length;
        int pointer = 0;

        while (pointer < len-2){

            Integer buyPrice = stockPrices[pointer];
            Integer sellPrice = stockPrices[pointer+1];

            Integer profit = sellPrice - buyPrice;

            pointer+=2;

            System.out.println("SellPrice : " + sellPrice + " BuyPrice : " + buyPrice + " Profit :: " + profit);
            System.out.println("pointer :: " + pointer);

          /*  if(pointer == len-2){
                // reset starting pointer to next integer
                pointer = pointer
            }
*/
        }

        return 0;
    }

    public static void main(String[] args) {
        Integer[] stockPrices = {1,2,3,4,5};

        maxProfit(stockPrices);
    }
}
