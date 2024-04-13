hexa = int(input("Digite um número inteiro"))

hex_map = {
    10: 'A',
    11: 'B',
    12: 'C',
    13: 'D',
    14: 'E',
    15: 'F'
}

hexade = ""

while numero > 0:
    resto = numero % 16
    if resto >=10:
         hexade = hex_map[resto] + hexadecimal
    else:
        hexade = hexade(resto) + hexadecimal
    numero = numero // 16


print("A representação hexadecimal é:", hexadecimal)