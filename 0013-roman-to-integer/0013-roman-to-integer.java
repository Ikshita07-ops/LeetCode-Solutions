class Solution {
    public int romanToInt(String s) {
    //    Map<Character,Integer> map = Map.of(
    //     'I',1,
    //     'V',5,
    //     'X', 10,
    //     'L', 50,
    //     'C', 100,
    //     'D', 500,
    //     'M', 1000
    //    );
    //    int res =0;
    //    for(int i=0;i<s.length();i++){
    //     int curr = map.get(s.charAt(i));
    //     int next = (i+1 < s.length()) ? map.get(s.charAt(i+1)) : 0;
    //     if(curr<next)
    //         res -= curr;
    //     else
    //         res += curr;
    //    } 
    //    return res;
//ASCII values
    int[] arr = new int[128];
    arr['I'] = 1;
    arr['V'] = 5;
    arr['X'] = 10;
    arr['L'] = 50;
    arr['C'] = 100;
    arr['D'] = 500;
    arr['M'] = 1000;

    int res =0;
    int prev =0;
    for(int i = s.length()-1;i>=0;i--){
        int curr = arr[s.charAt(i)];
        if(curr < prev)
            res -= curr;
        else
            res += curr;
        prev = curr;
    }
    return res;
    }
}