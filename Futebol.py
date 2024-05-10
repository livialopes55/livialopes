def inicia_times(lst): 
    nomes = ["Reak Madrid", "Bayern Munich", "Borussia Dortmund", "Paris Saint Germain"]
    for nome in nomes:
        lst.append(nome)
        lst.append(0) #vitorias
        lst.append(0) #empates
        lst.append(0) #derrotas
        lst.append(0) #saldo de gols

def define_partidas():
    nomes = ["Reak Madrid","Bayern Munich", "Borussia Dortmund", "Paris Saint Germain"]
    lista = [nomes[0], "", nomes[1], "", nomes[2], "", nomes[3], "", 
             nomes[0], "", nomes[3], "", nomes[1], "", nomes[2], "", 
             nomes[0], "", nomes[2], "", nomes[1], "", nomes[3], ""]
    return lista

def menu():
    print("\nQuadrangular Futebol")
    print("1 - Classificacao\n2 - Partida\n3 - Sair")
    return int(input("Escolha: "))

def mostra_classificacao(lista):
    print("\nTabela classificacao")
    i = 0
    while i < len(lista):
        pts = 3 * lista[i+1] + lista[i+2]
        print(f"{lista[i]}: {pts} \t SG: {lista[i+4]}")
        i = i + 5

def informa_resultado_partidas(matches, teams):
    i = 0
    while i < len(matches) and matches [i+1] != "":
        i = i + 4 

    print(f"{matches[i]} X {matches[i+2]}")
    gols1 = int(input(f"Gols {matches[i]}: "))
    gols2 = int(input(f"Gols {matches[i+2]}: "))
    if gols1 > gols2:
        adiciona_vitoria(matches[i], gols1 - gols2, teams)
        adiciona_derrota(matches[i+2], gols1 - gols2, teams)
    elif gols1 > gols2
        adiciona_vitoria(matches[i+2], gols2 - gols1, teams)
        adiciona_derrota(matches[i], gols2 - gols1, teams)
    else: 
        adiciona_empate(matches[i], matches[i+2], teams)


times = []
inicia_times(times)
print(times)
partidas = define_partidas()
print(partidas)

opcao = menu 
while opcao !=3:
    if opcao ==1:
        mostra_classificacao(times)
    elif opcao ==2:
        informa_resultado_partidas(partidas, times)

    opcao = menu()