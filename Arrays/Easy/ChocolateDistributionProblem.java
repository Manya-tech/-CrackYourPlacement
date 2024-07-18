package Arrays.Easy;

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0;i<n;i++)
                {
                    int x = sc.nextInt();
                    arr.add(x);
                }
            int m = sc.nextInt();
            
            Solution ob = new Solution();
            
    		System.out.println(ob.findMinDiff(arr,n,m));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        
        // int l=0;
        // int r=l+m-1;
        
        int ans=a.get(a.size()-1)-a.get(0);
        
        //HashMap<Integer, Integer> hm = new HashMap<>();
        
        int i=0; int j=i+m-1;;
        
        while(j<a.size()){
            int d=a.get(j)-a.get(i);
            if(j-i==m-1)
            ans=Math.min(ans,d);
            i++;
            j++;
        }
        
        return ans;
        
        
    }
}
