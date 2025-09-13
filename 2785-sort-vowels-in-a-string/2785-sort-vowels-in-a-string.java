class Solution {
public String sortVowels(String s) {
     char[] arr = s.toCharArray();
     int[] freq = new int[128]; 

                          
      for (int i = 0; i < arr.length; i++) {
      char ch = arr[i];
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
      ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
     freq[ch]++;
      }
     }


         int vowelPtr = 0;
                                                                                                                               for (int i = 0; i < arr.length; i++) {
                                                                                                                          char ch = arr[i];
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                                                                                                                                                                                                    

       while (vowelPtr < 128 && freq[vowelPtr] == 0) {
                                                                                                                                                                                                                                                        vowelPtr++;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        arr[i] = (char) vowelPtr;
                                                                                                                                                                                                                                                                          freq[vowelPtr]--;
                                                                                                                                                                                                                                                                 }
                                                                                                                                                                                                                                                               }

                                                                                                                                                                                                                                                          return new String(arr);
                                                                                                                                                                                                                                                        }


}