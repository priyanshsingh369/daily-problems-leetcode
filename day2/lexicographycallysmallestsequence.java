import java.io.*;
import java.util.*;

public class Solution {

    public static String LSS(int n, int k, int[] nums)
    {
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 0; i < n; i++)
        {
            while(!dq.isEmpty() && dq.peekLast() > nums[i] && (dq.size() - 1 + (n - i)) >= k)
            {
                dq.pollLast();
            }

            if(dq.size() < k)
            {
                dq.addLast(nums[i]);
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int x : dq)
        {
            ans.append(x).append(" ");
        }
        return ans.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        System.out.println(LSS(n, k, nums));
    }
}