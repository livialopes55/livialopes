num = int(input("Digite um número inteiro: "))

resultado = ""

resto = num % 16
num = num // 16
resultado = str(resto) + resultado 
#quoc = num // 16

resto = num % 16
num = num // 16
resultado = str(resto) + resultado 

resto = num % 16
num = num // 16
resultado = str(resto) + resultado 

print(resultado)

