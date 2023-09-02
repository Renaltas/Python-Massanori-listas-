peixes = int(input())
if peixes > 50:
    print('há execesso...')
    multa = (peixes-50)*4
    exec = peixes -50
    print(f'o execesso é de: {exec}')
    print(f'a multa é de: {multa}')
else:
    print('sem execesso de peso...')