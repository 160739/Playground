
#include<stdio.h>
int main()
{
  //type your code here
  char g;
  scanf("%c",&g);
  switch(g)
  {
      case'a':
      case'e':
      case'o':
      case'i':
      case'u':
      case'A':
      case'E':
      case'I':
      case'O':
      case'U':
      {
        printf("Vowel");
        break;
      }
    default:
      printf("Consonant");
  }
  return 0;
}