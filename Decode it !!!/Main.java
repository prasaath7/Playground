#include<stdio.h>
#include<string.h>
int main()
{ 
  char s[100];
  gets(s);
  int n,i,l,k=0;
  l=strlen(s);
  scanf("%d",&n);
  for(i=0;i<l;i++)
  {
    if(s[i]>='a'&&s[i]<='z') 
    {
      s[i]=s[i]-(n%26);
      if(s[i]<97)
        s[i]=s[i]+26;
    }
    else if (s[i]>='A'&&s[i]<='Z')
    {
       s[i]=s[i]-(n%26);
      if(s[i]<65)
        s[i]=s[i]+26;
    }
  }
    
  printf("%s",s);
 // printf("%d",'A');
  
  return 0;
}