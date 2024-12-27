int trap(int* height, int heightSize) {
    int level=0;
    int water=0;

    while(heightSize--){
        int lower=*height < height[heightSize] ? *height++:height[heightSize];

        if(level<lower){
            level=lower;
        }

        water+=level-lower;
    }
    return water;
}
