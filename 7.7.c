#include <stdio.h>

int * initArr(const int size) {
    static int array[20];
    
    for (int i = 0; i < size; i++) {
        printf("%d element: ", i+1);
        scanf("%d", &array[i]);
    }

    return array;
}

void outArr(int array[], int size) {
    for (int i = 0; i < size; i++) {
        printf("Array[%d] = %d\n", i, array[i]);
    }

}

int * sumArr(int array1[], int array2[], const int size) {
    static int array3[20];
    
    for (int i = 0; i < size; i++) {
        array3[i] = array1[i] + array2[i];
    }

    return array3;
}

int scalarProduct(int array1[], int array2[], const int size) {
    int product = 0;

    for (int i = 0; i < size; i++) {
        product += array1[i]*array2[i];
    }

    return product;
}

int main () {
    int *array1, *array2, *array3, product;
    const int n = 5;

    array1 = initArr(n);
    array2 = initArr(n);
    array3 = sumArr(array1, array2, n);
    outArr(array3, n);
    product = scalarProduct(array1, array2, n);
    printf("product = %d", product);
    return 0;
}