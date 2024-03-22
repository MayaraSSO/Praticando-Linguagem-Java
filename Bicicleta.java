public class Bicicleta {
    //Esta linha define uma nova classe chamada Bicicleta.
        int ritmo = 0;
        int velocidade = 0;
        int marcha = 1;
        int velocidadeMaxima;
    //Estas linhas declaram quatro variáveis de instância, ritmo,velocidade, marcha e velocidadeMaxima e inicializam-nas com os valores 0, 0, 1 e não declarado, respectivamente.


        void mudarRitmo(int novoValor){
            ritmo = novoValor;
        }
    //Este é um método chamado mudarRitmo(). Ele recebe um parâmetro novoValor e atribui esse valor à variável de instância ritmo.   
    

        public Bicicleta(int velocidadeMaxima) {
            this.velocidadeMaxima = velocidadeMaxima;
        }

    
        void mudarMarcha(int novoValor) {
            marcha = novoValor;
        }
    //Este é um método chamado mudarMarcha(). Ele recebe um parâmetro novoValor e atribui esse valor à variável de instância marcha.

    void acelerar(int incremento) {
        if (velocidade + incremento <= velocidadeMaxima) {
            velocidade = velocidade + incremento;
        } else {
            System.out.println("A velocidade máxima foi atingida.");
        }
    }
    //Este é um método chamado acelerar(). Ele recebe um parâmetro incremento e adiciona esse valor à variável de instância velocidade.
    
        void freiar(int decremento) {
            velocidade = velocidade - decremento;
        }
    //Este é um método chamado freiar(). Ele recebe um parâmetro decremento e subtrai esse valor da variável de instância velocidade.

    
        void imprimirEstados() {
            System.out.println(" Ritmo: " + ritmo +  "  Velocidade: " + velocidade + "  Marcha: " + marcha + "  Velocidade Maxima: " + velocidadeMaxima );

        }
    //Este é um método chamado imprimirEstados(). Quando este método é chamado, ele imprime o ritmo, a velocidade e a marcha atuais da bicicleta.
    
    }
    //Esta linha fecha a definição da classe Bicicleta.

    
    class DemonstracaoBicicleta {
        public static void main(String[] args) {
        //Este é o método main(), que é o ponto de entrada para qualquer programa Java.

            Bicicleta bike1 = new Bicicleta(30);
            Bicicleta bike2 = new Bicicleta(40);
         // Criando dois objetos diferentes da classe Bicicleta
    

            bike1.mudarRitmo(50);
            bike1.acelerar(10);
            bike1.mudarMarcha(2);
            bike1.imprimirEstados();
    //Estas linhas chamam os métodos acelerar(), mudarMarcha() e imprimirEstados() no objeto bike1.
    
            bike2.mudarRitmo(40);
            bike2.acelerar(20);
            bike2.mudarMarcha(3);
            bike2.imprimirEstados();
        }
    }
   // Estas linhas chamam os métodos   mudarRitmo(), acelerar(), mudarMarcha() e imprimirEstados() no objeto bike2. As duas últimas linhas fecham o método main() e a classe DemonstracaoBicicleta, respectivamente.
