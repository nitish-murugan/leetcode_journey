int maxScore(int* cardPoints, int cardPointsSize, int k) {
    int lsum=0, rsum=0;
    for(int i=0;i<k;i++) lsum+=cardPoints[i];
    int maxSum = lsum, rightIndex=cardPointsSize-1;
    for(int i=k-1;i>=0;i--){
        lsum = lsum-cardPoints[i];
        rsum = rsum+cardPoints[rightIndex--];
        maxSum = ((lsum+rsum)>maxSum)?(lsum+rsum):maxSum;
    }
    return maxSum;
}