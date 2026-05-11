//===================================================
// LeetCode #88 - Merge Sorted Array
// Defficulty: Easy
//===================================================
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx = m+n-1; int i= m-1; int j= n-1;
        while(i>=0 && j>=0)
        {
            if(nums1[i]>nums2[j])
            {
                nums1[idx--] = nums1[i--];
            }
            else
            {
                nums1[idx--] = nums2[j--];
            }
        }
        while(j >= 0)
        {
            nums1[idx--]= nums2[j--];
        }

     }
}
// Solution-1 Two Pointer (From Back)
// Runtime: 0ms | Beats: 100%
// Time Complexity : 0(m+n)
// Space Compexity : 0(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}

// Solution-2 -- Copy and Sort
// Runtime: 3ms | Beats: 18%
// Time Complexity: 0((m+n)log(m+n))
// Space Complexity: 0(1)
