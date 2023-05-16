#include <stdio.h>
#include <conio.h>

int main()
{
    int filas, columnas, n;
    printf("Escribir el numero de filas: ");
    scanf("%d", &filas);
    printf("Escribir el numero de columnas: ");
    scanf ("%d", &columnas);
    int A[filas][columnas];
    int B[filas][columnas];
    for (int i = 0; i < filas; i++) //Para dar valores a los digitos de la mtriz A
    {
        for (int j = 0; j < columnas; j++)
        {
            printf("Matirz A Ingresar el numero %d%d : ", i+1, j+1);
            scanf("%d", &n);
            A[i][j]=n;
        }
    }
    for (int i = 0; i < filas; i++) //Para dar valores a los digitos de la matriz B
    {
        for (int j = 0; j < columnas; j++)
        {
            printf("Matriz B Ingresar el numero %d%d : ", i+1, j+1);
            scanf("%d", &n);
            B[i][j]=n;

        }
    }
    int C[filas][columnas];
       for (int i = 0; i < filas; i++) //Sumar la matriz A y B para generar la matriz C
    {
        for (int j = 0; j < columnas; j++)
        {
            C[i][j]=A[i][j]+B[i][j];
            printf("Matriz C El numero %d%d es %d\n", i+1, j+1, C[i][j]);
        }
    }
    getch();
    return 0;
}