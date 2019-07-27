#include<stdio.h>
int main()
{
  int a,b,c,d,i;
  scanf("%d%d",&a,&b);
  i=(a>b) ? b:a;
  for(;i>=1;i--)
  {
    if(a%i==0 && b%i==0)
    {
      c=i;
      break;
    }
  }
  d=(a*b)/c;
  printf("%d",d);
  return 0;
}
