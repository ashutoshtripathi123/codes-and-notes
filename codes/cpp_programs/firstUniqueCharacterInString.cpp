    int firstUniqChar(string S) {
       int arr[26]={0};
       for(int i=0;i<S.length();i++){
           arr[S[i]-'a']++; // important conversion from char to int
       }
       
       for(int i=0;i<S.length();i++){
           if((arr[S[i]-'a'])==1)
           {
               //cout<<"Index is : "<<i<<endl;
                return i;
           }
       }
       return -1;
    }