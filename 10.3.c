#include <stdio.h>

typedef struct {
int height; 
char name[20];
} Mountain;

Mountain inputMountain(){
    Mountain mnt;
    int enter = 1;
    while(enter == 1){
        printf("Enter name: ");
        scanf(" %s", &mnt.name);
        if(mnt.name == ""){
            printf("Enter correct mountain name!\n");
        } else {
            printf("Enter height: ");
            scanf("%d", &mnt.height);
            if(mnt.height <= 0){
                printf("Enter correct mountain height!\n");
            } else {
                enter = 0;
            }
        }
    }
    return mnt;
}

void outputMountain(Mountain mnt){
    printf("%s - %d\n", mnt.name, mnt.height);
}

char findHighest(Mountain arr[], int size){
    int maxHeight = 0;
    char maxName;
    for(int i = 0; i < size; i++){
        if(arr[i].height > maxHeight){
            maxName = arr[i].name;
        }
    }
    return maxName;
} 

int findbyName(Mountain arr[], int size, char name){
    int height = 0;
    for(int i = 0; i < size; i++){
        if(arr[i].name == name){
            height = arr[i].height;
            break;
        }
    }
    return height;
} 

int main(){
    Mountain mnt = inputMountain();
    outputMountain(mnt);
    Mountain mnt2 = inputMountain();
    Mountain arr[2] = {mnt, mnt2};
}