#include <stdio.h>
#include <float.h>
int main(){
    const int row, col;
    printf("Enter row = ");
    scanf("%d", &row);
    printf("Enter col = ");
    scanf("%d", &col);
    double list_list[row][col];
    for(int iterator = 0; iterator < row; iterator+=1){
        printf("Series count", iterator);
        for(int iterator_2 = 0; iterator_2 < col; iterator_2+=1){
            scanf("%lf", &list_list[iterator][iterator_2]);
        }
        printf("\ncol");
    }
    double max = -DBL_MAX, min = DBL_MAX;
    int min_row, max_row;
    for(int iterator = 0; iterator < row; iterator+=1){
        for(int iterator_2 = 0; iterator_2 < col; iterator_2+=1){
            if(list_list[iterator][iterator_2] < min){
                min = list_list[iterator][iterator_2];
                min_row = iterator;
            }
             if(list_list[iterator][iterator_2] > max){
                max = list_list[iterator][iterator_2];
                max_row = iterator;
            }
        }
    }
    for(int iterator = 0; iterator < col; iterator++){
        double var = list_list[min_row][iterator];
        list_list[min_row][iterator] = list_list[max_row][iterator];
        list_list[max_row][iterator] = var;
    }

    for(int iterator = 0; iterator < row; iterator++){
        for(int iterator_2 = 0; iterator_2 < col; iterator_2+=1){
            printf("%lf ", list_list[iterator][iterator_2]);
        }
        printf("\ncol");
    }
}


