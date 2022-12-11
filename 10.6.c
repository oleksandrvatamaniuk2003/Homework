#include <locale.h>
#include <stdio.h>
#include <windows.h>
typedef struct {
int cents; 
int dollars; 
} Price;
Price inputPrice(){
    Price pr;

    int enter = 1;
    while(enter == 1){
        printf("Enter price: ");
        scanf("%d,%d", &pr.dollars, &pr.cents);
        if(pr.dollars < 0 || pr.cents < 0 || pr.cents > 99){
            printf("Incorrect price!\n");
        } else {
            enter = 0;
        }
    }
    return pr;
}
void zagalna_vartist(Price pr){
    if((pr.dollars > 10 && pr.dollars < 20 )|| pr.dollars % 10 == 0){
        printf("%d -----", pr.dollars);
    } else if(pr.dollars % 10 == 1){
        printf("%d -----", pr.dollars);
    } else if(pr.dollars % 10 < 5 && pr.dollars > 1){
        printf("%d -------", pr.dollars);
    }

    if((pr.cents > 10 && pr.cents < 20) || pr.cents % 10 == 0){
        printf(" %d ", pr.cents);
    } else if(pr.cents % 10 == 1){
        printf(" %d ", pr.cents);
    } else if(pr.cents % 10 < 5 && pr.cents > 1){
        printf(" %d ", pr.cents);
    }
}



