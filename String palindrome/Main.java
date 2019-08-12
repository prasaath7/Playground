#include<stdio.h>
#include<string.h>
int main()
{
  char a[10];
  gets(a);
  char b[10];
  int n=strlen(a);
  int i,j=0;
  for(i=n-1;i>=0;i--)
  {
    b[j]=a[i];
    j++;
  }
  //printf("%s\n",b);
  if(strcmp(a,b)==0)
    printf("%s is a palindrome",a);
  else
     printf("%s is not a palindrome",a);
  
  return 0;
}