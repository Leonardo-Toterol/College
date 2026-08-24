import java.lang.reflect.Array;
import java.util.ArrayList;

public class MenuService {

    ArrayList<Streaming> streamings = new ArrayList<>();
    ArrayList<Usuario> usuariosTotal = new ArrayList<>();

    public void iniciar() {
        int r;
        int opcao;

        do {
            r = Integer.parseInt(IO.readln("Menu Streming\n\n 1° Adicionar\n 2° Remover\n 3° Editar\n 4° Lista\n"));
            switch (r) {
                case 1:
                    opcao = Integer.parseInt(IO.readln("Adicionar\n1° Streming\n2° Usuario"));
                    if (r == 1){
                        adicionarStreaming();
                    }
                    else if (r == 2){
                        adicionarUsuario();
                    }
                    break;
                case 2:
                    /*remover();
                    break;
                case 3:
                    editar();
                    break;
                case 4:
                    listar();
                    break;*/
                case 0:
                    break;
                default:
                    IO.println("Try again.");
            }
        } while (r != 0);
    }

         public void adicionarUsuario(){
            String nome = IO.readln("Nome:");
            int idade = Integer.parseInt(IO.readln("Idade:"));
            boolean ativo = true;

            Usuario usuario = new Usuario(nome, idade, ativo);

            usuariosTotal.add(usuario);
    }

        public void adicionarStreaming(){
            String nome = IO.readln("nome");
            String data = IO.readln("Data Contratao");
            double valor = Double.parseDouble(IO.readln("Valor: "));

            Streaming streaming = new Streaming(nome, data, valor);

            streamings.add(streaming);
        }

    }





