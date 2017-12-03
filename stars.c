#include <stdio.h>
#define N 10
int main(){
    for (int i =0; i<N; i++){
        for(int j=0; j<i; j++){
            printf(" ");
        }
        for(int j=0; j<N-i; j++){
            printf("#");
        }
        printf("\n");
    }

    return 1;
}

