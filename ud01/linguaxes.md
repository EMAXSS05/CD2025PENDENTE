## Comando para actualizar la máquina 
>   sudo apt update  sudo apt upgrade -y

## Comando de instalación de Vs Studio Code
La forma más facil y práctica que encontre de instalar el visual en ubuntu es:
> sudo snap install code --classic
## Instalar compilador e interprete de java
> sudo apt install default-jdk -y

## Instalar compilador de C
> sudo apt install gcc -y

## Instalar intéprete de python 3
> sudo apt install python3 -y

## Ejemplo de creación y ejecución de programas

## Java
>nano OlaMundo.java
````java
 public class OlaMundo {
    public static void main(String[] args) {
        System.out.println("Ola mundo desde Java");
    }
}
````
>javac OlaMundo.java
>>java OlaMundo

## C
>nano ola.c
```C
#include <stdio.h>

int main() {
    printf("Ola mundo dende C\n");
    return 0;
}
```
>gcc ola.c -o ola
>./ola

## Python
>nano ola.py
```python
print("Ola mundo dende Python!")
```
>python3 ola.py


