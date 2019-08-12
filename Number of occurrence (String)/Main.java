#include<stdio.h>
#include<string.h>
int main()
{
  int i,j,k,l;
  char s1[100];
  char s2[100];
  gets(s1);
  gets(s2);
  int n1,n2;
  n1=strlen(s1);
  n2=strlen(s2);
  for(i=0;i<n1;i++)
  {
    if(s1[i]>='A' && s1[i] <='Z')
       s1[i]=s1[i]+32;
  }
  for(i=0;i<n2;i++)
  {
    if(s2[i]>='A' && s2[i] <='Z')
       s2[i]=s2[i]+32;
  }
  k=0;
  for(i=0;i<n1;i++)
  {
    l=1;
    for(j=0;j<n2;j++)
    {
      if(s1[i+j]!=s2[j])
      {
        l=0;
      }
    }
    if(l==1)
    {
       k++;
    }
  }
  printf("%d",k);
  return 0;
}