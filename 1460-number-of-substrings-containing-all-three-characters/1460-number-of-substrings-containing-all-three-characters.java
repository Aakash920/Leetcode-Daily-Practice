class Solution {
    public int numberOfSubstrings(String s) {
        // O(N^2)
        // int count=0;
        // for(int i=0 ; i<s.length() ; i++){
        //     HashMap<Character,Integer> map=new HashMap<>();
        //     for(int j=i ; j<s.length() ; j++){
        //         char ch=s.charAt(j);
        //         map.put(ch,map.getOrDefault(ch,0)+1);
        //         if(map.size()==3){
        //             count+=s.length()-j;
        //             break;
        //         }
        //     }
        // }
        // return count;


        // Time complexity - O(N)
        // SpaceComplexity - O(1)
        int[] arr=new int[3];
        int start=0;
        int count=0;
        for(int i=0 ; i<s.length() ; i++){
            arr[s.charAt(i)-'a']++;
            while(arr[0]>0 && arr[1]>0 && arr[2]>0){
                count+=s.length()-i;
                arr[s.charAt(start)-'a']--;
                start++;
            }
        }
        return count;

    }
}