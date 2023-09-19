usuario = input('insira nome de usuario: ')
senha = input('insira sua senha: ')


while usuario == senha:
    print('usuario e senha iguais, mude isso: ')
    usuario = str(input('insira nome de usuario: '))
    senha = int(input('insira sua senha: '))
    
print(f'o seu usuario é:{usuario} e sua senha é:{senha}')

    
    
