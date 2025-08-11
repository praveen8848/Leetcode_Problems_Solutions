package LeetcodeMedium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode658 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,10,10,10};
        int k = 1;
        int x = 9;
        List<Integer> ans = Findit(arr,k,x);
        System.out.println(ans);
    }
    public static List<Integer> Findit(int[] arr, int k, int x){
        List<Integer> ans = new ArrayList<>();
        int index = BinarySearch(arr, x);
        if(k == 1){
            if(index+1<arr.length){
                int m = Math.abs(arr[index]-x);
                int n = Math.abs(arr[index+1]-x);
                if(m<n){
                    ans.add(arr[index]);
                }
                else if(m>n){
                    ans.add(arr[index+1]);
                }
                else{
                    int t = Math.min(arr[index], arr[index+1]);
                    ans.add(t);
                }
                return ans;
            }
        }
        ans.add(arr[index]);
        k--;

        int i = index-1;
        int j = index+1;

        while(i>=0 && j<arr.length && k>0){
            int p = Math.abs(arr[i]-x);
            int q = Math.abs(arr[j]-x);
            if(p<q){
                ans.add(arr[i]);
                i--;
            }
            else if(p>q){
                ans.add(arr[j]);
                j++;
            }
            else{
                if(arr[i]<arr[j]){
                    ans.add(arr[i]);
                    i--;
                }
                else{
                    ans.add(arr[j]);
                    j++;
                }
            }
            k--;
        }

        while(i>=0 && k>0){
            ans.add(arr[i]);
            i--;
            k--;
        }
        while(j<arr.length && k>0){
            ans.add(arr[j]);
            j++;
            k--;
        }

        Collections.sort(ans);
        return ans;
    }
    static int BinarySearch(int[] arr, int target){
        int i = 0;
        int j = arr.length-1;
        int ans = 0;

        while(i<=j){
            int mid = i + (j-i)/2;
            if(arr[mid]<=target){
               ans = mid;
               i = mid+1;

            }
            else{
                j = mid-1;
            }
        }
        return ans;
    }
}
