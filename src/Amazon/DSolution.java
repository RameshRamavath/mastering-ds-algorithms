package Amazon;


import java.util.*;
public class DSolution {

    static int[][] arr;

    public static void main(String[] args) {

        arr = new int[][]{{2, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 5}};

        System.out.println(Collections.max(optimal(arr)));
    }

    private static Set<Integer> optimal(int[][] a) {

        int visited[][] = new int[a.length][a[0].length];
        for (int i = 0; i < visited.length; i++) {
            Arrays.fill(visited[i], 0);
        }

        return optimal(a, 0, 0,2,4 ,new LinkedList<>(), new LinkedHashSet<>());

    }


    private static Set<Integer> optimal(int[][] a, int row, int col, int dstRow,int dstCol,List<Integer> list, Set<Integer> set) {


        if (row > dstRow || col > dstCol) {
            return set;
        }
        list.add(a[row][col]);

        //move right
        optimal(a, row, col + 1,dstRow,dstCol, list, set);

        //move up
        optimal(a, row + 1, col,dstRow,dstCol, list, set);


        //hack to print the list properly
        if (list.size()  > dstRow + dstCol + 1) {
            int replaceIndex = (dstRow + dstCol + 1) - (list.size() - (dstRow + dstCol + 1));
            for (int i = replaceIndex, j = (dstRow + dstCol + 1); i < (dstRow + dstCol + 1); i++) {
                list.set(i, list.get(j));
                list.remove(j);
            }
        }

        //now we can print the paths without append
        //comment the above block of code above to see the problem.

        //uncomment the below to see the list getting formed
        //System.out.println(list);

        set.add(sum(list));

        return set;

    }

    public static int sum(List<Integer> list) {
        return list.stream().mapToInt(i -> i).sum();
    }
}
