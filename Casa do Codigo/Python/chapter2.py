# If Else
imposto = float(input('Imposto? '))

if imposto < 10 :
    print('Medio')
elif imposto < 27.5 :
    print('Alto')
else : print('Muito alto!')

# Operadores Ternarios

imposto_ex3 = 0.3
"Alto" if imposto_ex3 > 0.27 else "Baixo"