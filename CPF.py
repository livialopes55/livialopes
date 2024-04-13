cpf = input("Digite seu CPF: ")
cpf_formatado = cpf[:3] + '.' + cpf[3:6] + '.' + cpf[6:9] + '-' + cpf[9:]

print("CPF FORMATADO: " , cpf_formatado)