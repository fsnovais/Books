salario = int(input('Salario? '))
imposto = float(input('Imposto? (ex:27.5) '))

if not imposto : imposto = 27.5 
else: imposto = float(imposto)  
print('O valor final do seu salario e: {}'.format(salario - (salario * imposto * 0.01)))