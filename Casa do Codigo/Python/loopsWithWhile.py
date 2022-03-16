salario = int(input('Salario: '))
imposto = 27.
resultado = 0
while imposto > 0.:
    imposto = input('Imposto ou (s) para sair: ')
    if not imposto:
        imposto = 27.
    elif imposto == 's':
        break
    else:
        imposto = float(imposto)
    resultado = salario - (salario*imposto *0.01)
    if resultado > 0 :
        print('Valor real: {0}'.format(resultado))
    else:
        print('Salario negativo, favor inserir taxa de imposto abaixo de 100.')