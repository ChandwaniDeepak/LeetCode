import java.util.*;

public class MainClass {


    //    public static void main(String[] args) {
//        System.out.println(solution("{([()])}"));
//        System.out.println(solution("{ ( [ ) ] }"));
//    }
    public static boolean solution(String s) {
        Stack<Character> stack = new Stack();
        System.out.println(s);
        if (s.length() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push((Character) s.charAt(i));
            } else {
                if (stack.empty() && i == 0) {
                    return false;
                } else {
                    if (stack.empty() && i < s.length() - 1) {
                        return false;
                    } else {
                        if (s.charAt(i) == ')' && stack.peek() == '(' ||
                                s.charAt(i) == ']' && stack.peek() == '[' ||
                                s.charAt(i) == '}' && stack.peek() == '{') {
                            stack.pop();
                        }
                    }
                }
            }
        }
        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public static void main(String[] args) {

        KnightProbabilityInChessboard688 knight = new KnightProbabilityInChessboard688();
        knight.knightProbability(3, 3, 0, 0);


//        RiverSizesAlgo river = new RiverSizesAlgo();
//        int[][] matrix = new int[][]{
//                {1, 0, 0, 1},
//                {1, 0, 1, 0},
//                {0, 0, 1, 0},
//                {1, 0, 1, 0}
//                };
//        river.riverSizes(matrix);

//        AreBloodRelated abr = new AreBloodRelated();
//        abr.prepareTree();





//        ReverseLinkedListAlgo reverse = new ReverseLinkedListAlgo();
//        ReverseLinkedListAlgo.LinkedList list = new ReverseLinkedListAlgo.LinkedList(0);
//        ReverseLinkedListAlgo.LinkedList list1 = new ReverseLinkedListAlgo.LinkedList(1);
//        list.next = list1;
//        ReverseLinkedListAlgo.LinkedList list2 = new ReverseLinkedListAlgo.LinkedList(2);
//        list1.next = list2;
//        ReverseLinkedListAlgo.LinkedList list3 = new ReverseLinkedListAlgo.LinkedList(3);
//        list2.next = list3;
//        ReverseLinkedListAlgo.LinkedList list4 = new ReverseLinkedListAlgo.LinkedList(4);
//        list3.next = list4;
//        ReverseLinkedListAlgo.LinkedList list5 = new ReverseLinkedListAlgo.LinkedList(5);
//        list4.next = list5;
//        ReverseLinkedListAlgo.LinkedList list6 = new ReverseLinkedListAlgo.LinkedList(6);
//        list5.next = list6;
//        ReverseLinkedListAlgo.LinkedList list7 = new ReverseLinkedListAlgo.LinkedList(7);
//        list6.next = list7;
//
//        ReverseLinkedListAlgo.LinkedList res = reverse.reverseLinkedList(list);
//        System.out.println(res.value);

//        SearchInSortedMatrixAlgo search = new SearchInSortedMatrixAlgo();
//        int[][] matrix = {
//                {1, 4, 7, 12, 15, 1000},
//                {2, 5, 19, 31, 32, 1001},
//                {3, 8, 24, 33, 35, 1002},
//                {40, 41, 42, 44, 45, 1003},
//                {99, 100, 103, 106, 128, 1004},
//        };
//        search.searchInSortedMatrix(matrix, -1);

//        GroupAnagramsAlgo anagrams = new GroupAnagramsAlgo();
//        List<String> words = new ArrayList<String>(Arrays.asList("abc", "dabd", "bca", "cab", "ddba"));
//        anagrams.groupAnagrams(words);


//
//        RemoveKthNodeFromEndAlgo.LinkedList list = new RemoveKthNodeFromEndAlgo.LinkedList(0);
//        RemoveKthNodeFromEndAlgo.LinkedList list1 = new RemoveKthNodeFromEndAlgo.LinkedList(1);
//        list.next = list1;
//        RemoveKthNodeFromEndAlgo.LinkedList list2 = new RemoveKthNodeFromEndAlgo.LinkedList(2);
//        list1.next = list2;
//        RemoveKthNodeFromEndAlgo.LinkedList list3 = new RemoveKthNodeFromEndAlgo.LinkedList(3);
//        list2.next = list3;
//        RemoveKthNodeFromEndAlgo.LinkedList list4 = new RemoveKthNodeFromEndAlgo.LinkedList(4);
//        list3.next = list4;
//        RemoveKthNodeFromEndAlgo.LinkedList list5 = new RemoveKthNodeFromEndAlgo.LinkedList(5);
//        list4.next = list5;
//        RemoveKthNodeFromEndAlgo.LinkedList list6 = new RemoveKthNodeFromEndAlgo.LinkedList(6);
//        list5.next = list6;
//        RemoveKthNodeFromEndAlgo.LinkedList list7 = new RemoveKthNodeFromEndAlgo.LinkedList(7);
//        list6.next = list7;
//        RemoveKthNodeFromEndAlgo.LinkedList list8 = new RemoveKthNodeFromEndAlgo.LinkedList(8);
//        list7.next = list8;
//        RemoveKthNodeFromEndAlgo.LinkedList list9 = new RemoveKthNodeFromEndAlgo.LinkedList(9);
//        list8.next = list9;
//
//        RemoveKthNodeFromEndAlgo remove = new RemoveKthNodeFromEndAlgo();
//        remove.removeKthNodeFromEnd(list, 10);


//        SameBSTAlgo same = new SameBSTAlgo();
//        List<Integer> arrayOne =
//                new ArrayList<Integer>(
//                        Arrays.asList(5, 2, -1, 100, 45, 12, 8, -1, 8, 10, 15, 8, 12, 94, 81, 2, -34));
//        List<Integer> arrayTwo =
//                new ArrayList<Integer>(
//                        Arrays.asList(5, 8, 10, 15, 2, 8, 12, 45, 100, 2, 12, 94, 81, -1, -1, -34, 8));
//
//        boolean res = same.sameBsts(arrayOne, arrayTwo);
//        System.out.println(res);


//        SteppingNumbers1215 step = new SteppingNumbers1215();
//        step.countSteppingNumbers(0, 21);


//        RottingOranges944 oranges = new RottingOranges944();
//        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
//        oranges.orangesRotting(grid);


//        MedianOfTwoSortedArrays4 median = new MedianOfTwoSortedArrays4();
//        int[] nums1 = {1, 2};
//        int[] nums2 = {3, 4};
//        double med = median.findMedianSortedArrays(nums1, nums2);
//
//        System.out.println(med);


//        LongestPalindromicSubstring5 lng = new LongestPalindromicSubstring5();
//        lng.longestPalindromic("babad");


//        TicTacToe348 ticTacToe = new TicTacToe348(3);
//        ticTacToe.move(1,2,2);
//        ticTacToe.move(0,2,1);
//        ticTacToe.move(0,0,2);
//        ticTacToe.move(2,0,1);
//        ticTacToe.move(0,1,2);
//        ticTacToe.move(1,1,1);


//        MergeKSortedList23 merge = new MergeKSortedList23();
//        ListNode node = new ListNode(-2);
//        ListNode node1 = new ListNode(-1);
//        node.next = node1;
//        ListNode node2 = new ListNode(-1);
//        node1.next = node2;
//        ListNode node3 = new ListNode(-1);
//        node2.next = node3;
//
//        ListNode node6 = null;


//        PrisonCellsAfterNDays957 prison = new PrisonCellsAfterNDays957();
//        int[] cells = new int[]{0,1,0,1,1,0,0,1,0,1};
//        int N = 200;
//        prison.prisonAfterNDays(cells, N);

//        QuickSort q = new QuickSort();
//        //int[] a = new int[]{7, 6, 10, 5, 9, 2, 1, 15, 7};
//        int[] a = new int[]{3,2,3,1,2,4,5,5,6};
//        int k = 4;
//        q.sort(a, 0, a.length-1);
//        System.out.println("kth largest element is  "+(a.length-k+1));
//        System.out.print("kth largest element is  "+a[a.length-k+1]);
//        for(int i: a){
//            System.out.print(i+" ");
//        }


//        KClosestPointToOrigin973 k = new KClosestPointToOrigin973();
//        int[][] points = new int[][]{{1,3},{-2,2},{2,-2}};
//        k.kClosest(points, 2);

//        WordBreak139 word = new WordBreak139();
//        String s = "leetcode";
//        List<String> words = new ArrayList<>();
//        words.add("leet");
//        words.add("code");
//
//        word.wordBreak(s, words);


//        FizzBuzz412 fb = new FizzBuzz412();
//        List<String> res = fb.fizzBuzz(15);
//        res.forEach((x) ->{
//            System.out.println(x);
//        });


//        CoinChange322 coin = new CoinChange322();
//        int[] coins = new int[]{186,419,83,408};
//        int amount = 6294;
//        System.out.println(coin.coinChange(coins, amount));

//        Permutations46 per = new Permutations46();
//        int[] nums = new int[]{1, 2, 3};
//        per.permute(nums);


//        SpiralMatrix54 spiral = new SpiralMatrix54();
//        int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
//        List<Integer> res = spiral.spiralOrder(matrix);
//
//        for(int i : res){
//            System.out.print("  "+i);
//        }


//        SearchInSortedArray33 search = new SearchInSortedArray33();
//        int[] nums = new int[]{10, 0, 1, 2, 3, 4, 5, 6, 7, 8};
//        int target = 8;
//        System.out.println(search.search(nums, target));


//        GenerateParentheses22 gen = new GenerateParentheses22();
//        System.out.println(gen.generateParenthesis(3));


//        ReorderDataLogFiles937 reorder = new ReorderDataLogFiles937();
//        String[] in = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
//        String[] out = reorder.reorderLogFiles(in);


        //MergeIntervals56 merge = new MergeIntervals56();
//        int[][] in = {{1,3},{2,6},{8,10},{15,18}};
//        int[][] in = {{1,4},{0,4}};
//        int[][] in = {{1,4},{0,1}};
//        int[][] out = merge.merge(in);
//
//        for(int i = 0; i < out.length; i++){
//            System.out.println(out[i][0]+", "+out[i][1]);
//        }

        int n = 19;

//        int copyN = n;
//        int sum = 0, x = n;
//        Map<Integer, Integer> map = new HashMap<>();
//        System.out.println("n -> "+n);
//        while(sum != 1){
//            if(!map.containsKey(sum)){
//                sum = 0;
//                int org = x;
//                while(x > 0){
//                    int rem = x % 10;
//                    x = x / 10;
//                    sum += rem * rem;
//                }
//                map.put(org, sum);
//                System.out.println("sum -> "+ sum);
//                x = sum;
//                if(sum == 1){
//                    System.out.println("-----------------TRUE------------------");
//                    break;
//                }
//            }else{
//                System.out.println("-----------------FALSE------------------");
//                break;
//                // x = map.get(x);
//                // if(x == 1){
//                //     return true;
//                // }
//            }
//        }
    }


//    public static void main(String[] args) {
//        int[][] s = {{1,89},{1,58},{1,77},{1,8},{1,98},{1,0},{1,54},{1,44},{1,31},{1,34},{1,43},{1,59},
//                {1,88},{2,75},{2,14},{2,35},{2,37},
//                {2,96},{2,18},{2,20},{2,99},{2,47},{2,9},{2,41},{2,40}};
//        HighFive1086 hi = new HighFive1086();
//        int[][] res = hi.highFive(s);
//        System.out.println("Id"+"  "+"Avg");
//        for(int[] i: res){
//            System.out.println(i[0]+"  "+i[1]);
//        }
//    }

//    public static void main(String[] args) {
//
//        //int[][] board = new int[][]{{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
//        int[][] board = new int[][]{{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,1,1,1,0},{0,1,1,1,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
//        GameOfLife289 game = new GameOfLife289();
//        game.gameOfLife(board);
//        System.out.println();
//
//    }


//    public static void main(String[] args) {
//
//        PowOfTwo231 pow = new PowOfTwo231();
//        boolean res = pow.isPowerOfTwo(2048);
//        System.out.println(res);
//
//    }
//    public static void main(String[] args) {
//
//        int[][] workers = {{0,0},{2,1}};
//        int[][] bikes = {{1,2},{3,3}};
//        CampusBike1057 campus = new CampusBike1057();
//        int[] res = campus.assignBikes(workers, bikes);
//        for(int i: res) {
//            System.out.println(i);
//        }
//    }

//    public static void main(String[] args) {
//        char[][] c = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','0','0'}};
//
//        MaximalSquare221 maximalSquare = new MaximalSquare221();
//        System.out.println(maximalSquare.maximalSquare(c));
//    }
//    public static void main(String[] args) {
//        RandomizedSet380 randomizedSet380 = new RandomizedSet380();
//
//        System.out.println(randomizedSet380.insert(-1));
//        System.out.println(randomizedSet380.remove(-2));
//        System.out.println(randomizedSet380.insert(-2));
//        System.out.println(randomizedSet380.getRandom());
//        System.out.println(randomizedSet380.remove(-1));
//        System.out.println(randomizedSet380.insert(-2));
//        System.out.println(randomizedSet380.getRandom());
//    }
//
//    public static void main(String[] args) {
//        DecodeString394 decode = new DecodeString394();
//
////        System.out.println(decode.decodeString("leetcode"));
////        System.out.println(decode.decodeString("2[abc]3[cd]ef"));
////        System.out.println(decode.decodeString("3[a]10[bc]"));
//        //System.out.println(decode.decodeString("3[a2[c]]"));
//        System.out.println(decode.decodeString("3[a]2[b4[F]c]"));
//    }
//    public static void main(String[] args){
//        Pow50 pow = new Pow50();
//        double result = pow.myPow(8.84372, -5);
//        System.out.println(result);
//    }
//    public static void main(String[] args){
//        FirstAndLastPosition34 firstAndLastPosition = new FirstAndLastPosition34();
//        int target = 8;
//        int[] nums = {1, 2, 3, 4, 5, 8, 8, 9, 9, 10, 10, 11, 12, 14};
//        //int[] nums = {5,7,7,8,8,10};
//        int[] result = firstAndLastPosition.searchRange(nums, target);
//        for(int i: result){
//            System.out.println(i);
//        }
//    }

//    public static void main(String[] args){
//        long start = System.currentTimeMillis();
//        ConfusingnumberII confusingnumberII = new ConfusingnumberII();
//        int sum = confusingnumberII.confusingNumberII(100000000);
//        long end = System.currentTimeMillis();
//        //finding the time difference and converting it into seconds
//        float sec = (end - start) / 1000F;
//        System.out.println(sec + " seconds");
//        System.out.println(sum);
//        ;
//    }


//    public static void main(String[] args){
//        StringCompression443 str = new StringCompression443();
//        //String input = "abbbbbbbbbbbb";
//        String input = "abcdefggggggggggggabc";
//        char[] c = input.toCharArray();
//        int count = str.compress(c);
//        System.out.println(String.valueOf(c));
//
//    }
//    public static void main(String[] args){
//        LRUCache cache = new LRUCache( 2 /* capacity */ );
//
//        cache.put(1, 1);
//        cache.put(2, 2);
//        cache.get(1);       // returns 1
//        cache.put(3, 3);    // evicts key 2
//        cache.get(2);       // returns -1 (not found)
//        cache.put(4, 4);    // evicts key 1
//        cache.get(1);       // returns -1 (not found)
//        cache.get(3);       // returns 3
//        cache.get(4);       // returns 4
//    }
    //------------------------------------------------------------------
//    public static void main(String[] args){
//        ListNode l11 = new ListNode(1);
//
//        ListNode l21 = new ListNode(9);
//        ListNode l22 = new ListNode(9);
//        l21.next = l22;
//        MainClass mn = new MainClass();
//        mn.addTwoNumbers(l11,l21);
//    }

//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode head = new ListNode(0);
//        add(l1, l2, 0, head, 1);
//        return head;
//    }
//    private void add(ListNode l1, ListNode l2, int carry, ListNode ln, int count){
//        int sum = 0;
//        sum = l1.val + l2.val;
//        sum += carry;
//        carry = sum/10;
//        sum = sum%10;
//        ListNode newNode;
//        System.out.println("sum "+sum+" carry "+carry+" ln.val "+ln.val);
//        if(count == 1){
//            ln.val = sum;
//            newNode = ln;
//        }else{
//            ListNode l = new ListNode(sum);
//            ln.next = l;
//            newNode = l;
//        }
//        if(l1.next != null && l2.next != null){
//            add(l1.next, l2.next, carry, newNode, 0);
//        }else if(l1.next != null){
//            add(l1.next, new ListNode(0), carry, newNode, 0);
//        }else if(l2.next != null){
//            add(new ListNode(0), l2.next, carry, newNode, 0);
//        }else{
//            if (carry > 0){
//                ListNode l = new ListNode(carry);
//                newNode.next = l;
//                System.out.println("carry "+carry);
//            }
//        }
//    }
    //------------------------------------------------------------------
}

