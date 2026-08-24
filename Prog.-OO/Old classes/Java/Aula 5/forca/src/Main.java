void main() {

    String palavra = IO.readln("Digite uma palavra: ");

    List<String> letters = new ArrayList<>();
    String palavraSecreta = "";
    for (int i = 0; i < palavra.length(); i++) {
        palavraSecreta += "_ ";
        letters.add(String.valueOf(palavra.charAt(i)));
    }

    boolean acertouTodas = false;
    do {
        String letraUsuario = IO.readln("Informe uma letra: ");
        String textReveladoAtualizado = "";
        acertouTodas = true;
        for (int y = 0; y < letters.size(); y++) {
            if (letters.get(y).equals(letraUsuario)) {
                textReveladoAtualizado += letters.get(y) + " ";
            } else {
                acertouTodas = false;
                textReveladoAtualizado += "_ ";
            }
        }
        IO.println(textReveladoAtualizado);
    } while (acertouTodas==false);

}