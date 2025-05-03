#include<stdio.h>
#include <string.h>

int main()
{
    char ch[100];
    fgets(ch, 100, stdin);
    
    int countAlpha = 0, countDigit = 0, countSchar = 0;
    
    for (int i = 0; i < strlen(ch); i++)
    {
        if ((ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z'))
        {
            countAlpha++;
        }
        else if ((ch[i] >= '0' && ch[i] <= '9'))
        {
            countDigit++;
        }
        else if (ch[i] != ' ')
        {
            countSchar++;
        }
    }
    printf("Total Alphabet: %d\nTotal Digit: %d\nTotal Special Charcter: %d\n", countAlpha, countDigit, countSchar-1);
	return 0;
}
