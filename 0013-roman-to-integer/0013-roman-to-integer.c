int romanToInt(char* s) {
    int arr[26] = {0};
    arr['I'-'A'] = 1;
    arr['V'-'A'] = 5;
    arr['X'-'A'] = 10;
    arr['L'-'A'] = 50;
    arr['C'-'A'] = 100;
    arr['D'-'A'] = 500;
    arr['M'-'A'] = 1000;

    int sum = 0;

    for(int i=0;s[i]!='\0';i++){
        int first = arr[s[i]-'A'];
        int second = 0;
        if(s[i+1]!='\0'){
            second = arr[s[i+1]-'A'];
        }
        if(first<second){
            sum+=(second-first);
            i++;
        }
        else{
            sum+=first;
        }
    }
    return sum;
}