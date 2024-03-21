
/*
            Exercício 1
                •Altere a classe Cachorro para incluir o nome do cachorro. 
                • Adapte o método late para indicar o nome do cachorro a latir. 
                • Altere o main para que um segundo cachorro seja instanciado. Cada um deles deve latir.
 */

 /*
public class Cachorro {
    
        public void late(){
            System.out.println(“onomatopéia do cachorro!”); 
            } 
        public static void main(){
            // criando uma variavel do tipo Cachorro; 
                Cachorro bingo;
            //Instanciando um novo cachorro e associando a variavel bingo que e do tipo Cachorro 
              bingo = new Cachorro(); 
               bingo.late();
*/

public class Cachorro {  //Esta linha define uma nova classe chamada Cachorro.
   
    String nome; //Esta linha declara uma variável de instância nome do tipo String. Esta variável será usada para armazenar o nome do cachorro.

    public Cachorro(String nome) {
        this.nome = nome; //Este é o construtor da classe Cachorro. Ele recebe um parâmetro nome e atribui esse valor à variável de instância nome.
    }

    public void late() {
        System.out.println(nome + " está latindo!");  //Este é um método chamado late(). Quando este método é chamado, ele imprime uma mensagem indicando que o cachorro (com o nome armazenado na variável nome) está latindo.
    }

    public static void main(String[] args) { //Este é o método main(), que é o ponto de entrada para qualquer programa Java.
        
        Cachorro bingo = new Cachorro("Bingo"); //Esta linha cria um novo objeto Cachorro chamado bingo e passa a string “Bingo” para o construtor da classe Cachorro.
        bingo.late(); ///Esta linha chama o método late() no objeto bingo, fazendo com que imprima a mensagem “Bingo está latindo!”.

        
        Cachorro rex = new Cachorro("Rex"); //Esta linha cria um segundo objeto Cachorro chamado rex e passa a string “Rex” para o construtor da classe Cachorro.
        rex.late(); //Esta linha chama o método late() no objeto rex, fazendo com que imprima a mensagem “Rex está latindo!”. 
    }
}
//As duas últimas linhas fecham o método main() e a classe Cachorro, respectivamente

