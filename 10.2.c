#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct {
int row; 
char column; 
} Chess;

Chess inputChess(){
    Chess pos;
    int enter = 1;
    while(enter == 1){
        printf("Enter pos:");
        scanf(" %c %d", &pos.column, &pos.row);
        if(pos.row < 1 || pos.row > 8 ){
            printf("Incorrect position\n");
        } else{
            enter = 0;
        }
    }
    return pos;
}

void outputChess(Chess pos){
    printf("%c%u\n", pos.column, pos.row);
}

bool canQueenGo(Chess queenPos, Chess targetPos){
    if(queenPos.row == targetPos.row || queenPos.column == targetPos.column || abs(queenPos.row - targetPos.row) == abs(queenPos.column - targetPos.column)){
        return true;
    } else {
        return false;
    }
}


int main(){

    Chess pos;
    pos = inputChess();
    outputChess(pos);

    Chess pos1, pos2;
    pos1 = inputChess();
    pos2 = inputChess();
    if(canQueenGo(pos1, pos2) == true){
        printf("Queen can go there!");
    } else {
        printf("Queen cannot go there!");
    }

    
}