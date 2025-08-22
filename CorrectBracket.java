import java.util.*;

class CorrrectBracket {
    static void findBracket(List<Integer> open, 
            List<Integer> close, String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(')
                st.push(i);
            else {
                if (!st.isEmpty()) {
                    close.set(i, 1);
                    open.set(st.pop(), 1);
                } else
                    close.set(i, 0);
            }
        }
        for (int i = 1; i < n; i++) {
            close.set(i, close.get(i) + close.get(i - 1));
            open.set(i, open.get(i) + open.get(i - 1));
        }
    }

    static List<Integer> solveQueries(String s, 
                List<int[]> queries) {
        int n = s.length();
        
        List<Integer> result = new ArrayList<>();
        List<Integer> open = new ArrayList<>(Collections.nCopies(n + 1, 0));
        List<Integer> close = new ArrayList<>(Collections.nCopies(n + 1, 0));
        findBracket(open, close, s);

        // processing the queries
        for (int[] q : queries) {
            int start = q[0];
            int end = q[1];
            if (start == 0)
                result.add(close.get(end) * 2);
            else
                result.add((close.get(end) - open.get(start - 1)) * 2);
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "())(())(())(";
        List<int[]> queries = Arrays.asList(new int[]{4, 11}, 
                new int[]{3, 4}, new int[]{0, 2}, new int[]{0, 4}, new int[]{1, 2});
        List<Integer> ans = solveQueries(s, queries);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}