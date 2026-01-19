/*
I	1
V	5
X	10
L	50
C	100
D	500
M	1000
*/
char* intToRoman(int num) {
    char* arr = (char*)malloc(sizeof(char)*1000);
    int index = 0;
    arr[index] = '\0';
    int val[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    char *sym[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    while(num>0){
        while(num>=val[index]){
            strcat(arr, sym[index]);
            num-=val[index];
        }
        index++;
    }
    
    
    return arr;
}
