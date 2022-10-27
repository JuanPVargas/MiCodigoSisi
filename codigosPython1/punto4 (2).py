x=int(input("Digite un numero entero: "))
y=int(input("Digite otro numero entero: "))
n=float(input("Digite un numero decimal: "))
m=float(input("Digite otro numero decimal: "))
e=", "
s1=x+y;s2=n+m;s3=x+n
d1=x-y;d2=n-m
p1=x*y;p2=n*m
c1=x/y;c2=n/m;c3=y/m
r1=x%y;r2=n%m;r3=y%m

print("\n",x,"+",y," = ",s1,e,x,"-",y," = ",d1,e,x,"x",y," = ",p1,e,x,"/",y," = ",c1,e,x,"%",y," = ",r1,
      "\n",n,"+",m," = ",s2,e,n,"-",m," = ",d2,e,n,"x",m," = ",p2,e,n,"/",m," = ",c2,e,n,"%",m," = ",r2,
      "\n",x,"+",n," = ",s3,e,y,"/",m," = ",c3,e,y,"%",m," = ",r3)