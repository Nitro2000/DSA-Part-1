package LeetCodeQuestions.LeetcodeSearch.Medium;

public class RangeFreqQuery {

    int[] ar;
    
    public RangeFreqQuery(int[] arr) {
        ar = arr;
    }
    
    public int query(int left, int right, int value) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (ar[i] == value) count++;
        }
        return count;
    }
}



/**
 * Your RangeFreqQuery object will be instantiated and called as such:
 * RangeFreqQuery obj = new RangeFreqQuery(arr);
 * int param_1 = obj.query(left,right,value);
 */