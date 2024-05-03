n = int(input("Digite o número de elementos na sequência: "))
sequencia = list(map(int, input("Digite a sequência de números inteiros separados por espaço: ").split()))

def contar_segmentos_iguais(n, sequencia):
    if n == 0:
        return 0
    
    segmentos = 1
    i = 1
    while i < n:
        if sequencia[i] != sequencia[i - 1]:
            segmentos += 1
        i += 1
    
    return segmentos

quantidade_segmentos = contar_segmentos_iguais(n, sequencia)
print("Quantidade de segmentos de números iguais consecutivos:", quantidade_segmentos)
