void main(){

    MinhaMatriz matriz = new MinhaMatriz(2,2);

    matriz.setValor(0,0,6);
    matriz.getValor(0,0);

    matriz.preencher(2);

    matriz.imprimirMatriz();

    MinhaMatriz matriz2 = new MinhaMatriz(2, 2);

    matriz2.preencher(3);

    matriz2.imprimirMatriz();

    matriz.somar(matriz2);

    matriz2.somarLinha(1);

    matriz2.setValor(1,1, 5);

    matriz2.imprimirMatriz();

    matriz2.somarColuna(1);


}