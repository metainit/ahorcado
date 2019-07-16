Esta basura va??!!!1
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <conio.h>
#include <time.h>
#include <math.h>

char * generaPalabra (char * []);

/*He intentado subdividir el problema en funciones, pero me ha resultado imposible, estos dias estaré intentándolo.*/
/*void introduccionLetra(char[] &palabra);*/

int main(int argc, char const *argv[]) {
  char *lista[10] = {"oso", "amigo", "estornudo", "microondas", "continuacion", "aminoacido", "algoritmo", "inteligencia", "mentecato", "procesos"};
  char* letra = generaPalabra(lista);
  srand(time(NULL));
  float numero = rand() % (9 - 0) + 0;
  int redondeo = roundf(numero);
  char palabra[50]; strcpy(palabra,lista[redondeo]);

  char tecla;
  int cambios = 0;
  static char comprobador [100];
  static int intentos = 4;
  int longitud = strlen(palabra);
  system("cls");
  //---------Comprobador de letras

  while(intentos>0){
    for (int i=0;i<longitud;i++){
      if(comprobador[i]=='x'){
        printf("%c",palabra[i]);
      }
      else{

        printf(" _ ");
      }
    }
    printf("\nIntroduzca una letra\t\t\t\tVidas restantes: %d\n",intentos);
    scanf(" %c",&letra);
    system("cls");

    for(int i=0;i<longitud;i++){
      if(palabra[i] == letra && comprobador[i] != 'x'){
        comprobador[i] = 'x';
        cambios++;
      }
    }
    if(cambios != 0){
      printf("Letra correcta\nPresione cualquier tecla para continuar.");
      getch();
      system("cls");
    }
    else{
      printf("Esa letra no esta o ya ha sido adivinada. Pierdes 1 vida.\nPresione cualquier tecla para continuar.");
      intentos--;
      getch();
      system("cls");
      }
      cambios=0;
      for(int i=0;i<longitud;i++){
        if(comprobador[i]=='x'){
          cambios++;
        }
      }
      if(cambios == longitud){
        printf("%s\n", palabra);
        printf("Has adivinado la palabra, maquina.\n");
        break;
      }
      else {
        cambios=0;
    }
  }
  if (intentos<=1){
    printf("Has perdido el juego amigo.");
  }
  return 0;
}

char* generaPalabra(char * []){

}
/*
void introduccionLetra(&palabra){
  char letra;
  int longitud = strlen(palabra);
  int cambios = 0;
  printf("Introduzca una letra:");
  scanf("%c",&letra);
  for(int i = 0;i<longitud;i++){
    if(palabra[i]==letra){
      comprobador[i] = 'x';
      cambios++;
    }
  }
  if (cambios != 0){
    for(int i=0; i<longitud;i++){
      if(comprobador[i]=='x'){
        printf("%c ",palabra[i]);
      }
      else{
        printf("_ ");
      }
    }
    printf("Enhorabuena, esa letra es correcta.")
  }
}*/
