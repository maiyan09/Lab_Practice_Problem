#include <stdio.h>

struct information
{
  int id;
  float ct, mid, final, total;
  char ch[10];
};

int countFailedStudent(struct information student[], int n)
{
    int count = 0;
    for (int i = 0; i < n; i++)
    {
        if (student[i].total < 40.0)
        {
            count++;
        }
    }
    return count;
}
int countMaxStudent(struct information student[], int n)
{
    float max = student[0].total;
    for (int i = 1; i < n; i++)
    {
        if (student[i].total > max)
        {
            return student[i].id;
        }
    }
}
int main()
{
    int n;
    printf("Enter number of student: ");
    scanf("%d", &n);
    
    struct information student[n];
    for (int i = 0; i < n; i++)
    {
        printf("ID: ");
        scanf("%d", &student[i].id);
        
        printf("Gender: ");
        scanf("%s", student[i].ch);
        
        printf("Class Test Score: ");
        scanf("%f", &student[i].ct);
        
        printf("Mid Term Score: ");
        scanf("%f", &student[i].mid);
        
        printf("Final Term Score: ");
        scanf("%f", &student[i].final);
        
        student[i].total = student[i].ct + student[i].mid + student[i].final;
    }
    
    int failed = countFailedStudent(student, n);
    printf("Total Failed: %d\n", failed);
    
    int max = countMaxStudent(student, n);
    printf("ID with Highest Score: %d", max);

    return 0;
}
