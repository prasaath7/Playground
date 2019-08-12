#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int a[20];
int top=-1;

void push(int num)
{
  a[++top]=num;
  //printf("%d\n",a[top]);
}
void pop()
{
  printf("%d\n",a[top]);
  top--;
}
void print()
{
  int j;
  for(j=0;j<=top;j++)
  {
    printf("%d ",a[j]);
  }
  printf("\n");
}
int main() {
    int n;
   scanf("%d",&n);
   int i;
 // printf("%d",n);
   for(i=0;i<n;i++)
   {
     char cm[20];
     scanf("%s",cm);
     //printf("%s",cm);
     if(strcmp(cm,"push")==0)
     {
        int t;
        scanf("%d",&t);
        push(t);
     }
     else if (strcmp(cm,"pop")==0)
     {
       pop();
     }
     else{
       print();
     }
   }
   
    return 0;
}