class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a,b) -> a[0]-b[0]);
        int prevend=0;
        int n = meetings.length;
        for(int i=0;i<n;i++){
            int start = Math.max(meetings[i][0],prevend+1);
            int end = meetings[i][1];
            int len = end-start+1;
            days -= Math.max(len,0);
            prevend = Math.max(prevend,end);
        }
        return days;
    }
}