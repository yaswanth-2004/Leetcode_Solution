class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
       Arrays.sort(deck);
       Deque<Integer> result =new ArrayDeque<>();
       result.add(deck[deck.length-1]);

       for(int i=deck.length-2;i>=0;i--){
        result.addFirst(result.removeLast());
        result.addFirst(deck[i]);
       }

       int[]  resArray = new int[deck.length];
       int index=0;
       for (int num : result) {
    resArray[index++] = num;
}
return resArray;
    }
    ;
}
