class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        //count记录arr1数组中每一个数出现的频数
        int[] count = new int[1001];
        for (int a1 : arr1) ++count[a1];

        int res[] = new int[arr1.length];
        int index = 0;
        for (int a2 : arr2)
        {
            while (count[a2]-- > 0) res[index++] = a2;
        }

        //由于遍历的时候是递增遍历，所以天然有序。
        for (int i = 0; i < count.length; i++)
        {
            if (count[i] > 0)
            {
                while (count[i]-- > 0) res[index++] = i;
            }
        }

        return res;
    }
}