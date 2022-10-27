import math
repetir=0;
while repetir==0:
    e=int(input("De que figura desea hallar el area?\n 1.circulo\n 2.triangulo\n 3.cuadrado\n 4.salir\n"))
    if e == 1:
        r=int(input("Digite radio del circulo\n"))
        print("El area del circulo es ",(math.pi*(r*r)),"\n")
    elif e == 2:
        b=int(input("Digite la base del triangulo\n"))
        h=int(input("Digite la altura del triangulo\n"))
        print("El area del triangulo es ",((b*h)/2),"\n")
    elif e == 3:
        l=int(input("Digite lado del cuadrado\n"))
        print("El area del cuadrado es ",(l*l),"\n")
    elif e == 4:
        repetir=repetir+1
        print("Hata luego\n")
    else:
        print("Elija una de las 4 opciones.\n")