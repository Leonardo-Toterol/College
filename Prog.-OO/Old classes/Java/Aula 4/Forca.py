import os
import random

lista_palavras = ["MAÇA", "BANANA", "ABACATE"]

def listar() :
    os.system('cls')
    print(f'A lista atual é:\n ')
    for i in lista_palavras :
        print(i)
    input("\nAperte para continuar.")

def trocar() :
    while True :
        os.system('cls')
        r = int(input(f"O que deseja fazer?\n\n1 - Remover Palavra\n2 - Adicionar Palavra\n3 - Voltar\n: "))
        
        if r == 1 :
            os.system('cls')
            palavra = input("Digite a palavra que deseja remover: ").upper()
            
            if palavra in lista_palavras :
                lista_palavras.remove(palavra)
                print(f'{palavra} foi removida com sucesso.')
                input("\nAperte para continuar.")
                return lista_palavras
            else :
                print("Palavra não encontrada, tente novamente")
                input("\nAperte para continuar.")
        elif r == 2 :
            os.system('cls')
            palavra = input("Digite a palavra que deseja adicionar: ").upper()
            
            if palavra in lista_palavras :
                print("A palavra já existe na lista, tente novamente.")
                input("\nAperte para continuar.")
                break
            else :
                lista_palavras.append(palavra)
                print(f'{palavra} foi adicionado a lista com sucesso.')
                input("\nAperte para continuar.")
                return lista_palavras
        elif r == 3 :
            return lista_palavras

def jogo() :
    palavra_certa = random.choice(lista_palavras)
    letras_corretas = []
    tentativas = []
    vitoria = False
    derrota = False
    vida = 6

    while True :
        
        if vida <= 0 :
            derrota = True

        if derrota == True :
            print(f'Você perdeu, a palavra secreta era {palavra_certa}.')
            break
        
        if vitoria == True :
            print(f'Você ganhou, parabéns!')
            break
        
        forca = ""
        while True :
            letra = input("Digite uma letra: ").upper()

            if letra in tentativas :
                print("Você já usou essa letra, tente novamente: ")
                input("\nAperte para continuar.")
            else :
                tentativas.append(letra)
                break
        if letra in palavra_certa :
            letras_corretas.append(letra)
            
        else :
            vida -= 1
            print(f'Letra incorreta, você ainda tem {vida} chances.')
            

        for i in palavra_certa :
            if i in letras_corretas:
                forca += i
            else :
                forca += "_"

        if "_" not in forca :
            vitoria = True

        print(forca)
        input("\nAperte para continuar.")

def menu() :
    while True :

        os.system('cls')
        r = int(input("Bem vindo a jogo da FORCA\n\n1 - Jogar\n2 - Ver Palavras\n3 - Trocar Palavras\n4 - Sair\n\nDigite a opção: "))
        

        if r == 1 :
            jogo()
        elif r == 2 :
            listar()
        elif r == 3 :
            trocar()
        elif r == 4 :
            print("Obrigado por Jogar!")
            break
        else :
            print("Opção incorreta, tente novamente.")

menu()