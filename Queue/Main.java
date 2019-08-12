#include<stdio.h>
#include<string.h>
int a[20];
int b=-1;
int f=0;

void en(int v)
{
  // printf("2222");
  a[++b]=v;
}
void deq()
{
 // printf("1111");
  printf("%d\n",a[f]);
  f++;
}
void print()
{
  int i;
  for(i=f;i<=b;i++)
  {
    printf("%d ",a[i]);
  }
  printf("\n");
 }

int main()
{
	int n;
   scanf("%d",&n);
  int j;
  for(j=0;j<n;j++)
  {
   char c[20];
   scanf("%s",c);
 // printf("%s",c);
  if(strcmp(c,"enqueue")==0)
  {
     int v;
     scanf("%d",&v);
   // printf("%d",v);
     en(v);
  }
 else if(strcmp(c,"dequeue")==0)
  {
    deq();
  }
  else{
    print();
  }
  }
    return 0;
}