#include <stdio.h>
#include <stdlib.h>
int main()
{ int n,x,y=0,w=0;
 for(n=100;n<=999;n+=2)
 {
 y=y+n;
 }
 printf("soma pares: %i\n",y);
 for(n=101;n<=999;n+=2)
 {
 w=w+n;
 }
 printf("soma impares: %i\n",w);
 return 0;
}
