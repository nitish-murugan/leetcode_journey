int lengthOfLongestSubstring(char* s) {
    int arr[157] = {0};
    int count = 0;
    int max = 0;
    for(int j=0;s[j]!='\0';j++){
        for(int i=j;s[i]!='\0';i++){
            if(arr[(int)s[i]]==0){
                arr[(int)s[i]] = 1;
                count++;
            }
            else{
                max = (max<count)?count:max;
                memset(arr, 0, sizeof(arr));
                count=0;
                break;
            }
        }
    }
    max = (max<count)?count:max;
    return max;
}